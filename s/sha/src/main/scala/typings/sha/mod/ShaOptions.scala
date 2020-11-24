package typings.sha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaOptions extends js.Object {
  
  /** defaults to `sha1` and can be any of the algorithms supported by `crypto.createHash` */
  var algorithm: js.UndefOr[String] = js.native
}
object ShaOptions {
  
  @scala.inline
  def apply(): ShaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShaOptions]
  }
  
  @scala.inline
  implicit class ShaOptionsOps[Self <: ShaOptions] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
  }
}
