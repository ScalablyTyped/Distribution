package typings.reactHolder

import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-holder", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReactHolderProp, js.Object, js.Any]
  
  @js.native
  trait ReactHolder
    extends Component[ReactHolderProp, js.Object, js.Any]
  
  trait ReactHolderProp
    extends StObject
       with HTMLAttributes[ReactHolder] {
    
    var align: js.UndefOr[String] = js.undefined
    
    var bg: js.UndefOr[String] = js.undefined
    
    var fg: js.UndefOr[String] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var height: String | Double
    
    var lineWrap: js.UndefOr[Double] = js.undefined
    
    var outline: js.UndefOr[Boolean] = js.undefined
    
    var random: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    // config args
    var theme: js.UndefOr[String] = js.undefined
    
    var updateOnResize: Boolean
    
    var width: String | Double
  }
  object ReactHolderProp {
    
    inline def apply(height: String | Double, updateOnResize: Boolean, width: String | Double): ReactHolderProp = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], updateOnResize = updateOnResize.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactHolderProp]
    }
    
    extension [Self <: ReactHolderProp](x: Self) {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLineWrap(value: Double): Self = StObject.set(x, "lineWrap", value.asInstanceOf[js.Any])
      
      inline def setLineWrapUndefined: Self = StObject.set(x, "lineWrap", js.undefined)
      
      inline def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      inline def setRandom(value: Boolean): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      inline def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUpdateOnResize(value: Boolean): Self = StObject.set(x, "updateOnResize", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
