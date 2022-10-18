package typings.sodiumjs

import typings.sodiumjs.distTypingsSodiumCellMod.Cell
import typings.sodiumjs.distTypingsSodiumLazyMod.Lazy
import typings.sodiumjs.distTypingsSodiumStreamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsSodiumLazyCellMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/LazyCell", "LazyCell")
  @js.native
  open class LazyCell[A] protected () extends Cell[A] {
    def this(lazyInitValue: Lazy[A]) = this()
    def this(lazyInitValue: Lazy[A], str: Stream[A]) = this()
  }
}
