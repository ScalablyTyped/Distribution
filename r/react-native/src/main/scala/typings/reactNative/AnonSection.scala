package typings.reactNative

import typings.reactNative.mod.SectionListData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSection[ItemT] extends js.Object {
  var section: SectionListData[ItemT]
}

object AnonSection {
  @scala.inline
  def apply[ItemT](section: SectionListData[ItemT]): AnonSection[ItemT] = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSection[ItemT]]
  }
}

