package typings
package shaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shaMod {
  type CheckCallback[R] = js.Function1[/* err */ nodeLib.Error | scala.Null, R]
  type GetCallback = js.Function2[/* err */ nodeLib.Error | scala.Null, /* actual */ java.lang.String, scala.Unit]
}
