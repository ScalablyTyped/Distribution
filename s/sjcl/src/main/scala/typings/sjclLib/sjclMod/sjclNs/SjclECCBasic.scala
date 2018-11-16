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

