package typings.reactQrReader

import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.reactQrReader.reactQrReaderBooleans.`false`
import typings.reactQrReader.reactQrReaderStrings.environment
import typings.reactQrReader.reactQrReaderStrings.user
import typings.std.Event
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-qr-reader", JSImport.Namespace)
  @js.native
  class ^ () extends QrReader
  
  @js.native
  trait QrReader
    extends Component[typings.reactQrReader.mod.props, js.Object, js.Any] {
    
    def openImageDialog(): Unit = js.native
  }
  
  @js.native
  trait props extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var delay: js.UndefOr[Double | `false`] = js.native
    
    var facingMode: js.UndefOr[user | environment] = js.native
    
    var legacyMode: js.UndefOr[Boolean] = js.native
    
    def onError(err: js.Any): Unit = js.native
    
    var onImageLoad: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLImageElement, Event], Unit]] = js.native
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
    
    def onScan(): Unit = js.native
    def onScan(data: String): Unit = js.native
    
    var resolution: js.UndefOr[Double] = js.native
    
    var showViewFinder: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
  }
}
