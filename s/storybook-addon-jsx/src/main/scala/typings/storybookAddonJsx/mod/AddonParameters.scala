package typings.storybookAddonJsx.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddonParameters extends js.Object {
  
  var displayName: js.UndefOr[String | displayNameFunc] = js.native
  
  var enableBeautify: js.UndefOr[Boolean] = js.native
  
  var onBeforeRender: js.UndefOr[js.Function1[/* domString */ String, String]] = js.native
  
  var skip: js.UndefOr[Double] = js.native
}
object AddonParameters {
  
  @scala.inline
  def apply(): AddonParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddonParameters]
  }
  
  @scala.inline
  implicit class AddonParametersOps[Self <: AddonParameters] (val x: Self) extends AnyVal {
    
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
    def setDisplayNameFunction1(value: /* element */ ReactElement => String): Self = this.set("displayName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayName(value: String | displayNameFunc): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEnableBeautify(value: Boolean): Self = this.set("enableBeautify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableBeautify: Self = this.set("enableBeautify", js.undefined)
    
    @scala.inline
    def setOnBeforeRender(value: /* domString */ String => String): Self = this.set("onBeforeRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeRender: Self = this.set("onBeforeRender", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
  }
}
