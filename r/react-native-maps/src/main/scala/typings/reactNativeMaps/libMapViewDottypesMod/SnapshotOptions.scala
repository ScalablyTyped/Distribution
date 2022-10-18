package typings.reactNativeMaps.libMapViewDottypesMod

import typings.reactNativeMaps.libSharedTypesMod.Region
import typings.reactNativeMaps.reactNativeMapsStrings.base64
import typings.reactNativeMaps.reactNativeMapsStrings.file
import typings.reactNativeMaps.reactNativeMapsStrings.jpg
import typings.reactNativeMaps.reactNativeMapsStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotOptions extends StObject {
  
  /** image formats, defaults to 'png' */
  var format: js.UndefOr[png | jpg] = js.undefined
  
  /** optional, when omitted the view-height is used */
  var height: js.UndefOr[Double] = js.undefined
  
  /** image quality: 0..1 (only relevant for jpg, default: 1) */
  var quality: js.UndefOr[Double] = js.undefined
  
  /** __iOS only__, optional region to render */
  var region: js.UndefOr[Region] = js.undefined
  
  /** result types, defaults to 'file' */
  var result: js.UndefOr[file | base64] = js.undefined
  
  /** optional, when omitted the view-width is used */
  var width: js.UndefOr[Double] = js.undefined
}
object SnapshotOptions {
  
  inline def apply(): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotOptions]
  }
  
  extension [Self <: SnapshotOptions](x: Self) {
    
    inline def setFormat(value: png | jpg): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setResult(value: file | base64): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
