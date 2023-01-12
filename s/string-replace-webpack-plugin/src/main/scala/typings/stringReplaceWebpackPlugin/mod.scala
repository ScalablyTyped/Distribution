package typings.stringReplaceWebpackPlugin

import typings.webpack.mod.Plugin
import typings.webpack.mod.RuleSetUse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("string-replace-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject
  @JSImport("string-replace-webpack-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def replace(options: Options): RuleSetUse = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any]).asInstanceOf[RuleSetUse]
  inline def replace(options: Options, /**
    * loaders to follow the replacement
    */
  nextLoaders: String): RuleSetUse = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any], nextLoaders.asInstanceOf[js.Any])).asInstanceOf[RuleSetUse]
  /* static member */
  inline def replace(/**
    * loaders to apply prior to the replacement
    */
  prevLoaders: String, options: Options): RuleSetUse = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(prevLoaders.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RuleSetUse]
  inline def replace(
    /**
    * loaders to apply prior to the replacement
    */
  prevLoaders: String,
    options: Options,
    /**
    * loaders to follow the replacement
    */
  nextLoaders: String
  ): RuleSetUse = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(prevLoaders.asInstanceOf[js.Any], options.asInstanceOf[js.Any], nextLoaders.asInstanceOf[js.Any])).asInstanceOf[RuleSetUse]
  
  trait Options extends StObject {
    
    var replacements: js.Array[ReplacementItem]
  }
  object Options {
    
    inline def apply(replacements: js.Array[ReplacementItem]): Options = {
      val __obj = js.Dynamic.literal(replacements = replacements.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setReplacements(value: js.Array[ReplacementItem]): Self = StObject.set(x, "replacements", value.asInstanceOf[js.Any])
      
      inline def setReplacementsVarargs(value: ReplacementItem*): Self = StObject.set(x, "replacements", js.Array(value*))
    }
  }
  
  trait ReplacementItem extends StObject {
    
    /**
      * a regex to match against the file contents
      */
    var pattern: js.RegExp
    
    /**
      * an ECMAScript string replacement function
      * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/replace#Specifying_a_function_as_a_parameter
      */
    def replacement(substring: String, args: Any*): String
  }
  object ReplacementItem {
    
    inline def apply(pattern: js.RegExp, replacement: (String, /* repeated */ Any) => String): ReplacementItem = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], replacement = js.Any.fromFunction2(replacement))
      __obj.asInstanceOf[ReplacementItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReplacementItem] (val x: Self) extends AnyVal {
      
      inline def setPattern(value: js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setReplacement(value: (String, /* repeated */ Any) => String): Self = StObject.set(x, "replacement", js.Any.fromFunction2(value))
    }
  }
  
  type StringReplacePlugin = Plugin
}
