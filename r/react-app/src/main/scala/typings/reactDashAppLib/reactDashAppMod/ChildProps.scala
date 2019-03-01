package typings
package reactDashAppLib.reactDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildProps extends js.Object {
  var path: java.lang.String
  def action(params: js.Any): js.Any
}

object ChildProps {
  @scala.inline
  def apply(action: js.Function1[js.Any, js.Any], path: java.lang.String): ChildProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[ChildProps]
  }
}

