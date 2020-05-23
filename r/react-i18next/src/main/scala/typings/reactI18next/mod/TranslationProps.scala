package typings.reactI18next.mod

import typings.i18next.mod.TFunction
import typings.i18next.mod.i18n
import typings.react.mod.ReactNode
import typings.reactI18next.anon.Lng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslationProps extends js.Object {
  var i18n: js.UndefOr[typings.i18next.mod.i18n] = js.undefined
  var ns: js.UndefOr[Namespace] = js.undefined
  def children(t: TFunction, options: Lng, ready: Boolean): ReactNode
}

object TranslationProps {
  @scala.inline
  def apply(children: (TFunction, Lng, Boolean) => ReactNode, i18n: i18n = null, ns: Namespace = null): TranslationProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children))
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationProps]
  }
}

