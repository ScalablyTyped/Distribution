package typings.atStorybookHtml.distClientPreviewMod

import typings.atStorybookHtml.distClientPreviewTypesMod.IStorybookSection
import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ClientStoryApi<StoryFnHtmlReturnType> * / any */ trait ClientApi extends js.Object {
  def clearDecorators(): Unit
  def configure(
    loader: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Loadable */ js.Any,
    module: NodeModule
  ): Unit
  def forceReRender(): Unit
  def getStorybook(): js.Array[IStorybookSection]
  def raw(): js.Any
  def setAddon(addon: js.Any): Unit
}

object ClientApi {
  @scala.inline
  def apply(
    clearDecorators: () => Unit,
    configure: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Loadable */ js.Any, NodeModule) => Unit,
    forceReRender: () => Unit,
    getStorybook: () => js.Array[IStorybookSection],
    raw: () => js.Any,
    setAddon: js.Any => Unit
  ): ClientApi = {
    val __obj = js.Dynamic.literal(clearDecorators = js.Any.fromFunction0(clearDecorators), configure = js.Any.fromFunction2(configure), forceReRender = js.Any.fromFunction0(forceReRender), getStorybook = js.Any.fromFunction0(getStorybook), raw = js.Any.fromFunction0(raw), setAddon = js.Any.fromFunction1(setAddon))
  
    __obj.asInstanceOf[ClientApi]
  }
}

