package typings
package restDashIoLib.libSrcAuthorizedResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMethodAccess extends js.Object {
  var create: js.Array[java.lang.String]
  var del: js.Array[java.lang.String]
  var getAll: js.Array[java.lang.String]
  var getById: js.Array[java.lang.String]
  var update: js.Array[java.lang.String]
}

object IMethodAccess {
  @scala.inline
  def apply(
    create: js.Array[java.lang.String],
    del: js.Array[java.lang.String],
    getAll: js.Array[java.lang.String],
    getById: js.Array[java.lang.String],
    update: js.Array[java.lang.String]
  ): IMethodAccess = {
    val __obj = js.Dynamic.literal(create = create, del = del, getAll = getAll, getById = getById, update = update)
  
    __obj.asInstanceOf[IMethodAccess]
  }
}

