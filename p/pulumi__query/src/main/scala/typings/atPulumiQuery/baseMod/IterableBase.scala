package typings.atPulumiQuery.baseMod

import typings.atPulumiQuery.interfacesMod.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/query/base", "IterableBase")
@js.native
abstract class IterableBase[T] protected () extends AsyncIterableIterator[T] {
  def this(core: AsyncIterableIterator[T]) = this()
  val core: js.Any = js.native
}

