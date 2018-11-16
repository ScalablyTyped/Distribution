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
    
    val Dark: Dark with java.lang.String = js.native
    val Light: Light with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButtonNs.Color with java.lang.String
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
    
    val Icon: Icon with java.lang.String = js.native
    val Standard: Standard with java.lang.String = js.native
    val Wide: Wide with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButtonNs.Size with java.lang.String
      ] = js.native
  }
  
}

