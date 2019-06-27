package typings
package serialportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serialportMod {
  // Callbacks Type Defs
  type ErrorCallback = js.Function1[/* error */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  type ListCallback = js.Function2[
    /* error */ js.UndefOr[stdLib.Error | scala.Null], 
    /* ports */ js.Array[js.Any], 
    scala.Unit
  ]
  type ModemBitsCallback = js.Function2[
    /* error */ js.UndefOr[stdLib.Error | scala.Null], 
    /* status */ serialportLib.Anon_Cts, 
    scala.Unit
  ]
  type darwinBinding = BaseBinding
  type linuxBinding = BaseBinding
  // Binding Type Defs
  type win32Binding = BaseBinding
}
