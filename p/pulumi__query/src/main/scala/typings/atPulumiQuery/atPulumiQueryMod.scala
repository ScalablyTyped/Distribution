package typings.atPulumiQuery

import typings.atPulumiQuery.interfacesMod.AsyncIterableIterator
import typings.atPulumiQuery.interfacesMod.AsyncQuerySource
import typings.atPulumiQuery.interfacesMod.AsyncQueryable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/query", JSImport.Namespace)
@js.native
object atPulumiQueryMod extends js.Object {
  def empty[TResult](): AsyncIterableIterator[TResult] = js.native
  def from[TSource](source: AsyncQuerySource[TSource]): AsyncQueryable[TSource] = js.native
  def range(start: Double): AsyncQueryable[Double] = js.native
  def range(start: Double, stop: Double): AsyncQueryable[Double] = js.native
  def repeat[TSource](t: TSource): Unit = js.native
}

