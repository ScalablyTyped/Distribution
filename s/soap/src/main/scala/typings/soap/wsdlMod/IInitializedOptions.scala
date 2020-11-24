package typings.soap.wsdlMod

import typings.soap.typesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInitializedOptions extends IOptions {
  
  @JSName("ignoredNamespaces")
  var ignoredNamespaces_IInitializedOptions: js.UndefOr[js.Array[String]] = js.native
}
object IInitializedOptions {
  
  @scala.inline
  def apply(): IInitializedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInitializedOptions]
  }
  
  @scala.inline
  implicit class IInitializedOptionsOps[Self <: IInitializedOptions] (val x: Self) extends AnyVal {
    
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
    def setIgnoredNamespacesVarargs(value: String*): Self = this.set("ignoredNamespaces", js.Array(value :_*))
    
    @scala.inline
    def setIgnoredNamespaces(value: js.Array[String]): Self = this.set("ignoredNamespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoredNamespaces: Self = this.set("ignoredNamespaces", js.undefined)
  }
}
