package typings.reactRedux

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsBatchMod {
  
  @JSImport("react-redux/es/utils/batch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBatch(): js.Function1[/* callback */ js.Function0[Unit], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBatch")().asInstanceOf[js.Function1[/* callback */ js.Function0[Unit], Unit]]
  
  inline def setBatch(newBatch: js.Function1[/* callback */ js.Function0[Unit], Unit]): js.Function1[/* callback */ js.Function0[Unit], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBatch")(newBatch.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* callback */ js.Function0[Unit], Unit]]
}
