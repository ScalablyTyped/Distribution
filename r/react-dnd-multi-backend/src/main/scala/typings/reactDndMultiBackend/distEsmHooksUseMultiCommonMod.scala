package typings.reactDndMultiBackend

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmHooksUseMultiCommonMod {
  
  @JSImport("react-dnd-multi-backend/dist/esm/hooks/useMultiCommon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMultiCommon[Spec, Res](spec: Spec, fn: Fn[Spec, Res]): js.Tuple2[Res, Record[String, Res]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMultiCommon")(spec.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Res, Record[String, Res]]]
  
  type Fn[Spec, Res] = js.Function1[/* spec */ Spec, Res]
}
