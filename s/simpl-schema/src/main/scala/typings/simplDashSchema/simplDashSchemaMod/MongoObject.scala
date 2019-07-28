package typings.simplDashSchema.simplDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoObject extends js.Object {
  def expandKey(`val`: js.Any, key: String, obj: js.Any): Unit
}

object MongoObject {
  @scala.inline
  def apply(expandKey: (js.Any, String, js.Any) => Unit): MongoObject = {
    val __obj = js.Dynamic.literal(expandKey = js.Any.fromFunction3(expandKey))
  
    __obj.asInstanceOf[MongoObject]
  }
}

