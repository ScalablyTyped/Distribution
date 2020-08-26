package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracingStartOptions extends js.Object {
  var categories: js.UndefOr[js.Array[String]] = js.native
  var path: String = js.native
  var screenshots: js.UndefOr[Boolean] = js.native
}

object TracingStartOptions {
  @scala.inline
  def apply(path: String): TracingStartOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracingStartOptions]
  }
  @scala.inline
  implicit class TracingStartOptionsOps[Self <: TracingStartOptions] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setScreenshots(value: Boolean): Self = this.set("screenshots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenshots: Self = this.set("screenshots", js.undefined)
  }
  
}

