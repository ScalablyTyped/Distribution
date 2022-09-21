package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core", "Touchscreen")
@js.native
open class Touchscreen () extends StObject {
  
  /* private */ var `private`: Any = js.native
  
  /* Excluded from this release type: __constructor */
  /**
    * Dispatches a `touchstart` and `touchend` event.
    * @param x - Horizontal position of the tap.
    * @param y - Vertical position of the tap.
    */
  def tap(x: Double, y: Double): js.Promise[Unit] = js.native
}
