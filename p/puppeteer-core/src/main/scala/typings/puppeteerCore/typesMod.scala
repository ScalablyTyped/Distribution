package typings.puppeteerCore

import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Awaitable[T] = T | PromiseLike[T]
  
  type EvaluateFunc[T /* <: js.Array[Any] */] = js.Function1[/* params */ InnerParams[T], Awaitable[Any]]
  
  type FlattenHandle[T] = Any
  
  type FlattenLazyArg[T] = T
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.jshandleMod.JSHandle[T]
    - typings.puppeteerCore.elementHandleMod.ElementHandle[T]
  */
  trait HandleFor[T]
    extends StObject
       with _HandleOr[T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.typesMod.HandleFor[T]
    - typings.puppeteerCore.jshandleMod.JSHandle[T]
    - T
  */
  type HandleOr[T] = _HandleOr[T] | T
  
  type InnerLazyParams[T /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: puppeteer-core.puppeteer-core/lib/cjs/puppeteer/common/types.FlattenLazyArg<T[K]>}
    */ typings.puppeteerCore.puppeteerCoreStrings.InnerLazyParams & TopLevel[T]
  
  type InnerParams[T /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: puppeteer-core.puppeteer-core/lib/cjs/puppeteer/common/types.FlattenHandle<T[K]>}
    */ typings.puppeteerCore.puppeteerCoreStrings.InnerParams & TopLevel[T]
  
  type NodeFor[Selector /* <: String */] = Element | (/* import warning: importer.ImportType#apply Failed type conversion: std.SVGElementTagNameMap[Selector] */ js.Any)
  
  trait _HandleOr[T] extends StObject
}
