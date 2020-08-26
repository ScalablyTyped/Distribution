package typings.reduxLittleRouter.anon

import typings.reduxLittleRouter.mod.ObjectLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path extends js.Object {
  var path: String = js.native
  var query: ObjectLiteral[String] = js.native
  var url: String = js.native
}

object Path {
  @scala.inline
  def apply(path: String, query: ObjectLiteral[String], url: String): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  @scala.inline
  implicit class PathOps[Self <: Path] (val x: Self) extends AnyVal {
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
    def setQuery(value: ObjectLiteral[String]): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

