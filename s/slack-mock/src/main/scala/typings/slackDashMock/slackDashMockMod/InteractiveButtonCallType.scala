package typings.slackDashMock.slackDashMockMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InteractiveButtonCallType extends js.Object

@JSImport("slack-mock", "InteractiveButtonCallType")
@js.native
object InteractiveButtonCallType extends js.Object {
  @js.native
  sealed trait response extends InteractiveButtonCallType
  
  @js.native
  sealed trait response_url extends InteractiveButtonCallType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InteractiveButtonCallType with String] = js.native
  /* "response" */ @js.native
  object response extends TopLevel[response with String]
  
  /* "response_url" */ @js.native
  object response_url extends TopLevel[response_url with String]
  
}

