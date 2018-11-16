package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EncryptedPrivateKey extends js.Object {
  /** A Buffer or string that contains a private key. */
  var key: nodeLib.Buffer | java.lang.String
  /** The passphrase to decrypt a private key. */
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
}

