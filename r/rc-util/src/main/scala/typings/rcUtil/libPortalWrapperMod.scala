package typings.rcUtil

import typings.rcUtil.anon.AfterClose
import typings.rcUtil.anon.PartialPortalWrapperProps
import typings.rcUtil.libPortalMod.PortalRef
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPortalWrapperMod {
  
  @JSImport("rc-util/lib/PortalWrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-util/lib/PortalWrapper", JSImport.Default)
  @js.native
  open class default protected () extends PortalWrapper {
    def this(props: PortalWrapperProps) = this()
  }
  
  inline def getOpenCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOpenCount")().asInstanceOf[Double]
  
  type GetContainer = String | HTMLElement | js.Function0[HTMLElement]
  
  @js.native
  trait PortalWrapper
    extends Component[PortalWrapperProps, js.Object, Any] {
    
    def attachToParent(): Boolean = js.native
    def attachToParent(force: Boolean): Boolean = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPortalWrapper(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPortalWrapper(prevProps: PortalWrapperProps): Unit = js.native
    
    var componentRef: RefObject[PortalRef] = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPortalWrapper(): Unit = js.native
    
    var container: js.UndefOr[HTMLElement] = js.native
    
    def getContainer(): HTMLElement = js.native
    
    var rafId: js.UndefOr[Double] = js.native
    
    def removeCurrentContainer(): Unit = js.native
    
    var renderComponent: js.UndefOr[js.Function1[/* info */ AfterClose, Unit]] = js.native
    
    var scrollLocker: typings.rcUtil.libDomScrollLockerMod.default = js.native
    
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
    
    def updateOpenCount(): Unit = js.native
    def updateOpenCount(prevProps: PartialPortalWrapperProps): Unit = js.native
    
    def updateScrollLocker(): Unit = js.native
    def updateScrollLocker(prevProps: PartialPortalWrapperProps): Unit = js.native
  }
  
  trait PortalWrapperProps extends StObject {
    
    def children(info: typings.rcUtil.anon.GetContainer): ReactNode
    
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    var getContainer: js.UndefOr[GetContainer] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var wrapperClassName: js.UndefOr[String] = js.undefined
  }
  object PortalWrapperProps {
    
    inline def apply(children: typings.rcUtil.anon.GetContainer => ReactNode): PortalWrapperProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[PortalWrapperProps]
    }
    
    extension [Self <: PortalWrapperProps](x: Self) {
      
      inline def setChildren(value: typings.rcUtil.anon.GetContainer => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setGetContainer(value: GetContainer): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      inline def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
      
      inline def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
    }
  }
}
