package typings.reachRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reachRouter.reachRouterStrings.PUSH
  - typings.reachRouter.reachRouterStrings.POP
*/
trait HistoryActionType extends js.Object

object HistoryActionType {
  @scala.inline
  def POP: typings.reachRouter.reachRouterStrings.POP = this.cast("POP")
  @scala.inline
  def PUSH: typings.reachRouter.reachRouterStrings.PUSH = this.cast("PUSH")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

