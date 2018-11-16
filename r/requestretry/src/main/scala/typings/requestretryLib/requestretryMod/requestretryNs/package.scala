package typings
package requestretryLib.requestretryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestretryNs {
  type RetryStrategy = js.Function3[
    /* err */ nodeLib.Error, 
    /* response */ nodeLib.httpMod.IncomingMessage, 
    /* body */ js.Any, 
    scala.Boolean
  ]
}
