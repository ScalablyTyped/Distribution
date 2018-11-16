package typings
package qlikDashVisualizationextensionsLib.RootAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAppConfig extends js.Object {
  /**
           * Optional Qlik host.
           */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Optional. Unique identity for the session. If omitted, the session will be shared.
           */
  var identity: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Optional. Use SSL.
           */
  var isSecure: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Optional. Open app without loading data. Introduced in version 1.1.
           */
  var openWithoutData: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Port number.
           */
  var port: java.lang.String | scala.Double
  /**
           * Optional. Qlik virtual proxy. "/" if no proxy.
           */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

