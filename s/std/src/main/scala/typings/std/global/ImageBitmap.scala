package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ImageBitmap")
@js.native
/* standard dom */
open class ImageBitmap ()
  extends StObject
     with typings.std.ImageBitmap {
  
  /** Releases imageBitmap's underlying bitmap data. */
  /* standard dom */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /** Returns the intrinsic height of the image, in CSS pixels. */
  /* standard dom */
  /* CompleteClass */
  override val height: Double = js.native
  
  /** Returns the intrinsic width of the image, in CSS pixels. */
  /* standard dom */
  /* CompleteClass */
  override val width: Double = js.native
}
