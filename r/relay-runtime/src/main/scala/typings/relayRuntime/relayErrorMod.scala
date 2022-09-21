package typings.relayRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayErrorMod {
  
  object default {
    
    @JSImport("relay-runtime/lib/util/RelayError", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(name: String, messageFormat: String, messageParams: (String | Double | Boolean)*): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("create")((List(name.asInstanceOf[js.Any], messageFormat.asInstanceOf[js.Any])).`++`(messageParams.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Error]
    
    inline def createWarning(name: String, messageFormat: String, messageParams: (String | Double | Boolean)*): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("createWarning")((List(name.asInstanceOf[js.Any], messageFormat.asInstanceOf[js.Any])).`++`(messageParams.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Error]
  }
}
