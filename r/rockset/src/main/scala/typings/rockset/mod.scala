package typings.rockset

import typings.rockset.anon.Apikeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rockset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a master object for all rockset apis
    *
    * @param apikey Your rockset APIKEY
    * @param host The rockset apiserver that you are hitting, eg https://api.rs2.usw2.rockset.com
    */
  inline def default(apikey: String, host: String): Apikeys = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(apikey.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Apikeys]
  inline def default(
    apikey: String,
    host: String,
    customFetch: js.Function2[/* url */ String, /* request */ Any, js.Promise[Any]]
  ): Apikeys = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(apikey.asInstanceOf[js.Any], host.asInstanceOf[js.Any], customFetch.asInstanceOf[js.Any])).asInstanceOf[Apikeys]
}
