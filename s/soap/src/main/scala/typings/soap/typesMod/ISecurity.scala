package typings.soap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISecurity extends js.Object {
  var addHeaders: js.UndefOr[js.Function1[/* headers */ IHeaders, Unit]] = js.undefined
  var addOptions: js.UndefOr[js.Function1[/* options */ js.Any, Unit]] = js.undefined
  var postProcess: js.UndefOr[js.Function2[/* xml */ js.Any, /* envelopeKey */ js.Any, String]] = js.undefined
  var toXML: js.UndefOr[js.Function0[String]] = js.undefined
}

object ISecurity {
  @scala.inline
  def apply(
    addHeaders: /* headers */ IHeaders => Unit = null,
    addOptions: /* options */ js.Any => Unit = null,
    postProcess: (/* xml */ js.Any, /* envelopeKey */ js.Any) => String = null,
    toXML: () => String = null
  ): ISecurity = {
    val __obj = js.Dynamic.literal()
    if (addHeaders != null) __obj.updateDynamic("addHeaders")(js.Any.fromFunction1(addHeaders))
    if (addOptions != null) __obj.updateDynamic("addOptions")(js.Any.fromFunction1(addOptions))
    if (postProcess != null) __obj.updateDynamic("postProcess")(js.Any.fromFunction2(postProcess))
    if (toXML != null) __obj.updateDynamic("toXML")(js.Any.fromFunction0(toXML))
    __obj.asInstanceOf[ISecurity]
  }
}

