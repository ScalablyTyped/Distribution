package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonWebKey extends js.Object {
  var alg: js.UndefOr[java.lang.String] = js.native
  var crv: js.UndefOr[java.lang.String] = js.native
  var d: js.UndefOr[java.lang.String] = js.native
  var dp: js.UndefOr[java.lang.String] = js.native
  var dq: js.UndefOr[java.lang.String] = js.native
  var e: js.UndefOr[java.lang.String] = js.native
  var ext: js.UndefOr[scala.Boolean] = js.native
  var k: js.UndefOr[java.lang.String] = js.native
  var key_ops: js.UndefOr[js.Array[java.lang.String]] = js.native
  var kty: js.UndefOr[java.lang.String] = js.native
  var n: js.UndefOr[java.lang.String] = js.native
  var oth: js.UndefOr[js.Array[RsaOtherPrimesInfo]] = js.native
  var p: js.UndefOr[java.lang.String] = js.native
  var q: js.UndefOr[java.lang.String] = js.native
  var qi: js.UndefOr[java.lang.String] = js.native
  var use: js.UndefOr[java.lang.String] = js.native
  var x: js.UndefOr[java.lang.String] = js.native
  var y: js.UndefOr[java.lang.String] = js.native
}

object JsonWebKey {
  @scala.inline
  def apply(): JsonWebKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonWebKey]
  }
  @scala.inline
  implicit class JsonWebKeyOps[Self <: JsonWebKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlg(value: java.lang.String): Self = this.set("alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlg: Self = this.set("alg", js.undefined)
    @scala.inline
    def setCrv(value: java.lang.String): Self = this.set("crv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrv: Self = this.set("crv", js.undefined)
    @scala.inline
    def setD(value: java.lang.String): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    @scala.inline
    def setDp(value: java.lang.String): Self = this.set("dp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDp: Self = this.set("dp", js.undefined)
    @scala.inline
    def setDq(value: java.lang.String): Self = this.set("dq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDq: Self = this.set("dq", js.undefined)
    @scala.inline
    def setE(value: java.lang.String): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE: Self = this.set("e", js.undefined)
    @scala.inline
    def setExt(value: scala.Boolean): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    @scala.inline
    def setK(value: java.lang.String): Self = this.set("k", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteK: Self = this.set("k", js.undefined)
    @scala.inline
    def setKey_opsVarargs(value: java.lang.String*): Self = this.set("key_ops", js.Array(value :_*))
    @scala.inline
    def setKey_ops(value: js.Array[java.lang.String]): Self = this.set("key_ops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey_ops: Self = this.set("key_ops", js.undefined)
    @scala.inline
    def setKty(value: java.lang.String): Self = this.set("kty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKty: Self = this.set("kty", js.undefined)
    @scala.inline
    def setN(value: java.lang.String): Self = this.set("n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteN: Self = this.set("n", js.undefined)
    @scala.inline
    def setOthVarargs(value: RsaOtherPrimesInfo*): Self = this.set("oth", js.Array(value :_*))
    @scala.inline
    def setOth(value: js.Array[RsaOtherPrimesInfo]): Self = this.set("oth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOth: Self = this.set("oth", js.undefined)
    @scala.inline
    def setP(value: java.lang.String): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    @scala.inline
    def setQ(value: java.lang.String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setQi(value: java.lang.String): Self = this.set("qi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQi: Self = this.set("qi", js.undefined)
    @scala.inline
    def setUse(value: java.lang.String): Self = this.set("use", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
    @scala.inline
    def setX(value: java.lang.String): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: java.lang.String): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

