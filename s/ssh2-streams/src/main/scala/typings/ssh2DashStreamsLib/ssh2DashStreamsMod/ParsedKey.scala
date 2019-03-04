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

object ParsedKey {
  @scala.inline
  def apply(
    comment: java.lang.String,
    encryption: java.lang.String,
    extra: java.lang.String,
    fulltype: java.lang.String,
    `private`: nodeLib.Buffer,
    privateOrig: nodeLib.Buffer,
    public: nodeLib.Buffer,
    publicOrig: nodeLib.Buffer,
    `type`: java.lang.String,
    ppk: js.UndefOr[scala.Boolean] = js.undefined,
    privateMAC: java.lang.String = null
  ): ParsedKey = {
    val __obj = js.Dynamic.literal(comment = comment, encryption = encryption, extra = extra, fulltype = fulltype, privateOrig = privateOrig, public = public, publicOrig = publicOrig)
    __obj.updateDynamic("private")(`private`)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(ppk)) __obj.updateDynamic("ppk")(ppk)
    if (privateMAC != null) __obj.updateDynamic("privateMAC")(privateMAC)
    __obj.asInstanceOf[ParsedKey]
  }
}

