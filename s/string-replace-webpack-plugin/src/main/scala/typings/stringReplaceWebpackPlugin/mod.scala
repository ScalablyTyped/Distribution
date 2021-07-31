package typings.stringReplaceWebpackPlugin

import typings.std.Plugin
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("string-replace-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Plugin
  @JSImport("string-replace-webpack-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def replace(options: Options): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def replace(options: Options, /**
    * loaders to follow the replacement
    */
  nextLoaders: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any], nextLoaders.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  /* static member */
  @scala.inline
  def replace(/**
    * loaders to apply prior to the replacement
    */
  prevLoaders: String, options: Options): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(prevLoaders.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def replace(
    /**
    * loaders to apply prior to the replacement
    */
  prevLoaders: String,
    options: Options,
    /**
    * loaders to follow the replacement
    */
  nextLoaders: String
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(prevLoaders.asInstanceOf[js.Any], options.asInstanceOf[js.Any], nextLoaders.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  trait Options extends StObject {
    
    var replacements: js.Array[ReplacementItem]
  }
  object Options {
    
    @scala.inline
    def apply(replacements: js.Array[ReplacementItem]): Options = {
      val __obj = js.Dynamic.literal(replacements = replacements.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplacements(value: js.Array[ReplacementItem]): Self = StObject.set(x, "replacements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacementsVarargs(value: ReplacementItem*): Self = StObject.set(x, "replacements", js.Array(value :_*))
    }
  }
  
  trait ReplacementItem extends StObject {
    
    /**
      * a regex to match against the file contents
      */
    var pattern: RegExp
    
    /**
      * an ECMAScript string replacement function
      * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/replace#Specifying_a_function_as_a_parameter
      */
    def replacement(substring: String, args: js.Any*): String
  }
  object ReplacementItem {
    
    @scala.inline
    def apply(pattern: RegExp, replacement: (String, /* repeated */ js.Any) => String): ReplacementItem = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], replacement = js.Any.fromFunction2(replacement))
      __obj.asInstanceOf[ReplacementItem]
    }
    
    @scala.inline
    implicit class ReplacementItemMutableBuilder[Self <: ReplacementItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPattern(value: RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacement(value: (String, /* repeated */ js.Any) => String): Self = StObject.set(x, "replacement", js.Any.fromFunction2(value))
    }
  }
  
  type StringReplacePlugin = Plugin
}
