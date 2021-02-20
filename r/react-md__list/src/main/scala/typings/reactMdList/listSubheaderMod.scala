package typings.reactMdList

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listSubheaderMod {
  
  @JSImport("@react-md/list/types/ListSubheader", "ListSubheader")
  @js.native
  val ListSubheader: ForwardRefExoticComponent[ListSubheaderProps with RefAttributes[HTMLLIElement]] = js.native
  
  @js.native
  trait ListSubheaderProps extends HTMLAttributes[HTMLLIElement] {
    
    /**
      * Boolean if the subheader should be inset to match the `ListItem` text
      * keyline.
      */
    var inset: js.UndefOr[Boolean] = js.native
  }
  object ListSubheaderProps {
    
    @scala.inline
    def apply(): ListSubheaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListSubheaderProps]
    }
    
    @scala.inline
    implicit class ListSubheaderPropsMutableBuilder[Self <: ListSubheaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    }
  }
}
