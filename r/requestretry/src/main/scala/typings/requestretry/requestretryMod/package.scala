package typings.requestretry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestretryMod {
  import typings.node.httpMod.IncomingMessage
  import typings.std.Error

  type RetryStrategy = js.Function3[/* err */ Error, /* response */ IncomingMessage, /* body */ js.Any, Boolean]
}
