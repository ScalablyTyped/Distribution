package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSplitButtonMod {
  
  @JSImport("react-bootstrap/lib/SplitButton", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[SplitButtonProps, js.Object, Any]
  
  type SplitButton = Component[SplitButtonProps, js.Object, Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in {[ P in keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton> ]: P} & {[ P in 'title' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton>] ]: react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton>[P]} */ trait SplitButtonProps extends StObject {
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
    
    var dropdownTitle: js.UndefOr[Any] = js.undefined
    
    // TODO: Add more specific type
    var dropup: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var pullRight: js.UndefOr[Boolean] = js.undefined
    
    var title: ReactNode
  }
  object SplitButtonProps {
    
    inline def apply(id: String): SplitButtonProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SplitButtonProps] (val x: Self) extends AnyVal {
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      inline def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      inline def setDropdownTitle(value: Any): Self = StObject.set(x, "dropdownTitle", value.asInstanceOf[js.Any])
      
      inline def setDropdownTitleUndefined: Self = StObject.set(x, "dropdownTitle", js.undefined)
      
      inline def setDropup(value: Boolean): Self = StObject.set(x, "dropup", value.asInstanceOf[js.Any])
      
      inline def setDropupUndefined: Self = StObject.set(x, "dropup", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      inline def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
