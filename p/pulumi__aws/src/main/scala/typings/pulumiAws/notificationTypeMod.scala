package typings.pulumiAws

import typings.pulumiAws.enumsAutoscalingMod.NotificationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationTypeMod {
  
  @JSImport("@pulumi/aws/autoscaling/notificationType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/autoscaling/notificationType", "InstanceLaunchErrorNotification")
  @js.native
  def InstanceLaunchErrorNotification: NotificationType = js.native
  @scala.inline
  def InstanceLaunchErrorNotification_=(x: NotificationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InstanceLaunchErrorNotification")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/autoscaling/notificationType", "InstanceLaunchNotification")
  @js.native
  def InstanceLaunchNotification: NotificationType = js.native
  @scala.inline
  def InstanceLaunchNotification_=(x: NotificationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InstanceLaunchNotification")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/autoscaling/notificationType", "InstanceTerminateErrorNotification")
  @js.native
  def InstanceTerminateErrorNotification: NotificationType = js.native
  @scala.inline
  def InstanceTerminateErrorNotification_=(x: NotificationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InstanceTerminateErrorNotification")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/autoscaling/notificationType", "InstanceTerminateNotification")
  @js.native
  def InstanceTerminateNotification: NotificationType = js.native
  @scala.inline
  def InstanceTerminateNotification_=(x: NotificationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InstanceTerminateNotification")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/autoscaling/notificationType", "TestNotification")
  @js.native
  def TestNotification: NotificationType = js.native
  @scala.inline
  def TestNotification_=(x: NotificationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TestNotification")(x.asInstanceOf[js.Any])
}
