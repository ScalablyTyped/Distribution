package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.a
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import typings.reactBulmaComponents.srcComponentsTabsMod.TabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabBulmaComponent extends StObject {
  
  var Tab: BulmaComponent[TabProps, a]
}
object TabBulmaComponent {
  
  inline def apply(Tab: /* props */ TabProps & (ElementProps[TabProps, a]) => ReactElement): TabBulmaComponent = {
    val __obj = js.Dynamic.literal(Tab = js.Any.fromFunction1(Tab))
    __obj.asInstanceOf[TabBulmaComponent]
  }
  
  extension [Self <: TabBulmaComponent](x: Self) {
    
    inline def setTab(value: /* props */ TabProps & (ElementProps[TabProps, a]) => ReactElement): Self = StObject.set(x, "Tab", js.Any.fromFunction1(value))
  }
}
