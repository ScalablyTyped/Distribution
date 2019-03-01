package typings
package stellarDashBaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PublicKey extends js.Object {
  var publicKey: js.UndefOr[java.lang.String] = js.undefined
  var secretKey: java.lang.String
  var `type`: stellarDashBaseLib.stellarDashBaseMod.KeypairType
}

object Anon_PublicKey {
  @scala.inline
  def apply(
    secretKey: java.lang.String,
    `type`: stellarDashBaseLib.stellarDashBaseMod.KeypairType,
    publicKey: java.lang.String = null
  ): Anon_PublicKey = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("secretKey")(secretKey)
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey)
    __obj.asInstanceOf[Anon_PublicKey]
  }
}

