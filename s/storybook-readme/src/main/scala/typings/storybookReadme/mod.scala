package typings.storybookReadme

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.storybookAddons.distTs3Dot9TypesMod.DecoratorFunction
import typings.storybookAddons.distTs3Dot9TypesMod.StoryFn
import typings.storybookReact.distTs3Dot9ClientPreviewTypesMod.StoryFnReactReturnType
import typings.storybookReadme.anon.Children
import typings.storybookReadme.anon.ChildrenElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("storybook-readme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addFooter(md: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFooter")(md.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addHeader(md: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addHeader")(md.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("storybook-readme", "addReadme")
  @js.native
  val addReadme: MakeDecoratorResult = js.native
  
  inline def configureReadme(config: ConfigureReadmeConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureReadme")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def doc(readme: String): RenderFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("doc")(readme.asInstanceOf[js.Any]).asInstanceOf[RenderFunction]
  
  object withDocs {
    
    inline def apply(custom: CustomComponents): js.Function1[/* readme */ Readme, HOCPattern] = ^.asInstanceOf[js.Dynamic].apply(custom.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* readme */ Readme, HOCPattern]]
    inline def apply(readme: Readme): DecoratorPattern = ^.asInstanceOf[js.Dynamic].apply(readme.asInstanceOf[js.Any]).asInstanceOf[DecoratorPattern]
    inline def apply(readme: Readme, story: RenderFunction): RenderFunction = (^.asInstanceOf[js.Dynamic].apply(readme.asInstanceOf[js.Any], story.asInstanceOf[js.Any])).asInstanceOf[RenderFunction]
    
    @JSImport("storybook-readme", "withDocs")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addFooterDocs(footerDoc: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFooterDocs")(footerDoc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def withReadme(readme: Readme): DecoratorPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("withReadme")(readme.asInstanceOf[js.Any]).asInstanceOf[DecoratorPattern]
  inline def withReadme(readme: Readme, story: RenderFunction): RenderFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("withReadme")(readme.asInstanceOf[js.Any], story.asInstanceOf[js.Any])).asInstanceOf[RenderFunction]
  
  trait ConfigureReadmeConfig extends StObject {
    
    var DocPreview: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.undefined
    
    var FooterPreview: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.undefined
    
    var HeaderPreview: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.undefined
    
    var StoryPreview: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.undefined
    
    var footer: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
  }
  object ConfigureReadmeConfig {
    
    inline def apply(): ConfigureReadmeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigureReadmeConfig]
    }
    
    extension [Self <: ConfigureReadmeConfig](x: Self) {
      
      inline def setDocPreview(value: /* props */ Children => ReactNode): Self = StObject.set(x, "DocPreview", js.Any.fromFunction1(value))
      
      inline def setDocPreviewUndefined: Self = StObject.set(x, "DocPreview", js.undefined)
      
      inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterPreview(value: /* props */ Children => ReactNode): Self = StObject.set(x, "FooterPreview", js.Any.fromFunction1(value))
      
      inline def setFooterPreviewUndefined: Self = StObject.set(x, "FooterPreview", js.undefined)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderPreview(value: /* props */ Children => ReactNode): Self = StObject.set(x, "HeaderPreview", js.Any.fromFunction1(value))
      
      inline def setHeaderPreviewUndefined: Self = StObject.set(x, "HeaderPreview", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setStoryPreview(value: /* props */ Children => ReactNode): Self = StObject.set(x, "StoryPreview", js.Any.fromFunction1(value))
      
      inline def setStoryPreviewUndefined: Self = StObject.set(x, "StoryPreview", js.undefined)
    }
  }
  
  trait CustomComponents extends StObject {
    
    var FooterComponent: js.UndefOr[js.Function1[/* props */ ChildrenElement, Element]] = js.undefined
    
    var PreviewComponent: js.UndefOr[js.Function1[/* props */ ChildrenElement, Element]] = js.undefined
  }
  object CustomComponents {
    
    inline def apply(): CustomComponents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomComponents]
    }
    
    extension [Self <: CustomComponents](x: Self) {
      
      inline def setFooterComponent(value: /* props */ ChildrenElement => Element): Self = StObject.set(x, "FooterComponent", js.Any.fromFunction1(value))
      
      inline def setFooterComponentUndefined: Self = StObject.set(x, "FooterComponent", js.undefined)
      
      inline def setPreviewComponent(value: /* props */ ChildrenElement => Element): Self = StObject.set(x, "PreviewComponent", js.Any.fromFunction1(value))
      
      inline def setPreviewComponentUndefined: Self = StObject.set(x, "PreviewComponent", js.undefined)
    }
  }
  
  type DecoratorPattern = DecoratorFunction[StoryFnReactReturnType]
  
  type HOCPattern = DecoratorFunction[StoryFnReactReturnType]
  
  @js.native
  trait MakeDecoratorResult extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  type Readme = String | js.Array[String]
  
  type RenderFunction = StoryFn[StoryFnReactReturnType]
}
