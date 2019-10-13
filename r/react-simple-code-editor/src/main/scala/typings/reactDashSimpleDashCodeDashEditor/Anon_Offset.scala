package typings.reactDashSimpleDashCodeDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offset extends js.Object {
  var offset: Double
  var stack: js.Array[Anon_SelectionEnd]
}

object Anon_Offset {
  @scala.inline
  def apply(offset: Double, stack: js.Array[Anon_SelectionEnd]): Anon_Offset = {
    val __obj = js.Dynamic.literal(offset = offset, stack = stack)
  
    __obj.asInstanceOf[Anon_Offset]
  }
}

