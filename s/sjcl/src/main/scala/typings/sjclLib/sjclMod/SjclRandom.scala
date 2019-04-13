package typings
package sjclLib.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
@js.native
trait SjclRandom extends js.Object {
  def addEntropy(data: java.lang.String, estimatedEntropy: scala.Double, source: java.lang.String): scala.Unit = js.native
  def addEntropy(data: js.Array[scala.Double], estimatedEntropy: scala.Double, source: java.lang.String): scala.Unit = js.native
  def addEntropy(data: scala.Double, estimatedEntropy: scala.Double, source: java.lang.String): scala.Unit = js.native
  def addEventListener(name: java.lang.String, cb: js.Function): scala.Unit = js.native
  def getProgress(): scala.Double = js.native
  def getProgress(paranoia: scala.Double): scala.Double = js.native
  def isReady(): scala.Boolean = js.native
  def isReady(paranoia: scala.Double): scala.Boolean = js.native
  def randomWords(nwords: scala.Double): BitArray = js.native
  def randomWords(nwords: scala.Double, paranoia: scala.Double): BitArray = js.native
  def removeEventListener(name: java.lang.String, cb: js.Function): scala.Unit = js.native
  def setDefaultParanoia(paranoia: scala.Double, allowZeroParanoia: java.lang.String): scala.Unit = js.native
  def startCollectors(): scala.Unit = js.native
  def stopCollectors(): scala.Unit = js.native
}

