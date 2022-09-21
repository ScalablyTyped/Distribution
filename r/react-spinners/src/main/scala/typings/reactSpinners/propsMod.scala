package typings.reactSpinners

import typings.react.mod.CSSProperties
import typings.react.mod.ClassAttributes
import typings.react.mod.HTMLAttributes
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propsMod {
  
  trait CommonProps
    extends StObject
       with ClassAttributes[HTMLSpanElement]
       with HTMLAttributes[HTMLSpanElement] {
    
    var cssOverride: js.UndefOr[CSSProperties] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var speedMultiplier: js.UndefOr[Double] = js.undefined
  }
  object CommonProps {
    
    inline def apply(): CommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonProps]
    }
    
    extension [Self <: CommonProps](x: Self) {
      
      inline def setCssOverride(value: CSSProperties): Self = StObject.set(x, "cssOverride", value.asInstanceOf[js.Any])
      
      inline def setCssOverrideUndefined: Self = StObject.set(x, "cssOverride", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setSpeedMultiplier(value: Double): Self = StObject.set(x, "speedMultiplier", value.asInstanceOf[js.Any])
      
      inline def setSpeedMultiplierUndefined: Self = StObject.set(x, "speedMultiplier", js.undefined)
    }
  }
  
  type LengthType = Double | String
  
  trait LoaderHeightWidthProps
    extends StObject
       with CommonProps {
    
    var height: js.UndefOr[LengthType] = js.undefined
    
    var width: js.UndefOr[LengthType] = js.undefined
  }
  object LoaderHeightWidthProps {
    
    inline def apply(): LoaderHeightWidthProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderHeightWidthProps]
    }
    
    extension [Self <: LoaderHeightWidthProps](x: Self) {
      
      inline def setHeight(value: LengthType): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: LengthType): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LoaderHeightWidthRadiusProps
    extends StObject
       with CommonProps {
    
    var height: js.UndefOr[LengthType] = js.undefined
    
    var margin: js.UndefOr[LengthType] = js.undefined
    
    var radius: js.UndefOr[LengthType] = js.undefined
    
    var width: js.UndefOr[LengthType] = js.undefined
  }
  object LoaderHeightWidthRadiusProps {
    
    inline def apply(): LoaderHeightWidthRadiusProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderHeightWidthRadiusProps]
    }
    
    extension [Self <: LoaderHeightWidthRadiusProps](x: Self) {
      
      inline def setHeight(value: LengthType): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMargin(value: LengthType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setRadius(value: LengthType): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setWidth(value: LengthType): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LoaderSizeMarginProps
    extends StObject
       with CommonProps {
    
    var margin: js.UndefOr[LengthType] = js.undefined
    
    var size: js.UndefOr[LengthType] = js.undefined
  }
  object LoaderSizeMarginProps {
    
    inline def apply(): LoaderSizeMarginProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderSizeMarginProps]
    }
    
    extension [Self <: LoaderSizeMarginProps](x: Self) {
      
      inline def setMargin(value: LengthType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setSize(value: LengthType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait LoaderSizeProps
    extends StObject
       with CommonProps {
    
    var size: js.UndefOr[LengthType] = js.undefined
  }
  object LoaderSizeProps {
    
    inline def apply(): LoaderSizeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderSizeProps]
    }
    
    extension [Self <: LoaderSizeProps](x: Self) {
      
      inline def setSize(value: LengthType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
