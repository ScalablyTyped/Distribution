package typings.routeRecognizer.dslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchDSL extends js.Object {
  
  def apply(path: String): ToDSL = js.native
  def apply(path: String, callback: MatchCallback): Unit = js.native
}
