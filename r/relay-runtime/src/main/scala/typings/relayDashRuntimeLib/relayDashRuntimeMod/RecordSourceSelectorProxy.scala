package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordSourceSelectorProxy extends js.Object {
  def create(dataID: DataID, typeName: java.lang.String): RecordProxy
  def delete(dataID: DataID): scala.Unit
  def get(dataID: DataID): RecordProxy | scala.Null
  def getPluralRootField(fieldName: java.lang.String): js.Array[RecordProxy] | scala.Null
  def getRoot(): RecordProxy
  def getRootField(fieldName: java.lang.String): RecordProxy | scala.Null
}

object RecordSourceSelectorProxy {
  @scala.inline
  def apply(
    create: (DataID, java.lang.String) => RecordProxy,
    delete: DataID => scala.Unit,
    get: DataID => RecordProxy | scala.Null,
    getPluralRootField: java.lang.String => js.Array[RecordProxy] | scala.Null,
    getRoot: () => RecordProxy,
    getRootField: java.lang.String => RecordProxy | scala.Null
  ): RecordSourceSelectorProxy = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getPluralRootField = js.Any.fromFunction1(getPluralRootField), getRoot = js.Any.fromFunction0(getRoot), getRootField = js.Any.fromFunction1(getRootField))
  
    __obj.asInstanceOf[RecordSourceSelectorProxy]
  }
}

