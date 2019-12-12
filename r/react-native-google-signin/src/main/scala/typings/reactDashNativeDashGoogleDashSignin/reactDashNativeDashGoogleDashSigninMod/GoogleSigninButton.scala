package typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod

import org.scalablytyped.runtime.TopLevel
import typings.react.reactMod.Component
import typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButton.Color
import typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButton.Color.Dark
import typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButton.Color.Light
import typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButton.Size
import typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButton.Size.Icon
import typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButton.Size.Standard
import typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod.GoogleSigninButton.Size.Wide
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Color with Double] = js.native
    /* 1 */ @js.native
    object Dark extends TopLevel[Dark with Double]
    
    /* 0 */ @js.native
    object Light extends TopLevel[Light with Double]
    
  }
  
  @js.native
  object Size extends js.Object {
    @js.native
    sealed trait Icon extends Size
    
    @js.native
    sealed trait Standard extends Size
    
    @js.native
    sealed trait Wide extends Size
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Size with Double] = js.native
    /* 2 */ @js.native
    object Icon extends TopLevel[Icon with Double]
    
    /* 0 */ @js.native
    object Standard extends TopLevel[Standard with Double]
    
    /* 1 */ @js.native
    object Wide extends TopLevel[Wide with Double]
    
  }
  
}

