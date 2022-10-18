package typings.reactMdMenu.typesTypesMod

import typings.reactMdButton.typesButtonMod.ButtonProps
import typings.reactMdMenu.anon.ReadonlyMenuButtonIconRot
import typings.reactMdMenu.anon.ReadonlyOmitTextIconSpaci
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMenuButtonProps
  extends StObject
     with ButtonProps
     with MenuButtonTextIconSpacingProps {
  
  /**
    * Boolean if the dropdown icon should be included with the button children.
    *
    * @defaultValue `buttonType === "icon"`
    */
  var disableDropdownIcon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Any additional props to pass to the {@link IconRotator} component that
    * surrounds the {@link buttonChildren}
    */
  var iconRotatorProps: js.UndefOr[ReadonlyMenuButtonIconRot] = js.undefined
  
  /**
    * An id required for accessibility and will be passed to the `<Button>`
    * component.
    *
    * @see {@link BaseMenuHookOptions.baseId}
    */
  @JSName("id")
  var id_BaseMenuButtonProps: String
  
  /**
    * Any additional props to pass to the {@link TextIconSpacing} component that
    * surrounds the optional dropdown icon.
    */
  var textIconSpacingProps: js.UndefOr[ReadonlyOmitTextIconSpaci] = js.undefined
}
object BaseMenuButtonProps {
  
  inline def apply(id: String): BaseMenuButtonProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMenuButtonProps]
  }
  
  extension [Self <: BaseMenuButtonProps](x: Self) {
    
    inline def setDisableDropdownIcon(value: Boolean): Self = StObject.set(x, "disableDropdownIcon", value.asInstanceOf[js.Any])
    
    inline def setDisableDropdownIconUndefined: Self = StObject.set(x, "disableDropdownIcon", js.undefined)
    
    inline def setIconRotatorProps(value: ReadonlyMenuButtonIconRot): Self = StObject.set(x, "iconRotatorProps", value.asInstanceOf[js.Any])
    
    inline def setIconRotatorPropsUndefined: Self = StObject.set(x, "iconRotatorProps", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTextIconSpacingProps(value: ReadonlyOmitTextIconSpaci): Self = StObject.set(x, "textIconSpacingProps", value.asInstanceOf[js.Any])
    
    inline def setTextIconSpacingPropsUndefined: Self = StObject.set(x, "textIconSpacingProps", js.undefined)
  }
}
