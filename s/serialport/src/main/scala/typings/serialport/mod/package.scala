package typings.serialport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Callbacks Type Defs
  type ErrorCallback = js.Function1[/* error */ js.UndefOr[typings.std.Error | scala.Null], scala.Unit]
  type ModemBitsCallback = js.Function2[
    /* error */ js.UndefOr[typings.std.Error | scala.Null], 
    /* status */ typings.serialport.AnonCts, 
    scala.Unit
  ]
  type darwinBinding = typings.serialport.mod.BaseBinding
  type linuxBinding = typings.serialport.mod.BaseBinding
  // Binding Type Defs
  type win32Binding = typings.serialport.mod.BaseBinding
}
