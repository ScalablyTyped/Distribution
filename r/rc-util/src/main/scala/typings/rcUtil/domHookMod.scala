package typings.rcUtil

import typings.rcUtil.anon.MockRestore
import typings.std.PropertyDescriptor
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-util/lib/test/domHook", JSImport.Namespace)
@js.native
object domHookMod extends js.Object {
  
  def spyElementPrototype(Element: ElementClass, propName: String, property: Property): MockRestore = js.native
  
  def spyElementPrototypes[T /* <: ElementClass */](elementClass: T, properties: Record[String, Property]): MockRestore = js.native
  
  type ElementClass = js.Function
  
  type Property = PropertyDescriptor | js.Function
}
