package typings.sshpk.mod

import typings.asn1.mod.BerReader
import typings.asn1.mod.BerWriter
import typings.sshpk.anon.Components
import typings.sshpk.anon.keyinIndentityOidNameArra
import typings.sshpk.sshpkBooleans.`false`
import typings.sshpk.sshpkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "Identity")
@js.native
open class Identity protected () extends StObject {
  def this(opts: Components) = this()
  
  var cn: js.UndefOr[String] = js.native
  
  var componentLookup: keyinIndentityOidNameArra = js.native
  
  var components: js.Array[IdentityComponent] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  def equals(other: Identity): Boolean = js.native
  
  def get(name: IndentityOidName): String = js.native
  @JSName("get")
  def get_false(name: IndentityOidName, asArray: `false`): String = js.native
  @JSName("get")
  def get_true(name: IndentityOidName, asArray: `true`): js.Array[String] = js.native
  
  var hostname: js.UndefOr[String] = js.native
  
  def toArray(): js.Array[IdentityNameComponent] = js.native
  
  def toAsn1(der: BerWriter): Unit = js.native
  def toAsn1(der: BerWriter, tag: Double): Unit = js.native
  
  var `type`: IdentityTypeWithUnknown = js.native
  
  var uid: js.UndefOr[String] = js.native
}
object Identity {
  
  @JSImport("sshpk", "Identity")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def forEmail(email: String): Identity = ^.asInstanceOf[js.Dynamic].applyDynamic("forEmail")(email.asInstanceOf[js.Any]).asInstanceOf[Identity]
  
  /* static member */
  inline def forHost(hostname: String): Identity = ^.asInstanceOf[js.Dynamic].applyDynamic("forHost")(hostname.asInstanceOf[js.Any]).asInstanceOf[Identity]
  
  /* static member */
  inline def forUser(uid: String): Identity = ^.asInstanceOf[js.Dynamic].applyDynamic("forUser")(uid.asInstanceOf[js.Any]).asInstanceOf[Identity]
  
  /* static member */
  inline def fromArray(components: js.Array[IdentityNameComponent]): Identity = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(components.asInstanceOf[js.Any]).asInstanceOf[Identity]
  
  /* static member */
  inline def isIdentity(obj: Any, ver: Version): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentity")(obj.asInstanceOf[js.Any], ver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def parseAsn1(dn: BerReader): Identity = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAsn1")(dn.asInstanceOf[js.Any]).asInstanceOf[Identity]
  inline def parseAsn1(dn: BerReader, top: Double): Identity = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAsn1")(dn.asInstanceOf[js.Any], top.asInstanceOf[js.Any])).asInstanceOf[Identity]
  
  /* static member */
  inline def parseDN(dn: String): Identity = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDN")(dn.asInstanceOf[js.Any]).asInstanceOf[Identity]
}
