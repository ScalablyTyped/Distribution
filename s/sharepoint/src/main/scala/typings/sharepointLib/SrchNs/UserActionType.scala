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
  
  val filterLanguage: filterLanguage with java.lang.String = js.native
  val pageNext: pageNext with java.lang.String = js.native
  val pagePrev: pagePrev with java.lang.String = js.native
  val refine: refine with java.lang.String = js.native
  val search: search with java.lang.String = js.native
  val sort: sort with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SrchNs.UserActionType with java.lang.String] = js.native
}

