package typings.snyk

import typings.snyk.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibAnalyticsMod {
  
  @JSImport("snyk/dist/lib/analytics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addDataAndSend(data: Any): js.Promise[Unit | Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("addDataAndSend")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit | Body]]
  
  inline def allowAnalytics(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAnalytics")().asInstanceOf[Boolean]
}
