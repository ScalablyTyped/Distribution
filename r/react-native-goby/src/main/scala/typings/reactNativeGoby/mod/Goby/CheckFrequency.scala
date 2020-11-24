package typings.reactNativeGoby.mod.Goby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CheckFrequency extends js.Object
/**
  * Indicates when you would like to check for (and install) updates from the Goby server.
  */
@JSImport("react-native-goby", "Goby.CheckFrequency")
@js.native
object CheckFrequency extends js.Object {
  
  /**
    * Don't automatically check for updates, but only do it when goby.sync() is manully called inside app code.
    */
  @js.native
  sealed trait MANUAL extends CheckFrequency
  
  /**
    * When the app re-enters the foreground.
    */
  @js.native
  sealed trait ON_APP_RESUME extends CheckFrequency
  
  /**
    * When the app is fully initialized (or more specifically, when the root component is mounted).
    */
  @js.native
  sealed trait ON_APP_START extends CheckFrequency
}
