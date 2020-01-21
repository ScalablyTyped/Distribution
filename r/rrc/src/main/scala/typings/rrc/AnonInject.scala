package typings.rrc

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInject extends js.Object {
  var inject: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object AnonInject {
  @scala.inline
  def apply(inject: StringDictionary[js.Any] = null): AnonInject = {
    val __obj = js.Dynamic.literal()
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInject]
  }
}

