package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldUserSelectionMode extends js.Object

@JSGlobal("SP.FieldUserSelectionMode")
@js.native
object FieldUserSelectionMode extends js.Object {
  @js.native
  sealed trait peopleAndGroups extends FieldUserSelectionMode
  
  @js.native
  sealed trait peopleOnly extends FieldUserSelectionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldUserSelectionMode with Double] = js.native
  /* 1 */ @js.native
  object peopleAndGroups extends TopLevel[peopleAndGroups with Double]
  
  /* 0 */ @js.native
  object peopleOnly extends TopLevel[peopleOnly with Double]
  
}

