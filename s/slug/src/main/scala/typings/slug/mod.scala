package typings.slug

import typings.slug.anon.Pretty
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(string: String): String = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(string: String, opts: Options): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(string: String, replacement: String): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("slug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slug", "charmap")
  @js.native
  val charmap: CharMap_ = js.native
  
  object defaults {
    
    @JSImport("slug", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("slug", "defaults.charmap")
    @js.native
    def charmap: CharMap_ = js.native
    inline def charmap_=(x: CharMap_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("charmap")(x.asInstanceOf[js.Any])
    
    @JSImport("slug", "defaults.mode")
    @js.native
    def mode: String = js.native
    inline def mode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("slug", "defaults.modes")
    @js.native
    def modes: Pretty = js.native
    inline def modes_=(x: Pretty): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modes")(x.asInstanceOf[js.Any])
    
    @JSImport("slug", "defaults.multicharmap")
    @js.native
    def multicharmap: CharMap_ = js.native
    inline def multicharmap_=(x: CharMap_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multicharmap")(x.asInstanceOf[js.Any])
  }
  
  inline def extend(entry: CharMap_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(entry.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("slug", "multicharmap")
  @js.native
  val multicharmap: CharMap_ = js.native
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  type CharMap_ = Record[String, String]
  
  trait Mode extends StObject {
    
    var charmap: js.UndefOr[CharMap_ | Null] = js.undefined
    
    var lower: js.UndefOr[Boolean | Null] = js.undefined
    
    var multicharmap: js.UndefOr[CharMap_ | Null] = js.undefined
    
    var remove: js.UndefOr[js.RegExp | Null] = js.undefined
    
    var replacement: js.UndefOr[String | Null] = js.undefined
    
    var symbols: js.UndefOr[Boolean | Null] = js.undefined
    
    var trim: js.UndefOr[Boolean | Null] = js.undefined
  }
  object Mode {
    
    inline def apply(): Mode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
      
      inline def setCharmap(value: CharMap_): Self = StObject.set(x, "charmap", value.asInstanceOf[js.Any])
      
      inline def setCharmapNull: Self = StObject.set(x, "charmap", null)
      
      inline def setCharmapUndefined: Self = StObject.set(x, "charmap", js.undefined)
      
      inline def setLower(value: Boolean): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
      
      inline def setLowerNull: Self = StObject.set(x, "lower", null)
      
      inline def setLowerUndefined: Self = StObject.set(x, "lower", js.undefined)
      
      inline def setMulticharmap(value: CharMap_): Self = StObject.set(x, "multicharmap", value.asInstanceOf[js.Any])
      
      inline def setMulticharmapNull: Self = StObject.set(x, "multicharmap", null)
      
      inline def setMulticharmapUndefined: Self = StObject.set(x, "multicharmap", js.undefined)
      
      inline def setRemove(value: js.RegExp): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveNull: Self = StObject.set(x, "remove", null)
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
      
      inline def setReplacementNull: Self = StObject.set(x, "replacement", null)
      
      inline def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
      
      inline def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsNull: Self = StObject.set(x, "symbols", null)
      
      inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimNull: Self = StObject.set(x, "trim", null)
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  /* Inlined {  locale :string | undefined} & std.Partial<slug.slug.Mode> */
  trait Options extends StObject {
    
    var charmap: js.UndefOr[CharMap_ | Null] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var lower: js.UndefOr[Boolean | Null] = js.undefined
    
    var multicharmap: js.UndefOr[CharMap_ | Null] = js.undefined
    
    var remove: js.UndefOr[js.RegExp | Null] = js.undefined
    
    var replacement: js.UndefOr[String | Null] = js.undefined
    
    var symbols: js.UndefOr[Boolean | Null] = js.undefined
    
    var trim: js.UndefOr[Boolean | Null] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCharmap(value: CharMap_): Self = StObject.set(x, "charmap", value.asInstanceOf[js.Any])
      
      inline def setCharmapNull: Self = StObject.set(x, "charmap", null)
      
      inline def setCharmapUndefined: Self = StObject.set(x, "charmap", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLower(value: Boolean): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
      
      inline def setLowerNull: Self = StObject.set(x, "lower", null)
      
      inline def setLowerUndefined: Self = StObject.set(x, "lower", js.undefined)
      
      inline def setMulticharmap(value: CharMap_): Self = StObject.set(x, "multicharmap", value.asInstanceOf[js.Any])
      
      inline def setMulticharmapNull: Self = StObject.set(x, "multicharmap", null)
      
      inline def setMulticharmapUndefined: Self = StObject.set(x, "multicharmap", js.undefined)
      
      inline def setRemove(value: js.RegExp): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveNull: Self = StObject.set(x, "remove", null)
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
      
      inline def setReplacementNull: Self = StObject.set(x, "replacement", null)
      
      inline def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
      
      inline def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsNull: Self = StObject.set(x, "symbols", null)
      
      inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimNull: Self = StObject.set(x, "trim", null)
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
}
