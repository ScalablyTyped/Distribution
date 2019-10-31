package typings.stampit.stampitMod

import typings.stampit.PropertyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory function to create plain object instances.
  * @template Obj The object type that the `Stamp` will create.
  */
@js.native
trait FactoryFunction[Obj] extends js.Object {
  def apply(): StampObjectType[Obj] = js.native
  def apply(options: PropertyMap, args: js.Any*): StampObjectType[Obj] = js.native
}

