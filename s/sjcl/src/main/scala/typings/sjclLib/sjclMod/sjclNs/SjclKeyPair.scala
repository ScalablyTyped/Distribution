package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclKeyPair[P /* <: SjclECCPublicKey */, S /* <: SjclECCSecretKey */] extends js.Object {
  var pub: P
  var sec: S
}

object SjclKeyPair {
  @scala.inline
  def apply[P /* <: SjclECCPublicKey */, S /* <: SjclECCSecretKey */](pub: P, sec: S): SjclKeyPair[P, S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pub")(pub.asInstanceOf[js.Any])
    __obj.updateDynamic("sec")(sec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclKeyPair[P, S]]
  }
}

