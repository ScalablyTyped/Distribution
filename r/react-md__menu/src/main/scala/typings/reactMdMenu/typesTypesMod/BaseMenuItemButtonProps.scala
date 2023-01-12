package typings.reactMdMenu.typesTypesMod

import typings.reactMdMenu.anon.ReadonlyMenuButtonIconRot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMenuItemButtonProps
  extends StObject
     with MenuItemProps {
  
  /**
    * Boolean if the dropdown icon should be set to the
    * {@link ListItemProps.rightAddon}.
    *
    * @defaultValue `typeof rightAddon !== "undefined"`
    */
  var disableDropdownIcon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Any additional props to pass to the {@link IconRotator} component that
    * surrounds the {@link buttonChildren}
    */
  var iconRotatorProps: js.UndefOr[ReadonlyMenuButtonIconRot] = js.undefined
  
  /**
    * An id required for accessibility and will be passed to the `<MenuItem>`
    * component.
    *
    * @see {@link BaseMenuHookOptions.baseId}
    */
  @JSName("id")
  var id_BaseMenuItemButtonProps: String
}
object BaseMenuItemButtonProps {
  
  inline def apply(id: String): BaseMenuItemButtonProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMenuItemButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseMenuItemButtonProps] (val x: Self) extends AnyVal {
    
    inline def setDisableDropdownIcon(value: Boolean): Self = StObject.set(x, "disableDropdownIcon", value.asInstanceOf[js.Any])
    
    inline def setDisableDropdownIconUndefined: Self = StObject.set(x, "disableDropdownIcon", js.undefined)
    
    inline def setIconRotatorProps(value: ReadonlyMenuButtonIconRot): Self = StObject.set(x, "iconRotatorProps", value.asInstanceOf[js.Any])
    
    inline def setIconRotatorPropsUndefined: Self = StObject.set(x, "iconRotatorProps", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
