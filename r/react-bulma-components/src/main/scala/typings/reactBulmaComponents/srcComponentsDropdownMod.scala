package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactBulmaComponents.anon.Divider
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import typings.reactBulmaComponents.srcComponentsMod.Color
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsDropdownMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/dropdown", JSImport.Default)
  @js.native
  val default: (js.Function1[
    /* props */ DropdownProps[Any] & (ElementProps[DropdownProps[Any], div]), 
    ReactElement
  ]) & Divider = js.native
  
  trait DropdownItemProps[T] extends StObject {
    
    var value: T
  }
  object DropdownItemProps {
    
    inline def apply[T](value: T): DropdownItemProps[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownItemProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropdownItemProps[?], T] (val x: Self & DropdownItemProps[T]) extends AnyVal {
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropdownProps[T] extends StObject {
    
    var align: js.UndefOr[right] = js.undefined
    
    var closeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hoverable: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* newValue */ T, Unit]] = js.undefined
    
    var right: js.UndefOr[Boolean] = js.undefined
    
    var up: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[T] = js.undefined
  }
  object DropdownProps {
    
    inline def apply[T](): DropdownProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropdownProps[?], T] (val x: Self & DropdownProps[T]) extends AnyVal {
      
      inline def setAlign(value: right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      inline def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnChange(value: /* newValue */ T => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setUp(value: Boolean): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = (js.Function1[
    /* props */ DropdownProps[Any] & (ElementProps[DropdownProps[Any], div]), 
    ReactElement
  ]) & Divider
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsDropdownMod.foo` */
  override def _to: (js.Function1[
    /* props */ DropdownProps[Any] & (ElementProps[DropdownProps[Any], div]), 
    ReactElement
  ]) & Divider = default
}
