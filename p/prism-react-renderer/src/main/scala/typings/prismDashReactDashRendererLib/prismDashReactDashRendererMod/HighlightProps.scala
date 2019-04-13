package typings
package prismDashReactDashRendererLib.prismDashReactDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightProps extends js.Object {
  var Prism: PrismLib
  var code: java.lang.String
  var language: Language
  var theme: js.UndefOr[PrismTheme] = js.undefined
  def children(props: RenderProps): reactLib.reactMod.ReactNode
}

object HighlightProps {
  @scala.inline
  def apply(
    Prism: PrismLib,
    children: RenderProps => reactLib.reactMod.ReactNode,
    code: java.lang.String,
    language: Language,
    theme: PrismTheme = null
  ): HighlightProps = {
    val __obj = js.Dynamic.literal(Prism = Prism, children = js.Any.fromFunction1(children), code = code, language = language)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[HighlightProps]
  }
}

