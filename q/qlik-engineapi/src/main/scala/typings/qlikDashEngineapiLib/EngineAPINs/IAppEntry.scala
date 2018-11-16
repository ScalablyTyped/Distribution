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

