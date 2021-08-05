package typings.pulumiQuery

import typings.pulumiQuery.interfacesMod.AsyncIterableIterator
import typings.pulumiQuery.interfacesMod.AsyncQuerySource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcesMod {
  
  @JSImport("@pulumi/query/sources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def from[TSource](source: AsyncQuerySource[TSource]): AsyncIterableIterator[TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterableIterator[TSource]]
  
  inline def range(start: Double): AsyncIterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any]).asInstanceOf[AsyncIterableIterator[Double]]
  inline def range(start: Double, end: Double): AsyncIterableIterator[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[Double]]
}
