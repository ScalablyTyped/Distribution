package typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableArrayNs

import org.scalablytyped.runtime.NumberDictionary
import typings.seamlessDashImmutable.seamlessDashImmutableMod.Immutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Merging this into Overrides breaks stuff, so this is split out */
trait ReadOnlyIndexer[T]
  extends /* key */ NumberDictionary[Immutable[T, js.Object]]

object ReadOnlyIndexer {
  @scala.inline
  def apply[T](NumberDictionary: /* key */ NumberDictionary[Immutable[T, js.Object]] = null): ReadOnlyIndexer[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ReadOnlyIndexer[T]]
  }
}

