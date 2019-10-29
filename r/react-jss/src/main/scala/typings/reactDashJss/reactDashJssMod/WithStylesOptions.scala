package typings.reactDashJss.reactDashJssMod

import typings.theming.themingMod.Theming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StyleSheetFactoryOptions * / any */ trait WithStylesOptions extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var injectTheme: js.UndefOr[Boolean] = js.undefined
  var jss: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Jss */ js.Any
  ] = js.undefined
  var theming: js.UndefOr[Theming[js.Object]] = js.undefined
}

object WithStylesOptions {
  @scala.inline
  def apply(
    index: Int | Double = null,
    injectTheme: js.UndefOr[Boolean] = js.undefined,
    jss: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Jss */ js.Any = null,
    theming: Theming[js.Object] = null
  ): WithStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(injectTheme)) __obj.updateDynamic("injectTheme")(injectTheme)
    if (jss != null) __obj.updateDynamic("jss")(jss)
    if (theming != null) __obj.updateDynamic("theming")(theming)
    __obj.asInstanceOf[WithStylesOptions]
  }
}

