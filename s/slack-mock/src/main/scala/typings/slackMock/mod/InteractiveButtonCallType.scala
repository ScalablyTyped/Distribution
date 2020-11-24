package typings.slackMock.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InteractiveButtonCallType extends js.Object
@JSImport("slack-mock", "InteractiveButtonCallType")
@js.native
object InteractiveButtonCallType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InteractiveButtonCallType with String] = js.native
  
  @js.native
  sealed trait response extends InteractiveButtonCallType
  /* "response" */ @js.native
  object response extends TopLevel[response with String]
  
  @js.native
  sealed trait response_url extends InteractiveButtonCallType
  /* "response_url" */ @js.native
  object response_url extends TopLevel[response_url with String]
}
