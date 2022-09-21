package typings.std.global

import typings.std.Crypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Crypto")
@js.native
/* standard dom */
open class Crypto_ ()
  extends StObject
     with Crypto {
  
  /* standard dom */
  /* CompleteClass */
  override def getRandomValues[T /* <: js.typedarray.ArrayBufferView | Null */](array: T): T = js.native
  
  /** Available only in secure contexts. */
  /* standard dom */
  /* CompleteClass */
  override def randomUUID(): java.lang.String = js.native
  
  /** Available only in secure contexts. */
  /* standard dom */
  /* CompleteClass */
  override val subtle: typings.std.SubtleCrypto = js.native
}
