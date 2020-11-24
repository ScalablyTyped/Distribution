package typings.sololearn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sololearn", "getCode")
@js.native
object getCode extends js.Object {
  
  def apply(id: String): js.Promise[Code] = js.native
}
