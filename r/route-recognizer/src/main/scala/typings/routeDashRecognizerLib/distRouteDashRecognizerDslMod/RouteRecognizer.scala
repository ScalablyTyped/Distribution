package typings
package routeDashRecognizerLib.distRouteDashRecognizerDslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteRecognizer extends js.Object {
  var delegate: js.UndefOr[Delegate]
  def add(routes: js.Array[Route]): scala.Unit
}

object RouteRecognizer {
  @scala.inline
  def apply(add: js.Function1[js.Array[Route], scala.Unit], delegate: Delegate = null): RouteRecognizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    if (delegate != null) __obj.updateDynamic("delegate")(delegate)
    __obj.asInstanceOf[RouteRecognizer]
  }
}

