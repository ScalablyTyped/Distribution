package typings
package stormDashReactDashDiagramsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: Anon_X
  var pathToEnd: js.Array[js.Array[scala.Double]]
  var pathToStart: js.Array[js.Array[scala.Double]]
  var start: Anon_X
}

object Anon_End {
  @scala.inline
  def apply(
    end: Anon_X,
    pathToEnd: js.Array[js.Array[scala.Double]],
    pathToStart: js.Array[js.Array[scala.Double]],
    start: Anon_X
  ): Anon_End = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("pathToEnd")(pathToEnd)
    __obj.updateDynamic("pathToStart")(pathToStart)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_End]
  }
}

