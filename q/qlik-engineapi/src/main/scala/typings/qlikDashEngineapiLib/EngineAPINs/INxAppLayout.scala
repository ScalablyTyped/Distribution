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

