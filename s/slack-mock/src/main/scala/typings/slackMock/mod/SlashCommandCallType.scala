package typings.slackMock.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SlashCommandCallType extends js.Object
@JSImport("slack-mock", "SlashCommandCallType")
@js.native
object SlashCommandCallType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SlashCommandCallType with String] = js.native
  
  @js.native
  sealed trait response extends SlashCommandCallType
  /* "response" */ @js.native
  object response extends TopLevel[response with String]
  
  @js.native
  sealed trait response_url extends SlashCommandCallType
  /* "response_url" */ @js.native
  object response_url extends TopLevel[response_url with String]
}
