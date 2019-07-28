package typings.requestretry

import typings.node.httpMod.IncomingMessage
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestretryMod {
  type RetryStrategy = js.Function3[/* err */ Error, /* response */ IncomingMessage, /* body */ js.Any, Boolean]
}
