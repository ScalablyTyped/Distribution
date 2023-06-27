package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The dimensions of a piece of text in the canvas, as created by the CanvasRenderingContext2D.measureText() method.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics)
  */
trait TextMetrics extends StObject {
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxAscent)
    */
  /* standard dom */
  val actualBoundingBoxAscent: Double
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxDescent)
    */
  /* standard dom */
  val actualBoundingBoxDescent: Double
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxLeft)
    */
  /* standard dom */
  val actualBoundingBoxLeft: Double
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxRight)
    */
  /* standard dom */
  val actualBoundingBoxRight: Double
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/fontBoundingBoxAscent)
    */
  /* standard dom */
  val fontBoundingBoxAscent: Double
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/fontBoundingBoxDescent)
    */
  /* standard dom */
  val fontBoundingBoxDescent: Double
  
  /**
    * Returns the measurement described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/width)
    */
  /* standard dom */
  val width: Double
}
object TextMetrics {
  
  inline def apply(
    actualBoundingBoxAscent: Double,
    actualBoundingBoxDescent: Double,
    actualBoundingBoxLeft: Double,
    actualBoundingBoxRight: Double,
    fontBoundingBoxAscent: Double,
    fontBoundingBoxDescent: Double,
    width: Double
  ): TextMetrics = {
    val __obj = js.Dynamic.literal(actualBoundingBoxAscent = actualBoundingBoxAscent.asInstanceOf[js.Any], actualBoundingBoxDescent = actualBoundingBoxDescent.asInstanceOf[js.Any], actualBoundingBoxLeft = actualBoundingBoxLeft.asInstanceOf[js.Any], actualBoundingBoxRight = actualBoundingBoxRight.asInstanceOf[js.Any], fontBoundingBoxAscent = fontBoundingBoxAscent.asInstanceOf[js.Any], fontBoundingBoxDescent = fontBoundingBoxDescent.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextMetrics] (val x: Self) extends AnyVal {
    
    inline def setActualBoundingBoxAscent(value: Double): Self = StObject.set(x, "actualBoundingBoxAscent", value.asInstanceOf[js.Any])
    
    inline def setActualBoundingBoxDescent(value: Double): Self = StObject.set(x, "actualBoundingBoxDescent", value.asInstanceOf[js.Any])
    
    inline def setActualBoundingBoxLeft(value: Double): Self = StObject.set(x, "actualBoundingBoxLeft", value.asInstanceOf[js.Any])
    
    inline def setActualBoundingBoxRight(value: Double): Self = StObject.set(x, "actualBoundingBoxRight", value.asInstanceOf[js.Any])
    
    inline def setFontBoundingBoxAscent(value: Double): Self = StObject.set(x, "fontBoundingBoxAscent", value.asInstanceOf[js.Any])
    
    inline def setFontBoundingBoxDescent(value: Double): Self = StObject.set(x, "fontBoundingBoxDescent", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
