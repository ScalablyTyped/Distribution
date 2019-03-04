package typings
package sinonLib.sinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonExposeOptions extends js.Object {
  var includeFail: scala.Boolean
  var prefix: java.lang.String
}

object SinonExposeOptions {
  @scala.inline
  def apply(includeFail: scala.Boolean, prefix: java.lang.String): SinonExposeOptions = {
    val __obj = js.Dynamic.literal(includeFail = includeFail, prefix = prefix)
  
    __obj.asInstanceOf[SinonExposeOptions]
  }
}

