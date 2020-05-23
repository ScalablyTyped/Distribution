package typings.sccBrokerClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoMatchingPublishTargetError extends js.Object {
  def NoMatchingPublishTargetError(channelName: String): typings.std.Error
  def NoMatchingSubscribeTargetError(channelName: String): typings.std.Error
  def NoMatchingUnsubscribeTargetError(channelName: String): typings.std.Error
}

object NoMatchingPublishTargetError {
  @scala.inline
  def apply(
    NoMatchingPublishTargetError: String => typings.std.Error,
    NoMatchingSubscribeTargetError: String => typings.std.Error,
    NoMatchingUnsubscribeTargetError: String => typings.std.Error
  ): NoMatchingPublishTargetError = {
    val __obj = js.Dynamic.literal(NoMatchingPublishTargetError = js.Any.fromFunction1(NoMatchingPublishTargetError), NoMatchingSubscribeTargetError = js.Any.fromFunction1(NoMatchingSubscribeTargetError), NoMatchingUnsubscribeTargetError = js.Any.fromFunction1(NoMatchingUnsubscribeTargetError))
    __obj.asInstanceOf[NoMatchingPublishTargetError]
  }
}

