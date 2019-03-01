package typings
package stellarDashBaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PublicKeyType extends js.Object {
  var publicKey: java.lang.String
  var `type`: stellarDashBaseLib.stellarDashBaseMod.KeypairType
}

object Anon_PublicKeyType {
  @scala.inline
  def apply(publicKey: java.lang.String, `type`: stellarDashBaseLib.stellarDashBaseMod.KeypairType): Anon_PublicKeyType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("publicKey")(publicKey)
    __obj.asInstanceOf[Anon_PublicKeyType]
  }
}

