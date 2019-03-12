package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in select2.select2.Sub<keyof jquery.JQueryAjaxSettings, 'url'> ]: jquery.JQueryAjaxSettings[P]} */ trait AjaxOptions[Result, RemoteResult] extends js.Object {
  var data: js.UndefOr[js.Function1[/* params */ QueryOptions, PlainObject[_]]] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var processResults: js.UndefOr[
    js.Function2[/* data */ RemoteResult, /* params */ QueryOptions, ProcessedResult[Result]]
  ] = js.undefined
  var transport: js.UndefOr[
    js.Function3[
      /* settings */ jqueryLib.JQueryAjaxSettings, 
      /* success */ js.UndefOr[js.Function1[/* data */ RemoteResult, js.UndefOr[scala.Nothing]]], 
      /* failure */ js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]], 
      scala.Unit
    ]
  ] = js.undefined
  var url: js.UndefOr[java.lang.String | (js.Function1[/* params */ QueryOptions, java.lang.String])] = js.undefined
}

object AjaxOptions {
  @scala.inline
  def apply[Result, RemoteResult](
    data: /* params */ QueryOptions => PlainObject[_] = null,
    delay: scala.Int | scala.Double = null,
    processResults: (/* data */ RemoteResult, /* params */ QueryOptions) => ProcessedResult[Result] = null,
    transport: (/* settings */ jqueryLib.JQueryAjaxSettings, /* success */ js.UndefOr[js.Function1[/* data */ RemoteResult, js.UndefOr[scala.Nothing]]], /* failure */ js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]]) => scala.Unit = null,
    url: java.lang.String | (js.Function1[/* params */ QueryOptions, java.lang.String]) = null
  ): AjaxOptions[Result, RemoteResult] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(js.Any.fromFunction1(data))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (processResults != null) __obj.updateDynamic("processResults")(js.Any.fromFunction2(processResults))
    if (transport != null) __obj.updateDynamic("transport")(js.Any.fromFunction3(transport))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxOptions[Result, RemoteResult]]
  }
}

