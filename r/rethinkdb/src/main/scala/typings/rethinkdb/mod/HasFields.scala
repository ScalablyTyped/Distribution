package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasFields[T] extends js.Object {
  /**
    * Test if an object has one or more fields. An object has a field if it has that key and the key has a non-null value. For instance, the object `{'a': 1,'b': 2,'c': null}` has the fields `a` and `b`.
    *
    * When applied to a single object, `hasFields` returns `true` if the object has the fields and `false` if it does not. When applied to a sequence, it will return a new sequence (an array or stream) containing the elements that have the specified fields.
    *
    * See: https://rethinkdb.com/api/javascript/has_fields/
    */
  def hasFields(fields: String*): T = js.native
  /**
    * Test if an object has one or more fields. An object has a field if it has that key and the key has a non-null value.
    *
    * `hasFields` lets you test for nested fields in objects. If the value of a field is itself a set of key/value pairs, you can test for the presence of specific keys.
    *
    * See: https://rethinkdb.com/api/javascript/has_fields/
    */
  def hasFields(selector: BooleanMap): T = js.native
}

