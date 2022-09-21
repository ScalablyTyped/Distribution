package typings.reactDaumPostcode

import typings.react.mod.global.JSX.Element
import typings.reactDaumPostcode.loadPostcodeMod.PostcodeConstructor
import typings.reactDaumPostcode.useDaumPostcodePopupMod.DaumPostcodePopupParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-daum-postcode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-daum-postcode", JSImport.Default)
  @js.native
  open class default ()
    extends typings.reactDaumPostcode.daumPostcodeEmbedMod.default
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-daum-postcode", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-daum-postcode", "default.defaultProps.autoClose")
      @js.native
      def autoClose: Boolean = js.native
      inline def autoClose_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(x.asInstanceOf[js.Any])
      
      @JSImport("react-daum-postcode", "default.defaultProps.errorMessage")
      @js.native
      def errorMessage: Element = js.native
      inline def errorMessage_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(x.asInstanceOf[js.Any])
      
      @JSImport("react-daum-postcode", "default.defaultProps.scriptUrl")
      @js.native
      def scriptUrl: String = js.native
      inline def scriptUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scriptUrl")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("react-daum-postcode", "DaumPostcodeEmbed")
  @js.native
  open class DaumPostcodeEmbed ()
    extends typings.reactDaumPostcode.daumPostcodeEmbedMod.default
  object DaumPostcodeEmbed {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-daum-postcode", "DaumPostcodeEmbed.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-daum-postcode", "DaumPostcodeEmbed.defaultProps.autoClose")
      @js.native
      def autoClose: Boolean = js.native
      inline def autoClose_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(x.asInstanceOf[js.Any])
      
      @JSImport("react-daum-postcode", "DaumPostcodeEmbed.defaultProps.errorMessage")
      @js.native
      def errorMessage: Element = js.native
      inline def errorMessage_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(x.asInstanceOf[js.Any])
      
      @JSImport("react-daum-postcode", "DaumPostcodeEmbed.defaultProps.scriptUrl")
      @js.native
      def scriptUrl: String = js.native
      inline def scriptUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scriptUrl")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def loadPostcode(): js.Promise[PostcodeConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPostcode")().asInstanceOf[js.Promise[PostcodeConstructor]]
  inline def loadPostcode(url: String): js.Promise[PostcodeConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPostcode")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PostcodeConstructor]]
  
  inline def useDaumPostcodePopup(): js.Function1[/* options */ js.UndefOr[DaumPostcodePopupParams], js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDaumPostcodePopup")().asInstanceOf[js.Function1[/* options */ js.UndefOr[DaumPostcodePopupParams], js.Promise[Unit]]]
  inline def useDaumPostcodePopup(scriptUrl: String): js.Function1[/* options */ js.UndefOr[DaumPostcodePopupParams], js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDaumPostcodePopup")(scriptUrl.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ js.UndefOr[DaumPostcodePopupParams], js.Promise[Unit]]]
}
