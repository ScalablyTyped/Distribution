package typings.protractor

import typings.protractor.configMod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object launcherMod {
  
  @JSImport("protractor/built/launcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("protractor/built/launcher", "init")
  @js.native
  def init: js.Function2[/* configFile */ String, /* additionalConfig */ Config, Unit] = js.native
  @scala.inline
  def init_=(x: js.Function2[/* configFile */ String, /* additionalConfig */ Config, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("init")(x.asInstanceOf[js.Any])
}
