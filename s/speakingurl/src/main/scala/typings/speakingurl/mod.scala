package typings.speakingurl

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: String): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(input: String, options: String): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(input: String, options: SpeakingURLOptions): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("speakingurl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSlug(options: SpeakingURLOptions): js.Function1[/* input */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSlug")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* input */ String, String]]
  
  type Dictionary[T] = StringDictionary[T]
  
  trait SpeakingURLOptions extends StObject {
    
    var custom: js.UndefOr[js.Array[String] | Dictionary[String]] = js.undefined
    
    var lang: js.UndefOr[String | Boolean] = js.undefined
    
    var maintainCase: js.UndefOr[Boolean] = js.undefined
    
    var mark: js.UndefOr[Boolean] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
    
    var symbols: js.UndefOr[Boolean] = js.undefined
    
    var titleCase: js.UndefOr[js.Array[String] | Boolean] = js.undefined
    
    var truncate: js.UndefOr[Double] = js.undefined
    
    var uric: js.UndefOr[Boolean] = js.undefined
    
    var uricNoSlash: js.UndefOr[Boolean] = js.undefined
  }
  object SpeakingURLOptions {
    
    inline def apply(): SpeakingURLOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpeakingURLOptions]
    }
    
    extension [Self <: SpeakingURLOptions](x: Self) {
      
      inline def setCustom(value: js.Array[String] | Dictionary[String]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setCustomVarargs(value: String*): Self = StObject.set(x, "custom", js.Array(value*))
      
      inline def setLang(value: String | Boolean): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMaintainCase(value: Boolean): Self = StObject.set(x, "maintainCase", value.asInstanceOf[js.Any])
      
      inline def setMaintainCaseUndefined: Self = StObject.set(x, "maintainCase", js.undefined)
      
      inline def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      
      inline def setTitleCase(value: js.Array[String] | Boolean): Self = StObject.set(x, "titleCase", value.asInstanceOf[js.Any])
      
      inline def setTitleCaseUndefined: Self = StObject.set(x, "titleCase", js.undefined)
      
      inline def setTitleCaseVarargs(value: String*): Self = StObject.set(x, "titleCase", js.Array(value*))
      
      inline def setTruncate(value: Double): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      inline def setUric(value: Boolean): Self = StObject.set(x, "uric", value.asInstanceOf[js.Any])
      
      inline def setUricNoSlash(value: Boolean): Self = StObject.set(x, "uricNoSlash", value.asInstanceOf[js.Any])
      
      inline def setUricNoSlashUndefined: Self = StObject.set(x, "uricNoSlash", js.undefined)
      
      inline def setUricUndefined: Self = StObject.set(x, "uric", js.undefined)
    }
  }
}
