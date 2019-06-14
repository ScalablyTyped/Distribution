package typings
package sharepointLib.SPNs

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
  sealed trait discussionBoard
    extends sharepointLib.SPNs.BaseType
  
  @js.native
  sealed trait documentLibrary
    extends sharepointLib.SPNs.BaseType
  
  @js.native
  sealed trait genericList
    extends sharepointLib.SPNs.BaseType
  
  @js.native
  sealed trait issue
    extends sharepointLib.SPNs.BaseType
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.BaseType
  
  @js.native
  sealed trait survey
    extends sharepointLib.SPNs.BaseType
  
  @js.native
  sealed trait unused
    extends sharepointLib.SPNs.BaseType
  
  /* 4 */ val discussionBoard: discussionBoard with scala.Double = js.native
  /* 2 */ val documentLibrary: documentLibrary with scala.Double = js.native
  /* 1 */ val genericList: genericList with scala.Double = js.native
  /* 6 */ val issue: issue with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 5 */ val survey: survey with scala.Double = js.native
  /* 3 */ val unused: unused with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.BaseType with scala.Double] = js.native
}

