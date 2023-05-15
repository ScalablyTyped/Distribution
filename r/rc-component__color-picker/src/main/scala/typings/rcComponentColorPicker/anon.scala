package typings.rcComponentColorPicker

import typings.rcComponentColorPicker.esComponentsHandlerMod.HandlerSize
import typings.rcComponentColorPicker.esHooksUseColorStateMod.ColorValue
import typings.rcComponentColorPicker.esInterfaceMod.HsbaColorType
import typings.rcComponentColorPicker.esInterfaceMod.TransformOffset
import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var popup: js.UndefOr[CSSProperties] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setPopup(value: CSSProperties): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.undefined
    
    var colors: js.Array[typings.rcComponentColorPicker.esColorMod.Color | String]
    
    var direction: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[HsbaColorType] = js.undefined
  }
  object Children {
    
    inline def apply(colors: js.Array[typings.rcComponentColorPicker.esColorMod.Color | String]): Children = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColors(value: js.Array[typings.rcComponentColorPicker.esColorMod.Color | String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsVarargs(value: (typings.rcComponentColorPicker.esColorMod.Color | String)*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setType(value: HsbaColorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Color extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[HandlerSize] = js.undefined
  }
  object Color {
    
    inline def apply(): Color = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSize(value: HandlerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ContainerRef extends StObject {
    
    var color: js.UndefOr[typings.rcComponentColorPicker.esColorMod.Color] = js.undefined
    
    var containerRef: RefObject[HTMLDivElement]
    
    var offset: TransformOffset
    
    var targetRef: RefObject[HTMLDivElement]
    
    var `type`: js.UndefOr[HsbaColorType] = js.undefined
  }
  object ContainerRef {
    
    inline def apply(
      containerRef: RefObject[HTMLDivElement],
      offset: TransformOffset,
      targetRef: RefObject[HTMLDivElement]
    ): ContainerRef = {
      val __obj = js.Dynamic.literal(containerRef = containerRef.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerRef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContainerRef] (val x: Self) extends AnyVal {
      
      inline def setColor(value: typings.rcComponentColorPicker.esColorMod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContainerRef(value: RefObject[HTMLDivElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: TransformOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setTargetRef(value: RefObject[HTMLDivElement]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setType(value: HsbaColorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DefaultValue extends StObject {
    
    var defaultValue: js.UndefOr[ColorValue] = js.undefined
    
    var value: js.UndefOr[ColorValue] = js.undefined
  }
  object DefaultValue {
    
    inline def apply(): DefaultValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultValue] (val x: Self) extends AnyVal {
      
      inline def setDefaultValue(value: ColorValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setValue(value: ColorValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined @ctrl/tinycolor.@ctrl/tinycolor.Numberify<@rc-component/color-picker.@rc-component/color-picker/es/interface.HSBA> */
  trait NumberifyHSBA extends StObject {
    
    var a: Double
    
    var b: Double
    
    var h: Double
    
    var s: Double
  }
  object NumberifyHSBA {
    
    inline def apply(a: Double, b: Double, h: Double, s: Double): NumberifyHSBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberifyHSBA]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberifyHSBA] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  trait Popup extends StObject {
    
    var popup: js.UndefOr[String] = js.undefined
  }
  object Popup {
    
    inline def apply(): Popup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Popup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Popup] (val x: Self) extends AnyVal {
      
      inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    }
  }
  
  trait PrefixCls extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object PrefixCls {
    
    inline def apply(): PrefixCls = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrefixCls]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrefixCls] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined {  offset :@rc-component/color-picker.@rc-component/color-picker/es/interface.TransformOffset | undefined,   children :react.react.ReactNode | undefined} & react.react.RefAttributes<std.HTMLDivElement> */
  trait offsetTransformOffsetunde extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var offset: js.UndefOr[TransformOffset] = js.undefined
    
    /**
      * Allows getting a ref to the component instance.
      * Once the component unmounts, React will set `ref.current` to `null` (or call the ref with `null` if you passed a callback ref).
      * @see https://react.dev/learn/referencing-values-with-refs#refs-and-the-dom
      */
    var ref: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  }
  object offsetTransformOffsetunde {
    
    inline def apply(): offsetTransformOffsetunde = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[offsetTransformOffsetunde]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: offsetTransformOffsetunde] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOffset(value: TransformOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
