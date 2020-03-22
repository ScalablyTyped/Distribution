package typings.rcUtil

import typings.std.PropertyDescriptor
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-util/lib/test/domHook", JSImport.Namespace)
@js.native
object domHookMod extends js.Object {
  def spyElementPrototype(Element: ElementClass, propName: String, property: Property): AnonMockRestore = js.native
  def spyElementPrototypes[T /* <: ElementClass */](elementClass: T, properties: Record[String, Property]): AnonMockRestore = js.native
  type ElementClass = js.Function
  type Property = PropertyDescriptor | js.Function
}

