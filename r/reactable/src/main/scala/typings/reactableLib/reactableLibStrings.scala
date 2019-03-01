package typings
package reactableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactableLibStrings {
  @js.native
  sealed trait asc
    extends reactableLib.reactableMod.SortDirection
  
  @js.native
  sealed trait desc
    extends reactableLib.reactableMod.SortDirection
  
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
}

