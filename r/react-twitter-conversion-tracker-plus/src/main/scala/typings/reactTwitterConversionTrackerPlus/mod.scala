package typings.reactTwitterConversionTrackerPlus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-twitter-conversion-tracker-plus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(convId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(convId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def pageView(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pageView")().asInstanceOf[Unit]
  
  inline def track(action: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("track")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
