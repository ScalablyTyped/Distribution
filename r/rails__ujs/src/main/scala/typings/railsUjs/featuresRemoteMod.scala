package typings.railsUjs

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featuresRemoteMod {
  
  @JSImport("@rails/ujs/features/remote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formSubmitButtonClick(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("formSubmitButtonClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def handleRemote(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRemote")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def preventInsignificantClick(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventInsignificantClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
