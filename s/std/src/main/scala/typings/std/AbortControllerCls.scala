package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AbortController")
@js.native
class AbortControllerCls () extends AbortController {
  /**
    * Returns the AbortSignal object associated with this object.
    */
  /* CompleteClass */
  override val signal: AbortSignal = js.native
  /**
    * Invoking this method will set this object's AbortSignal's aborted flag and signal to any observers that the associated activity is to be aborted.
    */
  /* CompleteClass */
  override def abort(): Unit = js.native
}

