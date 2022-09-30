package typings.reactThreeFiber

import typings.reactThreeFiber.eventsMod.EventManager
import typings.reactThreeFiber.storeMod.RootState
import typings.std.HTMLElement
import typings.zustand.zustandReactMod.UseBoundStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeEventsMod {
  
  @JSImport("@react-three/fiber/dist/declarations/src/native/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTouchEvents(store: UseBoundStore[RootState]): EventManager[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTouchEvents")(store.asInstanceOf[js.Any]).asInstanceOf[EventManager[HTMLElement]]
}
