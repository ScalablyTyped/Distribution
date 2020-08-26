package typings.protractorHttpMock.anon

import typings.protractorHttpMock.protractorHttpMockStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathRegex extends js.Object {
  var method: PUT = js.native
  var path: String = js.native
  var regex: js.UndefOr[Boolean] = js.native
}

object PathRegex {
  @scala.inline
  def apply(method: PUT, path: String): PathRegex = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRegex]
  }
  @scala.inline
  implicit class PathRegexOps[Self <: PathRegex] (val x: Self) extends AnyVal {
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
    def setMethod(value: PUT): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegex(value: Boolean): Self = this.set("regex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
  }
  
}

