package typings.samchon.templatesParallelMod

import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel", "ParallelSystem")
@js.native
abstract class ParallelSystem protected ()
  extends typings.samchon.templatesParallelParallelSystemMod.ParallelSystem {
  /**
    * Construct from parent {@link ParallelSystemArray}.
    *
    * @param systemArray The parent {@link ParallelSystemArray} object.
    */
  def this(systemArray: typings.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem]) = this()
  /**
    * Construct from parent {@link ParallelSystemArray} and communicator.
    *
    * @param systemArray The parent {@link ParallelSystemArray} object.
    * @param communicator A communicator communicates with remote, the external system.
    */
  def this(
    systemArray: typings.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem],
    communicator: IClientDriver
  ) = this()
}

