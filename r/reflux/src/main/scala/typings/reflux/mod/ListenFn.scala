package typings.reflux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenFn extends js.Object {
  
  def apply(params: js.Any*): js.Any = js.native
  
  var completed: js.Function = js.native
  
  var failed: js.Function = js.native
}
