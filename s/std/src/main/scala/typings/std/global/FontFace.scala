package typings.std.global

import typings.std.BinaryData
import typings.std.FontDisplay
import typings.std.FontFaceDescriptors
import typings.std.FontFaceLoadStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("FontFace")
@js.native
open class FontFace protected ()
  extends StObject
     with typings.std.FontFace {
  /* standard dom */
  def this(family: java.lang.String, source: java.lang.String) = this()
  def this(family: java.lang.String, source: BinaryData) = this()
  def this(family: java.lang.String, source: java.lang.String, descriptors: FontFaceDescriptors) = this()
  def this(family: java.lang.String, source: BinaryData, descriptors: FontFaceDescriptors) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/ascentOverride) */
  /* standard dom */
  /* CompleteClass */
  var ascentOverride: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/descentOverride) */
  /* standard dom */
  /* CompleteClass */
  var descentOverride: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/display) */
  /* standard dom */
  /* CompleteClass */
  var display: FontDisplay = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/family) */
  /* standard dom */
  /* CompleteClass */
  var family: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/featureSettings) */
  /* standard dom */
  /* CompleteClass */
  var featureSettings: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/lineGapOverride) */
  /* standard dom */
  /* CompleteClass */
  var lineGapOverride: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/load) */
  /* standard dom */
  /* CompleteClass */
  override def load(): js.Promise[typings.std.FontFace] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/loaded) */
  /* standard dom */
  /* CompleteClass */
  override val loaded: js.Promise[typings.std.FontFace] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/status) */
  /* standard dom */
  /* CompleteClass */
  override val status: FontFaceLoadStatus = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/stretch) */
  /* standard dom */
  /* CompleteClass */
  var stretch: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/style) */
  /* standard dom */
  /* CompleteClass */
  var style: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/unicodeRange) */
  /* standard dom */
  /* CompleteClass */
  var unicodeRange: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/variant) */
  /* standard dom */
  /* CompleteClass */
  var variant: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/weight) */
  /* standard dom */
  /* CompleteClass */
  var weight: java.lang.String = js.native
}
