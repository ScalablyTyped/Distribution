package typings.reactNativeFirebaseApp

import typings.reactNativeFirebaseApp.ReactNativeFirebase.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object ReactNativeFirebase extends js.Object {
    @js.native
    class FirebaseModule ()
      extends typings.reactNativeFirebaseApp.ReactNativeFirebase.FirebaseModule {
      /**
        * The current `FirebaseApp` instance for this Firebase service.
        */
      /* CompleteClass */
      override var app: FirebaseApp = js.native
      /**
        * Returns the shared event emitter instance used for all JS event routing.
        */
      /* CompleteClass */
      override var emitter: js.Any = js.native
      /**
        * The native module instance for this Firebase service.
        */
      /* CompleteClass */
      override var native: js.Any = js.native
    }
    
  }
  
  @js.native
  object Utils extends js.Object {
    @js.native
    class Module ()
      extends typings.reactNativeFirebaseApp.Utils.Module {
      /**
        * The current `FirebaseApp` instance for this Firebase service.
        */
      /* CompleteClass */
      override var app: FirebaseApp = js.native
      /**
        * Returns the shared event emitter instance used for all JS event routing.
        */
      /* CompleteClass */
      override var emitter: js.Any = js.native
      /**
        * Returns true if this app is running inside a Firebase Test Lab environment. Always returns false on iOS.
        *
        * @android
        */
      /* CompleteClass */
      override var isRunningInTestLab: Boolean = js.native
      /**
        * The native module instance for this Firebase service.
        */
      /* CompleteClass */
      override var native: js.Any = js.native
    }
    
  }
  
}

