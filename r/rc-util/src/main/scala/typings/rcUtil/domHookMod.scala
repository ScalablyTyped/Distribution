package typings.rcUtil

import typings.rcUtil.anon.MockRestore
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domHookMod {
  
  @JSImport("rc-util/lib/test/domHook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def spyElementPrototype(Element: ElementClass, propName: String, property: Property): MockRestore = (^.asInstanceOf[js.Dynamic].applyDynamic("spyElementPrototype")(Element.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[MockRestore]
  
  inline def spyElementPrototypes[T /* <: ElementClass */](elementClass: T, properties: Record[String, Property]): MockRestore = (^.asInstanceOf[js.Dynamic].applyDynamic("spyElementPrototypes")(elementClass.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[MockRestore]
  
  type ElementClass = js.Function
  
  type Property = js.PropertyDescriptor | js.Function
}
