package typings.ssh2DashStreams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ssh2DashStreamsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.node.Buffer

  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.ssh2DashStreams.ssh2DashStreamsMod.PublicKeyAuthMethodData
    - typings.ssh2DashStreams.ssh2DashStreamsMod.HostbasedAuthMethodData
  */
  type AuthMethodData = _AuthMethodData | String
  /* Rewritten from type alias, can be one of: 
    - typings.ssh2DashStreams.ssh2DashStreamsMod.TcpipForwardGlobalRequest
    - typings.ssh2DashStreams.ssh2DashStreamsMod.openssh_StreamLocalForwardGlobalRequest
    - typings.node.Buffer
  */
  type GlobalRequest = _GlobalRequest | Buffer
  type HostKeys = StringDictionary[HostKey]
}
