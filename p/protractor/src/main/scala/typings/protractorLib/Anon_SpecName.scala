package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SpecName extends js.Object {
  var specName: js.UndefOr[java.lang.String] = js.undefined
  var stackTrace: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_SpecName {
  @scala.inline
  def apply(specName: java.lang.String = null, stackTrace: java.lang.String = null): Anon_SpecName = {
    val __obj = js.Dynamic.literal()
    if (specName != null) __obj.updateDynamic("specName")(specName)
    if (stackTrace != null) __obj.updateDynamic("stackTrace")(stackTrace)
    __obj.asInstanceOf[Anon_SpecName]
  }
}

