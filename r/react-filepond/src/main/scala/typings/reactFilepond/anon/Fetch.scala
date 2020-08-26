package typings.reactFilepond.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactFilepond.mod.ActualFileObject
import typings.reactFilepond.mod.FetchServerConfigFunction
import typings.reactFilepond.mod.LoadServerConfigFunction
import typings.reactFilepond.mod.ProcessServerConfigFunction
import typings.reactFilepond.mod.ProgressServerConfigFunction
import typings.reactFilepond.mod.RestoreServerConfigFunction
import typings.reactFilepond.mod.RevertServerConfigFunction
import typings.reactFilepond.mod.ServerUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fetch extends js.Object {
  var fetch: js.UndefOr[String | ServerUrl | FetchServerConfigFunction] = js.native
  var load: js.UndefOr[String | ServerUrl | LoadServerConfigFunction] = js.native
  var process: js.UndefOr[String | ServerUrl | ProcessServerConfigFunction] = js.native
  var restore: js.UndefOr[String | ServerUrl | RestoreServerConfigFunction] = js.native
  var revert: js.UndefOr[String | ServerUrl | RevertServerConfigFunction] = js.native
}

object Fetch {
  @scala.inline
  def apply(): Fetch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fetch]
  }
  @scala.inline
  implicit class FetchOps[Self <: Fetch] (val x: Self) extends AnyVal {
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
    def setFetchFunction6(
      value: (/* url */ String, /* load */ js.Function1[/* file */ ActualFileObject, Unit], /* error */ js.Function1[/* errorText */ String, Unit], /* progress */ ProgressServerConfigFunction, /* abort */ js.Function0[Unit], /* headers */ js.Function1[/* headersString */ String, Unit]) => Unit
    ): Self = this.set("fetch", js.Any.fromFunction6(value))
    @scala.inline
    def setFetch(value: String | ServerUrl | FetchServerConfigFunction): Self = this.set("fetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    @scala.inline
    def setLoadFunction6(
      value: (/* source */ js.Any, /* load */ js.Function1[/* file */ ActualFileObject, Unit], /* error */ js.Function1[/* errorText */ String, Unit], /* progress */ ProgressServerConfigFunction, /* abort */ js.Function0[Unit], /* headers */ js.Function1[/* headersString */ String, Unit]) => Unit
    ): Self = this.set("load", js.Any.fromFunction6(value))
    @scala.inline
    def setLoad(value: String | ServerUrl | LoadServerConfigFunction): Self = this.set("load", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setProcessFunction7(
      value: (/* fieldName */ String, /* file */ ActualFileObject, /* metadata */ StringDictionary[js.Any], /* load */ js.Function1[/* p */ String | StringDictionary[js.Any], Unit], /* error */ js.Function1[/* errorText */ String, Unit], /* progress */ ProgressServerConfigFunction, /* abort */ js.Function0[Unit]) => Unit
    ): Self = this.set("process", js.Any.fromFunction7(value))
    @scala.inline
    def setProcess(value: String | ServerUrl | ProcessServerConfigFunction): Self = this.set("process", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcess: Self = this.set("process", js.undefined)
    @scala.inline
    def setRestoreFunction6(
      value: (/* uniqueFileId */ js.Any, /* load */ js.Function1[/* file */ ActualFileObject, Unit], /* error */ js.Function1[/* errorText */ String, Unit], /* progress */ ProgressServerConfigFunction, /* abort */ js.Function0[Unit], /* headers */ js.Function1[/* headersString */ String, Unit]) => Unit
    ): Self = this.set("restore", js.Any.fromFunction6(value))
    @scala.inline
    def setRestore(value: String | ServerUrl | RestoreServerConfigFunction): Self = this.set("restore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestore: Self = this.set("restore", js.undefined)
    @scala.inline
    def setRevertFunction3(
      value: (/* uniqueFieldId */ js.Any, /* load */ js.Function0[Unit], /* error */ js.Function1[/* errorText */ String, Unit]) => Unit
    ): Self = this.set("revert", js.Any.fromFunction3(value))
    @scala.inline
    def setRevert(value: String | ServerUrl | RevertServerConfigFunction): Self = this.set("revert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevert: Self = this.set("revert", js.undefined)
  }
  
}

