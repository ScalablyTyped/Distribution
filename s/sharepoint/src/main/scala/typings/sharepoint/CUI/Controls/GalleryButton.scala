package typings.sharepoint.CUI.Controls

import typings.sharepoint.CUI.Control
import typings.sharepoint.CUI.ISelectableControl
import typings.sharepoint.CUI.Root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleryButton
  extends Control
     with ISelectableControl

object GalleryButton {
  @scala.inline
  def apply(
    createComponentForDisplayMode: String => js.Any,
    dispose: () => Unit,
    get_enabled: () => Boolean,
    get_id: () => String,
    get_root: () => Root,
    set_enabled: Boolean => Boolean
  ): GalleryButton = {
    val __obj = js.Dynamic.literal(createComponentForDisplayMode = js.Any.fromFunction1(createComponentForDisplayMode), dispose = js.Any.fromFunction0(dispose), get_enabled = js.Any.fromFunction0(get_enabled), get_id = js.Any.fromFunction0(get_id), get_root = js.Any.fromFunction0(get_root), set_enabled = js.Any.fromFunction1(set_enabled))
    __obj.asInstanceOf[GalleryButton]
  }
}

