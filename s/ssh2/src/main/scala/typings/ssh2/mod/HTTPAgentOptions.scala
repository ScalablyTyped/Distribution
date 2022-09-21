package typings.ssh2.mod

import typings.node.httpMod.AgentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTTPAgentOptions
  extends StObject
     with AgentOptions {
  
  var srcIP: js.UndefOr[String] = js.undefined
}
object HTTPAgentOptions {
  
  inline def apply(): HTTPAgentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPAgentOptions]
  }
  
  extension [Self <: HTTPAgentOptions](x: Self) {
    
    inline def setSrcIP(value: String): Self = StObject.set(x, "srcIP", value.asInstanceOf[js.Any])
    
    inline def setSrcIPUndefined: Self = StObject.set(x, "srcIP", js.undefined)
  }
}
