package typings.simplDashSchema.simplDashSchemaMod

import typings.simplDashSchema.Anon_EndPointsOnly
import typings.simplDashSchema.Anon_KeepArrays
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoObjectStatic extends js.Object {
  def addKey(key: String, `val`: js.Any, op: String): js.Any = js.native
  def affectsGenericKey(key: String): js.Any = js.native
  def affectsGenericKeyImplicit(key: String): js.Any = js.native
  def affectsKey(key: String): js.Any = js.native
  def filterGenericKeys(test: js.Function0[Boolean]): Unit = js.native
  def forEachNode(func: js.Function0[Unit]): Unit = js.native
  def forEachNode(func: js.Function0[Unit], options: Anon_EndPointsOnly): Unit = js.native
  def getFlatObject(): js.Any = js.native
  def getFlatObject(options: Anon_KeepArrays): js.Any = js.native
  def getGenericKeyForPosition(position: String): js.Any = js.native
  def getInfoForKey(key: String): js.Any = js.native
  def getKeyForPosition(position: String): js.Any = js.native
  def getObject(): js.Any = js.native
  def getPositionForKey(key: String): String = js.native
  def getPositionsForGenericKey(key: String): js.Array[String] = js.native
  def getValueForKey(key: String): js.Any = js.native
  def getValueForPosition(position: String): js.Any = js.native
  def removeGenericKey(key: String): Unit = js.native
  def removeGenericKeys(keys: js.Array[String]): Unit = js.native
  def removeKey(key: String): Unit = js.native
  def removeKeys(keys: js.Array[String]): Unit = js.native
  def removeValueForPosition(position: String): Unit = js.native
  def setValueForGenericKey(key: String, `val`: js.Any): Unit = js.native
  def setValueForKey(key: String, `val`: js.Any): Unit = js.native
  def setValueForPosition(position: String, value: js.Any): Unit = js.native
}

