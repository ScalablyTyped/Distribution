package typings.sfcookies

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sfcookies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bakeCookie(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bake_cookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def bakeCookie(name: String, value: String, date: js.Date): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bake_cookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deleteCookie(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("delete_cookie")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def readCookie(name: String): String | js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("read_cookie")(name.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[Any]]
}
