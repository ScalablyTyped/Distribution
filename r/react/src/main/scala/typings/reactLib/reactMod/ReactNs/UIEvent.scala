package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UIEvent[T]
  extends BaseSyntheticEvent[reactLib.NativeUIEvent, reactLib.EventTarget with T, reactLib.EventTarget] {
  var detail: scala.Double
  var view: AbstractView
}

