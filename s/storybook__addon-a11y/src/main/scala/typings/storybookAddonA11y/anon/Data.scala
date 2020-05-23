package typings.storybookAddonA11y.anon

import typings.std.HTMLElement
import typings.storybookAddonA11y.highlightToggleMod.HighlightedElementData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: HighlightedElementData
  var element: HTMLElement
}

object Data {
  @scala.inline
  def apply(data: HighlightedElementData, element: HTMLElement): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

