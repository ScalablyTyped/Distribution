package typings
package simplDashSchemaLib.simplDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoObjectStatic extends js.Object {
  def addKey(key: java.lang.String, `val`: js.Any, op: java.lang.String): js.Any = js.native
  def affectsGenericKey(key: java.lang.String): js.Any = js.native
  def affectsGenericKeyImplicit(key: java.lang.String): js.Any = js.native
  def affectsKey(key: java.lang.String): js.Any = js.native
  def filterGenericKeys(test: js.Function0[scala.Boolean]): scala.Unit = js.native
  def forEachNode(func: js.Function0[scala.Unit]): scala.Unit = js.native
  def forEachNode(func: js.Function0[scala.Unit], options: simplDashSchemaLib.Anon_EndPointsOnly): scala.Unit = js.native
  def getFlatObject(): js.Any = js.native
  def getFlatObject(options: simplDashSchemaLib.Anon_KeepArrays): js.Any = js.native
  def getGenericKeyForPosition(position: java.lang.String): js.Any = js.native
  def getInfoForKey(key: java.lang.String): js.Any = js.native
  def getKeyForPosition(position: java.lang.String): js.Any = js.native
  def getObject(): js.Any = js.native
  def getPositionForKey(key: java.lang.String): java.lang.String = js.native
  def getPositionsForGenericKey(key: java.lang.String): js.Array[java.lang.String] = js.native
  def getValueForKey(key: java.lang.String): js.Any = js.native
  def getValueForPosition(position: java.lang.String): js.Any = js.native
  def removeGenericKey(key: java.lang.String): scala.Unit = js.native
  def removeGenericKeys(keys: js.Array[java.lang.String]): scala.Unit = js.native
  def removeKey(key: java.lang.String): scala.Unit = js.native
  def removeKeys(keys: js.Array[java.lang.String]): scala.Unit = js.native
  def removeValueForPosition(position: java.lang.String): scala.Unit = js.native
  def setValueForGenericKey(key: java.lang.String, `val`: js.Any): scala.Unit = js.native
  def setValueForKey(key: java.lang.String, `val`: js.Any): scala.Unit = js.native
  def setValueForPosition(position: java.lang.String, value: js.Any): scala.Unit = js.native
}

