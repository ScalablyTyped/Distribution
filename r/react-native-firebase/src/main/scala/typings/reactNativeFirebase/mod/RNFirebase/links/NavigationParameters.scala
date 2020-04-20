package typings.reactNativeFirebase.mod.RNFirebase.links

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationParameters extends js.Object {
  def setForcedRedirectEnabled(forcedRedirectEnabled: Boolean): DynamicLink
}

object NavigationParameters {
  @scala.inline
  def apply(setForcedRedirectEnabled: Boolean => DynamicLink): NavigationParameters = {
    val __obj = js.Dynamic.literal(setForcedRedirectEnabled = js.Any.fromFunction1(setForcedRedirectEnabled))
    __obj.asInstanceOf[NavigationParameters]
  }
}

