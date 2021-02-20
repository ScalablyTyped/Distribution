package typings.sinonChrome.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object app {
  
  @JSImport("sinon-chrome", "app")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "app.getDetails")
  @js.native
  def getDetails: SinonChromeStub = js.native
  
  @JSImport("sinon-chrome", "app.getDetailsForFrame")
  @js.native
  def getDetailsForFrame: SinonChromeStub = js.native
  @scala.inline
  def getDetailsForFrame_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDetailsForFrame")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def getDetails_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDetails")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "app.getIsInstalled")
  @js.native
  def getIsInstalled: SinonChromeStub = js.native
  @scala.inline
  def getIsInstalled_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getIsInstalled")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "app.installState")
  @js.native
  def installState: SinonChromeStub = js.native
  @scala.inline
  def installState_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("installState")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "app.runningState")
  @js.native
  def runningState: SinonChromeStub = js.native
  @scala.inline
  def runningState_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runningState")(x.asInstanceOf[js.Any])
}
