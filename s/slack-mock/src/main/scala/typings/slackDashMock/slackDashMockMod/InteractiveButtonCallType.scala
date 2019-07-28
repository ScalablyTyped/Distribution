package typings.slackDashMock.slackDashMockMod

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
  
  /* "response" */ val response: typings.slackDashMock.slackDashMockMod.InteractiveButtonCallType.response with String = js.native
  /* "response_url" */ val response_url: typings.slackDashMock.slackDashMockMod.InteractiveButtonCallType.response_url with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InteractiveButtonCallType with String] = js.native
}

