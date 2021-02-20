package typings.rsocketCore

import typings.node.Buffer
import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketTypes.reactiveSocketTypesMod.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketbinaryframingMod {
  
  @JSImport("rsocket-core/RSocketBinaryFraming", "deserializeFrame")
  @js.native
  def deserializeFrame(buffer: Buffer): Frame = js.native
  @JSImport("rsocket-core/RSocketBinaryFraming", "deserializeFrame")
  @js.native
  def deserializeFrame(buffer: Buffer, encoders: Encoders[_]): Frame = js.native
  
  @JSImport("rsocket-core/RSocketBinaryFraming", "deserializeFrameWithLength")
  @js.native
  def deserializeFrameWithLength(buffer: Buffer): Frame = js.native
  @JSImport("rsocket-core/RSocketBinaryFraming", "deserializeFrameWithLength")
  @js.native
  def deserializeFrameWithLength(buffer: Buffer, encoders: Encoders[_]): Frame = js.native
  
  @JSImport("rsocket-core/RSocketBinaryFraming", "deserializeFrames")
  @js.native
  def deserializeFrames(buffer: Buffer): js.Tuple2[js.Array[Frame], Buffer] = js.native
  @JSImport("rsocket-core/RSocketBinaryFraming", "deserializeFrames")
  @js.native
  def deserializeFrames(buffer: Buffer, encoders: Encoders[_]): js.Tuple2[js.Array[Frame], Buffer] = js.native
  
  @JSImport("rsocket-core/RSocketBinaryFraming", "serializeFrame")
  @js.native
  def serializeFrame(frame: Frame): Buffer = js.native
  @JSImport("rsocket-core/RSocketBinaryFraming", "serializeFrame")
  @js.native
  def serializeFrame(frame: Frame, encoders: Encoders[_]): Buffer = js.native
  
  @JSImport("rsocket-core/RSocketBinaryFraming", "serializeFrameWithLength")
  @js.native
  def serializeFrameWithLength(frame: Frame): Buffer = js.native
  @JSImport("rsocket-core/RSocketBinaryFraming", "serializeFrameWithLength")
  @js.native
  def serializeFrameWithLength(frame: Frame, encoders: Encoders[_]): Buffer = js.native
  
  @JSImport("rsocket-core/RSocketBinaryFraming", "sizeOfFrame")
  @js.native
  def sizeOfFrame(frame: Frame): Double = js.native
  @JSImport("rsocket-core/RSocketBinaryFraming", "sizeOfFrame")
  @js.native
  def sizeOfFrame(frame: Frame, encoders: Encoders[_]): Double = js.native
}
