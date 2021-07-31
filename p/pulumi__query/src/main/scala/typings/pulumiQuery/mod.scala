package typings.pulumiQuery

import typings.pulumiQuery.interfacesMod.AsyncIterableIterator
import typings.pulumiQuery.interfacesMod.AsyncQuerySource
import typings.pulumiQuery.interfacesMod.AsyncQueryable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pulumi/query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def empty[TResult](): AsyncIterableIterator[TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[AsyncIterableIterator[TResult]]
  
  @scala.inline
  def from[TSource](source: AsyncQuerySource[TSource]): AsyncQueryable[TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncQueryable[TSource]]
  
  @scala.inline
  def range(start: Double): AsyncQueryable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any]).asInstanceOf[AsyncQueryable[Double]]
  @scala.inline
  def range(start: Double, stop: Double): AsyncQueryable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[AsyncQueryable[Double]]
  
  @scala.inline
  def repeat[TSource](t: TSource): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
