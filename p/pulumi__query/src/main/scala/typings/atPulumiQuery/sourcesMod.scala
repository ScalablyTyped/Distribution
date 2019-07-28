package typings.atPulumiQuery

import typings.atPulumiQuery.interfacesMod.AsyncIterableIterator
import typings.atPulumiQuery.interfacesMod.AsyncQuerySource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/query/sources", JSImport.Namespace)
@js.native
object sourcesMod extends js.Object {
  def from[TSource](source: AsyncQuerySource[TSource]): AsyncIterableIterator[TSource] = js.native
  def range(start: Double): AsyncIterableIterator[Double] = js.native
  def range(start: Double, end: Double): AsyncIterableIterator[Double] = js.native
}

