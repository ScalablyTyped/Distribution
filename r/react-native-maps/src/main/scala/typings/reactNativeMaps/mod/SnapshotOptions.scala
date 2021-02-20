package typings.reactNativeMaps.mod

import typings.reactNativeMaps.reactNativeMapsStrings.base64
import typings.reactNativeMaps.reactNativeMapsStrings.file
import typings.reactNativeMaps.reactNativeMapsStrings.jpg
import typings.reactNativeMaps.reactNativeMapsStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotOptions extends StObject {
  
  /** image formats, defaults to 'png' */
  var format: js.UndefOr[png | jpg] = js.native
  
  /** optional, when omitted the view-height is used */
  var height: js.UndefOr[Double] = js.native
  
  /** image quality: 0..1 (only relevant for jpg, default: 1) */
  var quality: js.UndefOr[Double] = js.native
  
  /** __iOS only__, optional region to render */
  var region: js.UndefOr[Region] = js.native
  
  /** result types, defaults to 'file' */
  var result: js.UndefOr[file | base64] = js.native
  
  /** optional, when omitted the view-width is used */
  var width: js.UndefOr[Double] = js.native
}
object SnapshotOptions {
  
  @scala.inline
  def apply(): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotOptions]
  }
  
  @scala.inline
  implicit class SnapshotOptionsMutableBuilder[Self <: SnapshotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: png | jpg): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setResult(value: file | base64): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
