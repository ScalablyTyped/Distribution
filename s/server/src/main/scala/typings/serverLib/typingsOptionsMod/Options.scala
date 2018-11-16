package typings
package serverLib.typingsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var engine: js.UndefOr[java.lang.String] = js.undefined
  var env: js.UndefOr[java.lang.String] = js.undefined
  var favicon: js.UndefOr[java.lang.String] = js.undefined
  var log: js.UndefOr[serverLib.typingsCommonMod.LogLevel | serverLib.Anon_Level] = js.undefined
  var parser: js.UndefOr[serverLib.Anon_Body] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var public: js.UndefOr[java.lang.String] = js.undefined
  var secret: js.UndefOr[java.lang.String] = js.undefined
  var security: js.UndefOr[
    (serverLib.serverLibNumbers.`false` | helmetLib.helmetMod.helmetNs.IHelmetConfiguration) with serverLib.Anon_Csurf
  ] = js.undefined
  var session: js.UndefOr[expressDashSessionLib.expressDashSessionMod.sessionNs.SessionOptions] = js.undefined
  var views: js.UndefOr[java.lang.String] = js.undefined
}

