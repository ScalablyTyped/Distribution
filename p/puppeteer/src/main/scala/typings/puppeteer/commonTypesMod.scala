package typings.puppeteer

import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonTypesMod {
  
  type Awaitable[T] = T | js.Thenable[T]
  
  type EvaluateFunc[T /* <: js.Array[Any] */] = js.Function1[/* params */ InnerParams[T], Awaitable[Any]]
  
  type FlattenHandle[T] = Any
  
  type FlattenLazyArg[T] = T
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteer.commonJshandleMod.JSHandle[T]
    - typings.puppeteer.commonElementHandleMod.ElementHandle[T]
  */
  trait HandleFor[T]
    extends StObject
       with _HandleOr[T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteer.commonTypesMod.HandleFor[T]
    - typings.puppeteer.commonJshandleMod.JSHandle[T]
    - T
  */
  type HandleOr[T] = _HandleOr[T] | T
  
  type InnerLazyParams[T /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: puppeteer.puppeteer/lib/esm/puppeteer/common/types.FlattenLazyArg<T[K]>}
    */ typings.puppeteer.puppeteerStrings.InnerLazyParams & TopLevel[T]
  
  type InnerParams[T /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: puppeteer.puppeteer/lib/esm/puppeteer/common/types.FlattenHandle<T[K]>}
    */ typings.puppeteer.puppeteerStrings.InnerParams & TopLevel[T]
  
  type NodeFor[Selector /* <: String */] = Element | (/* import warning: importer.ImportType#apply Failed type conversion: std.SVGElementTagNameMap[Selector] */ js.Any)
  
  trait _HandleOr[T] extends StObject
}
