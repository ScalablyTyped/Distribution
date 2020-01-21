package typings.sha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CheckCallback[R] = js.Function1[/* err */ typings.std.Error | scala.Null, R]
  type GetCallback = js.Function2[/* err */ typings.std.Error | scala.Null, /* actual */ java.lang.String, scala.Unit]
}
