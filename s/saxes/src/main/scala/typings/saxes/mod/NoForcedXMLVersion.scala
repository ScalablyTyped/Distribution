package typings.saxes.mod

import typings.saxes.saxesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoForcedXMLVersion extends XMLVersionOptions {
  
  @JSName("forceXMLVersion")
  var forceXMLVersion_NoForcedXMLVersion: js.UndefOr[`false`] = js.native
}
object NoForcedXMLVersion {
  
  @scala.inline
  def apply(): NoForcedXMLVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoForcedXMLVersion]
  }
  
  @scala.inline
  implicit class NoForcedXMLVersionOps[Self <: NoForcedXMLVersion] (val x: Self) extends AnyVal {
    
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
    def setForceXMLVersion(value: `false`): Self = this.set("forceXMLVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceXMLVersion: Self = this.set("forceXMLVersion", js.undefined)
  }
}
