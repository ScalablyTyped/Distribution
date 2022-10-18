package typings.reactSpringCore

import typings.reactSpringCore.distDeclarationsSrcSpringRefMod.SpringRef
import typings.reactSpringTypes.utilMod.Lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcHooksUseChainMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/hooks/useChain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useChain(refs: js.Array[SpringRef[Lookup[Any]]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useChain")(refs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useChain(refs: js.Array[SpringRef[Lookup[Any]]], timeSteps: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useChain")(refs.asInstanceOf[js.Any], timeSteps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useChain(refs: js.Array[SpringRef[Lookup[Any]]], timeSteps: js.Array[Double], timeFrame: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useChain")(refs.asInstanceOf[js.Any], timeSteps.asInstanceOf[js.Any], timeFrame.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useChain(refs: js.Array[SpringRef[Lookup[Any]]], timeSteps: Unit, timeFrame: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useChain")(refs.asInstanceOf[js.Any], timeSteps.asInstanceOf[js.Any], timeFrame.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
