package typings.reactRnd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Width extends js.Object {
  var height: Double
  var width: Double
}

object Width {
  @scala.inline
  def apply(height: Double, width: Double): Width = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width]
  }
}

