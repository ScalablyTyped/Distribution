package typings.recase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExceptions extends js.Object {
  var exceptions: js.UndefOr[StringDictionary[String]] = js.undefined
}

object AnonExceptions {
  @scala.inline
  def apply(exceptions: StringDictionary[String] = null): AnonExceptions = {
    val __obj = js.Dynamic.literal()
    if (exceptions != null) __obj.updateDynamic("exceptions")(exceptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExceptions]
  }
}

