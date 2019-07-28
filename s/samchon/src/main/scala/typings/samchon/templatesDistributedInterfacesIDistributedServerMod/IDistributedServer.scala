package typings.samchon.templatesDistributedInterfacesIDistributedServerMod

import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDistributedServer extends DistributedSystem {
  /**
    * Connect to external server.
    */
  def connect(): Unit = js.native
}

