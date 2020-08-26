package typings.riot.mod

import typings.riotjsDomBindings.mod.BindingType
import typings.riotjsDomBindings.mod.ExpressionType
import typings.riotjsDomBindings.mod.TemplateChunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RiotComponentShell[Props, State] extends js.Object {
  val css: js.UndefOr[String] = js.native
  val exports: js.UndefOr[js.Function0[(RiotComponentExport[Props, State]) | js.Object]] = js.native
  val name: js.UndefOr[String] = js.native
  def template(
    template: js.Function,
    expressionTypes: ExpressionType,
    bindingTypes: BindingType,
    getComponent: js.Function1[/* componentName */ String, _]
  ): TemplateChunk[_, _] = js.native
}

object RiotComponentShell {
  @scala.inline
  def apply[Props, State](
    template: (js.Function, ExpressionType, BindingType, js.Function1[/* componentName */ String, _]) => TemplateChunk[_, _]
  ): RiotComponentShell[Props, State] = {
    val __obj = js.Dynamic.literal(template = js.Any.fromFunction4(template))
    __obj.asInstanceOf[RiotComponentShell[Props, State]]
  }
  @scala.inline
  implicit class RiotComponentShellOps[Self <: RiotComponentShell[_, _], Props, State] (val x: Self with (RiotComponentShell[Props, State])) extends AnyVal {
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
    def setTemplate(
      value: (js.Function, ExpressionType, BindingType, js.Function1[/* componentName */ String, _]) => TemplateChunk[_, _]
    ): Self = this.set("template", js.Any.fromFunction4(value))
    @scala.inline
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setExports(value: () => (RiotComponentExport[Props, State]) | js.Object): Self = this.set("exports", js.Any.fromFunction0(value))
    @scala.inline
    def deleteExports: Self = this.set("exports", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

