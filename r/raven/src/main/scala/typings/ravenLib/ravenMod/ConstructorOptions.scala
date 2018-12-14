package typings
package ravenLib.ravenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConstructorOptions extends js.Object {
  var autoBreadcrumbs: js.UndefOr[scala.Boolean | org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  var captureUnhandledRejections: js.UndefOr[scala.Boolean] = js.undefined
  var dataCallback: js.UndefOr[DataCallback] = js.undefined
  var environment: js.UndefOr[java.lang.String] = js.undefined
  var extra: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var logger: js.UndefOr[java.lang.String] = js.undefined
  var maxBreadcrumbs: js.UndefOr[scala.Double] = js.undefined
  var maxReqQueueCount: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parseUser: js.UndefOr[scala.Boolean | js.Array[java.lang.String] | parseUserCallback] = js.undefined
  var release: js.UndefOr[java.lang.String] = js.undefined
  var sampleRate: js.UndefOr[scala.Double] = js.undefined
  var sendTimeout: js.UndefOr[scala.Double] = js.undefined
  var shouldSendCallback: js.UndefOr[ShouldSendCallback] = js.undefined
  var tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var transport: js.UndefOr[ravenLib.ravenMod.transportsNs.Transport] = js.undefined
}

