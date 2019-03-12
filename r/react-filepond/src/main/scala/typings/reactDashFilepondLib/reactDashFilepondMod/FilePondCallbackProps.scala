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
  /** If no error, file has been successfully loaded */
  var onaddfile: js.UndefOr[js.Function2[/* file */ File, /* error */ FilePondErrorDescription, scala.Unit]] = js.undefined
  /** Made progress loading a file */
  var onaddfileprogress: js.UndefOr[js.Function2[/* file */ File, /* progress */ scala.Double, scala.Unit]] = js.undefined
  /** Started file load */
  var onaddfilestart: js.UndefOr[js.Function1[/* file */ File, scala.Unit]] = js.undefined
  /**
    * FilePond instance throws an error. Optionally receives
    * file if error is related to a file object.
    */
  var onerror: js.UndefOr[
    js.Function3[
      /* file */ js.UndefOr[File], 
      /* error */ js.UndefOr[FilePondErrorDescription], 
      /* status */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** FilePond instance has been created and is ready. */
  var oninit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * File has been transformed by the transform plugin or
    * another plugin subscribing to the prepare_output filter.
    * It receives the file item and the output data.
    */
  var onpreparefile: js.UndefOr[js.Function2[/* file */ File, /* output */ js.Any, scala.Unit]] = js.undefined
  /** If no error, Processing of a file has been completed */
  var onprocessfile: js.UndefOr[js.Function2[/* file */ File, /* error */ FilePondErrorDescription, scala.Unit]] = js.undefined
  /** Aborted processing of a file */
  var onprocessfileabort: js.UndefOr[js.Function1[/* file */ File, scala.Unit]] = js.undefined
  /** Made progress processing a file */
  var onprocessfileprogress: js.UndefOr[js.Function2[/* file */ File, /* progress */ scala.Double, scala.Unit]] = js.undefined
  /** Started processing a file */
  var onprocessfilestart: js.UndefOr[js.Function1[/* file */ File, scala.Unit]] = js.undefined
  /** Processing of a file has been undone */
  var onprocessfileundo: js.UndefOr[js.Function1[/* file */ File, scala.Unit]] = js.undefined
  /** File has been removed. */
  var onremovefile: js.UndefOr[js.Function1[/* file */ File, scala.Unit]] = js.undefined
  /** A file has been added or removed, receives a list of file items */
  var onupdatefiles: js.UndefOr[js.Function1[/* fileItems */ js.Array[File], scala.Unit]] = js.undefined
  /**
    * FilePond instance throws a warning. For instance
    * when the maximum amount of files has been reached.
    * Optionally receives file if error is related to a
    * file object
    */
  var onwarning: js.UndefOr[
    js.Function3[
      /* error */ js.Any, 
      /* file */ js.UndefOr[File], 
      /* status */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

object FilePondCallbackProps {
  @scala.inline
  def apply(
    onaddfile: (/* file */ File, /* error */ FilePondErrorDescription) => scala.Unit = null,
    onaddfileprogress: (/* file */ File, /* progress */ scala.Double) => scala.Unit = null,
    onaddfilestart: /* file */ File => scala.Unit = null,
    onerror: (/* file */ js.UndefOr[File], /* error */ js.UndefOr[FilePondErrorDescription], /* status */ js.UndefOr[js.Any]) => scala.Unit = null,
    oninit: () => scala.Unit = null,
    onpreparefile: (/* file */ File, /* output */ js.Any) => scala.Unit = null,
    onprocessfile: (/* file */ File, /* error */ FilePondErrorDescription) => scala.Unit = null,
    onprocessfileabort: /* file */ File => scala.Unit = null,
    onprocessfileprogress: (/* file */ File, /* progress */ scala.Double) => scala.Unit = null,
    onprocessfilestart: /* file */ File => scala.Unit = null,
    onprocessfileundo: /* file */ File => scala.Unit = null,
    onremovefile: /* file */ File => scala.Unit = null,
    onupdatefiles: /* fileItems */ js.Array[File] => scala.Unit = null,
    onwarning: (/* error */ js.Any, /* file */ js.UndefOr[File], /* status */ js.UndefOr[js.Any]) => scala.Unit = null
  ): FilePondCallbackProps = {
    val __obj = js.Dynamic.literal()
    if (onaddfile != null) __obj.updateDynamic("onaddfile")(js.Any.fromFunction2(onaddfile))
    if (onaddfileprogress != null) __obj.updateDynamic("onaddfileprogress")(js.Any.fromFunction2(onaddfileprogress))
    if (onaddfilestart != null) __obj.updateDynamic("onaddfilestart")(js.Any.fromFunction1(onaddfilestart))
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction3(onerror))
    if (oninit != null) __obj.updateDynamic("oninit")(js.Any.fromFunction0(oninit))
    if (onpreparefile != null) __obj.updateDynamic("onpreparefile")(js.Any.fromFunction2(onpreparefile))
    if (onprocessfile != null) __obj.updateDynamic("onprocessfile")(js.Any.fromFunction2(onprocessfile))
    if (onprocessfileabort != null) __obj.updateDynamic("onprocessfileabort")(js.Any.fromFunction1(onprocessfileabort))
    if (onprocessfileprogress != null) __obj.updateDynamic("onprocessfileprogress")(js.Any.fromFunction2(onprocessfileprogress))
    if (onprocessfilestart != null) __obj.updateDynamic("onprocessfilestart")(js.Any.fromFunction1(onprocessfilestart))
    if (onprocessfileundo != null) __obj.updateDynamic("onprocessfileundo")(js.Any.fromFunction1(onprocessfileundo))
    if (onremovefile != null) __obj.updateDynamic("onremovefile")(js.Any.fromFunction1(onremovefile))
    if (onupdatefiles != null) __obj.updateDynamic("onupdatefiles")(js.Any.fromFunction1(onupdatefiles))
    if (onwarning != null) __obj.updateDynamic("onwarning")(js.Any.fromFunction3(onwarning))
    __obj.asInstanceOf[FilePondCallbackProps]
  }
}

