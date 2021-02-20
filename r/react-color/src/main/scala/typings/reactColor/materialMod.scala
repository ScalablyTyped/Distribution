package typings.reactColor

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactColor.anon.PartialClassesMaterialPic
import typings.reactColor.mod.ColorPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialMod {
  
  @JSImport("react-color/lib/components/material/Material", JSImport.Default)
  @js.native
  class default ()
    extends Component[MaterialPickerProps, js.Object, js.Any]
  
  @js.native
  trait MaterialPicker
    extends Component[MaterialPickerProps, js.Object, js.Any]
  
  @js.native
  trait MaterialPickerProps extends ColorPickerProps[MaterialPicker] {
    
    @JSName("styles")
    var styles_MaterialPickerProps: js.UndefOr[PartialClassesMaterialPic] = js.native
  }
  object MaterialPickerProps {
    
    @scala.inline
    def apply(): MaterialPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaterialPickerProps]
    }
    
    @scala.inline
    implicit class MaterialPickerPropsMutableBuilder[Self <: MaterialPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: PartialClassesMaterialPic): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait MaterialPickerStylesProps extends StObject {
    
    var HEXinput: CSSProperties = js.native
    
    var HEXlabel: CSSProperties = js.native
    
    var HEXwrap: CSSProperties = js.native
    
    var Hex: CSSProperties = js.native
    
    var RGBinput: CSSProperties = js.native
    
    var RGBlabel: CSSProperties = js.native
    
    var RGBwrap: CSSProperties = js.native
    
    var material: CSSProperties = js.native
    
    var split: CSSProperties = js.native
    
    var third: CSSProperties = js.native
  }
  object MaterialPickerStylesProps {
    
    @scala.inline
    def apply(
      HEXinput: CSSProperties,
      HEXlabel: CSSProperties,
      HEXwrap: CSSProperties,
      Hex: CSSProperties,
      RGBinput: CSSProperties,
      RGBlabel: CSSProperties,
      RGBwrap: CSSProperties,
      material: CSSProperties,
      split: CSSProperties,
      third: CSSProperties
    ): MaterialPickerStylesProps = {
      val __obj = js.Dynamic.literal(HEXinput = HEXinput.asInstanceOf[js.Any], HEXlabel = HEXlabel.asInstanceOf[js.Any], HEXwrap = HEXwrap.asInstanceOf[js.Any], Hex = Hex.asInstanceOf[js.Any], RGBinput = RGBinput.asInstanceOf[js.Any], RGBlabel = RGBlabel.asInstanceOf[js.Any], RGBwrap = RGBwrap.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any], third = third.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaterialPickerStylesProps]
    }
    
    @scala.inline
    implicit class MaterialPickerStylesPropsMutableBuilder[Self <: MaterialPickerStylesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHEXinput(value: CSSProperties): Self = StObject.set(x, "HEXinput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHEXlabel(value: CSSProperties): Self = StObject.set(x, "HEXlabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHEXwrap(value: CSSProperties): Self = StObject.set(x, "HEXwrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHex(value: CSSProperties): Self = StObject.set(x, "Hex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaterial(value: CSSProperties): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRGBinput(value: CSSProperties): Self = StObject.set(x, "RGBinput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRGBlabel(value: CSSProperties): Self = StObject.set(x, "RGBlabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRGBwrap(value: CSSProperties): Self = StObject.set(x, "RGBwrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplit(value: CSSProperties): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThird(value: CSSProperties): Self = StObject.set(x, "third", value.asInstanceOf[js.Any])
    }
  }
}
