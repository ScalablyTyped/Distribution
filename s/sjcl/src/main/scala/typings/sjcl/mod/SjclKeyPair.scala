package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclKeyPair[P /* <: SjclECCPublicKey */, S /* <: SjclECCSecretKey */] extends js.Object {
  var pub: P = js.native
  var sec: S = js.native
}

object SjclKeyPair {
  @scala.inline
  def apply[/* <: typings.sjcl.mod.SjclECCPublicKey */ P, /* <: typings.sjcl.mod.SjclECCSecretKey */ S](pub: P, sec: S): SjclKeyPair[P, S] = {
    val __obj = js.Dynamic.literal(pub = pub.asInstanceOf[js.Any], sec = sec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclKeyPair[P, S]]
  }
  @scala.inline
  implicit class SjclKeyPairOps[Self <: SjclKeyPair[_, _], /* <: typings.sjcl.mod.SjclECCPublicKey */ P, /* <: typings.sjcl.mod.SjclECCSecretKey */ S] (val x: Self with (SjclKeyPair[P, S])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPub(value: P): Self = this.set("pub", value.asInstanceOf[js.Any])
    @scala.inline
    def setSec(value: S): Self = this.set("sec", value.asInstanceOf[js.Any])
  }
  
}

