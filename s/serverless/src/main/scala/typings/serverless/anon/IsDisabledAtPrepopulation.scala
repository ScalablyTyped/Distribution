package typings.serverless.anon

import typings.serverless.pluginMod.VariableResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsDisabledAtPrepopulation extends js.Object {
  var isDisabledAtPrepopulation: js.UndefOr[Boolean] = js.native
  @JSName("resolver")
  var resolver_Original: VariableResolver = js.native
  var serviceName: js.UndefOr[String] = js.native
  def resolver(variableSource: String): js.Promise[_] = js.native
}

