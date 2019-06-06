package typings
package atPulumiQueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/query", JSImport.Namespace)
@js.native
object atPulumiQueryMod extends js.Object {
  def empty[TResult](): atPulumiQueryLib.interfacesMod.AsyncIterableIterator[TResult] = js.native
  def from[TSource](source: atPulumiQueryLib.interfacesMod.AsyncQuerySource[TSource]): atPulumiQueryLib.interfacesMod.AsyncQueryable[TSource] = js.native
  def range(start: scala.Double): atPulumiQueryLib.interfacesMod.AsyncQueryable[scala.Double] = js.native
  def range(start: scala.Double, stop: scala.Double): atPulumiQueryLib.interfacesMod.AsyncQueryable[scala.Double] = js.native
  def repeat[TSource](t: TSource): scala.Unit = js.native
}

