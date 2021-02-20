package typings.pulumiQuery

import typings.pulumiQuery.interfacesMod.AsyncIterableIterator
import typings.pulumiQuery.interfacesMod.AsyncQuerySource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcesMod {
  
  @JSImport("@pulumi/query/sources", "from")
  @js.native
  def from[TSource](source: AsyncQuerySource[TSource]): AsyncIterableIterator[TSource] = js.native
  
  @JSImport("@pulumi/query/sources", "range")
  @js.native
  def range(start: Double): AsyncIterableIterator[Double] = js.native
  @JSImport("@pulumi/query/sources", "range")
  @js.native
  def range(start: Double, end: Double): AsyncIterableIterator[Double] = js.native
}
