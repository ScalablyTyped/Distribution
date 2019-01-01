package typings
package readableDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Transforming extends js.Object {
  var afterTransform: js.ThisFunction2[/* this */ this.type, /* er */ js.Any, /* data */ js.Any, scala.Unit | scala.Boolean]
  var needTransform: scala.Boolean
  var transforming: scala.Boolean
  var writecb: (js.Function1[/* err */ js.Any, _]) | scala.Null
  var writechunk: js.Any
   // TODO
  var writeencoding: java.lang.String | scala.Null
}

