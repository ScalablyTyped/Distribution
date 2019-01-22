package typings
package samchonLib.templatesParallelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel", "ParallelServer")
@js.native
abstract class ParallelServer protected ()
  extends samchonLib.templatesParallelDerivedParallelServerMod.ParallelServer {
  /**
    * Construct from parent {@link ParallelSystemArray}.
    *
    * @param systemArray The parent {@link ParallelSystemArray} object.
    */
  def this(systemArray: samchonLib.templatesParallelParallelSystemArrayMod.ParallelSystemArray[samchonLib.templatesParallelInterfacesIParallelServerMod.IParallelServer]) = this()
}

