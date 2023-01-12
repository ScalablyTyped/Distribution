package typings.reactMdForm.typesSliderTypesMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderAddons extends StObject {
  
  /**
    * An optional addon to render after the slider's track. This can be anything
    * and will be wrapped in the `TextIconSpacing` component from
    * `@react-md/icon`.
    *
    * When the `vertical` prop is enabled, the addon will appear above the track.
    */
  var afterAddon: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * An optional addon to render before the slider's track. This can be anything
    * and will be wrapped in the `TextIconSpacing` component from
    * `@react-md/icon`.
    *
    * When the `vertical` prop is enabled, the addon will appear underneath the
    * track.
    */
  var beforeAddon: js.UndefOr[ReactNode] = js.undefined
}
object SliderAddons {
  
  inline def apply(): SliderAddons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderAddons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderAddons] (val x: Self) extends AnyVal {
    
    inline def setAfterAddon(value: ReactNode): Self = StObject.set(x, "afterAddon", value.asInstanceOf[js.Any])
    
    inline def setAfterAddonUndefined: Self = StObject.set(x, "afterAddon", js.undefined)
    
    inline def setBeforeAddon(value: ReactNode): Self = StObject.set(x, "beforeAddon", value.asInstanceOf[js.Any])
    
    inline def setBeforeAddonUndefined: Self = StObject.set(x, "beforeAddon", js.undefined)
  }
}
