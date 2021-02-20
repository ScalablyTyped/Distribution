package typings.reactHolder

import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-holder", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReactHolderProp, js.Object, js.Any]
  
  @js.native
  trait ReactHolder
    extends Component[ReactHolderProp, js.Object, js.Any]
  
  @js.native
  trait ReactHolderProp extends HTMLAttributes[ReactHolder] {
    
    var align: js.UndefOr[String] = js.native
    
    var bg: js.UndefOr[String] = js.native
    
    var fg: js.UndefOr[String] = js.native
    
    var font: js.UndefOr[String] = js.native
    
    var height: String | Double = js.native
    
    var lineWrap: js.UndefOr[Double] = js.native
    
    var outline: js.UndefOr[Boolean] = js.native
    
    var random: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    // config args
    var theme: js.UndefOr[String] = js.native
    
    var updateOnResize: Boolean = js.native
    
    var width: String | Double = js.native
  }
  object ReactHolderProp {
    
    @scala.inline
    def apply(height: String | Double, updateOnResize: Boolean, width: String | Double): ReactHolderProp = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], updateOnResize = updateOnResize.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactHolderProp]
    }
    
    @scala.inline
    implicit class ReactHolderPropMutableBuilder[Self <: ReactHolderProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      @scala.inline
      def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWrap(value: Double): Self = StObject.set(x, "lineWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWrapUndefined: Self = StObject.set(x, "lineWrap", js.undefined)
      
      @scala.inline
      def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      @scala.inline
      def setRandom(value: Boolean): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setUpdateOnResize(value: Boolean): Self = StObject.set(x, "updateOnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
