package typings.psi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name I18N is established convention
trait I18N extends js.Object {
  var rendererFormattedStrings: RendererFormattedStrings
}

object I18N {
  @scala.inline
  def apply(rendererFormattedStrings: RendererFormattedStrings): I18N = {
    val __obj = js.Dynamic.literal(rendererFormattedStrings = rendererFormattedStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18N]
  }
}

