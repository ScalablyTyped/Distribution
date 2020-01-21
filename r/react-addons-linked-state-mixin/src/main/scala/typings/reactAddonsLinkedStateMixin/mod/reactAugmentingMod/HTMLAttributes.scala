package typings.reactAddonsLinkedStateMixin.mod.reactAugmentingMod

import typings.reactAddonsLinkedStateMixin.mod.ReactLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLAttributes[T] extends js.Object {
  var checkedLink: js.UndefOr[ReactLink[Boolean]] = js.undefined
  var valueLink: js.UndefOr[ReactLink[Boolean | String | Double]] = js.undefined
}

object HTMLAttributes {
  @scala.inline
  def apply[T](checkedLink: ReactLink[Boolean] = null, valueLink: ReactLink[Boolean | String | Double] = null): HTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (checkedLink != null) __obj.updateDynamic("checkedLink")(checkedLink.asInstanceOf[js.Any])
    if (valueLink != null) __obj.updateDynamic("valueLink")(valueLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributes[T]]
  }
}

