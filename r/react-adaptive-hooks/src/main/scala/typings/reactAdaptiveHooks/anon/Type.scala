package typings.reactAdaptiveHooks.anon

import typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.`media-source`
import typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.file
import typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.record
import typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.transmission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: file | record | transmission | `media-source`
}

object Type {
  @scala.inline
  def apply(`type`: file | record | transmission | `media-source`): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

