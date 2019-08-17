package typings.reactDashI18next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashI18nextMod {
  import typings.i18next.i18nextMod.i18n
  import typings.reactDashI18next.Anon_I18n

  type Namespace = String | js.Array[String]
  type UseTranslationResponse = (js.Tuple3[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify i18next.TFunction */ _, 
    i18n, 
    Boolean
  ]) with Anon_I18n
}
