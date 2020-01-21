package typings.reactModal.mod

import typings.std.Element
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes overlay and content element references passed to onAfterOpen function */
trait OnAfterOpenCallbackOptions extends js.Object {
  /** content element reference */
  var contentEl: HTMLDivElement
  /** overlay element reference */
  var overlayEl: Element
}

object OnAfterOpenCallbackOptions {
  @scala.inline
  def apply(contentEl: HTMLDivElement, overlayEl: Element): OnAfterOpenCallbackOptions = {
    val __obj = js.Dynamic.literal(contentEl = contentEl.asInstanceOf[js.Any], overlayEl = overlayEl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnAfterOpenCallbackOptions]
  }
}

