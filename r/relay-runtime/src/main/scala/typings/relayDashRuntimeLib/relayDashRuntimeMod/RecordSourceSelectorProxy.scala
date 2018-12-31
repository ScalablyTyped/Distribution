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

