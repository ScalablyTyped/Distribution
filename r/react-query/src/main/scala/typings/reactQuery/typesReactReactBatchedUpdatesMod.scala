package typings.reactQuery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReactReactBatchedUpdatesMod {
  
  @JSImport("react-query/types/react/reactBatchedUpdates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unstableBatchedUpdates[R](callback: js.Function0[R]): R = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any]).asInstanceOf[R]
  inline def unstableBatchedUpdates[A, R](callback: js.Function1[/* a */ A, R], a: A): R = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[R]
}
