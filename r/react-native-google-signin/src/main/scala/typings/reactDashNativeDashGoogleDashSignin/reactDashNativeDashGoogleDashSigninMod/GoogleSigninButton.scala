package typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod

import typings.react.reactMod.Component
import typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButton.Color
import typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButton.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-google-signin", "GoogleSigninButton")
@js.native
class GoogleSigninButton protected ()
  extends Component[GoogleSigninButtonProps, js.Object, js.Any] {
  def this(props: GoogleSigninButtonProps) = this()
}

@JSImport("react-native-google-signin", "GoogleSigninButton")
@js.native
object GoogleSigninButton extends js.Object {
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
    
    /* 1 */ val Dark: typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButton.Color.Dark with Double = js.native
    /* 0 */ val Light: typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButton.Color.Light with Double = js.native
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
    
    /* 2 */ val Icon: typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButton.Size.Icon with Double = js.native
    /* 0 */ val Standard: typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButton.Size.Standard with Double = js.native
    /* 1 */ val Wide: typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButton.Size.Wide with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Size with Double] = js.native
  }
  
}

