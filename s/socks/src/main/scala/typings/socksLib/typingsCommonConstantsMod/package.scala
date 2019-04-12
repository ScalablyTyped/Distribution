package typings
package socksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typingsCommonConstantsMod {
  type SocksClientBoundEvent = SocksClientEstablishedEvent
  /**
    * Represents a SocksProxy
    */
  type SocksProxy = socksLib.typingsCommonUtilMod.RequireOnlyOne[
    socksLib.Anon_Host, 
    socksLib.socksLibStrings.host | socksLib.socksLibStrings.ipaddress
  ]
}
