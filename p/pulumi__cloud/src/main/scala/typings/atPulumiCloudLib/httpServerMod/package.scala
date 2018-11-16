package typings
package atPulumiCloudLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpServerMod {
  type RequestListenerFactory = js.Function0[
    js.Function2[
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ]
}
