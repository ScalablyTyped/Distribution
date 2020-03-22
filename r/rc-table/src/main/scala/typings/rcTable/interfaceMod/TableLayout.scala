package typings.rcTable.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcTable.rcTableStrings.auto
  - typings.rcTable.rcTableStrings.fixed
*/
trait TableLayout extends js.Object

object TableLayout {
  @scala.inline
  def auto: typings.rcTable.rcTableStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fixed: typings.rcTable.rcTableStrings.fixed = this.cast("fixed")
}

