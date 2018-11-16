package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IServerOptions
  extends IWsdlBaseOptions
     with /* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var oneWay: js.UndefOr[IOneWayOptions] = js.undefined
  var path: java.lang.String
  var services: IServices
  var suppressStack: js.UndefOr[scala.Boolean] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
  var xml: js.UndefOr[java.lang.String] = js.undefined
}

