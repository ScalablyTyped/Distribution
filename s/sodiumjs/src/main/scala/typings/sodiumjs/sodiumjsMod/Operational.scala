package typings.sodiumjs.sodiumjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "Operational")
@js.native
class Operational ()
  extends typings.sodiumjs.distTypingsSodiumOperationalMod.Operational

/* static members */
@JSImport("sodiumjs", "Operational")
@js.native
object Operational extends js.Object {
  /**
    * Push each event onto a new transaction guaranteed to come before the next externally
    * initiated transaction. Same as {@link split(Stream)} but it works on a single value.
    */
  def defer[A](s: typings.sodiumjs.distTypingsSodiumStreamMod.Stream[A]): typings.sodiumjs.distTypingsSodiumStreamMod.Stream[A] = js.native
  /**
    * Push each event in the list onto a newly created transaction guaranteed
    * to come before the next externally initiated transaction. Note that the semantics
    * are such that two different invocations of split() can put events into the same
    * new transaction, so the resulting stream's events could be simultaneous with
    * events output by split() or {@link defer(Stream)} invoked elsewhere in the code.
    */
  def split[A](s: typings.sodiumjs.distTypingsSodiumStreamMod.Stream[js.Array[A]]): typings.sodiumjs.distTypingsSodiumStreamMod.Stream[A] = js.native
  /**
    * A stream that gives the updates/steps for a {@link Cell}.
    * <P>
    * This is an OPERATIONAL primitive, which is not part of the main Sodium
    * API. It breaks the property of non-detectability of cell steps/updates.
    * The rule with this primitive is that you should only use it in functions
    * that do not allow the caller to detect the cell updates.
    */
  def updates[A](c: typings.sodiumjs.distTypingsSodiumCellMod.Cell[A]): typings.sodiumjs.distTypingsSodiumStreamMod.Stream[A] = js.native
  /**
    * A stream that is guaranteed to fire once in the transaction where value() is invoked, giving
    * the current value of the cell, and thereafter behaves like {@link updates(Cell)},
    * firing for each update/step of the cell's value.
    * <P>
    * This is an OPERATIONAL primitive, which is not part of the main Sodium
    * API. It breaks the property of non-detectability of cell steps/updates.
    * The rule with this primitive is that you should only use it in functions
    * that do not allow the caller to detect the cell updates.
    */
  def value[A](c: typings.sodiumjs.distTypingsSodiumCellMod.Cell[A]): typings.sodiumjs.distTypingsSodiumStreamMod.Stream[A] = js.native
}

