package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qID: java.lang.String
  /**
    * Last reload time of the app.
    */
  var qLastReloadTime: java.lang.String
  /**
    * Meta data.
    */
  var qMeta: INxMeta
  /**
    * Path of the app.
    */
  var qPath: java.lang.String
  /**
    * Is set to true if the app is read-only.
    */
  var qReadOnly: scala.Boolean
  /**
    * App thumbnail.
    */
  var qThumbnail: IStaticContentUrl
  /**
    * Title of the app.
    */
  var qTitle: java.lang.String
}

object IAppEntry {
  @scala.inline
  def apply(
    qID: java.lang.String,
    qLastReloadTime: java.lang.String,
    qMeta: INxMeta,
    qPath: java.lang.String,
    qReadOnly: scala.Boolean,
    qThumbnail: IStaticContentUrl,
    qTitle: java.lang.String
  ): IAppEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qID")(qID)
    __obj.updateDynamic("qLastReloadTime")(qLastReloadTime)
    __obj.updateDynamic("qMeta")(qMeta)
    __obj.updateDynamic("qPath")(qPath)
    __obj.updateDynamic("qReadOnly")(qReadOnly)
    __obj.updateDynamic("qThumbnail")(qThumbnail)
    __obj.updateDynamic("qTitle")(qTitle)
    __obj.asInstanceOf[IAppEntry]
  }
}

