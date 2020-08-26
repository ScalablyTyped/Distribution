package typings.sentiment.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalysisOptions extends js.Object {
  var extras: js.UndefOr[StringDictionary[Double]] = js.native
  var language: js.UndefOr[String] = js.native
}

object AnalysisOptions {
  @scala.inline
  def apply(): AnalysisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisOptions]
  }
  @scala.inline
  implicit class AnalysisOptionsOps[Self <: AnalysisOptions] (val x: Self) extends AnyVal {
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
    def setExtras(value: StringDictionary[Double]): Self = this.set("extras", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtras: Self = this.set("extras", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
  
}

