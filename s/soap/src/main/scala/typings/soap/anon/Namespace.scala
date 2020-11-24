package typings.soap.anon

import typings.soap.typesMod.IXmlAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Namespace extends js.Object {
  
  var namespace: String = js.native
  
  var xmlnsAttributes: js.UndefOr[js.Array[IXmlAttribute]] = js.native
}
object Namespace {
  
  @scala.inline
  def apply(namespace: String): Namespace = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace]
  }
  
  @scala.inline
  implicit class NamespaceOps[Self <: Namespace] (val x: Self) extends AnyVal {
    
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
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlnsAttributesVarargs(value: IXmlAttribute*): Self = this.set("xmlnsAttributes", js.Array(value :_*))
    
    @scala.inline
    def setXmlnsAttributes(value: js.Array[IXmlAttribute]): Self = this.set("xmlnsAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlnsAttributes: Self = this.set("xmlnsAttributes", js.undefined)
  }
}
