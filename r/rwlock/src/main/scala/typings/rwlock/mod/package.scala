package typings.rwlock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncCallback = js.Function2[/* err */ typings.std.Error, /* release */ typings.rwlock.mod.Release, scala.Unit]
  type Callback = js.Function1[/* release */ typings.rwlock.mod.Release, scala.Unit]
  type Release = js.Function0[scala.Unit]
}
