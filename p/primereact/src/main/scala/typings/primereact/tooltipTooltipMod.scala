package typings.primereact

import typings.primereact.tooltipTooltipoptionsMod.TooltipOptions
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipTooltipMod {
  
  @JSImport("primereact/tooltip/tooltip", "Tooltip")
  @js.native
  open class Tooltip protected () extends Component[TooltipProps, Any, Any] {
    def this(props: TooltipProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TooltipProps, context: Any) = this()
    
    def getElement(): HTMLElement = js.native
    
    def getTarget(): HTMLElement | Null = js.native
    
    def loadTargetEvents(target: HTMLElement): Unit = js.native
    
    def unloadTargetEvents(target: HTMLElement): Unit = js.native
    
    def updateTargetEvents(target: HTMLElement): Unit = js.native
  }
  
  trait TooltipProps
    extends StObject
       with TooltipOptions {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[TooltipTargetType] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(): TooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipProps]
    }
    
    extension [Self <: TooltipProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setTarget(value: TooltipTargetType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
    }
  }
  
  type TooltipTargetType = String | js.Array[String] | HTMLElement
}
