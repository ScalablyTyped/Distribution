package typings.sharepoint.Srch

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserActionType extends js.Object

@JSGlobal("Srch.UserActionType")
@js.native
object UserActionType extends js.Object {
  @js.native
  sealed trait filterLanguage extends UserActionType
  
  @js.native
  sealed trait pageNext extends UserActionType
  
  @js.native
  sealed trait pagePrev extends UserActionType
  
  @js.native
  sealed trait refine extends UserActionType
  
  @js.native
  sealed trait search extends UserActionType
  
  @js.native
  sealed trait sort extends UserActionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserActionType with Double] = js.native
  /* 5 */ @js.native
  object filterLanguage extends TopLevel[filterLanguage with Double]
  
  /* 1 */ @js.native
  object pageNext extends TopLevel[pageNext with Double]
  
  /* 2 */ @js.native
  object pagePrev extends TopLevel[pagePrev with Double]
  
  /* 3 */ @js.native
  object refine extends TopLevel[refine with Double]
  
  /* 0 */ @js.native
  object search extends TopLevel[search with Double]
  
  /* 4 */ @js.native
  object sort extends TopLevel[sort with Double]
  
}

