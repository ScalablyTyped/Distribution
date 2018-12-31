package typings
package rbacDashALib.rbacDashAMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbac-a", "AttributesManager")
@js.native
class AttributesManager () extends js.Object {
  var _attributes: org.scalablytyped.runtime.StringDictionary[AttributeFunction] = js.native
  /**
    * Undefine an attribute, by name or function and return removed
    * attribute function if one was found.
    */
  def remove(attribute: java.lang.String): AttributeFunction = js.native
  def remove(attribute: AttributeFunction): AttributeFunction = js.native
  /** Define an attribute. The returned value is self for chaining. */
  def set(attribute: AttributeFunction): this.type = js.native
  /**
    * Validate the attribute with the specified user, role and parameters.
    * The method will return a truthy value if the attribute valid, or a
    * falsy otherwise.
    * The method may also return a promise resolivng to the expected returne
    * value, or reject. A rejected promise should be considered falsy.
    * If the specified attribute does not exist, false is returned.
    */
  def validate(attribute: java.lang.String, user: js.Any, role: java.lang.String, params: js.Object): js.Any = js.native
}

