package typings.pulumiAws.notificationMod

import typings.pulumiAws.notificationTypeMod.NotificationType
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationState extends js.Object {
  /**
    * A list of AutoScaling Group Names
    */
  val groupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of Notification Types that trigger
    * notifications. Acceptable values are documented [in the AWS documentation here](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_NotificationConfiguration.html)
    */
  val notifications: js.UndefOr[Input[js.Array[Input[NotificationType]]]] = js.native
  /**
    * The Topic ARN for notifications to be sent through
    */
  val topicArn: js.UndefOr[Input[String]] = js.native
}

object NotificationState {
  @scala.inline
  def apply(): NotificationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationState]
  }
  @scala.inline
  implicit class NotificationStateOps[Self <: NotificationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroupNamesVarargs(value: Input[String]*): Self = this.set("groupNames", js.Array(value :_*))
    @scala.inline
    def setGroupNames(value: Input[js.Array[Input[String]]]): Self = this.set("groupNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupNames: Self = this.set("groupNames", js.undefined)
    @scala.inline
    def setNotificationsVarargs(value: Input[NotificationType]*): Self = this.set("notifications", js.Array(value :_*))
    @scala.inline
    def setNotifications(value: Input[js.Array[Input[NotificationType]]]): Self = this.set("notifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifications: Self = this.set("notifications", js.undefined)
    @scala.inline
    def setTopicArn(value: Input[String]): Self = this.set("topicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicArn: Self = this.set("topicArn", js.undefined)
  }
  
}

