package typings.slug

import org.scalablytyped.runtime.StringDictionary
import typings.slug.anon.Pretty
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(string: String): String = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(string: String, opts: String): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(string: String, opts: Mode): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
    @scala.inline
    def charmap_=(x: CharMap_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("charmap")(x.asInstanceOf[js.Any])
    
    @JSImport("slug", "defaults.mode")
    @js.native
    def mode: String = js.native
    @scala.inline
    def mode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("slug", "defaults.modes")
    @js.native
    def modes: Pretty = js.native
    @scala.inline
    def modes_=(x: Pretty): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modes")(x.asInstanceOf[js.Any])
    
    @JSImport("slug", "defaults.multicharmap")
    @js.native
    def multicharmap: CharMap_ = js.native
    @scala.inline
    def multicharmap_=(x: CharMap_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multicharmap")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("slug", "multicharmap")
  @js.native
  val multicharmap: CharMap_ = js.native
  
  type CharMap_ = StringDictionary[String]
  
  trait Mode extends StObject {
    
    var charmap: js.UndefOr[CharMap_ | Null] = js.undefined
    
    var lower: js.UndefOr[Boolean | Null] = js.undefined
    
    var multicharmap: js.UndefOr[CharMap_ | Null] = js.undefined
    
    var remove: js.UndefOr[RegExp | Null] = js.undefined
    
    var replacement: js.UndefOr[String | Null] = js.undefined
    
    var symbols: js.UndefOr[Boolean | Null] = js.undefined
  }
  object Mode {
    
    @scala.inline
    def apply(): Mode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mode]
    }
    
    @scala.inline
    implicit class ModeMutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharmap(value: CharMap_): Self = StObject.set(x, "charmap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharmapNull: Self = StObject.set(x, "charmap", null)
      
      @scala.inline
      def setCharmapUndefined: Self = StObject.set(x, "charmap", js.undefined)
      
      @scala.inline
      def setLower(value: Boolean): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowerNull: Self = StObject.set(x, "lower", null)
      
      @scala.inline
      def setLowerUndefined: Self = StObject.set(x, "lower", js.undefined)
      
      @scala.inline
      def setMulticharmap(value: CharMap_): Self = StObject.set(x, "multicharmap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMulticharmapNull: Self = StObject.set(x, "multicharmap", null)
      
      @scala.inline
      def setMulticharmapUndefined: Self = StObject.set(x, "multicharmap", js.undefined)
      
      @scala.inline
      def setRemove(value: RegExp): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveNull: Self = StObject.set(x, "remove", null)
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacementNull: Self = StObject.set(x, "replacement", null)
      
      @scala.inline
      def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
      
      @scala.inline
      def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolsNull: Self = StObject.set(x, "symbols", null)
      
      @scala.inline
      def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    }
  }
}
