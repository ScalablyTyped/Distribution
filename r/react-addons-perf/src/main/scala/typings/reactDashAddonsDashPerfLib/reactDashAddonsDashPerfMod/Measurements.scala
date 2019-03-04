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
    val __obj = js.Dynamic.literal(counts = counts, displayNames = displayNames, exclusive = exclusive, inclusive = inclusive, render = render, totalTime = totalTime, writes = writes)
  
    __obj.asInstanceOf[Measurements]
  }
}

