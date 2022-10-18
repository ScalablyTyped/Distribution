package typings.reactDnd

import typings.dndCore.distInterfacesMod.Identifier
import typings.reactDnd.distHooksTypesMod.DropTargetHookSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseDropUseAcceptMod {
  
  @JSImport("react-dnd/dist/hooks/useDrop/useAccept", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAccept[O, R, P](spec: DropTargetHookSpec[O, R, P]): js.Array[Identifier] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAccept")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Array[Identifier]]
}
