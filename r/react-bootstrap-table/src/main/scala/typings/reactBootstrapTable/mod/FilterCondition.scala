package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactBootstrapTable.reactBootstrapTableStrings.eq
  - typings.reactBootstrapTable.reactBootstrapTableStrings.like
*/
trait FilterCondition extends js.Object

object FilterCondition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eq: typings.reactBootstrapTable.reactBootstrapTableStrings.eq = this.cast("eq")
  @scala.inline
  def like: typings.reactBootstrapTable.reactBootstrapTableStrings.like = this.cast("like")
}

