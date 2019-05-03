package typings
package storageDashHelperLib.storageDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storage-helper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clear(): scala.Unit = js.native
  def getItem[U](key: java.lang.String): java.lang.String | stdLib.NonNullable[U] | scala.Null = js.native
  def getItem[U](key: java.lang.String, parse: js.UndefOr[scala.Nothing], fallback: U): java.lang.String | stdLib.NonNullable[U] | scala.Null = js.native
  def getItem[U](key: java.lang.String, parse: scala.Boolean): java.lang.String | stdLib.NonNullable[U] | scala.Null = js.native
  def getItem[U](key: java.lang.String, parse: scala.Boolean, fallback: U): java.lang.String | stdLib.NonNullable[U] | scala.Null = js.native
  def removeItem(key: java.lang.String): scala.Unit = js.native
  def setItem(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setItem(key: java.lang.String, value: java.lang.String, permanent: scala.Boolean): scala.Unit = js.native
  def showStorageLogger(enabled: scala.Boolean): scala.Unit = js.native
}

