package typings
package saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sasl-scram-sha-1", JSImport.Namespace)
@js.native
class namespaced () extends ScramSha1Mechanism {
  def this(options: saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1Mod.ScramSha1MechanismNs.Options) = this()
  /* CompleteClass */
  override var clientFirst: saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1LibNumbers.`true` = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  @JSName("name")
  override var name_ScramSha1Mechanism: saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1LibStrings.`SCRAM-SHA-1` = js.native
  /* CompleteClass */
  override def challenge(chal: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def response(cred: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
  /* CompleteClass */
  override def response(cred: saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1Mod.ScramSha1MechanismNs.Credentials): java.lang.String = js.native
}

@JSImport("sasl-scram-sha-1", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var Mechanism: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[
      /* options */ saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1Mod.ScramSha1MechanismNs.Options
    ], 
    saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1Mod.ScramSha1Mechanism
  ] = js.native
}

