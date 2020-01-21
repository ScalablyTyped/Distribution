package typings.sodiumjs.mod

import typings.sodiumjs.vertexMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "Cell")
@js.native
class Cell[A] protected ()
  extends typings.sodiumjs.cellMod.Cell[A] {
  def this(initValue: A) = this()
  def this(initValue: A, str: typings.sodiumjs.streamMod.Stream[A]) = this()
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
    cf: typings.sodiumjs.cellMod.Cell[js.Function1[/* a */ A, B]],
    ca: typings.sodiumjs.cellMod.Cell[A]
  ): typings.sodiumjs.cellMod.Cell[B] = js.native
  @JSName("apply")
  def apply[A, B](
    cf: typings.sodiumjs.cellMod.Cell[js.Function1[/* a */ A, B]],
    ca: typings.sodiumjs.cellMod.Cell[A],
    sources: js.Array[Source]
  ): typings.sodiumjs.cellMod.Cell[B] = js.native
  /**
    * Fantasy-land Algebraic Data Type Compatability.
    * Cell satisfies the Functor, Apply, Applicative categories
    * @see {@link https://github.com/fantasyland/fantasy-land} for more info
    */
  @JSName("fantasy-land/of")
  def `fantasy-landSlashof`[A](a: A): typings.sodiumjs.cellMod.Cell[A] = js.native
  /**
    * Lift an array of cells into a cell of an array.
    */
  def liftArray[A](ca: js.Array[typings.sodiumjs.cellMod.Cell[A]]): typings.sodiumjs.cellMod.Cell[js.Array[A]] = js.native
  /**
    * Unwrap a cell inside another cell to give a time-varying cell implementation.
    */
  def switchC[A](cca: typings.sodiumjs.cellMod.Cell[typings.sodiumjs.cellMod.Cell[A]]): typings.sodiumjs.cellMod.Cell[A] = js.native
  /**
    * Unwrap a stream inside a cell to give a time-varying stream implementation.
    */
  def switchS[A](csa: typings.sodiumjs.cellMod.Cell[typings.sodiumjs.streamMod.Stream[A]]): typings.sodiumjs.streamMod.Stream[A] = js.native
}

