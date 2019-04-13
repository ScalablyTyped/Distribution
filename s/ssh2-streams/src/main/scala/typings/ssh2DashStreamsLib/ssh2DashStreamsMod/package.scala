package typings
package ssh2DashStreamsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ssh2DashStreamsMod {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - PublicKeyAuthMethodData
    - HostbasedAuthMethodData
  */
  type AuthMethodData = _AuthMethodData | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - TcpipForwardGlobalRequest
    - openssh_StreamLocalForwardGlobalRequest
    - nodeLib.Buffer
  */
  type GlobalRequest = _GlobalRequest | nodeLib.Buffer
  type HostKeys = org.scalablytyped.runtime.StringDictionary[HostKey]
}
