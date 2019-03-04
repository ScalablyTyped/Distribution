package typings
package simplDashSchemaLib.simplDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoObject extends js.Object {
  def expandKey(`val`: js.Any, key: java.lang.String, obj: js.Any): scala.Unit
}

object MongoObject {
  @scala.inline
  def apply(expandKey: js.Function3[js.Any, java.lang.String, js.Any, scala.Unit]): MongoObject = {
    val __obj = js.Dynamic.literal(expandKey = expandKey)
  
    __obj.asInstanceOf[MongoObject]
  }
}

