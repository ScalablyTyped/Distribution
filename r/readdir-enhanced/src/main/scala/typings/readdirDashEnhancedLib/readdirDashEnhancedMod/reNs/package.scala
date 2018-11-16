package typings
package readdirDashEnhancedLib.readdirDashEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reNs {
  type Callback[T] = js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* result */ T, scala.Unit]
  type CallbackEntry = Callback[js.Array[Entry]]
  type CallbackString = Callback[js.Array[java.lang.String]]
  type FilterFunction = js.Function1[/* stat */ Entry, scala.Boolean]
}
