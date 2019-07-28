package typings.samchon.templatesSlaveSlaveClientMod

import typings.samchon.protocolCommunicatorIServerConnectorMod.IServerConnector
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
  /* protected */ def createServerConnector(): IServerConnector = js.native
}

