package typings.reactCookies

import org.scalablytyped.runtime.StringDictionary
import typings.cookie.mod.CookieSerializeOptions
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-cookies", "load")
  @js.native
  def load(name: String): js.Any = js.native
  @JSImport("react-cookies", "load")
  @js.native
  def load(name: String, doNotParse: Boolean): js.Any = js.native
  
  @JSImport("react-cookies", "loadAll")
  @js.native
  def loadAll(): StringDictionary[js.Any] = js.native
  @JSImport("react-cookies", "loadAll")
  @js.native
  def loadAll(doNotParse: Boolean): StringDictionary[js.Any] = js.native
  
  @JSImport("react-cookies", "plugToRequest")
  @js.native
  def plugToRequest(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): js.Function0[Unit] = js.native
  
  @JSImport("react-cookies", "remove")
  @js.native
  def remove(name: String): Unit = js.native
  @JSImport("react-cookies", "remove")
  @js.native
  def remove(name: String, opt: CookieSerializeOptions): Unit = js.native
  
  @JSImport("react-cookies", "save")
  @js.native
  def save(name: String, `val`: String, opt: CookieSerializeOptions): Unit = js.native
  @JSImport("react-cookies", "save")
  @js.native
  def save(name: String, `val`: js.Object, opt: CookieSerializeOptions): Unit = js.native
  @JSImport("react-cookies", "save")
  @js.native
  def save(name: String, `val`: Double, opt: CookieSerializeOptions): Unit = js.native
  
  @JSImport("react-cookies", "select")
  @js.native
  def select(): StringDictionary[js.Any] = js.native
  @JSImport("react-cookies", "select")
  @js.native
  def select(regex: RegExp): StringDictionary[js.Any] = js.native
  
  @JSImport("react-cookies", "setRawCookie")
  @js.native
  def setRawCookie(): Unit = js.native
  @JSImport("react-cookies", "setRawCookie")
  @js.native
  def setRawCookie(rawCookie: String): Unit = js.native
}
