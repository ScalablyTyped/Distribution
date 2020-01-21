package typings.redlock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inherit all the EventEmitter methods, like `on`, and `off`.
  */
@JSImport("redlock", JSImport.Namespace)
@js.native
class ^ protected () extends Redlock {
  /**
    * A redlock object is instantiated with an array of at least one redis client and an optional
    * `options` object. Properties of the Redlock object should NOT be changed after it is first
    * used, as doing so could have unintended consequences for live locks.
    *
    * @param clients - you should have one client for each independent redis node
    * @param options - optionally customize settings (advanced use only)
    */
  def this(clients: js.Array[CompatibleRedisClient]) = this()
  def this(clients: js.Array[CompatibleRedisClient], options: Options) = this()
}

