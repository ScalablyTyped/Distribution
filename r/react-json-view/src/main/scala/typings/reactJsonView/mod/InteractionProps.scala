package typings.reactJsonView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InteractionProps extends js.Object {
  
  /**
    * The existing subtree of the JSON tree.
    */
  var existing_src: js.Object = js.native
  
  /**
    * The original value of the entry that is interacted with.
    */
  var existing_value: js.Object | String | Double | Boolean | Null = js.native
  
  /**
    * The key of the entry that is interacted with.
    */
  var name: String | Null = js.native
  
  /**
    * List of keys.
    */
  var namespace: js.Array[String | Null] = js.native
  
  /**
    * The updated value of the entry that is interacted with.
    */
  var new_value: js.UndefOr[js.Object | String | Double | Boolean | Null] = js.native
  
  /**
    * The updated subtree of the JSON tree.
    */
  var updated_src: js.Object = js.native
}
object InteractionProps {
  
  @scala.inline
  def apply(existing_src: js.Object, namespace: js.Array[String | Null], updated_src: js.Object): InteractionProps = {
    val __obj = js.Dynamic.literal(existing_src = existing_src.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], updated_src = updated_src.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionProps]
  }
  
  @scala.inline
  implicit class InteractionPropsOps[Self <: InteractionProps] (val x: Self) extends AnyVal {
    
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
    def setExisting_src(value: js.Object): Self = this.set("existing_src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceVarargs(value: (String | Null)*): Self = this.set("namespace", js.Array(value :_*))
    
    @scala.inline
    def setNamespace(value: js.Array[String | Null]): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_src(value: js.Object): Self = this.set("updated_src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExisting_value(value: js.Object | String | Double | Boolean): Self = this.set("existing_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExisting_valueNull: Self = this.set("existing_value", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setNew_value(value: js.Object | String | Double | Boolean): Self = this.set("new_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_value: Self = this.set("new_value", js.undefined)
    
    @scala.inline
    def setNew_valueNull: Self = this.set("new_value", null)
  }
}
