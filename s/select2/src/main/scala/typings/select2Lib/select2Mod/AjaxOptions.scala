package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Pick) */ 
trait AjaxOptions[Result, RemoteResult] extends js.Object {
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

