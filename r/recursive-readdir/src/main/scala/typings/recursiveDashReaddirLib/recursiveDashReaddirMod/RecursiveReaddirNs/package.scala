package typings
package recursiveDashReaddirLib.recursiveDashReaddirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RecursiveReaddirNs {
  type Callback = js.Function2[/* error */ nodeLib.Error, /* files */ js.Array[java.lang.String], scala.Unit]
  type IgnoreFunction = js.Function2[/* file */ java.lang.String, /* stats */ nodeLib.fsMod.Stats, scala.Boolean]
  type Ignores = js.Array[java.lang.String | IgnoreFunction]
}
