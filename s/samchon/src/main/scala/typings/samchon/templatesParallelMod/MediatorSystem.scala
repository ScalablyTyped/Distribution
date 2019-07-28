package typings.samchon.templatesParallelMod

import typings.samchon.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel", "MediatorSystem")
@js.native
abstract class MediatorSystem protected ()
  extends typings.samchon.templatesParallelMediatorSystemMod.MediatorSystem {
  /**
    * Construct from parent {@link DistributedSystemArrayMediator} object.
    *
    * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
    */
  def this(systemArray: DistributedSystemArrayMediator[DistributedSystem]) = this()
  /**
    * Construct from parent {@link ParallelSystemArrayMediator} object.
    *
    * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
    */
  def this(systemArray: typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem]) = this()
}

