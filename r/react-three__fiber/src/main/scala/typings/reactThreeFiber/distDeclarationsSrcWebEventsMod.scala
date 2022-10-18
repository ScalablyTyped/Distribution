package typings.reactThreeFiber

import typings.reactThreeFiber.distDeclarationsSrcCoreEventsMod.EventManager
import typings.reactThreeFiber.distDeclarationsSrcCoreStoreMod.RootState
import typings.std.HTMLElement
import typings.zustand.reactMod.UseBoundStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcWebEventsMod {
  
  @JSImport("@react-three/fiber/dist/declarations/src/web/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPointerEvents(store: UseBoundStore[RootState]): EventManager[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPointerEvents")(store.asInstanceOf[js.Any]).asInstanceOf[EventManager[HTMLElement]]
}
