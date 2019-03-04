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
    create: js.Function2[DataID, java.lang.String, RecordProxy],
    delete: js.Function1[DataID, scala.Unit],
    get: js.Function1[DataID, RecordProxy | scala.Null],
    getPluralRootField: js.Function1[java.lang.String, js.Array[RecordProxy] | scala.Null],
    getRoot: js.Function0[RecordProxy],
    getRootField: js.Function1[java.lang.String, RecordProxy | scala.Null]
  ): RecordSourceSelectorProxy = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, get = get, getPluralRootField = getPluralRootField, getRoot = getRoot, getRootField = getRootField)
  
    __obj.asInstanceOf[RecordSourceSelectorProxy]
  }
}

