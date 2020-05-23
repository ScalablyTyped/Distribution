package typings.snykSnykCocoapodsPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SingleSubprojectInspectOptions * / any */ trait CocoaPodsInspectOptions extends js.Object {
  var strictOutOfSync: js.UndefOr[Boolean] = js.undefined
}

object CocoaPodsInspectOptions {
  @scala.inline
  def apply(strictOutOfSync: js.UndefOr[Boolean] = js.undefined): CocoaPodsInspectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strictOutOfSync)) __obj.updateDynamic("strictOutOfSync")(strictOutOfSync.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CocoaPodsInspectOptions]
  }
}

