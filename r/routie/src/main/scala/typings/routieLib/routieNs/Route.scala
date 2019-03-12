package typings
package routieLib.routieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  def addHandler(fn: js.Function): scala.Unit
  def `match`(path: java.lang.String, params: js.Any): scala.Boolean
  def removeHandler(fn: js.Function): scala.Unit
  def run(params: js.Any): scala.Unit
  def toURL(params: js.Any): java.lang.String
}

object Route {
  @scala.inline
  def apply(
    addHandler: js.Function => scala.Unit,
    `match`: (java.lang.String, js.Any) => scala.Boolean,
    removeHandler: js.Function => scala.Unit,
    run: js.Any => scala.Unit,
    toURL: js.Any => java.lang.String
  ): Route = {
    val __obj = js.Dynamic.literal(addHandler = js.Any.fromFunction1(addHandler), removeHandler = js.Any.fromFunction1(removeHandler), run = js.Any.fromFunction1(run), toURL = js.Any.fromFunction1(toURL))
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[Route]
  }
}

