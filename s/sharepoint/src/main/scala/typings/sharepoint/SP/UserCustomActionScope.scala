package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserCustomActionScope extends js.Object

@JSGlobal("SP.UserCustomActionScope")
@js.native
object UserCustomActionScope extends js.Object {
  @js.native
  sealed trait list extends UserCustomActionScope
  
  @js.native
  sealed trait site extends UserCustomActionScope
  
  @js.native
  sealed trait unknown extends UserCustomActionScope
  
  @js.native
  sealed trait web extends UserCustomActionScope
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserCustomActionScope with Double] = js.native
  /* 3 */ @js.native
  object list extends TopLevel[list with Double]
  
  /* 1 */ @js.native
  object site extends TopLevel[site with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 2 */ @js.native
  object web extends TopLevel[web with Double]
  
}

