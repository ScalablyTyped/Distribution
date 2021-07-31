package typings.storybookComponents

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLHeadingElement
import typings.storybookComponents.anon.PickDetailedHTMLPropsHTML
import typings.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docsPageMod {
  
  @JSImport("@storybook/components/dist/blocks/DocsPage", "DocsContent")
  @js.native
  val DocsContent: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/components/dist/blocks/DocsPage", "DocsPageWrapper")
  @js.native
  val DocsPageWrapper: FC[js.Object] = js.native
  
  @JSImport("@storybook/components/dist/blocks/DocsPage", "DocsWrapper")
  @js.native
  val DocsWrapper: StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], js.Object, Theme] = js.native
  
  @JSImport("@storybook/components/dist/blocks/DocsPage", "Subtitle")
  @js.native
  val Subtitle: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    js.Object, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/components/dist/blocks/DocsPage", "Title")
  @js.native
  val Title: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    js.Object, 
    Theme
  ] = js.native
  
  trait DocsPageProps extends StObject {
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var title: String
  }
  object DocsPageProps {
    
    @scala.inline
    def apply(title: String): DocsPageProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocsPageProps]
    }
    
    @scala.inline
    implicit class DocsPagePropsMutableBuilder[Self <: DocsPageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
