package typings
package slackDashMockLib.slackDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SlashCommandCallType extends js.Object

@JSImport("slack-mock", "SlashCommandCallType")
@js.native
object SlashCommandCallType extends js.Object {
  @js.native
  sealed trait response
    extends slackDashMockLib.slackDashMockMod.SlashCommandCallType
  
  @js.native
  sealed trait response_url
    extends slackDashMockLib.slackDashMockMod.SlashCommandCallType
  
  /* "response" */ val response: response with java.lang.String = js.native
  /* "response_url" */ val response_url: response_url with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[slackDashMockLib.slackDashMockMod.SlashCommandCallType with java.lang.String] = js.native
}

