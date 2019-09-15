package typings.atStorybookComponents.distBlocksColorPaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorProps extends js.Object {
  var colors: js.Array[String]
  var subtitle: String
  var title: String
}

object ColorProps {
  @scala.inline
  def apply(colors: js.Array[String], subtitle: String, title: String): ColorProps = {
    val __obj = js.Dynamic.literal(colors = colors, subtitle = subtitle, title = title)
  
    __obj.asInstanceOf[ColorProps]
  }
}

