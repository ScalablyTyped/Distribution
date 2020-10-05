package typings.stardustUiReactComponentRef

import typings.propTypes.mod.Requireable
import typings.react.mod.FunctionComponent
import typings.react.mod.RefObject
import typings.stardustUiReactComponentRef.anon.Children
import typings.stardustUiReactComponentRef.anon.InnerRef
import typings.stardustUiReactComponentRef.refFindNodeMod.default
import typings.stardustUiReactComponentRef.typesMod.RefProps
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stardust-ui/react-component-ref", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RefFindNode () extends default
  
  @js.native
  class RefForward ()
    extends typings.stardustUiReactComponentRef.refForwardMod.default
  
  val Ref: FunctionComponent[RefProps] = js.native
  val refPropType: Requireable[typings.react.mod.Ref[js.Any]] = js.native
  /**
    * The function that correctly handles passing refs.
    *
    * @param ref An ref object or function
    * @param node A node that should be passed by ref
    */
  def handleRef[N](ref: typings.react.mod.Ref[N], node: N): Unit = js.native
  /** Checks that the passed object is a valid React ref object. */
  def isRefObject(ref: js.Any): /* is react.react.RefObject<any> */ Boolean = js.native
  /** Creates a React ref object from existing DOM node. */
  def toRefObject[T /* <: Node */](node: T): RefObject[T] = js.native
  /* static members */
  @js.native
  object RefFindNode extends js.Object {
    var displayName: String = js.native
    var propTypes: Children | InnerRef = js.native
  }
  
  /* static members */
  @js.native
  object RefForward extends js.Object {
    var displayName: String = js.native
    var propTypes: Children | InnerRef = js.native
  }
  
}

