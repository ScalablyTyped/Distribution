package typings.qlik.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharRange extends js.Object {
  var qCharCount: Double
  var qCharPos: Double
}

object CharRange {
  @scala.inline
  def apply(qCharCount: Double, qCharPos: Double): CharRange = {
    val __obj = js.Dynamic.literal(qCharCount = qCharCount, qCharPos = qCharPos)
  
    __obj.asInstanceOf[CharRange]
  }
}

