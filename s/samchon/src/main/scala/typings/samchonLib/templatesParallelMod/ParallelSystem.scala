package typings
package samchonLib.templatesParallelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel", "ParallelSystem")
@js.native
abstract class ParallelSystem protected ()
  extends samchonLib.templatesParallelParallelSystemMod.ParallelSystem {
  /**
    * Construct from parent {@link ParallelSystemArray}.
    *
    * @param systemArray The parent {@link ParallelSystemArray} object.
    */
  def this(systemArray: samchonLib.templatesParallelParallelSystemArrayMod.ParallelSystemArray[samchonLib.templatesParallelParallelSystemMod.ParallelSystem]) = this()
  /**
    * Construct from parent {@link ParallelSystemArray} and communicator.
    *
    * @param systemArray The parent {@link ParallelSystemArray} object.
    * @param communicator A communicator communicates with remote, the external system.
    */
  def this(systemArray: samchonLib.templatesParallelParallelSystemArrayMod.ParallelSystemArray[samchonLib.templatesParallelParallelSystemMod.ParallelSystem], communicator: samchonLib.protocolCommunicatorIClientDriverMod.IClientDriver) = this()
}

