package typings.reactSpinners

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  type CalcFunction[T] = js.Function0[T]
  
  trait CommonProps extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var css: js.UndefOr[String | PrecompiledCss] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
  }
  object CommonProps {
    
    inline def apply(): CommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonProps]
    }
    
    extension [Self <: CommonProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCss(value: String | PrecompiledCss): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    }
  }
  
  trait LengthObject extends StObject {
    
    var unit: String
    
    var value: Double
  }
  object LengthObject {
    
    inline def apply(unit: String, value: Double): LengthObject = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LengthObject]
    }
    
    extension [Self <: LengthObject](x: Self) {
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
       with LoaderHeightWidthProps {
    
    var margin: js.UndefOr[LengthType] = js.undefined
    
    var radius: js.UndefOr[LengthType] = js.undefined
  }
  object LoaderHeightWidthRadiusProps {
    
    inline def apply(): LoaderHeightWidthRadiusProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderHeightWidthRadiusProps]
    }
    
    extension [Self <: LoaderHeightWidthRadiusProps](x: Self) {
      
      inline def setMargin(value: LengthType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setRadius(value: LengthType): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  trait LoaderSizeMarginProps
    extends StObject
       with LoaderSizeProps {
    
    var margin: js.UndefOr[LengthType] = js.undefined
  }
  object LoaderSizeMarginProps {
    
    inline def apply(): LoaderSizeMarginProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderSizeMarginProps]
    }
    
    extension [Self <: LoaderSizeMarginProps](x: Self) {
      
      inline def setMargin(value: LengthType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
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
  
  trait PrecompiledCss extends StObject {
    
    var name: String
    
    var styles: String
  }
  object PrecompiledCss {
    
    inline def apply(name: String, styles: String): PrecompiledCss = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrecompiledCss]
    }
    
    extension [Self <: PrecompiledCss](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
  
  type StyleFunction = js.Function0[PrecompiledCss]
  
  type StyleFunctionWithIndex = js.Function1[/* i */ Double, PrecompiledCss]
}
