package typings
package reactDashWindowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Props[P, S] extends js.Object {
  var props: P
  var state: S
}

object Anon_Props {
  @scala.inline
  def apply[P, S](props: P, state: S): Anon_Props[P, S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Props[P, S]]
  }
}

