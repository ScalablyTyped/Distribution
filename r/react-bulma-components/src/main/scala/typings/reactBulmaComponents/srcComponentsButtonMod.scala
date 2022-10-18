package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.anon.Group
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`black-bis`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`black-ter`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`grey-dark`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`grey-darker`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`grey-light`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`grey-lighter`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`white-bis`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`white-ter`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.active
import typings.reactBulmaComponents.reactBulmaComponentsStrings.button
import typings.reactBulmaComponents.reactBulmaComponentsStrings.center
import typings.reactBulmaComponents.reactBulmaComponentsStrings.focus
import typings.reactBulmaComponents.reactBulmaComponentsStrings.ghost
import typings.reactBulmaComponents.reactBulmaComponentsStrings.hover
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.Color
import typings.reactBulmaComponents.srcComponentsMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsButtonMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/button", JSImport.Default)
  @js.native
  val default: (BulmaComponent[ButtonProps, button]) & Group = js.native
  
  trait ButtonGroupProps extends StObject {
    
    var align: js.UndefOr[center | right] = js.undefined
    
    var hasAddons: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
  }
  object ButtonGroupProps {
    
    inline def apply(): ButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonGroupProps]
    }
    
    extension [Self <: ButtonGroupProps](x: Self) {
      
      inline def setAlign(value: center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setHasAddons(value: Boolean): Self = StObject.set(x, "hasAddons", value.asInstanceOf[js.Any])
      
      inline def setHasAddonsUndefined: Self = StObject.set(x, "hasAddons", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ButtonProps extends StObject {
    
    var color: js.UndefOr[
        Color | ghost | `black-bis` | `black-ter` | `white-bis` | `white-ter` | `grey-darker` | `grey-dark` | `grey-light` | `grey-lighter`
      ] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var fullwidth: js.UndefOr[Boolean] = js.undefined
    
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    var isStatic: js.UndefOr[Boolean] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var outlined: js.UndefOr[Boolean] = js.undefined
    
    var remove: js.UndefOr[Boolean] = js.undefined
    
    var reset: js.UndefOr[Boolean] = js.undefined
    
    var rounded: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var state: js.UndefOr[hover | focus | active] = js.undefined
    
    var submit: js.UndefOr[Boolean] = js.undefined
    
    var text: js.UndefOr[Boolean] = js.undefined
  }
  object ButtonProps {
    
    inline def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    extension [Self <: ButtonProps](x: Self) {
      
      inline def setColor(
        value: Color | ghost | `black-bis` | `black-ter` | `white-bis` | `white-ter` | `grey-darker` | `grey-dark` | `grey-light` | `grey-lighter`
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFullwidth(value: Boolean): Self = StObject.set(x, "fullwidth", value.asInstanceOf[js.Any])
      
      inline def setFullwidthUndefined: Self = StObject.set(x, "fullwidth", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
      
      inline def setIsStaticUndefined: Self = StObject.set(x, "isStatic", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOutlined(value: Boolean): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      inline def setOutlinedUndefined: Self = StObject.set(x, "outlined", js.undefined)
      
      inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setState(value: hover | focus | active): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setSubmit(value: Boolean): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
      
      inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
      
      inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type _To = (BulmaComponent[ButtonProps, button]) & Group
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsButtonMod.foo` */
  override def _to: (BulmaComponent[ButtonProps, button]) & Group = default
}
