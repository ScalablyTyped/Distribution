package typings.std.global

import typings.std.KeyAlgorithm
import typings.std.KeyType
import typings.std.KeyUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CryptoKey")
@js.native
class CryptoKey ()
  extends StObject
     with typings.std.CryptoKey {
  
  /* CompleteClass */
  override val algorithm: KeyAlgorithm = js.native
  
  /* CompleteClass */
  override val extractable: scala.Boolean = js.native
  
  /* CompleteClass */
  override val `type`: KeyType = js.native
  
  /* CompleteClass */
  override val usages: js.Array[KeyUsage] = js.native
}
