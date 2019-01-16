package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaSource extends EventTarget {
  val activeSourceBuffers: SourceBufferList = js.native
  var duration: scala.Double = js.native
  val readyState: ReadyState = js.native
  val sourceBuffers: SourceBufferList = js.native
  def addSourceBuffer(`type`: java.lang.String): SourceBuffer = js.native
  def endOfStream(): scala.Unit = js.native
  def endOfStream(error: EndOfStreamError): scala.Unit = js.native
  def removeSourceBuffer(sourceBuffer: SourceBuffer): scala.Unit = js.native
}

@JSGlobal("MediaSource")
@js.native
object MediaSource
  extends org.scalablytyped.runtime.Instantiable0[MediaSource] {
  def isTypeSupported(`type`: java.lang.String): scala.Boolean = js.native
}

