package typings.slackDashMock.slackDashMockMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SlashCommandCallType with String] = js.native
  /* "response" */ @js.native
  object response extends TopLevel[response with String]
  
  /* "response_url" */ @js.native
  object response_url extends TopLevel[response_url with String]
  
}

