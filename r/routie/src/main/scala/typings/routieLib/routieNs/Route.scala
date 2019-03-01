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
    addHandler: js.Function1[js.Function, scala.Unit],
    `match`: js.Function2[java.lang.String, js.Any, scala.Boolean],
    removeHandler: js.Function1[js.Function, scala.Unit],
    run: js.Function1[js.Any, scala.Unit],
    toURL: js.Function1[js.Any, java.lang.String]
  ): Route = {
    val __obj = js.Dynamic.literal(`match` = `match`)
    __obj.updateDynamic("addHandler")(addHandler)
    __obj.updateDynamic("removeHandler")(removeHandler)
    __obj.updateDynamic("run")(run)
    __obj.updateDynamic("toURL")(toURL)
    __obj.asInstanceOf[Route]
  }
}

