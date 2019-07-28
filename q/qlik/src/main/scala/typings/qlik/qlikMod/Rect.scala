package typings.qlik.qlikMod

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
    val __obj = js.Dynamic.literal(qHeight = qHeight, qLeft = qLeft, qTop = qTop, qWdith = qWdith)
  
    __obj.asInstanceOf[Rect]
  }
}

