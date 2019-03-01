package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DhKeyDeriveParams extends Algorithm {
  var public: CryptoKey
}

object DhKeyDeriveParams {
  @scala.inline
  def apply(name: java.lang.String, public: CryptoKey): DhKeyDeriveParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("public")(public)
    __obj.asInstanceOf[DhKeyDeriveParams]
  }
}

