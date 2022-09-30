package typings.storybookPreviewWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simulatePageloadMod {
  
  @JSImport("@storybook/preview-web/dist/ts3.9/simulate-pageload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def simulateDOMContentLoaded(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("simulateDOMContentLoaded")().asInstanceOf[Unit]
  
  inline def simulatePageLoad($container: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("simulatePageLoad")($container.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
