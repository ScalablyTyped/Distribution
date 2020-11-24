package typings.sax.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sax.mod.BaseTag because var conflicts: name. Inlined isSelfClosing */ @js.native
trait QualifiedTag extends QualifiedName {
  
  var attributes: StringDictionary[QualifiedAttribute] = js.native
  
  var isSelfClosing: Boolean = js.native
  
  var ns: StringDictionary[String] = js.native
}
object QualifiedTag {
  
  @scala.inline
  def apply(
    attributes: StringDictionary[QualifiedAttribute],
    isSelfClosing: Boolean,
    local: String,
    name: String,
    ns: StringDictionary[String],
    prefix: String,
    uri: String
  ): QualifiedTag = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualifiedTag]
  }
  
  @scala.inline
  implicit class QualifiedTagOps[Self <: QualifiedTag] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: StringDictionary[QualifiedAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelfClosing(value: Boolean): Self = this.set("isSelfClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNs(value: StringDictionary[String]): Self = this.set("ns", value.asInstanceOf[js.Any])
  }
}
