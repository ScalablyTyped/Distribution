package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordSourceProxy extends js.Object {
  def create(dataID: DataID, typeName: java.lang.String): RecordProxy
  def delete(dataID: DataID): scala.Unit
  def get(dataID: DataID): js.UndefOr[RecordProxy | scala.Null]
  def getRoot(): RecordProxy
}

object RecordSourceProxy {
  @scala.inline
  def apply(
    create: (DataID, java.lang.String) => RecordProxy,
    delete: DataID => scala.Unit,
    get: DataID => js.UndefOr[RecordProxy | scala.Null],
    getRoot: () => RecordProxy
  ): RecordSourceProxy = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getRoot = js.Any.fromFunction0(getRoot))
  
    __obj.asInstanceOf[RecordSourceProxy]
  }
}

