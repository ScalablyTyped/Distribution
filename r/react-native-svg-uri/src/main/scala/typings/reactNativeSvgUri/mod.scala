package typings.reactNativeSvgUri

import typings.react.mod.Component
import typings.reactNative.mod.ImageURISource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-svg-uri", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SvgUriProps, js.Object, Any]
  
  type SvgUri = Component[SvgUriProps, js.Object, Any]
  
  trait SvgUriProps extends StObject {
    
    /**
      * Fill color for the svg object
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /**
      * The height of the rendered svg
      */
    var height: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Source path for the .svg file
      * Expects a require('path') to the file or object with uri.
      * e.g. source={require('my-path')}
      * e.g. source={{ur: 'my-path'}}
      */
    var source: js.UndefOr[ImageURISource] = js.undefined
    
    /**
      * Direct svg code to render. Similar to inline svg
      */
    var svgXmlData: js.UndefOr[String] = js.undefined
    
    /**
      * The width of the rendered svg
      */
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object SvgUriProps {
    
    inline def apply(): SvgUriProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgUriProps]
    }
    
    extension [Self <: SvgUriProps](x: Self) {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSource(value: ImageURISource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSvgXmlData(value: String): Self = StObject.set(x, "svgXmlData", value.asInstanceOf[js.Any])
      
      inline def setSvgXmlDataUndefined: Self = StObject.set(x, "svgXmlData", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
