package typings
package samchonLib.templatesSlaveSlaveClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/slave/SlaveClient", "SlaveClient")
@js.native
/**
  * Default Constructor.
  */
abstract class SlaveClient () extends ISlaveClient {
  /**
    * @inheritdoc
    */
  /* protected */ def createServerConnector(): samchonLib.protocolCommunicatorIServerConnectorMod.IServerConnector = js.native
}

