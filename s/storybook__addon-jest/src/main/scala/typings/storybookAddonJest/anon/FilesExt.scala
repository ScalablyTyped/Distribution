package typings.storybookAddonJest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesExt extends js.Object {
  var filesExt: js.UndefOr[String] = js.native
  var results: js.Any = js.native
}

object FilesExt {
  @scala.inline
  def apply(results: js.Any): FilesExt = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesExt]
  }
  @scala.inline
  implicit class FilesExtOps[Self <: FilesExt] (val x: Self) extends AnyVal {
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
    def setResults(value: js.Any): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesExt(value: String): Self = this.set("filesExt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilesExt: Self = this.set("filesExt", js.undefined)
  }
  
}

