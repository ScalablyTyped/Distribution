package typings.reactNativeGoogleSignin

import typings.react.mod.Component
import typings.reactNative.mod.ViewProps
import typings.reactNativeGoogleSignin.anon.Email
import typings.reactNativeGoogleSignin.mod.GoogleSigninButton.Color
import typings.reactNativeGoogleSignin.mod.GoogleSigninButton.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object GoogleSignin {
    
    @JSImport("react-native-google-signin", "GoogleSignin")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Configures the library for login. MUST be called before attempting login
      */
    inline def configure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")().asInstanceOf[Unit]
    inline def configure(params: ConfigureParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Check if the device has Google Play Services installed. Always resolves
      * true on iOS
      */
    inline def hasPlayServices(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPlayServices")().asInstanceOf[js.Promise[Boolean]]
    inline def hasPlayServices(params: HasPlayServicesParams): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPlayServices")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Returns whether the user is currently signed in
      */
    inline def isSignedIn(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSignedIn")().asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Removes your application from the user's authorized applications
      */
    inline def revokeAccess(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeAccess")().asInstanceOf[js.Promise[Unit]]
    
    /**
      * Prompts the user to sign in with their Google account. Resolves with the
      * user if successful.
      */
    inline def signIn(): js.Promise[User] = ^.asInstanceOf[js.Dynamic].applyDynamic("signIn")().asInstanceOf[js.Promise[User]]
    
    /**
      * Returns a Promise that resolves with the current signed in user or rejects
      * if not signed in.
      */
    inline def signInSilently(): js.Promise[User] = ^.asInstanceOf[js.Dynamic].applyDynamic("signInSilently")().asInstanceOf[js.Promise[User]]
    
    /**
      * Signs the user out.
      */
    inline def signOut(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("signOut")().asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("react-native-google-signin", "GoogleSigninButton")
  @js.native
  open class GoogleSigninButton protected ()
    extends Component[GoogleSigninButtonProps, js.Object, Any] {
    def this(props: GoogleSigninButtonProps) = this()
  }
  object GoogleSigninButton {
    
    @js.native
    sealed trait Color extends StObject
    @JSImport("react-native-google-signin", "GoogleSigninButton.Color")
    @js.native
    object Color extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Color & Double] = js.native
      
      @js.native
      sealed trait Dark
        extends StObject
           with Color
      /* 1 */ val Dark: typings.reactNativeGoogleSignin.mod.GoogleSigninButton.Color.Dark & Double = js.native
      
      @js.native
      sealed trait Light
        extends StObject
           with Color
      /* 0 */ val Light: typings.reactNativeGoogleSignin.mod.GoogleSigninButton.Color.Light & Double = js.native
    }
    
    @js.native
    sealed trait Size extends StObject
    @JSImport("react-native-google-signin", "GoogleSigninButton.Size")
    @js.native
    object Size extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Size & Double] = js.native
      
      @js.native
      sealed trait Icon
        extends StObject
           with Size
      /* 2 */ val Icon: typings.reactNativeGoogleSignin.mod.GoogleSigninButton.Size.Icon & Double = js.native
      
      @js.native
      sealed trait Standard
        extends StObject
           with Size
      /* 0 */ val Standard: typings.reactNativeGoogleSignin.mod.GoogleSigninButton.Size.Standard & Double = js.native
      
      @js.native
      sealed trait Wide
        extends StObject
           with Size
      /* 1 */ val Wide: typings.reactNativeGoogleSignin.mod.GoogleSigninButton.Size.Wide & Double = js.native
    }
  }
  
  object statusCodes {
    
    @JSImport("react-native-google-signin", "statusCodes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-google-signin", "statusCodes.IN_PROGRESS")
    @js.native
    def IN_PROGRESS: String = js.native
    inline def IN_PROGRESS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IN_PROGRESS")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-google-signin", "statusCodes.PLAY_SERVICES_NOT_AVAILABLE")
    @js.native
    def PLAY_SERVICES_NOT_AVAILABLE: String = js.native
    inline def PLAY_SERVICES_NOT_AVAILABLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLAY_SERVICES_NOT_AVAILABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-google-signin", "statusCodes.SIGN_IN_CANCELLED")
    @js.native
    def SIGN_IN_CANCELLED: String = js.native
    inline def SIGN_IN_CANCELLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGN_IN_CANCELLED")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-google-signin", "statusCodes.SIGN_IN_REQUIRED")
    @js.native
    def SIGN_IN_REQUIRED: String = js.native
    inline def SIGN_IN_REQUIRED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGN_IN_REQUIRED")(x.asInstanceOf[js.Any])
  }
  
  trait ConfigureParams extends StObject {
    
    /**
      * ANDROID ONLY. An account name that should be prioritized.
      */
    var accountName: js.UndefOr[String] = js.undefined
    
    /**
      * ANDROID ONLY. Specifies if the consent prompt should be shown at each login.
      */
    var forceConsentPrompt: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies a hosted domain restriction
      */
    var hostedDomain: js.UndefOr[String] = js.undefined
    
    /**
      * If you want to specify the client ID of type iOS
      */
    var iosClientId: js.UndefOr[String] = js.undefined
    
    /**
      * Must be true if you wish to access user APIs on behalf of the user from
      * your own server
      */
    var offlineAccess: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The Google API scopes to request access to. Default is email and profile.
      */
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Web client ID from Developer Console. Required for offline access
      */
    var webClientId: js.UndefOr[String] = js.undefined
  }
  object ConfigureParams {
    
    inline def apply(): ConfigureParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigureParams]
    }
    
    extension [Self <: ConfigureParams](x: Self) {
      
      inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
      
      inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
      
      inline def setForceConsentPrompt(value: Boolean): Self = StObject.set(x, "forceConsentPrompt", value.asInstanceOf[js.Any])
      
      inline def setForceConsentPromptUndefined: Self = StObject.set(x, "forceConsentPrompt", js.undefined)
      
      inline def setHostedDomain(value: String): Self = StObject.set(x, "hostedDomain", value.asInstanceOf[js.Any])
      
      inline def setHostedDomainUndefined: Self = StObject.set(x, "hostedDomain", js.undefined)
      
      inline def setIosClientId(value: String): Self = StObject.set(x, "iosClientId", value.asInstanceOf[js.Any])
      
      inline def setIosClientIdUndefined: Self = StObject.set(x, "iosClientId", js.undefined)
      
      inline def setOfflineAccess(value: Boolean): Self = StObject.set(x, "offlineAccess", value.asInstanceOf[js.Any])
      
      inline def setOfflineAccessUndefined: Self = StObject.set(x, "offlineAccess", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setWebClientId(value: String): Self = StObject.set(x, "webClientId", value.asInstanceOf[js.Any])
      
      inline def setWebClientIdUndefined: Self = StObject.set(x, "webClientId", js.undefined)
    }
  }
  
  trait GoogleSigninButtonProps
    extends StObject
       with ViewProps {
    
    var color: js.UndefOr[Color] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
  }
  object GoogleSigninButtonProps {
    
    inline def apply(): GoogleSigninButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoogleSigninButtonProps]
    }
    
    extension [Self <: GoogleSigninButtonProps](x: Self) {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait HasPlayServicesParams extends StObject {
    
    /**
      * When showPlayServicesUpdateDialog is true, the user will be prompted to
      * install Play Services if on Android and they are not installed.
      * Default is true
      */
    var showPlayServicesUpdateDialog: js.UndefOr[Boolean] = js.undefined
  }
  object HasPlayServicesParams {
    
    inline def apply(): HasPlayServicesParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HasPlayServicesParams]
    }
    
    extension [Self <: HasPlayServicesParams](x: Self) {
      
      inline def setShowPlayServicesUpdateDialog(value: Boolean): Self = StObject.set(x, "showPlayServicesUpdateDialog", value.asInstanceOf[js.Any])
      
      inline def setShowPlayServicesUpdateDialogUndefined: Self = StObject.set(x, "showPlayServicesUpdateDialog", js.undefined)
    }
  }
  
  trait User extends StObject {
    
    var accessToken: String | Null
    
    /**
      * Deprecated
      */
    var accessTokenExpirationDate: Double | Null
    
    var idToken: String | Null
    
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Not null only if a valid webClientId and offlineAccess: true was
      * specified in configure().
      */
    var serverAuthCode: String | Null
    
    var user: Email
  }
  object User {
    
    inline def apply(user: Email): User = {
      val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any], accessToken = null, accessTokenExpirationDate = null, idToken = null, serverAuthCode = null)
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenExpirationDate(value: Double): Self = StObject.set(x, "accessTokenExpirationDate", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenExpirationDateNull: Self = StObject.set(x, "accessTokenExpirationDate", null)
      
      inline def setAccessTokenNull: Self = StObject.set(x, "accessToken", null)
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setServerAuthCode(value: String): Self = StObject.set(x, "serverAuthCode", value.asInstanceOf[js.Any])
      
      inline def setServerAuthCodeNull: Self = StObject.set(x, "serverAuthCode", null)
      
      inline def setUser(value: Email): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
