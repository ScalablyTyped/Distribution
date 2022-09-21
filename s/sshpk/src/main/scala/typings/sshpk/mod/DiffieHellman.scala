package typings.sshpk.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// == dhe.js == //
@JSImport("sshpk", "DiffieHellman")
@js.native
open class DiffieHellman protected () extends StObject {
  /* private */ def this(key: Key) = this()
  /* private */ def this(key: PrivateKey) = this()
  
  def computeSecret(otherpk: Key): Buffer = js.native
  
  def generateKey(): PrivateKey = js.native
  
  def generateKeys(): PrivateKey = js.native
  
  def getKey(): js.UndefOr[PrivateKey] = js.native
  
  def getPrivateKey(): js.UndefOr[PrivateKey] = js.native
  
  def getPublicKey(): Key = js.native
  
  def setKey(key: PrivateKey): Unit = js.native
  
  def setPrivateKey(key: PrivateKey): Unit = js.native
}
