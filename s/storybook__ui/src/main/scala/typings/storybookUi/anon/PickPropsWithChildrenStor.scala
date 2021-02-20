package typings.storybookUi.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react.react.PropsWithChildren<@storybook/components.@storybook/components/dist/brand/StorybookLogo.StorybookLogoProps>, 'children' | 'alt'> */
@js.native
trait PickPropsWithChildrenStor extends StObject {
  
  var alt: String = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
}
object PickPropsWithChildrenStor {
  
  @scala.inline
  def apply(alt: String): PickPropsWithChildrenStor = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPropsWithChildrenStor]
  }
  
  @scala.inline
  implicit class PickPropsWithChildrenStorMutableBuilder[Self <: PickPropsWithChildrenStor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
