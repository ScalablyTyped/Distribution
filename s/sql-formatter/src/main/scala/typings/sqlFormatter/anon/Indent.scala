package typings.sqlFormatter.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Indent extends js.Object {
  var indent: js.UndefOr[String] = js.native
  var language: js.UndefOr[String] = js.native
  var params: js.UndefOr[StringDictionary[String] | js.Array[String]] = js.native
}

object Indent {
  @scala.inline
  def apply(): Indent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Indent]
  }
  @scala.inline
  implicit class IndentOps[Self <: Indent] (val x: Self) extends AnyVal {
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
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setParamsVarargs(value: String*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: StringDictionary[String] | js.Array[String]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

