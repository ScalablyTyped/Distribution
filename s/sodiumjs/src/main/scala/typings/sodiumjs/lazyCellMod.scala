package typings.sodiumjs

import typings.sodiumjs.cellMod.Cell
import typings.sodiumjs.lazyMod.Lazy
import typings.sodiumjs.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazyCellMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/LazyCell", "LazyCell")
  @js.native
  open class LazyCell[A] protected () extends Cell[A] {
    def this(lazyInitValue: Lazy[A]) = this()
    def this(lazyInitValue: Lazy[A], str: Stream[A]) = this()
  }
}
