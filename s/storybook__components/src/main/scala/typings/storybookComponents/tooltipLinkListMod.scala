package typings.storybookComponents

import typings.react.mod.FunctionComponent
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.storybookComponents.listItemMod.LinkWrapperType
import typings.storybookComponents.listItemMod.ListItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipLinkListMod {
  
  @JSImport("@storybook/components/dist/tooltip/TooltipLinkList", "TooltipLinkList")
  @js.native
  val TooltipLinkList: FunctionComponent[TooltipLinkListProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof @storybook/components.@storybook/components/dist/tooltip/ListItem.ListItemProps, 'onClick'> ]: @storybook/components.@storybook/components/dist/tooltip/ListItem.ListItemProps[P]} */ trait Link extends StObject {
    
    var id: String
    
    var isGatsby: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[Element, Event], /* item */ ListItemProps, Unit]
      ] = js.undefined
  }
  object Link {
    
    @scala.inline
    def apply(id: String): Link = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    @scala.inline
    implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGatsby(value: Boolean): Self = StObject.set(x, "isGatsby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGatsbyUndefined: Self = StObject.set(x, "isGatsby", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* event */ SyntheticEvent[Element, Event], /* item */ ListItemProps) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  trait TooltipLinkListProps extends StObject {
    
    var LinkWrapper: js.UndefOr[LinkWrapperType] = js.undefined
    
    var links: js.Array[Link]
  }
  object TooltipLinkListProps {
    
    @scala.inline
    def apply(links: js.Array[Link]): TooltipLinkListProps = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipLinkListProps]
    }
    
    @scala.inline
    implicit class TooltipLinkListPropsMutableBuilder[Self <: TooltipLinkListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinkWrapper(value: LinkWrapperType): Self = StObject.set(x, "LinkWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkWrapperUndefined: Self = StObject.set(x, "LinkWrapper", js.undefined)
      
      @scala.inline
      def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value :_*))
    }
  }
}
