package typings.soap.soapMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.node.Buffer
import typings.soap.libSecurityWSSecurityCertMod.IWSSecurityCertOptions
import typings.soap.libSecurityWSSecurityMod.IWSSecurityOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Extracted nested Instantiables into classes in securityNs */
@JSImport("soap", "security")
@js.native
object security extends js.Object {
  var BasicAuthSecurity: Instantiable3[
    /* username */ String, 
    /* password */ String, 
    js.UndefOr[/* defaults */ js.Any], 
    typings.soap.libSecurityMod.BasicAuthSecurity
  ] = js.native
  var BearerSecurity: Instantiable2[
    /* token */ String, 
    js.UndefOr[/* defaults */ js.Any], 
    typings.soap.libSecurityMod.BearerSecurity
  ] = js.native
  var ClientSSLSecurity: Instantiable3[
    /* key */ String | Buffer, 
    /* cert */ String | Buffer, 
    js.UndefOr[/* defaults */ js.Any], 
    typings.soap.libSecurityMod.ClientSSLSecurity
  ] = js.native
  var ClientSSLSecurityPFX: Instantiable2[
    /* pfx */ String | Buffer, 
    js.UndefOr[/* defaults */ js.Any], 
    typings.soap.libSecurityMod.ClientSSLSecurityPFX
  ] = js.native
  var NTLMSecurity: Instantiable1[/* defaults */ js.Any, typings.soap.libSecurityMod.NTLMSecurity] = js.native
  var WSSecurity: Instantiable3[
    /* username */ String, 
    /* password */ String, 
    js.UndefOr[String | IWSSecurityOptions], 
    typings.soap.libSecurityMod.WSSecurity
  ] = js.native
  var WSSecurityCert: Instantiable4[
    /* privatePEM */ js.Any, 
    /* publicP12PEM */ js.Any, 
    /* password */ js.Any, 
    js.UndefOr[/* options */ IWSSecurityCertOptions], 
    typings.soap.libSecurityMod.WSSecurityCert
  ] = js.native
}

