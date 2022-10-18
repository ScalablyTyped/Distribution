package typings.storybookHtml

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ClientDocsSourceDecoratorMod {
  
  @JSImport("@storybook/html/dist/ts3.9/client/docs/sourceDecorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sourceDecorator(
    storyFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<HtmlFramework> */ Any,
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<HtmlFramework> */ Any
  ): String | Node = (^.asInstanceOf[js.Dynamic].applyDynamic("sourceDecorator")(storyFn.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String | Node]
}
