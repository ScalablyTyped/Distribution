package typings.storybookComponents

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iframeMod {
  
  @JSImport("@storybook/components/dist/blocks/IFrame", "IFrame")
  @js.native
  class IFrame protected ()
    extends Component[IFrameProps, js.Object, js.Any] {
    def this(props: IFrameProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IFrameProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MIFrame(): Unit = js.native
    
    var iframe: js.Any = js.native
    
    def setIframeBodyStyle(style: BodyStyle): js.Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MIFrame(nextProps: IFrameProps): Boolean = js.native
  }
  
  trait BodyStyle extends StObject {
    
    var height: String
    
    var transform: String
    
    var transformOrigin: String
    
    var width: String
  }
  object BodyStyle {
    
    @scala.inline
    def apply(height: String, transform: String, transformOrigin: String, width: String): BodyStyle = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyStyle]
    }
    
    @scala.inline
    implicit class BodyStyleMutableBuilder[Self <: BodyStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFrameProps extends StObject {
    
    var allowFullScreen: Boolean
    
    var id: String
    
    var key: js.UndefOr[String] = js.undefined
    
    var scale: Double
    
    var src: String
    
    var style: js.UndefOr[js.Any] = js.undefined
    
    var title: String
  }
  object IFrameProps {
    
    @scala.inline
    def apply(allowFullScreen: Boolean, id: String, scale: Double, src: String, title: String): IFrameProps = {
      val __obj = js.Dynamic.literal(allowFullScreen = allowFullScreen.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFrameProps]
    }
    
    @scala.inline
    implicit class IFramePropsMutableBuilder[Self <: IFrameProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
