package typings.sinonChrome.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object power {
  
  @JSImport("sinon-chrome", "power")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "power.releaseKeepAwake")
  @js.native
  def releaseKeepAwake: SinonChromeStub = js.native
  @scala.inline
  def releaseKeepAwake_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("releaseKeepAwake")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "power.requestKeepAwake")
  @js.native
  def requestKeepAwake: SinonChromeStub = js.native
  @scala.inline
  def requestKeepAwake_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestKeepAwake")(x.asInstanceOf[js.Any])
}
