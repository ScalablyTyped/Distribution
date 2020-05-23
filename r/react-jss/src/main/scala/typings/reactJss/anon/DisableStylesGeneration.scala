package typings.reactJss.anon

import typings.jss.mod.Jss
import typings.jss.mod.SheetsRegistry
import typings.jss.mod.StyleSheetFactoryOptions
import typings.reactJss.mod.Managers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableStylesGeneration extends js.Object {
  var disableStylesGeneration: Boolean
  var jss: js.UndefOr[Jss] = js.undefined
  var managers: js.UndefOr[Managers] = js.undefined
  var registry: js.UndefOr[SheetsRegistry] = js.undefined
  var sheetOptions: StyleSheetFactoryOptions
}

object DisableStylesGeneration {
  @scala.inline
  def apply(
    disableStylesGeneration: Boolean,
    sheetOptions: StyleSheetFactoryOptions,
    jss: Jss = null,
    managers: Managers = null,
    registry: SheetsRegistry = null
  ): DisableStylesGeneration = {
    val __obj = js.Dynamic.literal(disableStylesGeneration = disableStylesGeneration.asInstanceOf[js.Any], sheetOptions = sheetOptions.asInstanceOf[js.Any])
    if (jss != null) __obj.updateDynamic("jss")(jss.asInstanceOf[js.Any])
    if (managers != null) __obj.updateDynamic("managers")(managers.asInstanceOf[js.Any])
    if (registry != null) __obj.updateDynamic("registry")(registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableStylesGeneration]
  }
}

