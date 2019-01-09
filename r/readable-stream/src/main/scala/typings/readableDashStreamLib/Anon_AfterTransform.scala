package typings
package readableDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterTransform extends js.Object {
  var needTransform: scala.Boolean
  var transforming: scala.Boolean
  var writecb: (js.Function1[/* err */ js.Any, _]) | scala.Null
  var writechunk: js.Any
   // TODO
  var writeencoding: java.lang.String | scala.Null
  def afterTransform(
    `this`: readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Transform,
    er: js.Any,
    data: js.Any
  ): scala.Unit | scala.Boolean
}

