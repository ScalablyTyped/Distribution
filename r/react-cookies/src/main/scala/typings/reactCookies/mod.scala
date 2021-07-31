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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-cookies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def load(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def load(name: String, doNotParse: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], doNotParse.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def loadAll(): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")().asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def loadAll(doNotParse: Boolean): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(doNotParse.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  
  @scala.inline
  def plugToRequest(req: Request_[ParamsDictionary, js.Any, js.Any, Query], res: Response_[js.Any]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("plugToRequest")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def remove(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def remove(name: String, opt: CookieSerializeOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(name.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def save(name: String, `val`: String, opt: CookieSerializeOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(name.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def save(name: String, `val`: js.Object, opt: CookieSerializeOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(name.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def save(name: String, `val`: Double, opt: CookieSerializeOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(name.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def select(): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")().asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def select(regex: RegExp): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(regex.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  
  @scala.inline
  def setRawCookie(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRawCookie")().asInstanceOf[Unit]
  @scala.inline
  def setRawCookie(rawCookie: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRawCookie")(rawCookie.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
