package typings.atStardustDashUiReactDashComponentDashRef.atStardustDashUiReactDashComponentDashRefMod

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
object ^ extends js.Object {
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
}

