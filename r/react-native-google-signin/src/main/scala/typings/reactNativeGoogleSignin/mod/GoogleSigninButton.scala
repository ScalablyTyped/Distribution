package typings.reactNativeGoogleSignin.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  object Color extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Color with Double] = js.native
    
    @js.native
    sealed trait Dark extends Color
    /* 1 */ @js.native
    object Dark extends TopLevel[Dark with Double]
    
    @js.native
    sealed trait Light extends Color
    /* 0 */ @js.native
    object Light extends TopLevel[Light with Double]
  }
  
  @js.native
  sealed trait Size extends js.Object
  @js.native
  object Size extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Size with Double] = js.native
    
    @js.native
    sealed trait Icon extends Size
    /* 2 */ @js.native
    object Icon extends TopLevel[Icon with Double]
    
    @js.native
    sealed trait Standard extends Size
    /* 0 */ @js.native
    object Standard extends TopLevel[Standard with Double]
    
    @js.native
    sealed trait Wide extends Size
    /* 1 */ @js.native
    object Wide extends TopLevel[Wide with Double]
  }
}
