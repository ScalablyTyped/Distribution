package typings
package reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-google-signin", "GoogleSigninButton")
@js.native
object GoogleSigninButtonNs extends js.Object {
  @js.native
  sealed trait Color extends js.Object
  
  @js.native
  sealed trait Size extends js.Object
  
  @js.native
  object Color extends js.Object {
    @js.native
    sealed trait Dark
      extends reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButtonNs.Color
    
    @js.native
    sealed trait Light
      extends reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButtonNs.Color
    
    /* 1 */ val Dark: Dark with scala.Double = js.native
    /* 0 */ val Light: Light with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButtonNs.Color with scala.Double
      ] = js.native
  }
  
  @js.native
  object Size extends js.Object {
    @js.native
    sealed trait Icon
      extends reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButtonNs.Size
    
    @js.native
    sealed trait Standard
      extends reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButtonNs.Size
    
    @js.native
    sealed trait Wide
      extends reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButtonNs.Size
    
    /* 2 */ val Icon: Icon with scala.Double = js.native
    /* 0 */ val Standard: Standard with scala.Double = js.native
    /* 1 */ val Wide: Wide with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButtonNs.Size with scala.Double
      ] = js.native
  }
  
}

