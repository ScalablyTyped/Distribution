package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Extracted nested Instantiables into classes in securityNs */
@JSImport("soap", "security")
@js.native
object security extends js.Object {
  var BasicAuthSecurity: org.scalablytyped.runtime.Instantiable3[
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    js.UndefOr[/* defaults */ js.Any], 
    soapLib.libSecurityMod.BasicAuthSecurity
  ] = js.native
  var BearerSecurity: org.scalablytyped.runtime.Instantiable2[
    /* token */ java.lang.String, 
    js.UndefOr[/* defaults */ js.Any], 
    soapLib.libSecurityMod.BearerSecurity
  ] = js.native
  var ClientSSLSecurity: org.scalablytyped.runtime.Instantiable3[
    /* key */ java.lang.String | nodeLib.Buffer, 
    /* cert */ java.lang.String | nodeLib.Buffer, 
    js.UndefOr[/* defaults */ js.Any], 
    soapLib.libSecurityMod.ClientSSLSecurity
  ] = js.native
  var ClientSSLSecurityPFX: org.scalablytyped.runtime.Instantiable2[
    /* pfx */ java.lang.String | nodeLib.Buffer, 
    js.UndefOr[/* defaults */ js.Any], 
    soapLib.libSecurityMod.ClientSSLSecurityPFX
  ] = js.native
  var NTLMSecurity: org.scalablytyped.runtime.Instantiable1[/* defaults */ js.Any, soapLib.libSecurityMod.NTLMSecurity] = js.native
  var WSSecurity: org.scalablytyped.runtime.Instantiable3[
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    js.UndefOr[java.lang.String | soapLib.libSecurityWSSecurityMod.IWSSecurityOptions], 
    soapLib.libSecurityMod.WSSecurity
  ] = js.native
  var WSSecurityCert: org.scalablytyped.runtime.Instantiable4[
    /* privatePEM */ js.Any, 
    /* publicP12PEM */ js.Any, 
    /* password */ js.Any, 
    js.UndefOr[/* options */ soapLib.libSecurityWSSecurityCertMod.IWSSecurityCertOptions], 
    soapLib.libSecurityMod.WSSecurityCert
  ] = js.native
}

