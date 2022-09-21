package typings.reactPlyr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Active extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
  }
  object Active {
    
    inline def apply(): Active = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Active]
    }
    
    extension [Self <: Active](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  trait Controls extends StObject {
    
    var controls: js.UndefOr[Boolean] = js.undefined
    
    var seek: js.UndefOr[Boolean] = js.undefined
  }
  object Controls {
    
    inline def apply(): Controls = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Controls]
    }
    
    extension [Self <: Controls](x: Self) {
      
      inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setSeek(value: Boolean): Self = StObject.set(x, "seek", value.asInstanceOf[js.Any])
      
      inline def setSeekUndefined: Self = StObject.set(x, "seek", js.undefined)
    }
  }
  
  trait Default extends StObject {
    
    var default: js.UndefOr[String | Double] = js.undefined
    
    var option: js.UndefOr[js.Array[Double | String]] = js.undefined
  }
  object Default {
    
    inline def apply(): Default = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Default]
    }
    
    extension [Self <: Default](x: Self) {
      
      inline def setDefault(value: String | Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setOption(value: js.Array[Double | String]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      inline def setOptionVarargs(value: (Double | String)*): Self = StObject.set(x, "option", js.Array(value*))
    }
  }
  
  trait Enabled extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var fallback: js.UndefOr[Boolean] = js.undefined
    
    var iosNative: js.UndefOr[Boolean] = js.undefined
  }
  object Enabled {
    
    inline def apply(): Enabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enabled]
    }
    
    extension [Self <: Enabled](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFallback(value: Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setIosNative(value: Boolean): Self = StObject.set(x, "iosNative", value.asInstanceOf[js.Any])
      
      inline def setIosNativeUndefined: Self = StObject.set(x, "iosNative", js.undefined)
    }
  }
  
  trait Focused extends StObject {
    
    var focused: js.UndefOr[Boolean] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
  }
  object Focused {
    
    inline def apply(): Focused = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Focused]
    }
    
    extension [Self <: Focused](x: Self) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
  }
  object Key {
    
    inline def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait Kind extends StObject {
    
    var default: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Any] = js.undefined
    
    var kind: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var src: String
    
    var srclang: js.UndefOr[String] = js.undefined
  }
  object Kind {
    
    inline def apply(src: String): Kind = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Kind]
    }
    
    extension [Self <: Kind](x: Self) {
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrclang(value: String): Self = StObject.set(x, "srclang", value.asInstanceOf[js.Any])
      
      inline def setSrclangUndefined: Self = StObject.set(x, "srclang", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var options: js.UndefOr[js.Array[Double]] = js.undefined
    
    var selected: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: js.Array[Double]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: Double*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  trait Size extends StObject {
    
    var size: js.UndefOr[String] = js.undefined
    
    var src: String
    
    var `type`: String
  }
  object Size {
    
    inline def apply(src: String, `type`: String): Size = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
