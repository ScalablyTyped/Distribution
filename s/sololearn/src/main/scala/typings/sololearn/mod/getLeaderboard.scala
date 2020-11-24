package typings.sololearn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sololearn", "getLeaderboard")
@js.native
object getLeaderboard extends js.Object {
  
  def apply(): js.Promise[js.Array[Leader]] = js.native
  def apply(lang: String): js.Promise[js.Array[Leader]] = js.native
}
