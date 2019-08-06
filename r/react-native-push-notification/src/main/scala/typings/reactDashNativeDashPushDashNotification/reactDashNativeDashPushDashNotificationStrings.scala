package typings.reactDashNativeDashPushDashNotification

import typings.reactDashNativeDashPushDashNotification.reactDashNativeDashPushDashNotificationMod.ImportanceType
import typings.reactDashNativeDashPushDashNotification.reactDashNativeDashPushDashNotificationMod.PriorityType
import typings.reactDashNativeDashPushDashNotification.reactDashNativeDashPushDashNotificationMod.RepeatType
import typings.reactDashNativeDashPushDashNotification.reactDashNativeDashPushDashNotificationMod.VisibilityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashNativeDashPushDashNotificationStrings {
  @js.native
  sealed trait alert extends js.Object
  
  @js.native
  sealed trait badge extends js.Object
  
  @js.native
  sealed trait day extends RepeatType
  
  @js.native
  sealed trait default
    extends ImportanceType
       with PriorityType
  
  @js.native
  sealed trait high
    extends ImportanceType
       with PriorityType
  
  @js.native
  sealed trait hour extends RepeatType
  
  @js.native
  sealed trait low
    extends ImportanceType
       with PriorityType
  
  @js.native
  sealed trait max
    extends ImportanceType
       with PriorityType
  
  @js.native
  sealed trait min
    extends ImportanceType
       with PriorityType
  
  @js.native
  sealed trait minute extends RepeatType
  
  @js.native
  sealed trait none extends ImportanceType
  
  @js.native
  sealed trait `private` extends VisibilityType
  
  @js.native
  sealed trait public extends VisibilityType
  
  @js.native
  sealed trait secret extends VisibilityType
  
  @js.native
  sealed trait sound extends js.Object
  
  @js.native
  sealed trait time extends RepeatType
  
  @js.native
  sealed trait unspecified extends ImportanceType
  
  @js.native
  sealed trait week extends RepeatType
  
  @scala.inline
  def alert: alert = "alert".asInstanceOf[alert]
  @scala.inline
  def badge: badge = "badge".asInstanceOf[badge]
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def high: high = "high".asInstanceOf[high]
  @scala.inline
  def hour: hour = "hour".asInstanceOf[hour]
  @scala.inline
  def low: low = "low".asInstanceOf[low]
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  @scala.inline
  def min: min = "min".asInstanceOf[min]
  @scala.inline
  def minute: minute = "minute".asInstanceOf[minute]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  @scala.inline
  def secret: secret = "secret".asInstanceOf[secret]
  @scala.inline
  def sound: sound = "sound".asInstanceOf[sound]
  @scala.inline
  def time: time = "time".asInstanceOf[time]
  @scala.inline
  def unspecified: unspecified = "unspecified".asInstanceOf[unspecified]
  @scala.inline
  def week: week = "week".asInstanceOf[week]
}

