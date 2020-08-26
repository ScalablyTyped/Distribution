package typings.protractor.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reporter
  extends /* key */ StringDictionary[js.Any] {
  var reporter: js.UndefOr[String] = js.native
  var ui: js.UndefOr[String] = js.native
}

object Reporter {
  @scala.inline
  def apply(): Reporter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reporter]
  }
  @scala.inline
  implicit class ReporterOps[Self <: Reporter] (val x: Self) extends AnyVal {
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
    def setReporter(value: String): Self = this.set("reporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    @scala.inline
    def setUi(value: String): Self = this.set("ui", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUi: Self = this.set("ui", js.undefined)
  }
  
}

