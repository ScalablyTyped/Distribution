package typings.std.global

import typings.std.BufferSource
import typings.std.EncodedVideoChunkInit
import typings.std.EncodedVideoChunkType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("EncodedVideoChunk")
@js.native
open class EncodedVideoChunk protected ()
  extends StObject
     with typings.std.EncodedVideoChunk {
  /* standard dom */
  def this(init: EncodedVideoChunkInit) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/byteLength) */
  /* standard dom */
  /* CompleteClass */
  override val byteLength: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/copyTo) */
  /* standard dom */
  /* CompleteClass */
  override def copyTo(destination: BufferSource): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/duration) */
  /* standard dom */
  /* CompleteClass */
  override val duration: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/timestamp) */
  /* standard dom */
  /* CompleteClass */
  override val timestamp: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/type) */
  /* standard dom */
  /* CompleteClass */
  override val `type`: EncodedVideoChunkType = js.native
}
