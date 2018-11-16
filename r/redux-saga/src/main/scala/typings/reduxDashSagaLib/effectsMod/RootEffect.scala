package typings
package reduxDashSagaLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RootEffect extends js.Object {
  var args: js.Array[_]
  var root: reduxDashSagaLib.reduxDashSagaLibNumbers.`true`
  def saga(args: js.Any*): nodeLib.Iterator[_]
}

