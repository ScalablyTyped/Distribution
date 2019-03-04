package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordSourceProxy extends js.Object {
  def create(dataID: DataID, typeName: java.lang.String): RecordProxy
  def delete(dataID: DataID): scala.Unit
  def get(dataID: DataID): RecordProxy | scala.Null
  def getRoot(): RecordProxy
}

object RecordSourceProxy {
  @scala.inline
  def apply(
    create: js.Function2[DataID, java.lang.String, RecordProxy],
    delete: js.Function1[DataID, scala.Unit],
    get: js.Function1[DataID, RecordProxy | scala.Null],
    getRoot: js.Function0[RecordProxy]
  ): RecordSourceProxy = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, get = get, getRoot = getRoot)
  
    __obj.asInstanceOf[RecordSourceProxy]
  }
}

