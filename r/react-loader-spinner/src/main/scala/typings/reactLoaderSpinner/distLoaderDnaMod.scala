package typings.reactLoaderSpinner

import typings.react.mod.global.JSX.Element
import typings.reactLoaderSpinner.distTypeMod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoaderDnaMod {
  
  @JSImport("react-loader-spinner/dist/loader/Dna", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: DNAProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  /* Inlined parent std.Omit<react-loader-spinner.react-loader-spinner/dist/type.BaseProps, 'color'> */
  trait DNAProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
    
    var wrapperClass: js.UndefOr[String] = js.undefined
    
    var wrapperStyle: js.UndefOr[Style] = js.undefined
  }
  object DNAProps {
    
    inline def apply(): DNAProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DNAProps]
    }
    
    extension [Self <: DNAProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapperClass(value: String): Self = StObject.set(x, "wrapperClass", value.asInstanceOf[js.Any])
      
      inline def setWrapperClassUndefined: Self = StObject.set(x, "wrapperClass", js.undefined)
      
      inline def setWrapperStyle(value: Style): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
}
