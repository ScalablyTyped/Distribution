package typings.requestidlecallback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestidlecallbackMod {
  type DOMHighResTimeStamp = Double
  type IdleCallbackHandle = Double
  type IdleRequestCallback = js.Function1[/* deadline */ IdleDeadline, Unit]
}
