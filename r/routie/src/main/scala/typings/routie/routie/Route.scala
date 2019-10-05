package typings.routie.routie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  def addHandler(fn: js.Function): Unit
  def `match`(path: String, params: js.Any): Boolean
  def removeHandler(fn: js.Function): Unit
  def run(params: js.Any): Unit
  def toURL(params: js.Any): String
}

object Route {
  @scala.inline
  def apply(
    addHandler: js.Function => Unit,
    `match`: (String, js.Any) => Boolean,
    removeHandler: js.Function => Unit,
    run: js.Any => Unit,
    toURL: js.Any => String
  ): Route = {
    val __obj = js.Dynamic.literal(addHandler = js.Any.fromFunction1(addHandler), removeHandler = js.Any.fromFunction1(removeHandler), run = js.Any.fromFunction1(run), toURL = js.Any.fromFunction1(toURL))
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[Route]
  }
}

