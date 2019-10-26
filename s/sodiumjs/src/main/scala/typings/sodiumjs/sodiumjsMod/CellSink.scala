package typings.sodiumjs.sodiumjsMod

import typings.sodiumjs.distTypingsSodiumLambdaMod.Lambda2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "CellSink")
@js.native
class CellSink[A] protected ()
  extends typings.sodiumjs.distTypingsSodiumCellSinkMod.CellSink[A] {
  /**
    * Construct a writable cell with the specified initial value. If multiple values are
    * sent in the same transaction, the specified function is used to combine them.
    *
    * If the function is not supplied, then an exception will be thrown in this case.
    */
  def this(initValue: A) = this()
  def this(initValue: A, f: js.Function2[/* l */ A, /* r */ A, A]) = this()
  def this(initValue: A, f: Lambda2[A, A, A]) = this()
}

