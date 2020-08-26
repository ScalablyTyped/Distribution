package typings.seamlessImmutable.mod.ImmutableArray

import org.scalablytyped.runtime.NumberDictionary
import typings.seamlessImmutable.mod.Immutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Merging this into Overrides breaks stuff, so this is split out */
@js.native
trait ReadOnlyIndexer[T]
  extends /* key */ NumberDictionary[Immutable[T, js.Object]]

object ReadOnlyIndexer {
  @scala.inline
  def apply[T](): ReadOnlyIndexer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOnlyIndexer[T]]
  }
}

