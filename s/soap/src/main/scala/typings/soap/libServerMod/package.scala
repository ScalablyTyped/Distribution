package typings.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libServerMod {
  import typings.node.httpMod.IncomingMessage
  import typings.node.httpMod.ServerResponse
  import typings.soap.Anon_Body

  type Request = IncomingMessage with Anon_Body
  type Response = ServerResponse
  type ServerType = typings.node.httpMod.Server | IExpressApp
}
