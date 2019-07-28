package typings.samchon.templatesParallelMod

import typings.samchon.templatesParallelInterfacesIParallelServerMod.IParallelServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel", "ParallelServer")
@js.native
abstract class ParallelServer protected ()
  extends typings.samchon.templatesParallelDerivedParallelServerMod.ParallelServer {
  /**
    * Construct from parent {@link ParallelSystemArray}.
    *
    * @param systemArray The parent {@link ParallelSystemArray} object.
    */
  def this(systemArray: typings.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray[IParallelServer]) = this()
}

