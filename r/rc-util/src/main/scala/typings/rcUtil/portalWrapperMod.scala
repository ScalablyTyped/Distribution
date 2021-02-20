package typings.rcUtil

import typings.rcUtil.anon.AfterClose
import typings.rcUtil.anon.PrevProps
import typings.rcUtil.anon.PrevPropsAny
import typings.rcUtil.portalMod.PortalRef
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalWrapperMod {
  
  @JSImport("rc-util/lib/PortalWrapper", JSImport.Default)
  @js.native
  class default protected () extends PortalWrapper {
    def this(props: PortalWrapperProps) = this()
  }
  object default {
    
    /* static member */
    @JSImport("rc-util/lib/PortalWrapper", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: js.Any, hasPrevProps_self: PrevProps): PrevPropsAny = js.native
  }
  
  @JSImport("rc-util/lib/PortalWrapper", "getOpenCount")
  @js.native
  def getOpenCount(): Double = js.native
  
  type GetContainer = String | HTMLElement | js.Function0[HTMLElement]
  
  @js.native
  trait PortalWrapper
    extends Component[PortalWrapperProps, PortalWrapperState, js.Any] {
    
    def attachToParent(): Boolean = js.native
    def attachToParent(force: Boolean): Boolean = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPortalWrapper(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPortalWrapper(): Unit = js.native
    
    var componentRef: RefObject[PortalRef] = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPortalWrapper(): Unit = js.native
    
    var container: js.UndefOr[HTMLElement] = js.native
    
    def getContainer(): HTMLElement = js.native
    
    var rafId: js.UndefOr[Double] = js.native
    
    def removeCurrentContainer(): Unit = js.native
    
    var renderComponent: js.UndefOr[js.Function1[/* info */ AfterClose, Unit]] = js.native
    
    def setWrapperClassName(): Unit = js.native
    
    /**
      * Enhance ./switchScrollingEffect
      * 1. Simulate document body scroll bar with
      * 2. Record body has overflow style and recover when all of PortalWrapper invisible
      * 3. Disable body scroll when PortalWrapper has open
      *
      * @memberof PortalWrapper
      */
    def switchScrollingEffect(): Unit = js.native
  }
  
  @js.native
  trait PortalWrapperProps extends StObject {
    
    def children(info: typings.rcUtil.anon.GetContainer): ReactNode = js.native
    
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var getContainer: js.UndefOr[GetContainer] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var wrapperClassName: js.UndefOr[String] = js.native
  }
  object PortalWrapperProps {
    
    @scala.inline
    def apply(children: typings.rcUtil.anon.GetContainer => ReactNode): PortalWrapperProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[PortalWrapperProps]
    }
    
    @scala.inline
    implicit class PortalWrapperPropsMutableBuilder[Self <: PortalWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: typings.rcUtil.anon.GetContainer => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setGetContainer(value: GetContainer): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
    }
  }
  
  @js.native
  trait PortalWrapperState extends StObject {
    
    var _self: PortalWrapper = js.native
  }
  object PortalWrapperState {
    
    @scala.inline
    def apply(_self: PortalWrapper): PortalWrapperState = {
      val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortalWrapperState]
    }
    
    @scala.inline
    implicit class PortalWrapperStateMutableBuilder[Self <: PortalWrapperState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_self(value: PortalWrapper): Self = StObject.set(x, "_self", value.asInstanceOf[js.Any])
    }
  }
}
