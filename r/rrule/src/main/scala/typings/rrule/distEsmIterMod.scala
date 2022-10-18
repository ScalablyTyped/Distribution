package typings.rrule

import typings.rrule.distEsmIterresultMod.default
import typings.rrule.distEsmTypesMod.IterResultType
import typings.rrule.distEsmTypesMod.ParsedOptions
import typings.rrule.distEsmTypesMod.QueryMethodTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmIterMod {
  
  @JSImport("rrule/dist/esm/iter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iter[M /* <: QueryMethodTypes */](iterResult: default[M], options: ParsedOptions): IterResultType[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("iter")(iterResult.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IterResultType[M]]
}
