package typings
package reactDashI18nextLib.reactDashI18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait WithTranslation extends js.Object {
  var i18n: i18nextLib.i18nextMod.i18n
  var tReady: scala.Boolean
}

object WithTranslation {
  @scala.inline
  def apply(i18n: i18nextLib.i18nextMod.i18n, tReady: scala.Boolean): WithTranslation = {
    val __obj = js.Dynamic.literal(i18n = i18n, tReady = tReady)
  
    __obj.asInstanceOf[WithTranslation]
  }
}

