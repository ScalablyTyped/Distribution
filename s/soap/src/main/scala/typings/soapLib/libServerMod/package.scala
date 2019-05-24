package typings
package soapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libServerMod {
  type Request = nodeLib.httpMod.IncomingMessage with soapLib.Anon_Body
  type Response = nodeLib.httpMod.ServerResponse
  type ServerType = nodeLib.httpMod.Server | IExpressApp
}
