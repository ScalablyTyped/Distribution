package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssModule extends js.Object {
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var direction: reactstrapLib.reactstrapLibStrings.prev | reactstrapLib.reactstrapLibStrings.next
  var directionText: java.lang.String
  def onClickHandler(): scala.Unit
}

object Anon_CssModule {
  @scala.inline
  def apply(
    direction: reactstrapLib.reactstrapLibStrings.prev | reactstrapLib.reactstrapLibStrings.next,
    directionText: java.lang.String,
    onClickHandler: js.Function0[scala.Unit],
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null
  ): Anon_CssModule = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], directionText = directionText, onClickHandler = onClickHandler)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    __obj.asInstanceOf[Anon_CssModule]
  }
}

