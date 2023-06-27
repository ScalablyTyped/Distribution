package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`10`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import typings.std.stdInts.`5`
import typings.std.stdInts.`6`
import typings.std.stdInts.`7`
import typings.std.stdInts.`8`
import typings.std.stdInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Corresponds to the preserveAspectRatio attribute, which is available for some of SVG's elements.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio)
  */
trait SVGPreserveAspectRatio extends StObject {
  
  /* standard dom */
  val SVG_MEETORSLICE_MEET: `1`
  
  /* standard dom */
  val SVG_MEETORSLICE_SLICE: `2`
  
  /* standard dom */
  val SVG_MEETORSLICE_UNKNOWN: `0`
  
  /* standard dom */
  val SVG_PRESERVEASPECTRATIO_NONE: `1`
  
  /* standard dom */
  val SVG_PRESERVEASPECTRATIO_UNKNOWN: `0`
  
  /* standard dom */
  val SVG_PRESERVEASPECTRATIO_XMAXYMAX: `10`
  
  /* standard dom */
  val SVG_PRESERVEASPECTRATIO_XMAXYMID: `7`
  
  /* standard dom */
  val SVG_PRESERVEASPECTRATIO_XMAXYMIN: `4`
  
  /* standard dom */
  val SVG_PRESERVEASPECTRATIO_XMIDYMAX: `9`
  
  /* standard dom */
  val SVG_PRESERVEASPECTRATIO_XMIDYMID: `6`
  
  /* standard dom */
  val SVG_PRESERVEASPECTRATIO_XMIDYMIN: `3`
  
  /* standard dom */
  val SVG_PRESERVEASPECTRATIO_XMINYMAX: `8`
  
  /* standard dom */
  val SVG_PRESERVEASPECTRATIO_XMINYMID: `5`
  
  /* standard dom */
  val SVG_PRESERVEASPECTRATIO_XMINYMIN: `2`
  
  /* standard dom */
  var align: Double
  
  /* standard dom */
  var meetOrSlice: Double
}
object SVGPreserveAspectRatio {
  
  inline def apply(align: Double, meetOrSlice: Double): SVGPreserveAspectRatio = {
    val __obj = js.Dynamic.literal(SVG_MEETORSLICE_MEET = 1, SVG_MEETORSLICE_SLICE = 2, SVG_MEETORSLICE_UNKNOWN = 0, SVG_PRESERVEASPECTRATIO_NONE = 1, SVG_PRESERVEASPECTRATIO_UNKNOWN = 0, SVG_PRESERVEASPECTRATIO_XMAXYMAX = 10, SVG_PRESERVEASPECTRATIO_XMAXYMID = 7, SVG_PRESERVEASPECTRATIO_XMAXYMIN = 4, SVG_PRESERVEASPECTRATIO_XMIDYMAX = 9, SVG_PRESERVEASPECTRATIO_XMIDYMID = 6, SVG_PRESERVEASPECTRATIO_XMIDYMIN = 3, SVG_PRESERVEASPECTRATIO_XMINYMAX = 8, SVG_PRESERVEASPECTRATIO_XMINYMID = 5, SVG_PRESERVEASPECTRATIO_XMINYMIN = 2, align = align.asInstanceOf[js.Any], meetOrSlice = meetOrSlice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPreserveAspectRatio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGPreserveAspectRatio] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: Double): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setMeetOrSlice(value: Double): Self = StObject.set(x, "meetOrSlice", value.asInstanceOf[js.Any])
    
    inline def setSVG_MEETORSLICE_MEET(value: `1`): Self = StObject.set(x, "SVG_MEETORSLICE_MEET", value.asInstanceOf[js.Any])
    
    inline def setSVG_MEETORSLICE_SLICE(value: `2`): Self = StObject.set(x, "SVG_MEETORSLICE_SLICE", value.asInstanceOf[js.Any])
    
    inline def setSVG_MEETORSLICE_UNKNOWN(value: `0`): Self = StObject.set(x, "SVG_MEETORSLICE_UNKNOWN", value.asInstanceOf[js.Any])
    
    inline def setSVG_PRESERVEASPECTRATIO_NONE(value: `1`): Self = StObject.set(x, "SVG_PRESERVEASPECTRATIO_NONE", value.asInstanceOf[js.Any])
    
    inline def setSVG_PRESERVEASPECTRATIO_UNKNOWN(value: `0`): Self = StObject.set(x, "SVG_PRESERVEASPECTRATIO_UNKNOWN", value.asInstanceOf[js.Any])
    
    inline def setSVG_PRESERVEASPECTRATIO_XMAXYMAX(value: `10`): Self = StObject.set(x, "SVG_PRESERVEASPECTRATIO_XMAXYMAX", value.asInstanceOf[js.Any])
    
    inline def setSVG_PRESERVEASPECTRATIO_XMAXYMID(value: `7`): Self = StObject.set(x, "SVG_PRESERVEASPECTRATIO_XMAXYMID", value.asInstanceOf[js.Any])
    
    inline def setSVG_PRESERVEASPECTRATIO_XMAXYMIN(value: `4`): Self = StObject.set(x, "SVG_PRESERVEASPECTRATIO_XMAXYMIN", value.asInstanceOf[js.Any])
    
    inline def setSVG_PRESERVEASPECTRATIO_XMIDYMAX(value: `9`): Self = StObject.set(x, "SVG_PRESERVEASPECTRATIO_XMIDYMAX", value.asInstanceOf[js.Any])
    
    inline def setSVG_PRESERVEASPECTRATIO_XMIDYMID(value: `6`): Self = StObject.set(x, "SVG_PRESERVEASPECTRATIO_XMIDYMID", value.asInstanceOf[js.Any])
    
    inline def setSVG_PRESERVEASPECTRATIO_XMIDYMIN(value: `3`): Self = StObject.set(x, "SVG_PRESERVEASPECTRATIO_XMIDYMIN", value.asInstanceOf[js.Any])
    
    inline def setSVG_PRESERVEASPECTRATIO_XMINYMAX(value: `8`): Self = StObject.set(x, "SVG_PRESERVEASPECTRATIO_XMINYMAX", value.asInstanceOf[js.Any])
    
    inline def setSVG_PRESERVEASPECTRATIO_XMINYMID(value: `5`): Self = StObject.set(x, "SVG_PRESERVEASPECTRATIO_XMINYMID", value.asInstanceOf[js.Any])
    
    inline def setSVG_PRESERVEASPECTRATIO_XMINYMIN(value: `2`): Self = StObject.set(x, "SVG_PRESERVEASPECTRATIO_XMINYMIN", value.asInstanceOf[js.Any])
  }
}
