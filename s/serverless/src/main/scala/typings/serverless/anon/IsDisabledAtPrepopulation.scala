package typings.serverless.anon

import typings.serverless.pluginMod.VariableResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsDisabledAtPrepopulation extends js.Object {
  
  var isDisabledAtPrepopulation: js.UndefOr[Boolean] = js.native
  
  def resolver(variableSource: String): js.Promise[_] = js.native
  @JSName("resolver")
  var resolver_Original: VariableResolver = js.native
  
  var serviceName: js.UndefOr[String] = js.native
}
