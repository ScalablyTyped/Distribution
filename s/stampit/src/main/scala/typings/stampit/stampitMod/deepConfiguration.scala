package typings.stampit.stampitMod

import typings.stampit.PropertyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stampit", "deepConfiguration")
@js.native
object deepConfiguration extends js.Object {
  def apply[Obj](deepConfs: PropertyMap*): StampType[Obj] = js.native
}

