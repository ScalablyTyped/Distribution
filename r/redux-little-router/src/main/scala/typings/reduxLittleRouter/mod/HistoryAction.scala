package typings.reduxLittleRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reduxLittleRouter.reduxLittleRouterStrings.PUSH
  - typings.reduxLittleRouter.reduxLittleRouterStrings.POP
  - typings.reduxLittleRouter.reduxLittleRouterStrings.REPLACE
*/
trait HistoryAction extends js.Object

object HistoryAction {
  @scala.inline
  def POP: typings.reduxLittleRouter.reduxLittleRouterStrings.POP = this.cast("POP")
  @scala.inline
  def PUSH: typings.reduxLittleRouter.reduxLittleRouterStrings.PUSH = this.cast("PUSH")
  @scala.inline
  def REPLACE: typings.reduxLittleRouter.reduxLittleRouterStrings.REPLACE = this.cast("REPLACE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

