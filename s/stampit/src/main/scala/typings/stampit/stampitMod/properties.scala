package typings.stampit.stampitMod

import typings.stampit.PropertyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stampit", "properties")
@js.native
object properties extends js.Object {
  def apply[Obj](objects: PropertyMap*): StampType[Obj] = js.native
}

