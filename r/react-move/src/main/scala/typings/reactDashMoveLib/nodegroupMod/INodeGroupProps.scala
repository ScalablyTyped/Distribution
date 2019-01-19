package typings
package reactDashMoveLib.nodegroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INodeGroupProps extends js.Object {
  /**
    * An array.  The data prop is treated as immutable so the nodes will only update if prev.data !== next.data.
    */
  var data: js.Array[_]
  /**
    * A function that **returns an object or array of objects** describing how the state should transform on enter.  The function is passed the data and index.
    */
  var enter: js.UndefOr[
    js.Function2[
      /* data */ js.Any, 
      /* index */ scala.Double, 
      reactDashMoveLib.coreMod.Transition | js.Array[reactDashMoveLib.coreMod.Transition]
    ]
  ] = js.undefined
  /**
    * A function that **returns an object or array of objects** describing how the state should transform on leave.  The function is passed the data and index.
    */
  var leave: js.UndefOr[
    js.Function2[
      /* data */ js.Any, 
      /* index */ scala.Double, 
      reactDashMoveLib.coreMod.Transition | js.Array[reactDashMoveLib.coreMod.Transition]
    ]
  ] = js.undefined
  /**
    * A function that **returns an object or array of objects** describing how the state should transform on update.  The function is passed the data and index.
    */
  var update: js.UndefOr[
    js.Function2[
      /* data */ js.Any, 
      /* index */ scala.Double, 
      reactDashMoveLib.coreMod.Transition | js.Array[reactDashMoveLib.coreMod.Transition]
    ]
  ] = js.undefined
  /**
    * A function that renders the nodes. It should accept an array of nodes as its only argument.  Each node is an object with the key, data, state and a type of 'ENTER', 'UPDATE' or 'LEAVE'.
    */
  def children(nodes: js.Array[_]): reactLib.reactMod.ReactNs.ReactElement[_]
  /**
    * Function that returns a string key given a data object and its index.  Used to track which nodes are entering, updating and leaving.
    */
  def keyAccessor(data: js.Any, index: scala.Double): java.lang.String
  /**
    * A function that returns the starting state.  The function is passed the data and index and must return an object.
    */
  def start(data: js.Any, index: scala.Double): reactDashMoveLib.coreMod.PlainObject
}

