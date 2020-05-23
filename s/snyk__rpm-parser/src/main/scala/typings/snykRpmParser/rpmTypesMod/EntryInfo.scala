package typings.snykRpmParser.rpmTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryInfo extends js.Object {
  var count: Double
  var offset: Double
  var tag: Double
  var `type`: Double
}

object EntryInfo {
  @scala.inline
  def apply(count: Double, offset: Double, tag: Double, `type`: Double): EntryInfo = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryInfo]
  }
}

