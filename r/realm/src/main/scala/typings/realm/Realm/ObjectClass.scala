package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectClass
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~ObjectClass }
  */
trait ObjectClass extends js.Object {
  var schema: ObjectSchema
}

object ObjectClass {
  @scala.inline
  def apply(schema: ObjectSchema): ObjectClass = {
    val __obj = js.Dynamic.literal(schema = schema)
  
    __obj.asInstanceOf[ObjectClass]
  }
}

