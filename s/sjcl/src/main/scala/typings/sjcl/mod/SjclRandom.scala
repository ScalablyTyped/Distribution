package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
@js.native
trait SjclRandom extends StObject {
  
  def addEntropy(data: String, estimatedEntropy: Double, source: String): Unit = js.native
  def addEntropy(data: js.Array[Double], estimatedEntropy: Double, source: String): Unit = js.native
  def addEntropy(data: Double, estimatedEntropy: Double, source: String): Unit = js.native
  
  def addEventListener(name: String, cb: js.Function): Unit = js.native
  
  def getProgress(): Double = js.native
  def getProgress(paranoia: Double): Double = js.native
  
  def isReady(): Boolean = js.native
  def isReady(paranoia: Double): Boolean = js.native
  
  def randomWords(nwords: Double): BitArray_ = js.native
  def randomWords(nwords: Double, paranoia: Double): BitArray_ = js.native
  
  def removeEventListener(name: String, cb: js.Function): Unit = js.native
  
  def setDefaultParanoia(paranoia: Double, allowZeroParanoia: String): Unit = js.native
  
  def startCollectors(): Unit = js.native
  
  def stopCollectors(): Unit = js.native
}
