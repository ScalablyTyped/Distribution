package typings
package samchonLib.templatesDistributedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/distributed", "DistributedServer")
@js.native
abstract class DistributedServer protected ()
  extends samchonLib.templatesDistributedDerivedDistributedServerMod.DistributedServer {
  /**
    * Construct from parent {@link DistributedSystemArray}.
    *
    * @param systemArray The parent {@link DistributedSystemArray} object.
    */
  def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
}

