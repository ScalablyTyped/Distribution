package typings
package qlikDashVisualizationextensionsLib.RootAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGlobalConfig extends js.Object {
  /**
           * Qlik Sense host
           */
  var host: java.lang.String
  /**
           * Unique identity for the session. If omitted, the session will be shared.
           */
  var identity: java.lang.String
  /**
           * Use SSL
           */
  var isSecure: scala.Boolean
  /**
           * Port number
           */
  var port: java.lang.String
  /**
           * Qlik Sense virtual proxy. / if no virtual proxy
           */
  var prefix: java.lang.String
}

