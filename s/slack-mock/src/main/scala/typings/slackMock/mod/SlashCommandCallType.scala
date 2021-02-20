package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SlashCommandCallType extends StObject
@JSImport("slack-mock", "SlashCommandCallType")
@js.native
object SlashCommandCallType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SlashCommandCallType with String] = js.native
  
  @js.native
  sealed trait response extends SlashCommandCallType
  /* "response" */ val response: typings.slackMock.mod.SlashCommandCallType.response with String = js.native
  
  @js.native
  sealed trait response_url extends SlashCommandCallType
  /* "response_url" */ val response_url: typings.slackMock.mod.SlashCommandCallType.response_url with String = js.native
}
