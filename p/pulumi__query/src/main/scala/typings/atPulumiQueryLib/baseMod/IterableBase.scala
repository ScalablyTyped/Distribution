package typings
package atPulumiQueryLib.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/query/base", "IterableBase")
@js.native
abstract class IterableBase[T] protected ()
  extends atPulumiQueryLib.interfacesMod.AsyncIterableIterator[T] {
  def this(core: atPulumiQueryLib.interfacesMod.AsyncIterableIterator[T]) = this()
  val core: js.Any = js.native
}

