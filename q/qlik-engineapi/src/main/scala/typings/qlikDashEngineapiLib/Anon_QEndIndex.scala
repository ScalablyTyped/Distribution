package typings
package qlikDashEngineapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QEndIndex extends js.Object {
  var qEndIndex: scala.Double
  var qStartIndex: scala.Double
}

object Anon_QEndIndex {
  @scala.inline
  def apply(qEndIndex: scala.Double, qStartIndex: scala.Double): Anon_QEndIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qEndIndex")(qEndIndex)
    __obj.updateDynamic("qStartIndex")(qStartIndex)
    __obj.asInstanceOf[Anon_QEndIndex]
  }
}

