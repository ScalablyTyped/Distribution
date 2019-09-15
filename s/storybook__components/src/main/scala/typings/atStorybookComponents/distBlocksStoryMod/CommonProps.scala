package typings.atStorybookComponents.distBlocksStoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonProps extends js.Object {
  var height: js.UndefOr[String] = js.undefined
  var id: String
  var title: String
}

object CommonProps {
  @scala.inline
  def apply(id: String, title: String, height: String = null): CommonProps = {
    val __obj = js.Dynamic.literal(id = id, title = title)
    if (height != null) __obj.updateDynamic("height")(height)
    __obj.asInstanceOf[CommonProps]
  }
}

