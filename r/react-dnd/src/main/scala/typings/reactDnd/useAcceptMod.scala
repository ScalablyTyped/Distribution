package typings.reactDnd

import typings.dndCore.interfacesMod.Identifier
import typings.reactDnd.typesMod.DropTargetHookSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAcceptMod {
  
  @JSImport("react-dnd/dist/hooks/useDrop/useAccept", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAccept[O, R, P](spec: DropTargetHookSpec[O, R, P]): js.Array[Identifier] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAccept")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Array[Identifier]]
}
