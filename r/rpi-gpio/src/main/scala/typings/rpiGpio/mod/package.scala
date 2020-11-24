package typings.rpiGpio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[typings.std.Error | scala.Null], scala.Unit]
  
  type ValueCallback[T] = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* value */ js.UndefOr[T], 
    scala.Unit
  ]
}
