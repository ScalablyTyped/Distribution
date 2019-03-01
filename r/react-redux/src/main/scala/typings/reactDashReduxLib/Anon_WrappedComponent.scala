package typings
package reactDashReduxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WrappedComponent[C] extends js.Object {
  var WrappedComponent: C
}

object Anon_WrappedComponent {
  @scala.inline
  def apply[C](WrappedComponent: C): Anon_WrappedComponent[C] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("WrappedComponent")(WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_WrappedComponent[C]]
  }
}

