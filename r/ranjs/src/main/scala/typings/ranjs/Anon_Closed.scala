package typings.ranjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Closed extends js.Object {
  var closed: Boolean
  var value: Double
}

object Anon_Closed {
  @scala.inline
  def apply(closed: Boolean, value: Double): Anon_Closed = {
    val __obj = js.Dynamic.literal(closed = closed, value = value)
  
    __obj.asInstanceOf[Anon_Closed]
  }
}

