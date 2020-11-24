package typings.reactAdaptiveHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-adaptive-hooks.react-adaptive-hooks/media-capabilities.MediaConfigurationInfo> */
@js.native
trait PartialMediaConfiguration extends js.Object {
  
  var powerEfficient: js.UndefOr[Boolean] = js.native
  
  var smooth: js.UndefOr[Boolean] = js.native
  
  var supported: js.UndefOr[Boolean] = js.native
}
object PartialMediaConfiguration {
  
  @scala.inline
  def apply(): PartialMediaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMediaConfiguration]
  }
  
  @scala.inline
  implicit class PartialMediaConfigurationOps[Self <: PartialMediaConfiguration] (val x: Self) extends AnyVal {
    
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
    def setPowerEfficient(value: Boolean): Self = this.set("powerEfficient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerEfficient: Self = this.set("powerEfficient", js.undefined)
    
    @scala.inline
    def setSmooth(value: Boolean): Self = this.set("smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    
    @scala.inline
    def setSupported(value: Boolean): Self = this.set("supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupported: Self = this.set("supported", js.undefined)
  }
}
