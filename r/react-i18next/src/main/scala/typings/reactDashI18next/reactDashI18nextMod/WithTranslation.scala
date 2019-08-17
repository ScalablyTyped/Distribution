package typings.reactDashI18next.reactDashI18nextMod

import typings.i18next.i18nextMod.i18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify i18next.WithT * / any */ trait WithTranslation extends js.Object {
  var i18n: typings.i18next.i18nextMod.i18n
  var tReady: Boolean
}

object WithTranslation {
  @scala.inline
  def apply(i18n: i18n, tReady: Boolean): WithTranslation = {
    val __obj = js.Dynamic.literal(i18n = i18n, tReady = tReady)
  
    __obj.asInstanceOf[WithTranslation]
  }
}

