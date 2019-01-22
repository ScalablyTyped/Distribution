package typings
package samchonLib.templatesParallelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel", "MediatorSystem")
@js.native
abstract class MediatorSystem protected ()
  extends samchonLib.templatesParallelMediatorSystemMod.MediatorSystem {
  /**
    * Construct from parent {@link DistributedSystemArrayMediator} object.
    *
    * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
    */
  def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
  /**
    * Construct from parent {@link ParallelSystemArrayMediator} object.
    *
    * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
    */
  def this(systemArray: samchonLib.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[samchonLib.templatesParallelParallelSystemMod.ParallelSystem]) = this()
}

