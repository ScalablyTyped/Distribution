package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DocListEntry...
  */
trait IDocListEntry extends js.Object {
  /**
    * Not used.
    */
  var qConnectedUsers: Double
  /**
    * Identifier of the app.
    *
    * - In Qlik Sense Desktop, the identifier is the path and name of the app
    * - In Qlik Sense Enterprise, the identifier is the app's GUID.
    */
  var qDocId: String
  /**
    * Name of the app.
    */
  var qDocName: String
  /**
    * Size of remote app.
    * This property is used only with Qlik Sense Desktop.
    * It is set to 0 for Qlik Sense Enterprise.
    */
  var qFileSize: Double
  /**
    * Last modified time stamp of the app.
    * This property is used only with Qlik Sense Desktop.
    * It is set to 0 for Qlik Sense Enterprise.
    */
  var qFileTime: Double
  /**
    * Last reload time of the app.
    */
  var qLastReloadTime: String
  /**
    * Meta data related to the app.
    */
  var qMeta: INxMeta
  /**
    * If set to true, the app is read-only.
    */
  var qReadOnly: Boolean
  /**
    * Thumbnail of the app.
    */
  var qThumbnail: IStaticContentUrl
  /**
    * Title of the app.
    */
  var qTitle: String
}

object IDocListEntry {
  @scala.inline
  def apply(
    qConnectedUsers: Double,
    qDocId: String,
    qDocName: String,
    qFileSize: Double,
    qFileTime: Double,
    qLastReloadTime: String,
    qMeta: INxMeta,
    qReadOnly: Boolean,
    qThumbnail: IStaticContentUrl,
    qTitle: String
  ): IDocListEntry = {
    val __obj = js.Dynamic.literal(qConnectedUsers = qConnectedUsers.asInstanceOf[js.Any], qDocId = qDocId.asInstanceOf[js.Any], qDocName = qDocName.asInstanceOf[js.Any], qFileSize = qFileSize.asInstanceOf[js.Any], qFileTime = qFileTime.asInstanceOf[js.Any], qLastReloadTime = qLastReloadTime.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qReadOnly = qReadOnly.asInstanceOf[js.Any], qThumbnail = qThumbnail.asInstanceOf[js.Any], qTitle = qTitle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDocListEntry]
  }
}

