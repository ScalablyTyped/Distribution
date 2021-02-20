package typings.rcMentions

import typings.rcMentions.mentionsContextMod.MentionsContextProps
import typings.rcMentions.optionMod.OptionProps
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMenuMod {
  
  /**
    * We only use Menu to display the candidate.
    * The focus is controlled by textarea to make accessibility easy.
    */
  @JSImport("rc-mentions/es/DropdownMenu", JSImport.Default)
  @js.native
  class default () extends DropdownMenu
  
  /**
    * We only use Menu to display the candidate.
    * The focus is controlled by textarea to make accessibility easy.
    */
  @js.native
  trait DropdownMenu
    extends Component[DropdownMenuProps, js.Object, js.Any] {
    
    def renderDropdown(hasNotFoundContentActiveIndexSetActiveIndexSelectOptionOnFocusOnBlur: MentionsContextProps): Element = js.native
  }
  
  @js.native
  trait DropdownMenuProps extends StObject {
    
    var options: js.Array[OptionProps] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
  }
  object DropdownMenuProps {
    
    @scala.inline
    def apply(options: js.Array[OptionProps]): DropdownMenuProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownMenuProps]
    }
    
    @scala.inline
    implicit class DropdownMenuPropsMutableBuilder[Self <: DropdownMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Array[OptionProps]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: OptionProps*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
}
