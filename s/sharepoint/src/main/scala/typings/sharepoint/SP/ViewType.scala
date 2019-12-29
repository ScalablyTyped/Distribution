package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewType extends js.Object

@JSGlobal("SP.ViewType")
@js.native
object ViewType extends js.Object {
  @js.native
  sealed trait calendar extends ViewType
  
  @js.native
  sealed trait chart extends ViewType
  
  @js.native
  sealed trait gantt extends ViewType
  
  @js.native
  sealed trait grid extends ViewType
  
  @js.native
  sealed trait html extends ViewType
  
  @js.native
  sealed trait none extends ViewType
  
  @js.native
  sealed trait recurrence extends ViewType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewType with Double] = js.native
  /* 3 */ @js.native
  object calendar extends TopLevel[calendar with Double]
  
  /* 5 */ @js.native
  object chart extends TopLevel[chart with Double]
  
  /* 6 */ @js.native
  object gantt extends TopLevel[gantt with Double]
  
  /* 2 */ @js.native
  object grid extends TopLevel[grid with Double]
  
  /* 1 */ @js.native
  object html extends TopLevel[html with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 4 */ @js.native
  object recurrence extends TopLevel[recurrence with Double]
  
}

