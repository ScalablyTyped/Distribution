package typings
package reactDashMoveLib.animateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimateProps extends js.Object {
  /**
    * An object, array of objects, or function that returns an object or array of objects describing how the state should transform on enter.
    */
  var enter: js.UndefOr[
    reactDashMoveLib.coreMod.TransitionFunction | reactDashMoveLib.coreMod.Transition | js.Array[reactDashMoveLib.coreMod.Transition]
  ] = js.undefined
  /**
    * An object, array of objects, or function that returns an object or array of objects describing how the state should transform on leave.
    */
  var leave: js.UndefOr[
    reactDashMoveLib.coreMod.TransitionFunction | reactDashMoveLib.coreMod.Transition | js.Array[reactDashMoveLib.coreMod.Transition]
  ] = js.undefined
  /**
    * Boolean value that determines if the child should be rendered or not.
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An object or function that returns an obejct to be used as the starting state. 
    */
  var start: reactDashMoveLib.coreMod.PlainObjectFunction | reactDashMoveLib.coreMod.PlainObject
  /**
    * An object, array of objects, or function that returns an object or array of objects describing how the state should transform on update. ***Note:*** although not required, in most cases it make sense to specify an update prop to handle interrupted enter and leave transitions.
    */
  var update: js.UndefOr[
    reactDashMoveLib.coreMod.TransitionFunction | reactDashMoveLib.coreMod.Transition | js.Array[reactDashMoveLib.coreMod.Transition]
  ] = js.undefined
  /**
    * A function that renders the node.  The function is passed the data and state.
    */
  def children(state: reactDashMoveLib.coreMod.PlainObject): reactLib.reactMod.ReactNs.ReactElement[_]
}

