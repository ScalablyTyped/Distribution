package typings.reactDashJss

import typings.jss.jssMod.Jss
import typings.jss.jssMod.SheetsRegistry
import typings.jss.jssMod.StyleSheetFactoryOptions
import typings.reactDashJss.reactDashJssMod.Managers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisableStylesGeneration extends js.Object {
  var disableStylesGeneration: Boolean
  var jss: js.UndefOr[Jss] = js.undefined
  var managers: js.UndefOr[Managers] = js.undefined
  var registry: js.UndefOr[SheetsRegistry] = js.undefined
  var sheetOptions: StyleSheetFactoryOptions
}

object Anon_DisableStylesGeneration {
  @scala.inline
  def apply(
    disableStylesGeneration: Boolean,
    sheetOptions: StyleSheetFactoryOptions,
    jss: Jss = null,
    managers: Managers = null,
    registry: SheetsRegistry = null
  ): Anon_DisableStylesGeneration = {
    val __obj = js.Dynamic.literal(disableStylesGeneration = disableStylesGeneration, sheetOptions = sheetOptions)
    if (jss != null) __obj.updateDynamic("jss")(jss)
    if (managers != null) __obj.updateDynamic("managers")(managers)
    if (registry != null) __obj.updateDynamic("registry")(registry)
    __obj.asInstanceOf[Anon_DisableStylesGeneration]
  }
}

