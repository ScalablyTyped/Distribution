package typings.sodiumjs.sodiumjsMod

import typings.sodiumjs.distTypingsSodiumVertexMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "Cell")
@js.native
class Cell[A] protected ()
  extends typings.sodiumjs.distTypingsSodiumCellMod.Cell[A] {
  def this(initValue: A) = this()
  def this(initValue: A, str: typings.sodiumjs.distTypingsSodiumStreamMod.Stream[A]) = this()
}

/* static members */
@JSImport("sodiumjs", "Cell")
@js.native
object Cell extends js.Object {
  var _liftArray: js.Any = js.native
  /**
    * Apply a value inside a cell to a function inside a cell. This is the
    * primitive for all function lifting.
    */
  @JSName("apply")
  def apply[A, B](
    cf: typings.sodiumjs.distTypingsSodiumCellMod.Cell[js.Function1[/* a */ A, B]],
    ca: typings.sodiumjs.distTypingsSodiumCellMod.Cell[A]
  ): typings.sodiumjs.distTypingsSodiumCellMod.Cell[B] = js.native
  @JSName("apply")
  def apply[A, B](
    cf: typings.sodiumjs.distTypingsSodiumCellMod.Cell[js.Function1[/* a */ A, B]],
    ca: typings.sodiumjs.distTypingsSodiumCellMod.Cell[A],
    sources: js.Array[Source]
  ): typings.sodiumjs.distTypingsSodiumCellMod.Cell[B] = js.native
  /**
    * Fantasy-land Algebraic Data Type Compatability.
    * Cell satisfies the Functor, Apply, Applicative categories
    * @see {@link https://github.com/fantasyland/fantasy-land} for more info
    */
  @JSName("fantasy-land/of")
  def `fantasy-landSlashof`[A](a: A): typings.sodiumjs.distTypingsSodiumCellMod.Cell[A] = js.native
  /**
    * Lift an array of cells into a cell of an array.
    */
  def liftArray[A](ca: js.Array[typings.sodiumjs.distTypingsSodiumCellMod.Cell[A]]): typings.sodiumjs.distTypingsSodiumCellMod.Cell[js.Array[A]] = js.native
  /**
    * Unwrap a cell inside another cell to give a time-varying cell implementation.
    */
  def switchC[A](
    cca: typings.sodiumjs.distTypingsSodiumCellMod.Cell[typings.sodiumjs.distTypingsSodiumCellMod.Cell[A]]
  ): typings.sodiumjs.distTypingsSodiumCellMod.Cell[A] = js.native
  /**
    * Unwrap a stream inside a cell to give a time-varying stream implementation.
    */
  def switchS[A](
    csa: typings.sodiumjs.distTypingsSodiumCellMod.Cell[typings.sodiumjs.distTypingsSodiumStreamMod.Stream[A]]
  ): typings.sodiumjs.distTypingsSodiumStreamMod.Stream[A] = js.native
}

