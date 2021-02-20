package typings.reactSpinners

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  type CalcFunction[T] = js.Function0[T]
  
  @js.native
  trait CommonProps extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var css: js.UndefOr[String | PrecompiledCss] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
  }
  object CommonProps {
    
    @scala.inline
    def apply(): CommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonProps]
    }
    
    @scala.inline
    implicit class CommonPropsMutableBuilder[Self <: CommonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCss(value: String | PrecompiledCss): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    }
  }
  
  @js.native
  trait LengthObject extends StObject {
    
    var unit: String = js.native
    
    var value: Double = js.native
  }
  object LengthObject {
    
    @scala.inline
    def apply(unit: String, value: Double): LengthObject = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LengthObject]
    }
    
    @scala.inline
    implicit class LengthObjectMutableBuilder[Self <: LengthObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type LengthType = Double | String
  
  @js.native
  trait LoaderHeightWidthProps extends CommonProps {
    
    var height: js.UndefOr[LengthType] = js.native
    
    var width: js.UndefOr[LengthType] = js.native
  }
  object LoaderHeightWidthProps {
    
    @scala.inline
    def apply(): LoaderHeightWidthProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderHeightWidthProps]
    }
    
    @scala.inline
    implicit class LoaderHeightWidthPropsMutableBuilder[Self <: LoaderHeightWidthProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: LengthType): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: LengthType): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait LoaderHeightWidthRadiusProps extends LoaderHeightWidthProps {
    
    var margin: js.UndefOr[LengthType] = js.native
    
    var radius: js.UndefOr[LengthType] = js.native
  }
  object LoaderHeightWidthRadiusProps {
    
    @scala.inline
    def apply(): LoaderHeightWidthRadiusProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderHeightWidthRadiusProps]
    }
    
    @scala.inline
    implicit class LoaderHeightWidthRadiusPropsMutableBuilder[Self <: LoaderHeightWidthRadiusProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMargin(value: LengthType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setRadius(value: LengthType): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  @js.native
  trait LoaderSizeMarginProps extends LoaderSizeProps {
    
    var margin: js.UndefOr[LengthType] = js.native
  }
  object LoaderSizeMarginProps {
    
    @scala.inline
    def apply(): LoaderSizeMarginProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderSizeMarginProps]
    }
    
    @scala.inline
    implicit class LoaderSizeMarginPropsMutableBuilder[Self <: LoaderSizeMarginProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMargin(value: LengthType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    }
  }
  
  @js.native
  trait LoaderSizeProps extends CommonProps {
    
    var size: js.UndefOr[LengthType] = js.native
  }
  object LoaderSizeProps {
    
    @scala.inline
    def apply(): LoaderSizeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderSizeProps]
    }
    
    @scala.inline
    implicit class LoaderSizePropsMutableBuilder[Self <: LoaderSizeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: LengthType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait PrecompiledCss extends StObject {
    
    var name: String = js.native
    
    var styles: String = js.native
  }
  object PrecompiledCss {
    
    @scala.inline
    def apply(name: String, styles: String): PrecompiledCss = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrecompiledCss]
    }
    
    @scala.inline
    implicit class PrecompiledCssMutableBuilder[Self <: PrecompiledCss] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
  
  type StyleFunction = js.Function0[PrecompiledCss]
  
  type StyleFunctionWithIndex = js.Function1[/* i */ Double, PrecompiledCss]
}
