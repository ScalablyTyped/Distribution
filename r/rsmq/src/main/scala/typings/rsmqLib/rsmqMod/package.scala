package typings
package rsmqLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rsmqMod {
  type CallbackT[R] = js.Function2[/* e */ js.UndefOr[stdLib.Error], /* res */ js.UndefOr[R], scala.Unit]
}
