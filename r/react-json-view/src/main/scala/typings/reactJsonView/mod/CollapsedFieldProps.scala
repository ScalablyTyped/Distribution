package typings.reactJsonView.mod

import typings.reactJsonView.reactJsonViewStrings.`object`
import typings.reactJsonView.reactJsonViewStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapsedFieldProps extends js.Object {
  
  /**
    * The name of the entry.
    */
  var name: String | Null = js.native
  
  /**
    * The scopes above the current entry.
    */
  var namespace: js.Array[String | Null] = js.native
  
  /**
    * The corresponding JSON subtree.
    */
  var src: js.Object = js.native
  
  /**
    * The type of src. Can only be "array" or "object".
    */
  var `type`: array | `object` = js.native
}
object CollapsedFieldProps {
  
  @scala.inline
  def apply(namespace: js.Array[String | Null], src: js.Object, `type`: array | `object`): CollapsedFieldProps = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsedFieldProps]
  }
  
  @scala.inline
  implicit class CollapsedFieldPropsOps[Self <: CollapsedFieldProps] (val x: Self) extends AnyVal {
    
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
    def setNamespaceVarargs(value: (String | Null)*): Self = this.set("namespace", js.Array(value :_*))
    
    @scala.inline
    def setNamespace(value: js.Array[String | Null]): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: js.Object): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: array | `object`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
  }
}
