package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAppLayout ...
  */
trait INxAppLayout extends js.Object {
  /**
    * In Qlik Sense Enterprise, this property corresponds to the app identifier (GUID).
    * In Qlik Sense Desktop, this property corresponds to the full path of the app.
    */
  var qFileName: java.lang.String
  /**
    * Is set to true if the app contains data following a script reload.
    */
  var qHasData: scala.Boolean
  /**
    * Is set to true if a script is defined in the app.
    */
  var qHasScript: scala.Boolean
  /**
    * If set to true, it means that the app was opened without loading its data.
    */
  var qIsOpenedWithoutData: scala.Boolean
  /**
    * Date and time of the last reload of the app in ISO format.
    */
  var qLastReloadTime: java.lang.String
  /**
    * Information about the locale.
    */
  var qLocaleInfo: ILocaleInfo
  /**
    * Information on publishing and permissions.
    */
  var qMeta: INxMeta
  /**
    * Is set to true if the app has been updated since the last save.
    */
  var qModified: scala.Boolean
  /**
    * If set to true, it means that the app is read-only.
    */
  var qReadOnly: scala.Boolean
  /**
    * Array of alternate states.
    */
  var qStateNames: js.Array[java.lang.String]
  /**
    * App thumbnail.
    */
  var qThumbnail: IStaticContentUrl
  /**
    * Title of the app.
    */
  var qTitle: java.lang.String
}

object INxAppLayout {
  @scala.inline
  def apply(
    qFileName: java.lang.String,
    qHasData: scala.Boolean,
    qHasScript: scala.Boolean,
    qIsOpenedWithoutData: scala.Boolean,
    qLastReloadTime: java.lang.String,
    qLocaleInfo: ILocaleInfo,
    qMeta: INxMeta,
    qModified: scala.Boolean,
    qReadOnly: scala.Boolean,
    qStateNames: js.Array[java.lang.String],
    qThumbnail: IStaticContentUrl,
    qTitle: java.lang.String
  ): INxAppLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qFileName")(qFileName)
    __obj.updateDynamic("qHasData")(qHasData)
    __obj.updateDynamic("qHasScript")(qHasScript)
    __obj.updateDynamic("qIsOpenedWithoutData")(qIsOpenedWithoutData)
    __obj.updateDynamic("qLastReloadTime")(qLastReloadTime)
    __obj.updateDynamic("qLocaleInfo")(qLocaleInfo)
    __obj.updateDynamic("qMeta")(qMeta)
    __obj.updateDynamic("qModified")(qModified)
    __obj.updateDynamic("qReadOnly")(qReadOnly)
    __obj.updateDynamic("qStateNames")(qStateNames)
    __obj.updateDynamic("qThumbnail")(qThumbnail)
    __obj.updateDynamic("qTitle")(qTitle)
    __obj.asInstanceOf[INxAppLayout]
  }
}

