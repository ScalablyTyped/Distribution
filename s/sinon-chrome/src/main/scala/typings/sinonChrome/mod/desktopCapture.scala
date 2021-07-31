package typings.sinonChrome.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object desktopCapture {
  
  @JSImport("sinon-chrome", "desktopCapture")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "desktopCapture.cancelChooseDesktopMedia")
  @js.native
  def cancelChooseDesktopMedia: SinonChromeStub = js.native
  @scala.inline
  def cancelChooseDesktopMedia_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancelChooseDesktopMedia")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "desktopCapture.chooseDesktopMedia")
  @js.native
  def chooseDesktopMedia: SinonChromeStub = js.native
  @scala.inline
  def chooseDesktopMedia_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chooseDesktopMedia")(x.asInstanceOf[js.Any])
}
