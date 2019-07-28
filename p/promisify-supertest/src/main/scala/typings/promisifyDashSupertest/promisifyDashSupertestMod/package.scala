package typings.promisifyDashSupertest

import typings.superagent.superagentMod.SuperAgent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promisifyDashSupertestMod {
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, Unit]
  type Response = typings.superagent.superagentMod.Response
  type SuperTest = SuperAgent[Test]
}
