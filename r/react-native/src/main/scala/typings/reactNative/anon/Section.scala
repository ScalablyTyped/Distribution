package typings.reactNative.anon

import typings.reactNative.mod.SectionListData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Section[ItemT] extends js.Object {
  var section: SectionListData[ItemT]
}

object Section {
  @scala.inline
  def apply[ItemT](section: SectionListData[ItemT]): Section[ItemT] = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section[ItemT]]
  }
}

