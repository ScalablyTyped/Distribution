package typings
package qlikDashVisualizationextensionsLib.RootAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISessionAppConfig extends js.Object {
  /**
           * Optional Qlik host.
           */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Optional. Unique identity for the session. If omitted, the session will be shared.
           */
  var identity: java.lang.String
  /**
           * Optional. Use SSL.
           */
  var isSecure: scala.Boolean
  /**
           * Optional. Open app without loading data.
           */
  var openWithoutData: scala.Boolean
  /**
           * Port number.
           */
  var port: java.lang.String | scala.Double
  /**
           * Optional. Qlik virtual proxy. "/" if no proxy.
           */
  var prefix: java.lang.String
}

