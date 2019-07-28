package typings.prismDashReactDashRenderer.prismDashReactDashRendererMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightProps extends js.Object {
  var Prism: PrismLib
  var code: String
  var language: Language
  var theme: js.UndefOr[PrismTheme] = js.undefined
  def children(props: RenderProps): ReactNode
}

object HighlightProps {
  @scala.inline
  def apply(
    Prism: PrismLib,
    children: RenderProps => ReactNode,
    code: String,
    language: Language,
    theme: PrismTheme = null
  ): HighlightProps = {
    val __obj = js.Dynamic.literal(Prism = Prism, children = js.Any.fromFunction1(children), code = code, language = language)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[HighlightProps]
  }
}

