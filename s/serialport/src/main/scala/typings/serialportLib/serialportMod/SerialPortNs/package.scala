package typings
package serialportLib.serialportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SerialPortNs {
  // Callbacks Type Defs
  type ErrorCallback = js.Function1[/* error */ nodeLib.Error, scala.Unit]
  type ListCallback = js.Function2[/* error */ nodeLib.Error, /* port */ js.Array[js.Any], scala.Unit]
  type ModemBitsCallback = js.Function2[/* error */ nodeLib.Error, /* status */ serialportLib.Anon_Cts, scala.Unit]
  type darwinBinding = BaseBinding
  type linuxBinding = BaseBinding
  // Binding Type Defs
  type win32Binding = BaseBinding
}
