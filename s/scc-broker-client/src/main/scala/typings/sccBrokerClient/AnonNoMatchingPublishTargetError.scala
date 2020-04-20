package typings.sccBrokerClient

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoMatchingPublishTargetError extends js.Object {
  def NoMatchingPublishTargetError(channelName: String): Error
  def NoMatchingSubscribeTargetError(channelName: String): Error
  def NoMatchingUnsubscribeTargetError(channelName: String): Error
}

object AnonNoMatchingPublishTargetError {
  @scala.inline
  def apply(
    NoMatchingPublishTargetError: String => Error,
    NoMatchingSubscribeTargetError: String => Error,
    NoMatchingUnsubscribeTargetError: String => Error
  ): AnonNoMatchingPublishTargetError = {
    val __obj = js.Dynamic.literal(NoMatchingPublishTargetError = js.Any.fromFunction1(NoMatchingPublishTargetError), NoMatchingSubscribeTargetError = js.Any.fromFunction1(NoMatchingSubscribeTargetError), NoMatchingUnsubscribeTargetError = js.Any.fromFunction1(NoMatchingUnsubscribeTargetError))
    __obj.asInstanceOf[AnonNoMatchingPublishTargetError]
  }
}

