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
  
  @scala.inline
  def apply(to: String): PickQueryLinkPropschildre = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickQueryLinkPropschildre]
  }
  
  @scala.inline
  implicit class PickQueryLinkPropschildreMutableBuilder[Self <: PickQueryLinkPropschildre] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
