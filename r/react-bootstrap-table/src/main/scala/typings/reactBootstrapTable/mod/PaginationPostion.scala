package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.reactBootstrapTableStrings.bottom_
import typings.reactBootstrapTable.reactBootstrapTableStrings.top_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactBootstrapTable.reactBootstrapTableStrings.top_
  - typings.reactBootstrapTable.reactBootstrapTableStrings.bottom_
  - typings.reactBootstrapTable.reactBootstrapTableStrings.both
*/
trait PaginationPostion extends js.Object

object PaginationPostion {
  @scala.inline
  def both: typings.reactBootstrapTable.reactBootstrapTableStrings.both = this.cast("both")
  @scala.inline
  def bottom: bottom_ = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def top: top_ = this.cast("top")
}

