package typings.reactSpringShared

import typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useIsMountedMod {
  
  @JSImport("@react-spring/shared/dist/declarations/src/hooks/useIsMounted", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useIsMounted(): MutableRefObject[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsMounted")().asInstanceOf[MutableRefObject[Boolean]]
}
