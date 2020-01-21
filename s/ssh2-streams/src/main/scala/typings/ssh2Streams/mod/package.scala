package typings.ssh2Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.ssh2Streams.mod.PublicKeyAuthMethodData
    - typings.ssh2Streams.mod.HostbasedAuthMethodData
  */
  type AuthMethodData = typings.ssh2Streams.mod._AuthMethodData | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.ssh2Streams.mod.TcpipForwardGlobalRequest
    - typings.ssh2Streams.mod.opensshStreamLocalForwardGlobalRequest
    - typings.node.Buffer
  */
  type GlobalRequest = typings.ssh2Streams.mod._GlobalRequest | typings.node.Buffer
  type HostKeys = org.scalablytyped.runtime.StringDictionary[typings.ssh2Streams.mod.HostKey]
}
