package typings.stampit.stampitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stampit", "deepConf")
@js.native
object deepConf extends js.Object {
  def apply[Obj](deepConfs: PropertyMap*): StampType[Obj] = js.native
}

