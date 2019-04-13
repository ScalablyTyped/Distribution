package typings
package storageDashHelperLib.storageDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storage-helper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clear(): scala.Unit = js.native
  def getItem[T /* <: js.UndefOr[scala.Boolean] */, U](key: java.lang.String): java.lang.String | stdLib.NonNullable[U] | scala.Null = js.native
  def getItem[T /* <: js.UndefOr[scala.Boolean] */, U](key: java.lang.String, parse: T): java.lang.String | stdLib.NonNullable[U] | scala.Null = js.native
  def getItem[T /* <: js.UndefOr[scala.Boolean] */, U](key: java.lang.String, parse: T, fallback: U): java.lang.String | stdLib.NonNullable[U] | scala.Null = js.native
  def removeItem(key: java.lang.String): scala.Unit = js.native
  def setItem(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setItem(key: java.lang.String, value: java.lang.String, permanent: scala.Boolean): scala.Unit = js.native
  def showStorageLogger(enabled: scala.Boolean): scala.Unit = js.native
}

