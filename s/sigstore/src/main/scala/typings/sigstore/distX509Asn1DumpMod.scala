package typings.sigstore

import typings.sigstore.distX509Asn1ObjMod.ASN1Obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distX509Asn1DumpMod {
  
  @JSImport("sigstore/dist/x509/asn1/dump", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dump(obj: ASN1Obj): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dump")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def dump(obj: ASN1Obj, indent: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dump")(obj.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
