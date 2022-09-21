package typings.resolveValue

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](boolean: T): js.Promise[DeepResolved[T]] = ^.asInstanceOf[js.Dynamic].apply(boolean.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeepResolved[T]]]
  
  @JSImport("resolve-value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DeepResolved[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: any}
    */ typings.resolveValue.resolveValueStrings.DeepResolved & TopLevel[Any])
}
