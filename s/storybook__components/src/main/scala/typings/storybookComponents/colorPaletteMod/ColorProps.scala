package typings.storybookComponents.colorPaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorProps extends js.Object {
  var colors: js.Array[String] = js.native
  var subtitle: String = js.native
  var title: String = js.native
}

object ColorProps {
  @scala.inline
  def apply(colors: js.Array[String], subtitle: String, title: String): ColorProps = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColorProps]
  }
}

