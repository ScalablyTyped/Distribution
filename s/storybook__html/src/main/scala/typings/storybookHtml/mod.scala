package typings.storybookHtml

import typings.node.NodeModule
import typings.storybookAddons.distTs3Dot9TypesMod.DecoratorFunction
import typings.storybookAddons.distTs3Dot9TypesMod.Loadable
import typings.storybookAddons.distTs3Dot9TypesMod.Parameters
import typings.storybookAddons.distTs3Dot9TypesMod.StoryApi
import typings.storybookHtml.distTs3Dot9ClientPreviewTypesMod.IStorybookSection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/html", "addDecorator")
  @js.native
  val addDecorator: js.Function1[
    /* decorator */ DecoratorFunction[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/html.@storybook/html/dist/ts3.9/client/preview/types-6-0.HtmlFramework['storyResult'] */ js.Any
    ], 
    StoryApi[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/html.@storybook/html/dist/ts3.9/client/preview/types-6-0.HtmlFramework['storyResult'] */ js.Any
    ]
  ] = js.native
  
  @JSImport("@storybook/html", "addParameters")
  @js.native
  val addParameters: js.Function1[
    /* parameter */ Parameters, 
    StoryApi[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/html.@storybook/html/dist/ts3.9/client/preview/types-6-0.HtmlFramework['storyResult'] */ js.Any
    ]
  ] = js.native
  
  @JSImport("@storybook/html", "configure")
  @js.native
  val configure: js.Function2[/* loader */ Loadable, /* module */ NodeModule, Unit] = js.native
  
  @JSImport("@storybook/html", "forceReRender")
  @js.native
  val forceReRender: js.Function0[Unit] = js.native
  
  @JSImport("@storybook/html", "getStorybook")
  @js.native
  val getStorybook: js.Function0[js.Array[IStorybookSection]] = js.native
  
  @JSImport("@storybook/html", "raw")
  @js.native
  val raw: js.Function0[Any] = js.native
  
  @JSImport("@storybook/html", "setAddon")
  @js.native
  val setAddon: js.Function1[/* addon */ Any, Unit] = js.native
  
  @JSImport("@storybook/html", "storiesOf")
  @js.native
  val storiesOf: js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ /* kind */ Any, 
    /* module */ NodeModule, 
    StoryApi[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/html.@storybook/html/dist/ts3.9/client/preview/types-6-0.HtmlFramework['storyResult'] */ js.Any
    ]
  ] = js.native
}
