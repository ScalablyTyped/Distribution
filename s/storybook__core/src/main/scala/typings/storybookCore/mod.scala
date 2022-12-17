package typings.storybookCore

import typings.std.Element
import typings.storybookCoreClient.anon.Configure
import typings.storybookCoreClient.anon.DecorateStory
import typings.storybookStore.distTs3Dot9TypesMod.RenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/core", "ClientApi")
  @js.native
  open class ClientApi[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] ()
    extends typings.storybookCoreClient.mod.ClientApi[TFramework] {
    def this(param0: typings.storybookClientApi.anon.StoryStore[TFramework]) = this()
  }
  
  @JSImport("@storybook/core", "StoryStore")
  @js.native
  open class StoryStore[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] ()
    extends typings.storybookCoreClient.mod.StoryStore[TFramework]
  
  inline def start[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](): typings.storybookCoreClient.anon.ClientApi | Configure[TFramework] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[typings.storybookCoreClient.anon.ClientApi | Configure[TFramework]]
  inline def start[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    renderToDOM: js.Function2[
      /* context */ RenderContext[TFramework], 
      /* element */ Element, 
      js.Promise[Unit] | Unit
    ]
  ): typings.storybookCoreClient.anon.ClientApi | Configure[TFramework] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(renderToDOM.asInstanceOf[js.Any]).asInstanceOf[typings.storybookCoreClient.anon.ClientApi | Configure[TFramework]]
  inline def start[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    renderToDOM: js.Function2[
      /* context */ RenderContext[TFramework], 
      /* element */ Element, 
      js.Promise[Unit] | Unit
    ],
    param1: DecorateStory[TFramework]
  ): typings.storybookCoreClient.anon.ClientApi | Configure[TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(renderToDOM.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[typings.storybookCoreClient.anon.ClientApi | Configure[TFramework]]
  inline def start[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](renderToDOM: Unit, param1: DecorateStory[TFramework]): typings.storybookCoreClient.anon.ClientApi | Configure[TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(renderToDOM.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[typings.storybookCoreClient.anon.ClientApi | Configure[TFramework]]
  
  inline def toId(kind: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toId")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
}
