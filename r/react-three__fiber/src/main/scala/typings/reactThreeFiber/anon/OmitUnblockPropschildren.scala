package typings.reactThreeFiber.anon

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import typings.reactThreeFiber.distDeclarationsSrcCoreUtilsMod.SetBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.UnblockProps, 'children'> */
trait OmitUnblockPropschildren extends StObject {
  
  var set: Dispatch[SetStateAction[SetBlock]]
}
object OmitUnblockPropschildren {
  
  inline def apply(set: SetStateAction[SetBlock] => Unit): OmitUnblockPropschildren = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[OmitUnblockPropschildren]
  }
  
  extension [Self <: OmitUnblockPropschildren](x: Self) {
    
    inline def setSet(value: SetStateAction[SetBlock] => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
