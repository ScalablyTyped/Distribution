package typings.stampit.stampitMod

import typings.stampit.PropertyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stampit", "deepProperties")
@js.native
object deepProperties extends js.Object {
  def apply[Obj](deepObjects: PropertyMap*): StampType[Obj] = js.native
}

