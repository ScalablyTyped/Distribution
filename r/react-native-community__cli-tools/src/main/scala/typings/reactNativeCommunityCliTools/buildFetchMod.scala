package typings.reactNativeCommunityCliTools

import typings.nodeFetch.mod.Request
import typings.nodeFetch.mod.RequestInit
import typings.reactNativeCommunityCliTools.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFetchMod {
  
  @JSImport("@react-native-community/cli-tools/build/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetch(url: String): js.Promise[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Data]]
  inline def fetch(url: String, options: RequestInit): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
  inline def fetch(url: Request): js.Promise[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Data]]
  inline def fetch(url: Request, options: RequestInit): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
  
  /**
    * Downloads the given `url` to the OS's temp folder and
    * returns the path to it.
    */
  inline def fetchToTemp(url: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchToTemp")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
