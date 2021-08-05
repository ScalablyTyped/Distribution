package typings.storybookComponents

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.storybookComponents.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMessageMod {
  
  @JSImport("@storybook/components/dist/tooltip/TooltipMessage", "TooltipMessage")
  @js.native
  val TooltipMessage: FunctionComponent[TooltipMessageProps] = js.native
  
  trait TooltipMessageProps extends StObject {
    
    var desc: js.UndefOr[ReactNode] = js.undefined
    
    var links: js.UndefOr[js.Array[Href]] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object TooltipMessageProps {
    
    inline def apply(): TooltipMessageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipMessageProps]
    }
    
    extension [Self <: TooltipMessageProps](x: Self) {
      
      inline def setDesc(value: ReactNode): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setLinks(value: js.Array[Href]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setLinksVarargs(value: Href*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
