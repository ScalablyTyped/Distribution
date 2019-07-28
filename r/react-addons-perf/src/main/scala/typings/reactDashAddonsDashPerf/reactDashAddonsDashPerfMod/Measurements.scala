package typings.reactDashAddonsDashPerf.reactDashAddonsDashPerfMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Measurements extends js.Object {
  var counts: NumericPerfContext
  var displayNames: StringDictionary[ComponentPerfContext]
  var exclusive: NumericPerfContext
  var inclusive: NumericPerfContext
  var render: NumericPerfContext
  var totalTime: Double
  var writes: NumericPerfContext
}

object Measurements {
  @scala.inline
  def apply(
    counts: NumericPerfContext,
    displayNames: StringDictionary[ComponentPerfContext],
    exclusive: NumericPerfContext,
    inclusive: NumericPerfContext,
    render: NumericPerfContext,
    totalTime: Double,
    writes: NumericPerfContext
  ): Measurements = {
    val __obj = js.Dynamic.literal(counts = counts, displayNames = displayNames, exclusive = exclusive, inclusive = inclusive, render = render, totalTime = totalTime, writes = writes)
  
    __obj.asInstanceOf[Measurements]
  }
}

