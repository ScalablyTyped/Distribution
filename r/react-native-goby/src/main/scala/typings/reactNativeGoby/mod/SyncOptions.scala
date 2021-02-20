package typings.reactNativeGoby.mod

import typings.reactNativeGoby.mod.Goby.InstallMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncOptions extends StObject {
  
  /**
    * Specifies the deployment key you want to query for an update against. By default, this value is derived from the Info.plist
    * file (iOS) and MainActivity.java file (Android), but this option allows you to override it from the script-side if you need to
    * dynamically use a different deployment for a specific call to sync.
    */
  var deploymentKey: js.UndefOr[String] = js.native
  
  /**
    * Specifies when you would like to install optional updates (i.e. those that aren't marked as mandatory).
    * Defaults to goby.InstallMode.ON_NEXT_RESTART.
    */
  var installMode: js.UndefOr[InstallMode] = js.native
  
  /**
    * Specifies when you would like to install updates which are marked as mandatory.
    * Defaults to goby.InstallMode.IMMEDIATE.
    */
  var mandatoryInstallMode: js.UndefOr[InstallMode] = js.native
  
  /**
    * Specifies the minimum number of seconds that the app needs to have been in the background before restarting the app. This property
    * only applies to updates which are installed using `InstallMode.ON_NEXT_RESUME`, and can be useful for getting your update in front
    * of end users sooner, without being too obtrusive. Defaults to `0`, which has the effect of applying the update immediately after a
    * resume, regardless how long it was in the background.
    */
  var minimumBackgroundDuration: js.UndefOr[Double] = js.native
  
  /**
    * An "options" object used to determine whether a confirmation dialog should be displayed to the end user when an update is available,
    * and if so, what strings to use. Defaults to null, which has the effect of disabling the dialog completely. Setting this to any truthy
    * value will enable the dialog with the default strings, and passing an object to this parameter allows enabling the dialog as well as
    * overriding one or more of the default strings.
    */
  var updateDialog: js.UndefOr[UpdateDialog] = js.native
}
object SyncOptions {
  
  @scala.inline
  def apply(): SyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncOptions]
  }
  
  @scala.inline
  implicit class SyncOptionsMutableBuilder[Self <: SyncOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentKey(value: String): Self = StObject.set(x, "deploymentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentKeyUndefined: Self = StObject.set(x, "deploymentKey", js.undefined)
    
    @scala.inline
    def setInstallMode(value: InstallMode): Self = StObject.set(x, "installMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallModeUndefined: Self = StObject.set(x, "installMode", js.undefined)
    
    @scala.inline
    def setMandatoryInstallMode(value: InstallMode): Self = StObject.set(x, "mandatoryInstallMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMandatoryInstallModeUndefined: Self = StObject.set(x, "mandatoryInstallMode", js.undefined)
    
    @scala.inline
    def setMinimumBackgroundDuration(value: Double): Self = StObject.set(x, "minimumBackgroundDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumBackgroundDurationUndefined: Self = StObject.set(x, "minimumBackgroundDuration", js.undefined)
    
    @scala.inline
    def setUpdateDialog(value: UpdateDialog): Self = StObject.set(x, "updateDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDialogUndefined: Self = StObject.set(x, "updateDialog", js.undefined)
  }
}
