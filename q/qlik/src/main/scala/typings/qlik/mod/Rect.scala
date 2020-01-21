package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rect extends js.Object {
  var qHeight: Double
  var qLeft: Double
  var qTop: Double
  var qWdith: Double
}

object Rect {
  @scala.inline
  def apply(qHeight: Double, qLeft: Double, qTop: Double, qWdith: Double): Rect = {
    val __obj = js.Dynamic.literal(qHeight = qHeight.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any], qTop = qTop.asInstanceOf[js.Any], qWdith = qWdith.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Rect]
  }
}

