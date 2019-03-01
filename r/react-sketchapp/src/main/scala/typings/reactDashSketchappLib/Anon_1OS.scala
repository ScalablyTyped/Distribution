package typings
package reactDashSketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1OS extends js.Object {
  var OS: reactDashSketchappLib.reactDashSketchappLibStrings.sketch
  var Version: reactDashSketchappLib.reactDashSketchappLibNumbers.`1`
  def select(obj: js.Any): js.Any
}

object Anon_1OS {
  @scala.inline
  def apply(
    OS: reactDashSketchappLib.reactDashSketchappLibStrings.sketch,
    Version: reactDashSketchappLib.reactDashSketchappLibNumbers.`1`,
    select: js.Function1[js.Any, js.Any]
  ): Anon_1OS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("OS")(OS)
    __obj.updateDynamic("Version")(Version)
    __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[Anon_1OS]
  }
}

