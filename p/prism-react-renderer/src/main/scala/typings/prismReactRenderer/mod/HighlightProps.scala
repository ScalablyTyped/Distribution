package typings.prismReactRenderer.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightProps extends js.Object {
  var Prism: PrismLib = js.native
  var code: String = js.native
  var language: Language = js.native
  var theme: js.UndefOr[PrismTheme] = js.native
  def children(props: RenderProps): ReactNode = js.native
}

object HighlightProps {
  @scala.inline
  def apply(Prism: PrismLib, children: RenderProps => ReactNode, code: String, language: Language): HighlightProps = {
    val __obj = js.Dynamic.literal(Prism = Prism.asInstanceOf[js.Any], children = js.Any.fromFunction1(children), code = code.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightProps]
  }
  @scala.inline
  implicit class HighlightPropsOps[Self <: HighlightProps] (val x: Self) extends AnyVal {
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
    def setPrism(value: PrismLib): Self = this.set("Prism", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: RenderProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: Language): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: PrismTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

