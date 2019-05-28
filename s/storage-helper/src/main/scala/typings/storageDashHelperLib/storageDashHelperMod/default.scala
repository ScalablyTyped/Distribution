package typings
package storageDashHelperLib.storageDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storage-helper", JSImport.Default)
@js.native
object default extends js.Object {
  @JSName("clear")
  var clear_Original: js.Function0[scala.Unit] = js.native
  @JSName("getItem")
  var getItem_Original: storageDashHelperLib.Fn_Fallback = js.native
  @JSName("removeItem")
  var removeItem_Original: js.Function1[/* key */ java.lang.String, scala.Unit] = js.native
  @JSName("setItem")
  var setItem_Original: js.Function3[
    /* key */ java.lang.String, 
    /* value */ java.lang.String, 
    /* permanent */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ] = js.native
  def clear(): scala.Unit = js.native
  def getItem[U](key: java.lang.String): java.lang.String | stdLib.NonNullable[U] | scala.Null = js.native
  def getItem[U](key: java.lang.String, parse: js.UndefOr[scala.Nothing], fallback: U): java.lang.String | stdLib.NonNullable[U] | scala.Null = js.native
  def getItem[U](key: java.lang.String, parse: scala.Boolean): java.lang.String | stdLib.NonNullable[U] | scala.Null = js.native
  def getItem[U](key: java.lang.String, parse: scala.Boolean, fallback: U): java.lang.String | stdLib.NonNullable[U] | scala.Null = js.native
  def removeItem(key: java.lang.String): scala.Unit = js.native
  def setItem(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setItem(key: java.lang.String, value: java.lang.String, permanent: scala.Boolean): scala.Unit = js.native
}

