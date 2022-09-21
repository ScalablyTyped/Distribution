package typings.std.global

import typings.std.VideoColorPrimaries
import typings.std.VideoColorSpaceInit
import typings.std.VideoMatrixCoefficients
import typings.std.VideoTransferCharacteristics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("VideoColorSpace")
@js.native
/* standard dom */
open class VideoColorSpace ()
  extends StObject
     with typings.std.VideoColorSpace {
  def this(init: VideoColorSpaceInit) = this()
  
  /* standard dom */
  /* CompleteClass */
  override val fullRange: scala.Boolean | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val matrix: VideoMatrixCoefficients | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val primaries: VideoColorPrimaries | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def toJSON(): VideoColorSpaceInit = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val transfer: VideoTransferCharacteristics | Null = js.native
}
