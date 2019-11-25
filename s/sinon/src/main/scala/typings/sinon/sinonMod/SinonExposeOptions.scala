package typings.sinon.sinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonExposeOptions extends js.Object {
  var includeFail: Boolean
  var prefix: String
}

object SinonExposeOptions {
  @scala.inline
  def apply(includeFail: Boolean, prefix: String): SinonExposeOptions = {
    val __obj = js.Dynamic.literal(includeFail = includeFail.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SinonExposeOptions]
  }
}

