package typings
package reactDashAddonsDashPerfLib.reactDashAddonsDashPerfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Measurements extends js.Object {
  var counts: NumericPerfContext
  var displayNames: ScalablyTyped.runtime.StringDictionary[ComponentPerfContext]
  var exclusive: NumericPerfContext
  var inclusive: NumericPerfContext
  var render: NumericPerfContext
  var totalTime: scala.Double
  var writes: NumericPerfContext
}

