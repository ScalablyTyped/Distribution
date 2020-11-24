package typings.saxes.mod

import typings.saxes.saxesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NSOptionsWithoutNamespaces extends NSOptions {
  
  @JSName("additionalNamespaces")
  var additionalNamespaces_NSOptionsWithoutNamespaces: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("resolvePrefix")
  var resolvePrefix_NSOptionsWithoutNamespaces: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("xmlns")
  var xmlns_NSOptionsWithoutNamespaces: js.UndefOr[`false`] = js.native
}
object NSOptionsWithoutNamespaces {
  
  @scala.inline
  def apply(): NSOptionsWithoutNamespaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NSOptionsWithoutNamespaces]
  }
  
  @scala.inline
  implicit class NSOptionsWithoutNamespacesOps[Self <: NSOptionsWithoutNamespaces] (val x: Self) extends AnyVal {
    
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
    def setXmlns(value: `false`): Self = this.set("xmlns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlns: Self = this.set("xmlns", js.undefined)
  }
}
