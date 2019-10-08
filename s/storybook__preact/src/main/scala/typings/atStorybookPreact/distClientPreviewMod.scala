package typings.atStorybookPreact

import typings.atStorybookPreact.distClientPreviewTypesMod.IStorybookSection
import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/preact/dist/client/preview", JSImport.Namespace)
@js.native
object distClientPreviewMod extends js.Object {
  val addDecorator: /* import warning: ImportType.apply Failed type conversion: @storybook/preact.@storybook/preact/dist/client/preview/types.ClientApi['addDecorator'] */ js.Any = js.native
  val addParameters: /* import warning: ImportType.apply Failed type conversion: @storybook/preact.@storybook/preact/dist/client/preview/types.ClientApi['addParameters'] */ js.Any = js.native
  val clearDecorators: js.Function0[Unit] = js.native
  val configure: js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Loadable */ /* loader */ js.Any, 
    /* module */ NodeModule, 
    Unit
  ] = js.native
  val forceReRender: js.Function0[Unit] = js.native
  val getStorybook: js.Function0[js.Array[IStorybookSection]] = js.native
  val raw: js.Function0[js.Any] = js.native
  val setAddon: js.Function1[/* addon */ js.Any, Unit] = js.native
  val storiesOf: /* import warning: ImportType.apply Failed type conversion: @storybook/preact.@storybook/preact/dist/client/preview/types.ClientApi['storiesOf'] */ js.Any = js.native
}

