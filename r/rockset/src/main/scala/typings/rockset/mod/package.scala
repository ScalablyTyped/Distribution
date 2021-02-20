package typings.rockset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(apiKey: java.lang.String, apiServer: java.lang.String): typings.rockset.mod.ApiClient = (typings.rockset.mod.^.asInstanceOf[js.Dynamic].apply(apiKey.asInstanceOf[js.Any], apiServer.asInstanceOf[js.Any])).asInstanceOf[typings.rockset.mod.ApiClient]
  
  type RequestCallback = js.Function3[/* err */ js.Any, /* data */ js.Any, /* response */ js.Any, scala.Unit]
}
