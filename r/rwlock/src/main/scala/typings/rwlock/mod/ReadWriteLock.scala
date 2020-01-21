package typings.rwlock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadWriteLock extends ReadWriteGeneric[Callback] {
  var async: ReadWriteGeneric[AsyncCallback] = js.native
}

