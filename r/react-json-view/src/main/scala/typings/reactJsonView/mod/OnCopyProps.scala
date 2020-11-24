package typings.reactJsonView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnCopyProps extends js.Object {
  
  /**
    * The last key in the namespace array.
    */
  var name: String | Null = js.native
  
  /**
    * List of keys.
    */
  var namespace: js.Array[String | Null] = js.native
  
  /**
    * The JSON tree source object
    */
  var src: js.Object = js.native
}
object OnCopyProps {
  
  @scala.inline
  def apply(namespace: js.Array[String | Null], src: js.Object): OnCopyProps = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCopyProps]
  }
  
  @scala.inline
  implicit class OnCopyPropsOps[Self <: OnCopyProps] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
  }
}
