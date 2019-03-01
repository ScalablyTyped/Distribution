package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclECCBasic extends js.Object {
  var publicKey: SjclECCPublicKeyFactory[SjclECCPublicKey]
  var secretKey: SjclECCSecretKeyFactory[SjclECCSecretKey]
  def generateKeys(cn: java.lang.String): SjclKeysGenerator[SjclECCPublicKey, SjclECCSecretKey]
}

object SjclECCBasic {
  @scala.inline
  def apply(
    generateKeys: js.Function1[java.lang.String, SjclKeysGenerator[SjclECCPublicKey, SjclECCSecretKey]],
    publicKey: SjclECCPublicKeyFactory[SjclECCPublicKey],
    secretKey: SjclECCSecretKeyFactory[SjclECCSecretKey]
  ): SjclECCBasic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generateKeys")(generateKeys)
    __obj.updateDynamic("publicKey")(publicKey)
    __obj.updateDynamic("secretKey")(secretKey)
    __obj.asInstanceOf[SjclECCBasic]
  }
}

