package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserCustomActionRegistrationType extends js.Object

@JSGlobal("SP.UserCustomActionRegistrationType")
@js.native
object UserCustomActionRegistrationType extends js.Object {
  @js.native
  sealed trait contentType extends UserCustomActionRegistrationType
  
  @js.native
  sealed trait fileType extends UserCustomActionRegistrationType
  
  @js.native
  sealed trait list extends UserCustomActionRegistrationType
  
  @js.native
  sealed trait none extends UserCustomActionRegistrationType
  
  @js.native
  sealed trait progId extends UserCustomActionRegistrationType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserCustomActionRegistrationType with Double] = js.native
  /* 2 */ @js.native
  object contentType extends TopLevel[contentType with Double]
  
  /* 4 */ @js.native
  object fileType extends TopLevel[fileType with Double]
  
  /* 1 */ @js.native
  object list extends TopLevel[list with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object progId extends TopLevel[progId with Double]
  
}

