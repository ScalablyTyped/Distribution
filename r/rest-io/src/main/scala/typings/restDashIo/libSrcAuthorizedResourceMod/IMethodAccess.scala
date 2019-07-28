package typings.restDashIo.libSrcAuthorizedResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMethodAccess extends js.Object {
  var create: js.Array[String]
  var del: js.Array[String]
  var getAll: js.Array[String]
  var getById: js.Array[String]
  var update: js.Array[String]
}

object IMethodAccess {
  @scala.inline
  def apply(
    create: js.Array[String],
    del: js.Array[String],
    getAll: js.Array[String],
    getById: js.Array[String],
    update: js.Array[String]
  ): IMethodAccess = {
    val __obj = js.Dynamic.literal(create = create, del = del, getAll = getAll, getById = getById, update = update)
  
    __obj.asInstanceOf[IMethodAccess]
  }
}

