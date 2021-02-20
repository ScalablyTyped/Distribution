package typings.stellarBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "Account")
@js.native
class Account protected () extends StObject {
  def this(accountId: String, sequence: String) = this()
  
  def accountId(): String = js.native
  
  def incrementSequenceNumber(): Unit = js.native
  
  def sequenceNumber(): String = js.native
}
