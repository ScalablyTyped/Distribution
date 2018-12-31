package typings
package reactDashFilepondLib.reactDashFilepondMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note that in my testing, callbacks that include an error prop
  * always give the error as the second prop, with the file as
  * the first prop.    This is contradictory to the current docs.
  */
trait FilePondCallbackProps extends js.Object {
  var onaddfile: js.UndefOr[
    js.Function2[/* file */ FilePondItem, /* error */ FilePondErrorDescription, scala.Unit]
  ] = js.undefined
  var onaddfileprogress: js.UndefOr[js.Function2[/* file */ FilePondItem, /* progress */ scala.Double, scala.Unit]] = js.undefined
  var onaddfilestart: js.UndefOr[js.Function1[/* file */ FilePondItem, scala.Unit]] = js.undefined
  var onerror: js.UndefOr[
    js.Function3[
      /* file */ js.UndefOr[FilePondItem], 
      /* error */ js.UndefOr[FilePondErrorDescription], 
      /* status */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var oninit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onpreparefile: js.UndefOr[js.Function2[/* file */ FilePondItem, /* output */ js.Any, scala.Unit]] = js.undefined
  var onprocessfile: js.UndefOr[
    js.Function2[/* file */ FilePondItem, /* error */ FilePondErrorDescription, scala.Unit]
  ] = js.undefined
  var onprocessfileabort: js.UndefOr[js.Function1[/* file */ FilePondItem, scala.Unit]] = js.undefined
  var onprocessfileprogress: js.UndefOr[js.Function2[/* file */ FilePondItem, /* progress */ scala.Double, scala.Unit]] = js.undefined
  var onprocessfilestart: js.UndefOr[js.Function1[/* file */ FilePondItem, scala.Unit]] = js.undefined
  var onprocessfileundo: js.UndefOr[js.Function1[/* file */ FilePondItem, scala.Unit]] = js.undefined
  var onremovefile: js.UndefOr[js.Function1[/* file */ FilePondItem, scala.Unit]] = js.undefined
  var onupdatefiles: js.UndefOr[js.Function1[/* fileItems */ js.Array[FilePondItem], scala.Unit]] = js.undefined
  var onwarning: js.UndefOr[
    js.Function3[
      /* error */ js.Any, 
      /* file */ js.UndefOr[FilePondItem], 
      /* status */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

