package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qConnectedUsers: scala.Double
  /**
           * Identifier of the app.
           *
           * - In Qlik Sense Desktop, the identifier is the path and name of the app
           * - In Qlik Sense Enterprise, the identifier is the app's GUID.
           */
  var qDocId: java.lang.String
  /**
           * Name of the app.
           */
  var qDocName: java.lang.String
  /**
           * Size of remote app.
           * This property is used only with Qlik Sense Desktop.
           * It is set to 0 for Qlik Sense Enterprise.
           */
  var qFileSize: scala.Double
  /**
           * Last modified time stamp of the app.
           * This property is used only with Qlik Sense Desktop.
           * It is set to 0 for Qlik Sense Enterprise.
           */
  var qFileTime: scala.Double
  /**
           * Last reload time of the app.
           */
  var qLastReloadTime: java.lang.String
  /**
           * Meta data related to the app.
           */
  var qMeta: INxMeta
  /**
           * If set to true, the app is read-only.
           */
  var qReadOnly: scala.Boolean
  /**
           * Thumbnail of the app.
           */
  var qThumbnail: IStaticContentUrl
  /**
           * Title of the app.
           */
  var qTitle: java.lang.String
}

