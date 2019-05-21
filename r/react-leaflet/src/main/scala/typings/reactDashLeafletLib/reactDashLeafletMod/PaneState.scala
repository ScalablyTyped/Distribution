package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneState extends js.Object {
  var context: js.UndefOr[LeafletContext | scala.Null] = js.undefined
  var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object PaneState {
  @scala.inline
  def apply(context: LeafletContext = null, name: java.lang.String = null): PaneState = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[PaneState]
  }
}

