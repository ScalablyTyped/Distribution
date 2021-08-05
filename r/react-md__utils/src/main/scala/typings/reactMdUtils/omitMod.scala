package typings.reactMdUtils

import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object omitMod {
  
  @JSImport("@react-md/utils/types/omit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def omit[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: T, omitKeys: js.Array[K | String]): Omit[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(`object`.asInstanceOf[js.Any], omitKeys.asInstanceOf[js.Any])).asInstanceOf[Omit[T, K]]
}
