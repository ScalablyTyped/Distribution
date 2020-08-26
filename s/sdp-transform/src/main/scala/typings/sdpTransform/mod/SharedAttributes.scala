package typings.sdpTransform.mod

import typings.sdpTransform.anon.AddressTypes
import typings.sdpTransform.anon.Hash
import typings.sdpTransform.anon.Uri
import typings.sdpTransform.anon.ValueString
import typings.sdpTransform.sdpTransformStrings.inactive
import typings.sdpTransform.sdpTransformStrings.recvonly
import typings.sdpTransform.sdpTransformStrings.sendonly
import typings.sdpTransform.sdpTransformStrings.sendrecv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedAttributes extends js.Object {
  // a=control
  var control: js.UndefOr[String] = js.native
  // a=sendrecv
  // a=recvonly
  // a=sendonly
  // a=inactive
  var direction: js.UndefOr[sendrecv | recvonly | sendonly | inactive] = js.native
  // a=extmap
  var ext: js.UndefOr[js.Array[Uri]] = js.native
  var fingerprint: js.UndefOr[Hash] = js.native
  var icePwd: js.UndefOr[String] = js.native
  var iceUfrag: js.UndefOr[String] = js.native
  var invalid: js.UndefOr[js.Array[ValueString]] = js.native
  // a=setup
  var setup: js.UndefOr[String] = js.native
  // a=source-filter: incl IN IP4 239.5.2.31 10.1.15.5
  var sourceFilter: js.UndefOr[AddressTypes] = js.native
}

object SharedAttributes {
  @scala.inline
  def apply(): SharedAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedAttributes]
  }
  @scala.inline
  implicit class SharedAttributesOps[Self <: SharedAttributes] (val x: Self) extends AnyVal {
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
    def setControl(value: String): Self = this.set("control", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    @scala.inline
    def setDirection(value: sendrecv | recvonly | sendonly | inactive): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setExtVarargs(value: Uri*): Self = this.set("ext", js.Array(value :_*))
    @scala.inline
    def setExt(value: js.Array[Uri]): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    @scala.inline
    def setFingerprint(value: Hash): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    @scala.inline
    def setIcePwd(value: String): Self = this.set("icePwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcePwd: Self = this.set("icePwd", js.undefined)
    @scala.inline
    def setIceUfrag(value: String): Self = this.set("iceUfrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIceUfrag: Self = this.set("iceUfrag", js.undefined)
    @scala.inline
    def setInvalidVarargs(value: ValueString*): Self = this.set("invalid", js.Array(value :_*))
    @scala.inline
    def setInvalid(value: js.Array[ValueString]): Self = this.set("invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    @scala.inline
    def setSetup(value: String): Self = this.set("setup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
    @scala.inline
    def setSourceFilter(value: AddressTypes): Self = this.set("sourceFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFilter: Self = this.set("sourceFilter", js.undefined)
  }
  
}

