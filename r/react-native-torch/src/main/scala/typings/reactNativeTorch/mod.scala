package typings.reactNativeTorch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-torch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * On android, we need to ask for permissions before being able to turn on/off
      * the torch
      *
      * @example
      *  if (Platform.OS === 'ios') {
      *    Torch.switchState(this.isTorchOn);
      *  } else {
      *    const cameraAllowed = await Torch.requestCameraPermission(
      *      'Camera Permissions', // dialog title
      *      'We require camera permissions to use the torch on the back of your phone.' // dialog body
      *    );
      *
      *    if (cameraAllowed) {
      *      Torch.switchState(this.isTorchOn);
      *    }
      *  }
      *
      * @param dialogTitle The title of the permissions dialog
      * @param dialogBody The body text of the permissions dialog
      */
    inline def requestCameraPermission(dialogTitle: String, dialogBody: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestCameraPermission")(dialogTitle.asInstanceOf[js.Any], dialogBody.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Used to turn on or off the torch. Pass `true` to turn on and `false` to
      * turn off
      *
      * @example
      *  Torch.switchState(true); // Turn ON
      *  Torch.switchState(false); // Turn OFF
      *
      * @param newState `true` for on or `false` for off
      */
    inline def switchState(newState: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("switchState")(newState.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
