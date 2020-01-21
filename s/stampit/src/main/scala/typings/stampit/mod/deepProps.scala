package typings.stampit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stampit", "deepProps")
@js.native
object deepProps extends js.Object {
  def apply[Obj](deepObjects: PropertyMap*): StampType[Obj] = js.native
}

