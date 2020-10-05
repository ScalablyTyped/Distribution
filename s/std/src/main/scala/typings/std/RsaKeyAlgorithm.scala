package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RsaKeyAlgorithm extends KeyAlgorithm {
  var modulusLength: Double = js.native
  var publicExponent: BigInteger = js.native
}

object RsaKeyAlgorithm {
  @scala.inline
  def apply(modulusLength: Double, name: java.lang.String, publicExponent: BigInteger): RsaKeyAlgorithm = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaKeyAlgorithm]
  }
  @scala.inline
  implicit class RsaKeyAlgorithmOps[Self <: RsaKeyAlgorithm] (val x: Self) extends AnyVal {
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
    def setModulusLength(value: Double): Self = this.set("modulusLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicExponent(value: BigInteger): Self = this.set("publicExponent", value.asInstanceOf[js.Any])
  }
  
}

