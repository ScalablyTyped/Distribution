package typings.reactSpringShared

import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useOnceMod {
  
  @JSImport("@react-spring/shared/dist/declarations/src/hooks/useOnce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useOnce(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnce")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
