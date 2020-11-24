package typings.sshpk.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "FingerprintFormatError")
@js.native
class FingerprintFormatError protected () extends Error {
  def this(fp: Fingerprint, format: String) = this()
}
