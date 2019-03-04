package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharRange extends js.Object {
  var qCharCount: scala.Double
  var qCharPos: scala.Double
}

object CharRange {
  @scala.inline
  def apply(qCharCount: scala.Double, qCharPos: scala.Double): CharRange = {
    val __obj = js.Dynamic.literal(qCharCount = qCharCount, qCharPos = qCharPos)
  
    __obj.asInstanceOf[CharRange]
  }
}

