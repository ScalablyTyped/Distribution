package typings.shortCssVars

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("short-css-vars", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with ShortCssVars {
    def this(options: Options) = this()
    
    /**
      * Get a mapping of original names to shortened names
      *
      * @example
      * {
      *   'long-variable-name-that-defines-a-particular-color': '1vf2dsn'
      * }
      * @returns map
      */
    /* CompleteClass */
    override def getMap(): StringDictionary[String] = js.native
    
    /**
      * Shortens the names of variables throughout CSS
      * @param css - Text containing CSS variables
      * @returns shortened CSS
      */
    /* CompleteClass */
    override def replaceCss(css: String): String = js.native
    
    /**
      * Shortens the name part of a variable string
      * @param varName - Variable name including -- prefix
      * @returns short
      */
    /* CompleteClass */
    override def replaceName(varName: String): String = js.native
  }
  
  type CustomFormatter = js.Function1[/* name */ String, String]
  
  type CustomIgnore = js.Function1[/* name */ String, Boolean]
  
  type IgnoreType = RegExp | String | CustomIgnore
  
  /**
    * Optional configurations
    */
  trait Options extends StObject {
    
    /**
      * Custom formatter
      */
    var formatter: js.UndefOr[CustomFormatter] = js.undefined
    
    /**
      * Rule to ignore certain variable names
      */
    var ignore: js.UndefOr[IgnoreType] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormatter(value: /* name */ String => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setIgnore(value: IgnoreType): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreFunction1(value: /* name */ String => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    }
  }
  
  trait ShortCssVars extends StObject {
    
    /**
      * Get a mapping of original names to shortened names
      *
      * @example
      * {
      *   'long-variable-name-that-defines-a-particular-color': '1vf2dsn'
      * }
      * @returns map
      */
    def getMap(): StringDictionary[String]
    
    /**
      * Shortens the names of variables throughout CSS
      * @param css - Text containing CSS variables
      * @returns shortened CSS
      */
    def replaceCss(css: String): String
    
    /**
      * Shortens the name part of a variable string
      * @param varName - Variable name including -- prefix
      * @returns short
      */
    def replaceName(varName: String): String
  }
  object ShortCssVars {
    
    @scala.inline
    def apply(
      getMap: () => StringDictionary[String],
      replaceCss: String => String,
      replaceName: String => String
    ): ShortCssVars = {
      val __obj = js.Dynamic.literal(getMap = js.Any.fromFunction0(getMap), replaceCss = js.Any.fromFunction1(replaceCss), replaceName = js.Any.fromFunction1(replaceName))
      __obj.asInstanceOf[ShortCssVars]
    }
    
    @scala.inline
    implicit class ShortCssVarsMutableBuilder[Self <: ShortCssVars] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetMap(value: () => StringDictionary[String]): Self = StObject.set(x, "getMap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReplaceCss(value: String => String): Self = StObject.set(x, "replaceCss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReplaceName(value: String => String): Self = StObject.set(x, "replaceName", js.Any.fromFunction1(value))
    }
  }
}
