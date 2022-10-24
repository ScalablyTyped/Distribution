package typings.storybookCoreClient

import typings.std.Element
import typings.storybookCoreClient.anon.ClientApi
import typings.storybookCoreClient.anon.Configure
import typings.storybookCoreClient.anon.DecorateStory
import typings.storybookStore.distTs3Dot9TypesMod.RenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9PreviewStartMod {
  
  @JSImport("@storybook/core-client/dist/ts3.9/preview/start", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def start[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](): ClientApi | Configure[TFramework] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[ClientApi | Configure[TFramework]]
  inline def start[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    renderToDOM: js.Function2[
      /* context */ RenderContext[TFramework], 
      /* element */ Element, 
      js.Promise[Unit] | Unit
    ]
  ): ClientApi | Configure[TFramework] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(renderToDOM.asInstanceOf[js.Any]).asInstanceOf[ClientApi | Configure[TFramework]]
  inline def start[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    renderToDOM: js.Function2[
      /* context */ RenderContext[TFramework], 
      /* element */ Element, 
      js.Promise[Unit] | Unit
    ],
    param1: DecorateStory[TFramework]
  ): ClientApi | Configure[TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(renderToDOM.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[ClientApi | Configure[TFramework]]
  inline def start[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](renderToDOM: Unit, param1: DecorateStory[TFramework]): ClientApi | Configure[TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(renderToDOM.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[ClientApi | Configure[TFramework]]
}
