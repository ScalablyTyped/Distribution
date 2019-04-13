package typings
package sjclLib.sjclMod

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
    generateKeys: java.lang.String => SjclKeysGenerator[SjclECCPublicKey, SjclECCSecretKey],
    publicKey: SjclECCPublicKeyFactory[SjclECCPublicKey],
    secretKey: SjclECCSecretKeyFactory[SjclECCSecretKey]
  ): SjclECCBasic = {
    val __obj = js.Dynamic.literal(generateKeys = js.Any.fromFunction1(generateKeys), publicKey = publicKey, secretKey = secretKey)
  
    __obj.asInstanceOf[SjclECCBasic]
  }
}

