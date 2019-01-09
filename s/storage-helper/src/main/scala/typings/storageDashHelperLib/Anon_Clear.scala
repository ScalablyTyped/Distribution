package typings
package storageDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Clear extends js.Object {
  @JSName("clear")
  var clear_Original: js.Function0[scala.Unit] = js.native
  @JSName("getItem")
  var getItem_Original: Anon_Fallback = js.native
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
  def getItem[T /* <: js.UndefOr[scala.Boolean] */, U](key: java.lang.String): java.lang.String | stdLib.NonNullable[U] | scala.Null = js.native
  def getItem[T /* <: js.UndefOr[scala.Boolean] */, U](key: java.lang.String, parse: T): java.lang.String | stdLib.NonNullable[U] | scala.Null = js.native
  def getItem[T /* <: js.UndefOr[scala.Boolean] */, U](key: java.lang.String, parse: T, fallback: U): java.lang.String | stdLib.NonNullable[U] | scala.Null = js.native
  def removeItem(key: java.lang.String): scala.Unit = js.native
  def setItem(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setItem(key: java.lang.String, value: java.lang.String, permanent: scala.Boolean): scala.Unit = js.native
}

