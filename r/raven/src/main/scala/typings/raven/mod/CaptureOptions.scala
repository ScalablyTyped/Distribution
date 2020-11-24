package typings.raven.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptureOptions extends js.Object {
  
  var extra: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var fingerprint: js.UndefOr[js.Array[String]] = js.native
  
  var level: js.UndefOr[String] = js.native
  
  var req: js.UndefOr[IncomingMessage] = js.native
  
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  
  var user: js.UndefOr[js.Any] = js.native
}
object CaptureOptions {
  
  @scala.inline
  def apply(): CaptureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureOptions]
  }
  
  @scala.inline
  implicit class CaptureOptionsOps[Self <: CaptureOptions] (val x: Self) extends AnyVal {
    
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
    def setExtra(value: StringDictionary[js.Any]): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setFingerprintVarargs(value: String*): Self = this.set("fingerprint", js.Array(value :_*))
    
    @scala.inline
    def setFingerprint(value: js.Array[String]): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setReq(value: IncomingMessage): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReq: Self = this.set("req", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUser(value: js.Any): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
