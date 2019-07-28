package typings.atStorybookAddonDashKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debounce extends js.Object {
  var debounce: Boolean
  var timestamps: Boolean
}

object Anon_Debounce {
  @scala.inline
  def apply(debounce: Boolean, timestamps: Boolean): Anon_Debounce = {
    val __obj = js.Dynamic.literal(debounce = debounce, timestamps = timestamps)
  
    __obj.asInstanceOf[Anon_Debounce]
  }
}

