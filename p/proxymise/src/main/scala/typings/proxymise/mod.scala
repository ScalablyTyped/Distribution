package typings.proxymise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](target: T): Proxymise[T] = ^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any]).asInstanceOf[Proxymise[T]]
  
  @JSImport("proxymise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Proxymise[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: T[key] extends (args : infer Params): std.Promise<infer Return>? (args : Params): proxymise.proxymise.Proxymise<Return> : T[key]} */ js.Any) & js.Promise[T]
}
