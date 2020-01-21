package typings.prosemirrorTestBuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EqMethod extends js.Object {
  def eq(param: EqMethod): Boolean
}

object EqMethod {
  @scala.inline
  def apply(eq: EqMethod => Boolean): EqMethod = {
    val __obj = js.Dynamic.literal(eq = js.Any.fromFunction1(eq))
  
    __obj.asInstanceOf[EqMethod]
  }
}

