package typings.saywhen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatcherProxy[T] extends js.Object {
  
  def apply(arg: T): Boolean = js.native
  
  val latest: T = js.native
  
  def values(): js.Array[T] = js.native
}
