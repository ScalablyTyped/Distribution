package typings.sinon.anon

import typings.sinon.mod.SinonFakeServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<sinon.sinon.SinonSandboxConfig> */
@js.native
trait PartialSinonSandboxConfig extends js.Object {
  
  var injectInto: js.UndefOr[js.Object | Null] = js.native
  
  var properties: js.UndefOr[js.Array[String]] = js.native
  
  var useFakeServer: js.UndefOr[Boolean | SinonFakeServer] = js.native
  
  var useFakeTimers: js.UndefOr[Boolean | PartialSinonFakeTimersCon] = js.native
}
object PartialSinonSandboxConfig {
  
  @scala.inline
  def apply(): PartialSinonSandboxConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSinonSandboxConfig]
  }
  
  @scala.inline
  implicit class PartialSinonSandboxConfigOps[Self <: PartialSinonSandboxConfig] (val x: Self) extends AnyVal {
    
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
    def setInjectInto(value: js.Object): Self = this.set("injectInto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjectInto: Self = this.set("injectInto", js.undefined)
    
    @scala.inline
    def setInjectIntoNull: Self = this.set("injectInto", null)
    
    @scala.inline
    def setPropertiesVarargs(value: String*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setUseFakeServer(value: Boolean | SinonFakeServer): Self = this.set("useFakeServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFakeServer: Self = this.set("useFakeServer", js.undefined)
    
    @scala.inline
    def setUseFakeTimers(value: Boolean | PartialSinonFakeTimersCon): Self = this.set("useFakeTimers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFakeTimers: Self = this.set("useFakeTimers", js.undefined)
  }
}
