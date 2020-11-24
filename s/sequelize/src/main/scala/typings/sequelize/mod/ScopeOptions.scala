package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* Scope Options for Model.scope
*/
@js.native
trait ScopeOptions extends js.Object {
  
  /**
    * The scope(s) to apply. Scopes can either be passed as consecutive arguments, or as an array of arguments.
    * To apply simple scopes and scope functions with no arguments, pass them as strings. For scope function,
    * pass an object, with a `method` property. The value can either be a string, if the method does not take
    * any arguments, or an array, where the first element is the name of the method, and consecutive elements
    * are arguments to that method. Pass null to remove all scopes, including the default.
    */
  var method: String | js.Array[_] = js.native
}
object ScopeOptions {
  
  @scala.inline
  def apply(method: String | js.Array[_]): ScopeOptions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeOptions]
  }
  
  @scala.inline
  implicit class ScopeOptionsOps[Self <: ScopeOptions] (val x: Self) extends AnyVal {
    
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
    def setMethodVarargs(value: js.Any*): Self = this.set("method", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: String | js.Array[_]): Self = this.set("method", value.asInstanceOf[js.Any])
  }
}
