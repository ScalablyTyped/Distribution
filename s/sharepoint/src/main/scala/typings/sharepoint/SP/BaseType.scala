package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BaseType extends js.Object

/** Specifies the base type for a list. */
@JSGlobal("SP.BaseType")
@js.native
object BaseType extends js.Object {
  @js.native
  sealed trait discussionBoard extends BaseType
  
  @js.native
  sealed trait documentLibrary extends BaseType
  
  @js.native
  sealed trait genericList extends BaseType
  
  @js.native
  sealed trait issue extends BaseType
  
  @js.native
  sealed trait none extends BaseType
  
  @js.native
  sealed trait survey extends BaseType
  
  @js.native
  sealed trait unused extends BaseType
  
  /* 4 */ val discussionBoard: typings.sharepoint.SP.BaseType.discussionBoard with Double = js.native
  /* 2 */ val documentLibrary: typings.sharepoint.SP.BaseType.documentLibrary with Double = js.native
  /* 1 */ val genericList: typings.sharepoint.SP.BaseType.genericList with Double = js.native
  /* 6 */ val issue: typings.sharepoint.SP.BaseType.issue with Double = js.native
  /* 0 */ val none: typings.sharepoint.SP.BaseType.none with Double = js.native
  /* 5 */ val survey: typings.sharepoint.SP.BaseType.survey with Double = js.native
  /* 3 */ val unused: typings.sharepoint.SP.BaseType.unused with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BaseType with Double] = js.native
}

