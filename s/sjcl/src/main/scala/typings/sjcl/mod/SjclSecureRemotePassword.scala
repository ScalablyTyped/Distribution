package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclSecureRemotePassword extends StObject {
  
  def knownGroup(i: String): SjclSRPGroup = js.native
  def knownGroup(i: Double): SjclSRPGroup = js.native
  
  def makeVerifier(username: String, password: String, salt: BitArray_, group: SjclSRPGroup): BitArray_ = js.native
  
  def makeX(username: String, password: String, salt: BitArray_): BitArray_ = js.native
}
