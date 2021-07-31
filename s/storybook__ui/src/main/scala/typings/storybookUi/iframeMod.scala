package typings.storybookUi

import typings.react.mod.IframeHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iframeMod {
  
  @JSImport("@storybook/ui/dist/components/preview/iframe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def IFrame(props: IFrameProps & IframeHTMLAttributes[HTMLIFrameElement]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IFrame")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait IFrameProps extends StObject {
    
    var active: Boolean
    
    var allowFullScreen: Boolean
    
    var id: String
    
    var scale: Double
    
    var src: String
    
    var title: String
  }
  object IFrameProps {
    
    @scala.inline
    def apply(active: Boolean, allowFullScreen: Boolean, id: String, scale: Double, src: String, title: String): IFrameProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], allowFullScreen = allowFullScreen.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFrameProps]
    }
    
    @scala.inline
    implicit class IFramePropsMutableBuilder[Self <: IFrameProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
