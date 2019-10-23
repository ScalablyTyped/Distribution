package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestidlecallback {
  type IdleCallbackHandle = Double
  type IdleRequestCallback = js.Function1[/* deadline */ IdleDeadline, Unit]
}
