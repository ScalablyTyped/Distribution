package typings.stampit.stampitMod

import typings.stampit.PropertyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stampit", "props")
@js.native
object props extends js.Object {
  def apply[Obj](objects: PropertyMap*): StampType[Obj] = js.native
}

