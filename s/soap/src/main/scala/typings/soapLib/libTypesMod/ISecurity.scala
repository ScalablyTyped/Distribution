package typings
package soapLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISecurity extends js.Object {
  var addHeaders: js.UndefOr[js.Function1[/* headers */ IHeaders, scala.Unit]] = js.undefined
  var addOptions: js.UndefOr[js.Function1[/* options */ js.Any, scala.Unit]] = js.undefined
  var postProcess: js.UndefOr[js.Function2[/* xml */ js.Any, /* envelopeKey */ js.Any, java.lang.String]] = js.undefined
  var toXML: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

object ISecurity {
  @scala.inline
  def apply(
    addHeaders: /* headers */ IHeaders => scala.Unit = null,
    addOptions: /* options */ js.Any => scala.Unit = null,
    postProcess: (/* xml */ js.Any, /* envelopeKey */ js.Any) => java.lang.String = null,
    toXML: () => java.lang.String = null
  ): ISecurity = {
    val __obj = js.Dynamic.literal()
    if (addHeaders != null) __obj.updateDynamic("addHeaders")(js.Any.fromFunction1(addHeaders))
    if (addOptions != null) __obj.updateDynamic("addOptions")(js.Any.fromFunction1(addOptions))
    if (postProcess != null) __obj.updateDynamic("postProcess")(js.Any.fromFunction2(postProcess))
    if (toXML != null) __obj.updateDynamic("toXML")(js.Any.fromFunction0(toXML))
    __obj.asInstanceOf[ISecurity]
  }
}

