package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SlashCommandCallType extends js.Object

@JSImport("slack-mock/SlackMock", "SlashCommandCallType")
@js.native
object SlashCommandCallType extends js.Object {
  @js.native
  sealed trait response
    extends slackDashMockLib.slackDashMockMod.SlackMockNs.SlashCommandCallType
  
  @js.native
  sealed trait response_url
    extends slackDashMockLib.slackDashMockMod.SlackMockNs.SlashCommandCallType
  
}

