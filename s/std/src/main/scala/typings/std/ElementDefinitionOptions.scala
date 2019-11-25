package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementDefinitionOptions extends js.Object {
  var `extends`: js.UndefOr[java.lang.String] = js.undefined
}

object ElementDefinitionOptions {
  @scala.inline
  def apply(`extends`: java.lang.String = null): ElementDefinitionOptions = {
    val __obj = js.Dynamic.literal()
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionOptions]
  }
}

