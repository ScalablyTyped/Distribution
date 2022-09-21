package typings.qrcodejs

import typings.qrcodejs.qrcodejsNumbers.`0`
import typings.qrcodejs.qrcodejsNumbers.`1`
import typings.qrcodejs.qrcodejsNumbers.`2`
import typings.qrcodejs.qrcodejsNumbers.`3`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object QRCode {
    
    @JSGlobal("QRCode")
    @js.native
    open class ^ protected ()
      extends typings.qrcodejs.mod.^ {
      def this(el: String, vOption: typings.qrcodejs.qrcodejsMod.vOption) = this()
      /**
        * @param el target element or 'id' attribute of element.
        * @param vOption
        */
      def this(el: HTMLElement, vOption: typings.qrcodejs.qrcodejsMod.vOption) = this()
    }
    
    object CorrectLevel {
      
      @JSGlobal("QRCode.CorrectLevel")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("QRCode.CorrectLevel.H")
      @js.native
      def H: `2` = js.native
      inline def H_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("H")(x.asInstanceOf[js.Any])
      
      @JSGlobal("QRCode.CorrectLevel.L")
      @js.native
      def L: `1` = js.native
      inline def L_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("L")(x.asInstanceOf[js.Any])
      
      @JSGlobal("QRCode.CorrectLevel.M")
      @js.native
      def M: `0` = js.native
      inline def M_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("M")(x.asInstanceOf[js.Any])
      
      @JSGlobal("QRCode.CorrectLevel.Q")
      @js.native
      def Q: `3` = js.native
      inline def Q_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Q")(x.asInstanceOf[js.Any])
    }
  }
}
