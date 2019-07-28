package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Scope Options for Model.scope
*/
trait ScopeOptions extends js.Object {
  /**
    * The scope(s) to apply. Scopes can either be passed as consecutive arguments, or as an array of arguments.
    * To apply simple scopes and scope functions with no arguments, pass them as strings. For scope function,
    * pass an object, with a `method` property. The value can either be a string, if the method does not take
    * any arguments, or an array, where the first element is the name of the method, and consecutive elements
    * are arguments to that method. Pass null to remove all scopes, including the default.
    */
  var method: String | js.Array[_]
}

object ScopeOptions {
  @scala.inline
  def apply(method: String | js.Array[_]): ScopeOptions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScopeOptions]
  }
}

