package typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod

import typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButtonNs.Color
import typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButtonNs.Size
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
    sealed trait Dark extends Color
    
    @js.native
    sealed trait Light extends Color
    
    /* 1 */ val Dark: typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButtonNs.Color.Dark with Double = js.native
    /* 0 */ val Light: typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButtonNs.Color.Light with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Color with Double] = js.native
  }
  
  @js.native
  object Size extends js.Object {
    @js.native
    sealed trait Icon extends Size
    
    @js.native
    sealed trait Standard extends Size
    
    @js.native
    sealed trait Wide extends Size
    
    /* 2 */ val Icon: typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButtonNs.Size.Icon with Double = js.native
    /* 0 */ val Standard: typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButtonNs.Size.Standard with Double = js.native
    /* 1 */ val Wide: typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButtonNs.Size.Wide with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Size with Double] = js.native
  }
  
}

