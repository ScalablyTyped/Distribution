package typings.speakingurl

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("speakingurl", JSImport.Namespace)
  @js.native
  def apply(input: String): String = js.native
  @JSImport("speakingurl", JSImport.Namespace)
  @js.native
  def apply(input: String, options: String): String = js.native
  @JSImport("speakingurl", JSImport.Namespace)
  @js.native
  def apply(input: String, options: SpeakingURLOptions): String = js.native
  
  @JSImport("speakingurl", "createSlug")
  @js.native
  def createSlug(options: SpeakingURLOptions): js.Function1[/* input */ String, String] = js.native
  
  type Dictionary[T] = StringDictionary[T]
  
  @js.native
  trait SpeakingURLOptions extends StObject {
    
    var custom: js.UndefOr[js.Array[String] | Dictionary[String]] = js.native
    
    var lang: js.UndefOr[String | Boolean] = js.native
    
    var maintainCase: js.UndefOr[Boolean] = js.native
    
    var mark: js.UndefOr[Boolean] = js.native
    
    var separator: js.UndefOr[String] = js.native
    
    var symbols: js.UndefOr[Boolean] = js.native
    
    var titleCase: js.UndefOr[js.Array[String] | Boolean] = js.native
    
    var truncate: js.UndefOr[Double] = js.native
    
    var uric: js.UndefOr[Boolean] = js.native
    
    var uricNoSlash: js.UndefOr[Boolean] = js.native
  }
  object SpeakingURLOptions {
    
    @scala.inline
    def apply(): SpeakingURLOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpeakingURLOptions]
    }
    
    @scala.inline
    implicit class SpeakingURLOptionsMutableBuilder[Self <: SpeakingURLOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom(value: js.Array[String] | Dictionary[String]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setCustomVarargs(value: String*): Self = StObject.set(x, "custom", js.Array(value :_*))
      
      @scala.inline
      def setLang(value: String | Boolean): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setMaintainCase(value: Boolean): Self = StObject.set(x, "maintainCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainCaseUndefined: Self = StObject.set(x, "maintainCase", js.undefined)
      
      @scala.inline
      def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      
      @scala.inline
      def setTitleCase(value: js.Array[String] | Boolean): Self = StObject.set(x, "titleCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleCaseUndefined: Self = StObject.set(x, "titleCase", js.undefined)
      
      @scala.inline
      def setTitleCaseVarargs(value: String*): Self = StObject.set(x, "titleCase", js.Array(value :_*))
      
      @scala.inline
      def setTruncate(value: Double): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      @scala.inline
      def setUric(value: Boolean): Self = StObject.set(x, "uric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUricNoSlash(value: Boolean): Self = StObject.set(x, "uricNoSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUricNoSlashUndefined: Self = StObject.set(x, "uricNoSlash", js.undefined)
      
      @scala.inline
      def setUricUndefined: Self = StObject.set(x, "uric", js.undefined)
    }
  }
}
