package typings.reactCookies

import org.scalablytyped.runtime.StringDictionary
import typings.cookie.mod.CookieSerializeOptions
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-cookies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def load(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def load(name: String, doNotParse: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], doNotParse.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def loadAll(): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")().asInstanceOf[StringDictionary[Any]]
  inline def loadAll(doNotParse: Boolean): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(doNotParse.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  
  inline def plugToRequest(
    req: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ],
    res: Response_[Any, Record[String, Any]]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("plugToRequest")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def remove(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def remove(name: String, opt: CookieSerializeOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(name.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def save(name: String, `val`: String, opt: CookieSerializeOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(name.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def save(name: String, `val`: js.Object, opt: CookieSerializeOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(name.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def save(name: String, `val`: Double, opt: CookieSerializeOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(name.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def select(): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")().asInstanceOf[StringDictionary[Any]]
  inline def select(regex: js.RegExp): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(regex.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  
  inline def setRawCookie(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRawCookie")().asInstanceOf[Unit]
  inline def setRawCookie(rawCookie: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRawCookie")(rawCookie.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
