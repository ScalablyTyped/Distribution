package typings.rascal.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rascal.AnonSizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redelivery extends js.Object {
  var counters: js.UndefOr[StringDictionary[AnonSizeType]] = js.undefined
}

object Redelivery {
  @scala.inline
  def apply(counters: StringDictionary[AnonSizeType] = null): Redelivery = {
    val __obj = js.Dynamic.literal()
    if (counters != null) __obj.updateDynamic("counters")(counters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redelivery]
  }
}

