package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalUtilMapOneOrManyArgsMod {
  
  @JSImport("rxjs/dist/types/internal/util/mapOneOrManyArgs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapOneOrManyArgs[T, R](fn: js.Function1[/* repeated */ T, R]): OperatorFunction[T | js.Array[T], R] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapOneOrManyArgs")(fn.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T | js.Array[T], R]]
}
