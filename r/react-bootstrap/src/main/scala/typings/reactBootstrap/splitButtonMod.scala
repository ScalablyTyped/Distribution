package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitButtonMod {
  
  @JSImport("react-bootstrap/lib/SplitButton", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[SplitButtonProps, js.Object, js.Any]
  
  @js.native
  trait SplitButton
    extends Component[SplitButtonProps, js.Object, js.Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in {[ P in keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton> ]: P} & {[ P in 'title' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton>] ]: react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton>[P]} */ @js.native
  trait SplitButtonProps extends StObject {
    
    var bsSize: js.UndefOr[Sizes] = js.native
    
    var bsStyle: js.UndefOr[String] = js.native
    
    var dropdownTitle: js.UndefOr[js.Any] = js.native
    
    // TODO: Add more specific type
    var dropup: js.UndefOr[Boolean] = js.native
    
    var id: String = js.native
    
    var pullRight: js.UndefOr[Boolean] = js.native
    
    var title: ReactNode = js.native
  }
  object SplitButtonProps {
    
    @scala.inline
    def apply(id: String): SplitButtonProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitButtonProps]
    }
    
    @scala.inline
    implicit class SplitButtonPropsMutableBuilder[Self <: SplitButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      @scala.inline
      def setDropdownTitle(value: js.Any): Self = StObject.set(x, "dropdownTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownTitleUndefined: Self = StObject.set(x, "dropdownTitle", js.undefined)
      
      @scala.inline
      def setDropup(value: Boolean): Self = StObject.set(x, "dropup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropupUndefined: Self = StObject.set(x, "dropup", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
