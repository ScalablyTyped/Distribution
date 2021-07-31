package typings.scryptsy

import typings.node.Buffer
import typings.scryptsy.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(key: String, salt: String, N: Double, r: Double, p: Double, dkLen: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], N.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def apply(
    key: String,
    salt: String,
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    progressCallback: js.Function1[/* status */ Current, Unit]
  ): Buffer = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], N.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def apply(key: String, salt: Buffer, N: Double, r: Double, p: Double, dkLen: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], N.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def apply(
    key: String,
    salt: Buffer,
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    progressCallback: js.Function1[/* status */ Current, Unit]
  ): Buffer = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], N.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def apply(key: Buffer, salt: String, N: Double, r: Double, p: Double, dkLen: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], N.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def apply(
    key: Buffer,
    salt: String,
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    progressCallback: js.Function1[/* status */ Current, Unit]
  ): Buffer = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], N.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def apply(key: Buffer, salt: Buffer, N: Double, r: Double, p: Double, dkLen: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], N.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def apply(
    key: Buffer,
    salt: Buffer,
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    progressCallback: js.Function1[/* status */ Current, Unit]
  ): Buffer = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], N.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @JSImport("scryptsy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
