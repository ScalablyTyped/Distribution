package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The CryptoKey dictionary of the Web Crypto API represents a cryptographic key. */
@js.native
trait CryptoKey extends js.Object {
  val algorithm: KeyAlgorithm = js.native
  val extractable: scala.Boolean = js.native
  val `type`: KeyType = js.native
  val usages: js.Array[KeyUsage] = js.native
}

object CryptoKey {
  @scala.inline
  def apply(algorithm: KeyAlgorithm, extractable: scala.Boolean, `type`: KeyType, usages: js.Array[KeyUsage]): CryptoKey = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], extractable = extractable.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKey]
  }
  @scala.inline
  implicit class CryptoKeyOps[Self <: CryptoKey] (val x: Self) extends AnyVal {
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
    def setAlgorithm(value: KeyAlgorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtractable(value: scala.Boolean): Self = this.set("extractable", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: KeyType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsagesVarargs(value: KeyUsage*): Self = this.set("usages", js.Array(value :_*))
    @scala.inline
    def setUsages(value: js.Array[KeyUsage]): Self = this.set("usages", value.asInstanceOf[js.Any])
  }
  
}

