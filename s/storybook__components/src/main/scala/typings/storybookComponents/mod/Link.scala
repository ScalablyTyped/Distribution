package typings.storybookComponents.mod

import typings.react.mod.FunctionComponent
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @storybook/components.@storybook/components.ListItemProps, 'onClick'> ]: @storybook/components.@storybook/components.ListItemProps[P]} */ trait Link extends StObject {
  
  var id: String
  
  var isGatsby: js.UndefOr[Boolean] = js.undefined
  
  var onClick: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Element, Event], /* item */ ListItemProps, Unit]
  ] = js.undefined
}
object Link {
  
  @JSImport("@storybook/components", "Link")
  @js.native
  val ^ : FunctionComponent[LinkProps & AProps] = js.native
  
  extension [Self <: Link](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsGatsby(value: Boolean): Self = StObject.set(x, "isGatsby", value.asInstanceOf[js.Any])
    
    inline def setIsGatsbyUndefined: Self = StObject.set(x, "isGatsby", js.undefined)
    
    inline def setOnClick(value: (/* event */ SyntheticEvent[Element, Event], /* item */ ListItemProps) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
