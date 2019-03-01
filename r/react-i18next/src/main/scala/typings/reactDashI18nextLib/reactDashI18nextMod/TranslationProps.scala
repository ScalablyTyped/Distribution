package typings
package reactDashI18nextLib.reactDashI18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslationProps extends js.Object {
  var i18n: js.UndefOr[i18nextLib.i18nextMod.i18nextNs.i18n] = js.undefined
  var ns: js.UndefOr[Namespace] = js.undefined
  def children(
    t: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify i18next.TFunction */ js.Any,
    options: reactDashI18nextLib.Anon_I18nLng
  ): reactLib.reactMod.ReactNs.ReactNode
}

object TranslationProps {
  @scala.inline
  def apply(
    children: js.Function2[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify i18next.TFunction */ js.Any, 
      reactDashI18nextLib.Anon_I18nLng, 
      reactLib.reactMod.ReactNs.ReactNode
    ],
    i18n: i18nextLib.i18nextMod.i18nextNs.i18n = null,
    ns: Namespace = null
  ): TranslationProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationProps]
  }
}

