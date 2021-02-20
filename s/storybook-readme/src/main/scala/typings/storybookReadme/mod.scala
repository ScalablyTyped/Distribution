package typings.storybookReadme

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.StoryFn
import typings.storybookReact.typesMod.StoryFnReactReturnType
import typings.storybookReadme.anon.Children
import typings.storybookReadme.anon.ChildrenElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("storybook-readme", "addFooter")
  @js.native
  def addFooter(md: String): Unit = js.native
  
  @JSImport("storybook-readme", "addHeader")
  @js.native
  def addHeader(md: String): Unit = js.native
  
  @JSImport("storybook-readme", "addReadme")
  @js.native
  val addReadme: MakeDecoratorResult = js.native
  
  @JSImport("storybook-readme", "configureReadme")
  @js.native
  def configureReadme(config: ConfigureReadmeConfig): Unit = js.native
  
  @JSImport("storybook-readme", "doc")
  @js.native
  def doc(readme: String): RenderFunction = js.native
  
  object withDocs {
    
    @JSImport("storybook-readme", "withDocs")
    @js.native
    def apply(custom: CustomComponents): js.Function1[/* readme */ Readme, HOCPattern] = js.native
    @JSImport("storybook-readme", "withDocs")
    @js.native
    def apply(readme: Readme): DecoratorPattern = js.native
    @JSImport("storybook-readme", "withDocs")
    @js.native
    def apply(readme: Readme, story: RenderFunction): RenderFunction = js.native
    
    @JSImport("storybook-readme", "withDocs.addFooterDocs")
    @js.native
    def addFooterDocs(footerDoc: String): Unit = js.native
  }
  
  @JSImport("storybook-readme", "withReadme")
  @js.native
  def withReadme(readme: Readme): DecoratorPattern = js.native
  @JSImport("storybook-readme", "withReadme")
  @js.native
  def withReadme(readme: Readme, story: RenderFunction): RenderFunction = js.native
  
  @js.native
  trait ConfigureReadmeConfig extends StObject {
    
    var DocPreview: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.native
    
    var FooterPreview: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.native
    
    var HeaderPreview: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.native
    
    var StoryPreview: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.native
    
    var footer: js.UndefOr[String] = js.native
    
    var header: js.UndefOr[String] = js.native
  }
  object ConfigureReadmeConfig {
    
    @scala.inline
    def apply(): ConfigureReadmeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigureReadmeConfig]
    }
    
    @scala.inline
    implicit class ConfigureReadmeConfigMutableBuilder[Self <: ConfigureReadmeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocPreview(value: /* props */ Children => ReactNode): Self = StObject.set(x, "DocPreview", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDocPreviewUndefined: Self = StObject.set(x, "DocPreview", js.undefined)
      
      @scala.inline
      def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterPreview(value: /* props */ Children => ReactNode): Self = StObject.set(x, "FooterPreview", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFooterPreviewUndefined: Self = StObject.set(x, "FooterPreview", js.undefined)
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPreview(value: /* props */ Children => ReactNode): Self = StObject.set(x, "HeaderPreview", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderPreviewUndefined: Self = StObject.set(x, "HeaderPreview", js.undefined)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setStoryPreview(value: /* props */ Children => ReactNode): Self = StObject.set(x, "StoryPreview", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStoryPreviewUndefined: Self = StObject.set(x, "StoryPreview", js.undefined)
    }
  }
  
  @js.native
  trait CustomComponents extends StObject {
    
    var FooterComponent: js.UndefOr[js.Function1[/* props */ ChildrenElement, Element]] = js.native
    
    var PreviewComponent: js.UndefOr[js.Function1[/* props */ ChildrenElement, Element]] = js.native
  }
  object CustomComponents {
    
    @scala.inline
    def apply(): CustomComponents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomComponents]
    }
    
    @scala.inline
    implicit class CustomComponentsMutableBuilder[Self <: CustomComponents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFooterComponent(value: /* props */ ChildrenElement => Element): Self = StObject.set(x, "FooterComponent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFooterComponentUndefined: Self = StObject.set(x, "FooterComponent", js.undefined)
      
      @scala.inline
      def setPreviewComponent(value: /* props */ ChildrenElement => Element): Self = StObject.set(x, "PreviewComponent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreviewComponentUndefined: Self = StObject.set(x, "PreviewComponent", js.undefined)
    }
  }
  
  type DecoratorPattern = DecoratorFunction[StoryFnReactReturnType]
  
  type HOCPattern = DecoratorFunction[StoryFnReactReturnType]
  
  type MakeDecoratorResult = js.Function1[/* repeated */ js.Any, js.Any]
  
  type Readme = String | js.Array[String]
  
  type RenderFunction = StoryFn[StoryFnReactReturnType]
}
