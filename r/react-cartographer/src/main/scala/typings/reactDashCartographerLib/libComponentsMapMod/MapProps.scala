package typings
package reactDashCartographerLib.libComponentsMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MapProps extends js.Object {
  var addressLine1: js.UndefOr[java.lang.String] = js.undefined
  var city: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** Default: 270 */
  var height: scala.Double
  var latitude: js.UndefOr[scala.Double] = js.undefined
  var longitude: js.UndefOr[scala.Double] = js.undefined
  /** Default: map */
  var mapId: java.lang.String
  /** Default: yahoo */
  var provider: reactDashCartographerLib.reactDashCartographerLibStrings.yahoo | reactDashCartographerLib.reactDashCartographerLibStrings.google | reactDashCartographerLib.reactDashCartographerLibStrings.bing
  var providerKey: java.lang.String
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Default: false */
  var useBackgroundImageStyle: scala.Boolean
  /** Default: 580 */
  var width: scala.Double
  /** Default: 10 */
  var zoom: scala.Double
}

