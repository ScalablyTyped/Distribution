package typings
package promisifyDashSupertestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promisifyDashSupertestMod {
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, scala.Unit]
  type Response = superagentLib.superagentMod.Response
  type SuperTest = superagentLib.superagentMod.SuperAgent[Test]
}
