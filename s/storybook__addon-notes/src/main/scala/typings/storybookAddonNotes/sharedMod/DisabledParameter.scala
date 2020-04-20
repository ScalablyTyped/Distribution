package typings.storybookAddonNotes.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisabledParameter extends _Parameters {
  var disable: Boolean
}

object DisabledParameter {
  @scala.inline
  def apply(disable: Boolean): DisabledParameter = {
    val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledParameter]
  }
}

