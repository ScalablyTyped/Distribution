package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.ssh2Streams.mod.PublicKeyAuthMethodData
  - typings.ssh2Streams.mod.HostbasedAuthMethodData
*/
type AuthMethodData = _AuthMethodData | String

/* Rewritten from type alias, can be one of: 
  - typings.ssh2Streams.mod.TcpipForwardGlobalRequest
  - typings.ssh2Streams.mod.opensshStreamLocalForwardGlobalRequest
  - typings.node.bufferMod.global.Buffer
*/
type GlobalRequest = _GlobalRequest | Buffer

type HostKeys = StringDictionary[HostKey]
