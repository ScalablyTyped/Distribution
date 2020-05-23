package typings.prosemirrorTables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buttom extends js.Object {
  var buttom: Double
  var left: Double
  var right: Double
  var top: Double
}

object Buttom {
  @scala.inline
  def apply(buttom: Double, left: Double, right: Double, top: Double): Buttom = {
    val __obj = js.Dynamic.literal(buttom = buttom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttom]
  }
}

