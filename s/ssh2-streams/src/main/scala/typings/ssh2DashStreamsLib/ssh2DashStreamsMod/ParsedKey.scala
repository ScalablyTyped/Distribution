package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedKey extends js.Object {
  var comment: java.lang.String
  var encryption: java.lang.String
  var extra: java.lang.String
  var fulltype: java.lang.String
  var ppk: js.UndefOr[scala.Boolean] = js.undefined
  var `private`: nodeLib.Buffer
  var privateMAC: js.UndefOr[java.lang.String] = js.undefined
  var privateOrig: nodeLib.Buffer
  var public: nodeLib.Buffer
  var publicOrig: nodeLib.Buffer
  var `type`: java.lang.String
}

