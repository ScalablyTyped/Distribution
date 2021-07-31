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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("storybook-readme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addFooter(md: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFooter")(md.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def addHeader(md: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addHeader")(md.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("storybook-readme", "addReadme")
  @js.native
  val addReadme: MakeDecoratorResult = js.native
  
  @scala.inline
  def configureReadme(config: ConfigureReadmeConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureReadme")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def doc(readme: String): RenderFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("doc")(readme.asInstanceOf[js.Any]).asInstanceOf[RenderFunction]
  
  object withDocs {
    
    @scala.inline
    def apply(custom: CustomComponents): js.Function1[/* readme */ Readme, HOCPattern] = ^.asInstanceOf[js.Dynamic].apply(custom.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* readme */ Readme, HOCPattern]]
    @scala.inline
    def apply(readme: Readme): DecoratorPattern = ^.asInstanceOf[js.Dynamic].apply(readme.asInstanceOf[js.Any]).asInstanceOf[DecoratorPattern]
    @scala.inline
    def apply(readme: Readme, story: RenderFunction): RenderFunction = (^.asInstanceOf[js.Dynamic].apply(readme.asInstanceOf[js.Any], story.asInstanceOf[js.Any])).asInstanceOf[RenderFunction]
    
    @JSImport("storybook-readme", "withDocs")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def addFooterDocs(footerDoc: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFooterDocs")(footerDoc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @scala.inline
  def withReadme(readme: Readme): DecoratorPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("withReadme")(readme.asInstanceOf[js.Any]).asInstanceOf[DecoratorPattern]
  @scala.inline
  def withReadme(readme: Readme, story: RenderFunction): RenderFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("withReadme")(readme.asInstanceOf[js.Any], story.asInstanceOf[js.Any])).asInstanceOf[RenderFunction]
  
  trait ConfigureReadmeConfig extends StObject {
    
    var DocPreview: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.undefined
    
    var FooterPreview: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.undefined
    
    var HeaderPreview: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.undefined
    
    var StoryPreview: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.undefined
    
    var footer: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
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
  
  trait CustomComponents extends StObject {
    
    var FooterComponent: js.UndefOr[js.Function1[/* props */ ChildrenElement, Element]] = js.undefined
    
    var PreviewComponent: js.UndefOr[js.Function1[/* props */ ChildrenElement, Element]] = js.undefined
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
  
  @js.native
  trait MakeDecoratorResult extends StObject {
    
    def apply(args: js.Any*): js.Any = js.native
  }
  
  type Readme = String | js.Array[String]
  
  type RenderFunction = StoryFn[StoryFnReactReturnType]
}
