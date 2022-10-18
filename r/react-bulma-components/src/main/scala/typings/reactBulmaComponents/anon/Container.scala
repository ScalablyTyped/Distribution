package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var Container: BulmaComponent[js.Object, div]
}
object Container {
  
  inline def apply(Container: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): Container = {
    val __obj = js.Dynamic.literal(Container = js.Any.fromFunction1(Container))
    __obj.asInstanceOf[Container]
  }
  
  extension [Self <: Container](x: Self) {
    
    inline def setContainer(value: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): Self = StObject.set(x, "Container", js.Any.fromFunction1(value))
  }
}
