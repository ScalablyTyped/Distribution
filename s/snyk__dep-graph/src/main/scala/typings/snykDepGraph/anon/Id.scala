package typings.snykDepGraph.anon

import typings.snykDepGraph.typesMod.PkgInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: String
  var info: PkgInfo
}

object Id {
  @scala.inline
  def apply(id: String, info: PkgInfo): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

