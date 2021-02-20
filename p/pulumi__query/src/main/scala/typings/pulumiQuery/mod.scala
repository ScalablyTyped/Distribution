package typings.pulumiQuery

import typings.pulumiQuery.interfacesMod.AsyncIterableIterator
import typings.pulumiQuery.interfacesMod.AsyncQuerySource
import typings.pulumiQuery.interfacesMod.AsyncQueryable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pulumi/query", "empty")
  @js.native
  def empty[TResult](): AsyncIterableIterator[TResult] = js.native
  
  @JSImport("@pulumi/query", "from")
  @js.native
  def from[TSource](source: AsyncQuerySource[TSource]): AsyncQueryable[TSource] = js.native
  
  @JSImport("@pulumi/query", "range")
  @js.native
  def range(start: Double): AsyncQueryable[Double] = js.native
  @JSImport("@pulumi/query", "range")
  @js.native
  def range(start: Double, stop: Double): AsyncQueryable[Double] = js.native
  
  @JSImport("@pulumi/query", "repeat")
  @js.native
  def repeat[TSource](t: TSource): Unit = js.native
}
