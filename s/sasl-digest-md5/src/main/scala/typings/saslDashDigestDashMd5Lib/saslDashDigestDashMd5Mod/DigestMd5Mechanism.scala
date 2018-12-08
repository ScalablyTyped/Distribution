package typings
package saslDashDigestDashMd5Lib.saslDashDigestDashMd5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DigestMd5Mechanism
  extends saslmechanismsLib.saslmechanismsMod.FactoryNs.Mechanism {
  var clientFirst: saslDashDigestDashMd5Lib.saslDashDigestDashMd5LibNumbers.`false`
  @JSName("name")
  var name_DigestMd5Mechanism: saslDashDigestDashMd5Lib.saslDashDigestDashMd5LibStrings.`DIGEST-MD5`
  def response(cred: saslDashDigestDashMd5Lib.saslDashDigestDashMd5Mod.DigestMd5MechanismNs.Credentials): java.lang.String
}

