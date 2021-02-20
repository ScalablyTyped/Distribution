package typings.rcUtil

import typings.rcUtil.anon.MockRestore
import typings.std.PropertyDescriptor
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domHookMod {
  
  @JSImport("rc-util/lib/test/domHook", "spyElementPrototype")
  @js.native
  def spyElementPrototype(Element: ElementClass, propName: String, property: Property): MockRestore = js.native
  
  @JSImport("rc-util/lib/test/domHook", "spyElementPrototypes")
  @js.native
  def spyElementPrototypes[T /* <: ElementClass */](elementClass: T, properties: Record[String, Property]): MockRestore = js.native
  
  type ElementClass = js.Function
  
  type Property = PropertyDescriptor | js.Function
}
