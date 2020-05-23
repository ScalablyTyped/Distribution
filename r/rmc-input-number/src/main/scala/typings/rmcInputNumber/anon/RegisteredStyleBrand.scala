package typings.rmcInputNumber.anon

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisteredStyleBrand extends js.Object {
  var __registeredStyleBrand: ViewStyle | TextStyle | ImageStyle
}

object RegisteredStyleBrand {
  @scala.inline
  def apply(__registeredStyleBrand: ViewStyle | TextStyle | ImageStyle): RegisteredStyleBrand = {
    val __obj = js.Dynamic.literal(__registeredStyleBrand = __registeredStyleBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredStyleBrand]
  }
}

