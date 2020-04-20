package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AppEntry...
  */
trait IAppEntry extends js.Object {
  /**
    * Identifier of the app.
    */
  var qID: String
  /**
    * Last reload time of the app.
    */
  var qLastReloadTime: String
  /**
    * Meta data.
    */
  var qMeta: INxMeta
  /**
    * Path of the app.
    */
  var qPath: String
  /**
    * Is set to true if the app is read-only.
    */
  var qReadOnly: Boolean
  /**
    * App thumbnail.
    */
  var qThumbnail: IStaticContentUrl
  /**
    * Title of the app.
    */
  var qTitle: String
}

object IAppEntry {
  @scala.inline
  def apply(
    qID: String,
    qLastReloadTime: String,
    qMeta: INxMeta,
    qPath: String,
    qReadOnly: Boolean,
    qThumbnail: IStaticContentUrl,
    qTitle: String
  ): IAppEntry = {
    val __obj = js.Dynamic.literal(qID = qID.asInstanceOf[js.Any], qLastReloadTime = qLastReloadTime.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qPath = qPath.asInstanceOf[js.Any], qReadOnly = qReadOnly.asInstanceOf[js.Any], qThumbnail = qThumbnail.asInstanceOf[js.Any], qTitle = qTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAppEntry]
  }
}

