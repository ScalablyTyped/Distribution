package typings
package reactDashAddonsDashPerfLib.reactDashAddonsDashPerfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Measurements extends js.Object {
  var counts: NumericPerfContext
  var displayNames: org.scalablytyped.runtime.StringDictionary[ComponentPerfContext]
  var exclusive: NumericPerfContext
  var inclusive: NumericPerfContext
  var render: NumericPerfContext
  var totalTime: scala.Double
  var writes: NumericPerfContext
}

object Measurements {
  @scala.inline
  def apply(
    counts: NumericPerfContext,
    displayNames: org.scalablytyped.runtime.StringDictionary[ComponentPerfContext],
    exclusive: NumericPerfContext,
    inclusive: NumericPerfContext,
    render: NumericPerfContext,
    totalTime: scala.Double,
    writes: NumericPerfContext
  ): Measurements = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("counts")(counts)
    __obj.updateDynamic("displayNames")(displayNames)
    __obj.updateDynamic("exclusive")(exclusive)
    __obj.updateDynamic("inclusive")(inclusive)
    __obj.updateDynamic("render")(render)
    __obj.updateDynamic("totalTime")(totalTime)
    __obj.updateDynamic("writes")(writes)
    __obj.asInstanceOf[Measurements]
  }
}

