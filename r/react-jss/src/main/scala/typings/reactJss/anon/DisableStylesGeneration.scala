package typings.reactJss.anon

import typings.jss.mod.Jss
import typings.jss.mod.SheetsRegistry
import typings.jss.mod.StyleSheetFactoryOptions
import typings.reactJss.mod.Managers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableStylesGeneration extends js.Object {
  var disableStylesGeneration: Boolean = js.native
  var jss: js.UndefOr[Jss] = js.native
  var managers: js.UndefOr[Managers] = js.native
  var registry: js.UndefOr[SheetsRegistry] = js.native
  var sheetOptions: StyleSheetFactoryOptions = js.native
}

object DisableStylesGeneration {
  @scala.inline
  def apply(disableStylesGeneration: Boolean, sheetOptions: StyleSheetFactoryOptions): DisableStylesGeneration = {
    val __obj = js.Dynamic.literal(disableStylesGeneration = disableStylesGeneration.asInstanceOf[js.Any], sheetOptions = sheetOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableStylesGeneration]
  }
  @scala.inline
  implicit class DisableStylesGenerationOps[Self <: DisableStylesGeneration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisableStylesGeneration(value: Boolean): Self = this.set("disableStylesGeneration", value.asInstanceOf[js.Any])
    @scala.inline
    def setSheetOptions(value: StyleSheetFactoryOptions): Self = this.set("sheetOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setJss(value: Jss): Self = this.set("jss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJss: Self = this.set("jss", js.undefined)
    @scala.inline
    def setManagers(value: Managers): Self = this.set("managers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagers: Self = this.set("managers", js.undefined)
    @scala.inline
    def setRegistry(value: SheetsRegistry): Self = this.set("registry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistry: Self = this.set("registry", js.undefined)
  }
  
}

