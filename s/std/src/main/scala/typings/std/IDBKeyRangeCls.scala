package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IDBKeyRange")
@js.native
class IDBKeyRangeCls () extends IDBKeyRange {
  /**
    * Returns lower bound, or undefined if none.
    */
  /* CompleteClass */
  override val lower: js.Any = js.native
  /**
    * Returns true if the lower open flag is set, and false otherwise.
    */
  /* CompleteClass */
  override val lowerOpen: scala.Boolean = js.native
  /**
    * Returns upper bound, or undefined if none.
    */
  /* CompleteClass */
  override val upper: js.Any = js.native
  /**
    * Returns true if the upper open flag is set, and false otherwise.
    */
  /* CompleteClass */
  override val upperOpen: scala.Boolean = js.native
  /**
    * Returns true if key is included in the range, and false otherwise.
    */
  /* CompleteClass */
  override def includes(key: js.Any): scala.Boolean = js.native
}

