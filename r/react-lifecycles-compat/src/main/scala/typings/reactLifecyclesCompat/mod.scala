package typings.reactLifecyclesCompat

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-lifecycles-compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def polyfill[T /* <: ComponentType[Any] */](Comp: T): T & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]} */ js.Any) = ^.asInstanceOf[js.Dynamic].applyDynamic("polyfill")(Comp.asInstanceOf[js.Any]).asInstanceOf[T & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]} */ js.Any)]
}
