package typings.slackDashMock.slackDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SlashCommandCallType extends js.Object

@JSImport("slack-mock", "SlashCommandCallType")
@js.native
object SlashCommandCallType extends js.Object {
  @js.native
  sealed trait response extends SlashCommandCallType
  
  @js.native
  sealed trait response_url extends SlashCommandCallType
  
  /* "response" */ val response: typings.slackDashMock.slackDashMockMod.SlashCommandCallType.response with String = js.native
  /* "response_url" */ val response_url: typings.slackDashMock.slackDashMockMod.SlashCommandCallType.response_url with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SlashCommandCallType with String] = js.native
}

