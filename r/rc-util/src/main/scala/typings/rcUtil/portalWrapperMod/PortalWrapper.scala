package typings.rcUtil.portalWrapperMod

import typings.rcUtil.anon.AfterClose
import typings.rcUtil.portalMod.PortalRef
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
