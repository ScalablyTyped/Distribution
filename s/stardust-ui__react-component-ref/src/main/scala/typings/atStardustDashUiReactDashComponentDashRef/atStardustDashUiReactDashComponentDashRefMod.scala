package typings.atStardustDashUiReactDashComponentDashRef

import typings.atStardustDashUiReactDashComponentDashRef.distEsRefFindNodeMod.default
import typings.atStardustDashUiReactDashComponentDashRef.distEsTypesMod.RefProps
import typings.propDashTypes.propDashTypesMod.Requireable
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.RefObject
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@stardust-ui/react-component-ref", JSImport.Namespace)
@js.native
object atStardustDashUiReactDashComponentDashRefMod extends js.Object {
  @js.native
  class RefFindNode () extends default
  
  @js.native
  class RefForward ()
    extends typings.atStardustDashUiReactDashComponentDashRef.distEsRefForwardMod.default
  
  val Ref: FunctionComponent[RefProps] = js.native
  val refPropType: Requireable[typings.react.reactMod.Ref[js.Any]] = js.native
  /**
    * The function that correctly handles passing refs.
    *
    * @param ref An ref object or function
    * @param node A node that should be passed by ref
    */
  def handleRef[N](ref: typings.react.reactMod.Ref[N], node: N): Unit = js.native
  /** Checks that the passed object is a valid React ref object. */
  def isRefObject(ref: js.Any): /* is react.react.RefObject<any> */ Boolean = js.native
  /** Creates a React ref object from existing DOM node. */
  def toRefObject[T /* <: Node */](node: T): RefObject[T] = js.native
  /* static members */
  @js.native
  object RefFindNode extends js.Object {
    var displayName: String = js.native
    var propTypes: Anon_Children | Anon_ChildrenInnerRef = js.native
  }
  
  /* static members */
  @js.native
  object RefForward extends js.Object {
    var displayName: String = js.native
    var propTypes: Anon_Children | Anon_ChildrenInnerRef = js.native
  }
  
}

