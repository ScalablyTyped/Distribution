package typings.serialport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serialportMod {
  import typings.serialport.Anon_Cts
  import typings.std.Error

  // Callbacks Type Defs
  type ErrorCallback = js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  type ListCallback = js.Function2[/* error */ js.UndefOr[Error | Null], /* ports */ js.Array[js.Any], Unit]
  type ModemBitsCallback = js.Function2[/* error */ js.UndefOr[Error | Null], /* status */ Anon_Cts, Unit]
  type darwinBinding = BaseBinding
  type linuxBinding = BaseBinding
  // Binding Type Defs
  type win32Binding = BaseBinding
}
