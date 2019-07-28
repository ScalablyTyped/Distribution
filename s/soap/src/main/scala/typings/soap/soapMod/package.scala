package typings.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object soapMod {
  type CreateClientCallback = js.Function2[/* err */ js.Any, /* client */ typings.soap.libClientMod.Client, Unit]
}
