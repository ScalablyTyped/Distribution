package typings.reduxLittleRouter.anon

import typings.reduxLittleRouter.mod.ObjectLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var path: String
  var query: ObjectLiteral[String]
  var url: String
}

object Path {
  @scala.inline
  def apply(path: String, query: ObjectLiteral[String], url: String): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

