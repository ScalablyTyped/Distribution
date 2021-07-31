package typings.storybookComponents

import typings.react.mod.Component
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactElement
import typings.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomIFrameMod {
  
  @JSImport("@storybook/components/dist/Zoom/ZoomIFrame", "ZoomIFrame")
  @js.native
  class ZoomIFrame protected ()
    extends Component[IZoomIFrameProps, js.Object, js.Any] {
    def this(props: IZoomIFrameProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IZoomIFrameProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MZoomIFrame(): Unit = js.native
    
    var iframe: HTMLIFrameElement = js.native
    
    def setIframeInnerZoom(scale: Double): Unit = js.native
    
    def setIframeZoom(scale: Double): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MZoomIFrame(nextProps: IZoomIFrameProps): Boolean = js.native
  }
  
  trait IZoomIFrameProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var children: ReactElement
    
    var iFrameRef: MutableRefObject[HTMLIFrameElement]
    
    var scale: Double
  }
  object IZoomIFrameProps {
    
    @scala.inline
    def apply(children: ReactElement, iFrameRef: MutableRefObject[HTMLIFrameElement], scale: Double): IZoomIFrameProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], iFrameRef = iFrameRef.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[IZoomIFrameProps]
    }
    
    @scala.inline
    implicit class IZoomIFramePropsMutableBuilder[Self <: IZoomIFrameProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIFrameRef(value: MutableRefObject[HTMLIFrameElement]): Self = StObject.set(x, "iFrameRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
}
