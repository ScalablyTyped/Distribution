package typings.std.global

import typings.std.CanvasDirection
import typings.std.CanvasFontKerning
import typings.std.CanvasTextAlign
import typings.std.CanvasTextBaseline
import typings.std.GlobalCompositeOperation
import typings.std.ImageSmoothingQuality
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CanvasRenderingContext2D")
@js.native
/* standard dom */
open class CanvasRenderingContext2D ()
  extends StObject
     with typings.std.CanvasRenderingContext2D {
  
  /* standard dom */
  /* CompleteClass */
  override def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /* standard dom */
  /* CompleteClass */
  var direction: CanvasDirection = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /* standard dom */
  /* CompleteClass */
  var filter: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var font: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var fontKerning: CanvasFontKerning = js.native
  
  /* standard dom */
  /* CompleteClass */
  var globalAlpha: Double = js.native
  
  /* standard dom */
  /* CompleteClass */
  var globalCompositeOperation: GlobalCompositeOperation = js.native
  
  /* standard dom */
  /* CompleteClass */
  var imageSmoothingEnabled: scala.Boolean = js.native
  
  /* standard dom */
  /* CompleteClass */
  var imageSmoothingQuality: ImageSmoothingQuality = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def restore(): Unit = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def save(): Unit = js.native
  
  /* standard dom */
  /* CompleteClass */
  var shadowBlur: Double = js.native
  
  /* standard dom */
  /* CompleteClass */
  var shadowColor: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var shadowOffsetX: Double = js.native
  
  /* standard dom */
  /* CompleteClass */
  var shadowOffsetY: Double = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /* standard dom */
  /* CompleteClass */
  var textAlign: CanvasTextAlign = js.native
  
  /* standard dom */
  /* CompleteClass */
  var textBaseline: CanvasTextBaseline = js.native
}
