package typings.reactFilepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePondCallbackProps extends js.Object {
  /** If no error, file has been successfully loaded */
  var onaddfile: js.UndefOr[js.Function2[/* error */ FilePondErrorDescription, /* file */ File, Unit]] = js.native
  /** Made progress loading a file */
  var onaddfileprogress: js.UndefOr[js.Function2[/* file */ File, /* progress */ Double, Unit]] = js.native
  /** Started file load */
  var onaddfilestart: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.native
  /**
    * FilePond instance throws an error. Optionally receives
    * file if error is related to a file object.
    */
  var onerror: js.UndefOr[
    js.Function3[
      /* error */ FilePondErrorDescription, 
      /* file */ js.UndefOr[File], 
      /* status */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** FilePond instance has been created and is ready. */
  var oninit: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * File has been transformed by the transform plugin or
    * another plugin subscribing to the prepare_output filter.
    * It receives the file item and the output data.
    */
  var onpreparefile: js.UndefOr[js.Function2[/* file */ File, /* output */ js.Any, Unit]] = js.native
  /** If no error, Processing of a file has been completed */
  var onprocessfile: js.UndefOr[js.Function2[/* error */ FilePondErrorDescription, /* file */ File, Unit]] = js.native
  /** Aborted processing of a file */
  var onprocessfileabort: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.native
  /** Made progress processing a file */
  var onprocessfileprogress: js.UndefOr[js.Function2[/* file */ File, /* progress */ Double, Unit]] = js.native
  /** Started processing a file */
  var onprocessfilestart: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.native
  /** Processing of a file has been undone */
  var onprocessfileundo: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.native
  /** File has been removed. */
  var onremovefile: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.native
  /** A file has been added or removed, receives a list of file items */
  var onupdatefiles: js.UndefOr[js.Function1[/* fileItems */ js.Array[File], Unit]] = js.native
  /**
    * FilePond instance throws a warning. For instance
    * when the maximum amount of files has been reached.
    * Optionally receives file if error is related to a
    * file object
    */
  var onwarning: js.UndefOr[
    js.Function3[/* error */ js.Any, /* file */ js.UndefOr[File], /* status */ js.UndefOr[js.Any], Unit]
  ] = js.native
}

object FilePondCallbackProps {
  @scala.inline
  def apply(): FilePondCallbackProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondCallbackProps]
  }
  @scala.inline
  implicit class FilePondCallbackPropsOps[Self <: FilePondCallbackProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnaddfile(value: (/* error */ FilePondErrorDescription, /* file */ File) => Unit): Self = this.set("onaddfile", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnaddfile: Self = this.set("onaddfile", js.undefined)
    @scala.inline
    def setOnaddfileprogress(value: (/* file */ File, /* progress */ Double) => Unit): Self = this.set("onaddfileprogress", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnaddfileprogress: Self = this.set("onaddfileprogress", js.undefined)
    @scala.inline
    def setOnaddfilestart(value: /* file */ File => Unit): Self = this.set("onaddfilestart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnaddfilestart: Self = this.set("onaddfilestart", js.undefined)
    @scala.inline
    def setOnerror(
      value: (/* error */ FilePondErrorDescription, /* file */ js.UndefOr[File], /* status */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onerror", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    @scala.inline
    def setOninit(value: () => Unit): Self = this.set("oninit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOninit: Self = this.set("oninit", js.undefined)
    @scala.inline
    def setOnpreparefile(value: (/* file */ File, /* output */ js.Any) => Unit): Self = this.set("onpreparefile", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnpreparefile: Self = this.set("onpreparefile", js.undefined)
    @scala.inline
    def setOnprocessfile(value: (/* error */ FilePondErrorDescription, /* file */ File) => Unit): Self = this.set("onprocessfile", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnprocessfile: Self = this.set("onprocessfile", js.undefined)
    @scala.inline
    def setOnprocessfileabort(value: /* file */ File => Unit): Self = this.set("onprocessfileabort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnprocessfileabort: Self = this.set("onprocessfileabort", js.undefined)
    @scala.inline
    def setOnprocessfileprogress(value: (/* file */ File, /* progress */ Double) => Unit): Self = this.set("onprocessfileprogress", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnprocessfileprogress: Self = this.set("onprocessfileprogress", js.undefined)
    @scala.inline
    def setOnprocessfilestart(value: /* file */ File => Unit): Self = this.set("onprocessfilestart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnprocessfilestart: Self = this.set("onprocessfilestart", js.undefined)
    @scala.inline
    def setOnprocessfileundo(value: /* file */ File => Unit): Self = this.set("onprocessfileundo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnprocessfileundo: Self = this.set("onprocessfileundo", js.undefined)
    @scala.inline
    def setOnremovefile(value: /* file */ File => Unit): Self = this.set("onremovefile", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnremovefile: Self = this.set("onremovefile", js.undefined)
    @scala.inline
    def setOnupdatefiles(value: /* fileItems */ js.Array[File] => Unit): Self = this.set("onupdatefiles", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnupdatefiles: Self = this.set("onupdatefiles", js.undefined)
    @scala.inline
    def setOnwarning(value: (/* error */ js.Any, /* file */ js.UndefOr[File], /* status */ js.UndefOr[js.Any]) => Unit): Self = this.set("onwarning", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnwarning: Self = this.set("onwarning", js.undefined)
  }
  
}

