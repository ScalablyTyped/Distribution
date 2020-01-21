package typings.stampit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stampit", "conf")
@js.native
object conf extends js.Object {
  def apply[Obj](confs: PropertyMap*): StampType[Obj] = js.native
}

