package typings.rcTabs

import typings.rcTabs.interfaceMod.AnimatedConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAnimateConfigMod {
  
  @JSImport("rc-tabs/es/hooks/useAnimateConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): AnimatedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[AnimatedConfig]
  inline def default(animated: js.UndefOr[Boolean | AnimatedConfig]): AnimatedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(animated.asInstanceOf[js.Any]).asInstanceOf[AnimatedConfig]
}
