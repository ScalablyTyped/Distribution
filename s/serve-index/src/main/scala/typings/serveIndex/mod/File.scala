package typings.serveIndex.mod

import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var name: String
  var stat: Stats
}

object File {
  @scala.inline
  def apply(name: String, stat: Stats): File = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

