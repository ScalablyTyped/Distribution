package typings.storybookUi.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/router.@storybook/router.QueryLinkProps, 'children' | 'to'> */
trait PickQueryLinkPropschildre extends StObject {
  
  var children: ReactNode
  
  var to: String
}
object PickQueryLinkPropschildre {
  
  inline def apply(to: String): PickQueryLinkPropschildre = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickQueryLinkPropschildre]
  }
  
  extension [Self <: PickQueryLinkPropschildre](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
