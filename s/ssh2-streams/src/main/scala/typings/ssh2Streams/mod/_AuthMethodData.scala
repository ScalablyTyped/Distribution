package typings.ssh2Streams.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AuthMethodData extends js.Object
object _AuthMethodData {
  
  @scala.inline
  def PublicKeyAuthMethodData(key: Buffer, keyAlgo: String): _AuthMethodData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyAlgo = keyAlgo.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AuthMethodData]
  }
  
  @scala.inline
  def HostbasedAuthMethodData(key: Buffer, keyAlgo: String, localHostname: String, localUsername: String): _AuthMethodData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyAlgo = keyAlgo.asInstanceOf[js.Any], localHostname = localHostname.asInstanceOf[js.Any], localUsername = localUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AuthMethodData]
  }
}
