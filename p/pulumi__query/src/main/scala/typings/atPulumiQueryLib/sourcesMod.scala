package typings
package atPulumiQueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/query/sources", JSImport.Namespace)
@js.native
object sourcesMod extends js.Object {
  def from[TSource](source: atPulumiQueryLib.interfacesMod.AsyncQuerySource[TSource]): atPulumiQueryLib.interfacesMod.AsyncIterableIterator[TSource] = js.native
  def range(start: scala.Double): atPulumiQueryLib.interfacesMod.AsyncIterableIterator[scala.Double] = js.native
  def range(start: scala.Double, end: scala.Double): atPulumiQueryLib.interfacesMod.AsyncIterableIterator[scala.Double] = js.native
}

