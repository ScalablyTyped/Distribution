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
  
  val discussionBoard: discussionBoard with java.lang.String = js.native
  val documentLibrary: documentLibrary with java.lang.String = js.native
  val genericList: genericList with java.lang.String = js.native
  val issue: issue with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val survey: survey with java.lang.String = js.native
  val unused: unused with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.BaseType with java.lang.String] = js.native
}

