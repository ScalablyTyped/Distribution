package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BaseType with Double] = js.native
  /* 4 */ @js.native
  object discussionBoard extends TopLevel[discussionBoard with Double]
  
  /* 2 */ @js.native
  object documentLibrary extends TopLevel[documentLibrary with Double]
  
  /* 1 */ @js.native
  object genericList extends TopLevel[genericList with Double]
  
  /* 6 */ @js.native
  object issue extends TopLevel[issue with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 5 */ @js.native
  object survey extends TopLevel[survey with Double]
  
  /* 3 */ @js.native
  object unused extends TopLevel[unused with Double]
  
}

