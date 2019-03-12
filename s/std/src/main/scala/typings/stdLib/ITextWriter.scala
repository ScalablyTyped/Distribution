package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextWriter extends js.Object {
  def Close(): scala.Unit
  def Write(s: java.lang.String): scala.Unit
  def WriteLine(s: java.lang.String): scala.Unit
}

object ITextWriter {
  @scala.inline
  def apply(
    Close: () => scala.Unit,
    Write: java.lang.String => scala.Unit,
    WriteLine: java.lang.String => scala.Unit
  ): ITextWriter = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Write = js.Any.fromFunction1(Write), WriteLine = js.Any.fromFunction1(WriteLine))
  
    __obj.asInstanceOf[ITextWriter]
  }
}

