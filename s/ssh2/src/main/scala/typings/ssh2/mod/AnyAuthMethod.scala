package typings.ssh2.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ssh2.mod.NoAuthMethod
  - typings.ssh2.mod.PasswordAuthMethod
  - typings.ssh2.mod.HostBasedAuthMethod
  - typings.ssh2.mod.PublicKeyAuthMethod
  - typings.ssh2.mod.AgentAuthMethod
  - typings.ssh2.mod.KeyboardInteractiveAuthMethod
*/
trait AnyAuthMethod extends StObject
object AnyAuthMethod {
  
  inline def AgentAuthMethod(agent: (BaseAgent[String | Buffer | ParsedKey]) | String, username: String): typings.ssh2.mod.AgentAuthMethod = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("agent")
    __obj.asInstanceOf[typings.ssh2.mod.AgentAuthMethod]
  }
  
  inline def HostBasedAuthMethod(key: ParsedKey | Buffer | String, localHostname: String, localUsername: String, username: String): typings.ssh2.mod.HostBasedAuthMethod = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], localHostname = localHostname.asInstanceOf[js.Any], localUsername = localUsername.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hostbased")
    __obj.asInstanceOf[typings.ssh2.mod.HostBasedAuthMethod]
  }
  
  inline def KeyboardInteractiveAuthMethod(
    prompt: (String, String, String, js.Array[Prompt], KeyboardInteractiveCallback) => Unit,
    username: String
  ): typings.ssh2.mod.KeyboardInteractiveAuthMethod = {
    val __obj = js.Dynamic.literal(prompt = js.Any.fromFunction5(prompt), username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("keyboard-interactive")
    __obj.asInstanceOf[typings.ssh2.mod.KeyboardInteractiveAuthMethod]
  }
  
  inline def NoAuthMethod(username: String): typings.ssh2.mod.NoAuthMethod = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("none")
    __obj.asInstanceOf[typings.ssh2.mod.NoAuthMethod]
  }
  
  inline def PasswordAuthMethod(password: String, username: String): typings.ssh2.mod.PasswordAuthMethod = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("password")
    __obj.asInstanceOf[typings.ssh2.mod.PasswordAuthMethod]
  }
  
  inline def PublicKeyAuthMethod(key: ParsedKey | Buffer | String, username: String): typings.ssh2.mod.PublicKeyAuthMethod = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("publickey")
    __obj.asInstanceOf[typings.ssh2.mod.PublicKeyAuthMethod]
  }
}
