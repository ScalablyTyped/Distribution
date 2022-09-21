package typings.reactTwitterConversionTracker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-twitter-conversion-tracker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(convId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(convId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def pageView(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pageView")().asInstanceOf[Unit]
}
