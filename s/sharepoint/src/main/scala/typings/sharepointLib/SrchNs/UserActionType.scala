package typings
package sharepointLib.SrchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserActionType extends js.Object

@JSGlobal("Srch.UserActionType")
@js.native
object UserActionType extends js.Object {
  @js.native
  sealed trait filterLanguage
    extends sharepointLib.SrchNs.UserActionType
  
  @js.native
  sealed trait pageNext
    extends sharepointLib.SrchNs.UserActionType
  
  @js.native
  sealed trait pagePrev
    extends sharepointLib.SrchNs.UserActionType
  
  @js.native
  sealed trait refine
    extends sharepointLib.SrchNs.UserActionType
  
  @js.native
  sealed trait search
    extends sharepointLib.SrchNs.UserActionType
  
  @js.native
  sealed trait sort
    extends sharepointLib.SrchNs.UserActionType
  
  /* 5 */ val filterLanguage: filterLanguage with scala.Double = js.native
  /* 1 */ val pageNext: pageNext with scala.Double = js.native
  /* 2 */ val pagePrev: pagePrev with scala.Double = js.native
  /* 3 */ val refine: refine with scala.Double = js.native
  /* 0 */ val search: search with scala.Double = js.native
  /* 4 */ val sort: sort with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SrchNs.UserActionType with scala.Double] = js.native
}

