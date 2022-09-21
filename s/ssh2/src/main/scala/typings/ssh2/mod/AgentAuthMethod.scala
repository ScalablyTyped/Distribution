package typings.ssh2.mod

import typings.node.bufferMod.global.Buffer
import typings.ssh2.ssh2Strings.agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentAuthMethod
  extends StObject
     with AuthMethod
     with AnyAuthMethod {
  
  /**
    * Can be a string that is interpreted exactly like the `agent` connection config
    * option or can be a custom agent object/instance that extends and implements `BaseAgent`
    */
  var agent: (BaseAgent[String | Buffer | ParsedKey]) | String
  
  @JSName("type")
  var type_AgentAuthMethod: agent
}
object AgentAuthMethod {
  
  inline def apply(agent: (BaseAgent[String | Buffer | ParsedKey]) | String, username: String): AgentAuthMethod = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("agent")
    __obj.asInstanceOf[AgentAuthMethod]
  }
  
  extension [Self <: AgentAuthMethod](x: Self) {
    
    inline def setAgent(value: (BaseAgent[String | Buffer | ParsedKey]) | String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setType(value: agent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
