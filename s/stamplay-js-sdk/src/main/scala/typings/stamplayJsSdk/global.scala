package typings.stamplayJsSdk

import typings.stamplayJsSdk.Stamplay.StamplayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Stamplay {
    
    @JSGlobal("Stamplay")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Cobject(`object`: String): StamplayObject = ^.asInstanceOf[js.Dynamic].applyDynamic("Cobject")(`object`.asInstanceOf[js.Any]).asInstanceOf[StamplayObject]
    
    inline def User(): StamplayObject = ^.asInstanceOf[js.Dynamic].applyDynamic("User")().asInstanceOf[StamplayObject]
    
    inline def init(appId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(appId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
