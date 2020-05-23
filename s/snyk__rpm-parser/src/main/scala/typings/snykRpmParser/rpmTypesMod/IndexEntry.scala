package typings.snykRpmParser.rpmTypesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexEntry extends js.Object {
  var data: Buffer
  var info: EntryInfo
  var length: Double
}

object IndexEntry {
  @scala.inline
  def apply(data: Buffer, info: EntryInfo, length: Double): IndexEntry = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexEntry]
  }
}

