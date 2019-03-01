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
    Close: js.Function0[scala.Unit],
    Write: js.Function1[java.lang.String, scala.Unit],
    WriteLine: js.Function1[java.lang.String, scala.Unit]
  ): ITextWriter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Close")(Close)
    __obj.updateDynamic("Write")(Write)
    __obj.updateDynamic("WriteLine")(WriteLine)
    __obj.asInstanceOf[ITextWriter]
  }
}

