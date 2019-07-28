package typings.storageDashHelper.storageDashHelperMod

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storage-helper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clear(): Unit = js.native
  def getItem[U](key: String): String | NonNullable[U] | Null = js.native
  def getItem[U](key: String, parse: js.UndefOr[scala.Nothing], fallback: U): String | NonNullable[U] | Null = js.native
  def getItem[U](key: String, parse: Boolean): String | NonNullable[U] | Null = js.native
  def getItem[U](key: String, parse: Boolean, fallback: U): String | NonNullable[U] | Null = js.native
  def removeItem(key: String): Unit = js.native
  def setItem(key: String, value: String): Unit = js.native
  def setItem(key: String, value: String, permanent: Boolean): Unit = js.native
  def showStorageLogger(enabled: Boolean): Unit = js.native
}

