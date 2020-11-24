package typings.ssimJs.typesMod

import typings.ssimJs.ssimJsBooleans.`false`
import typings.ssimJs.ssimJsStrings.bezkrovny
import typings.ssimJs.ssimJsStrings.fast
import typings.ssimJs.ssimJsStrings.integer
import typings.ssimJs.ssimJsStrings.original
import typings.ssimJs.ssimJsStrings.weber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var bitDepth: Double = js.native
  
  var downsample: original | fast | `false` = js.native
  
  var k1: Double = js.native
  
  var k2: Double = js.native
  
  var maxSize: js.UndefOr[Double] = js.native
  
  var rgb2grayVersion: original | integer = js.native
  
  var ssim: fast | original | bezkrovny | weber = js.native
  
  var windowSize: Double = js.native
}
object Options {
  
  @scala.inline
  def apply(
    bitDepth: Double,
    downsample: original | fast | `false`,
    k1: Double,
    k2: Double,
    rgb2grayVersion: original | integer,
    ssim: fast | original | bezkrovny | weber,
    windowSize: Double
  ): Options = {
    val __obj = js.Dynamic.literal(bitDepth = bitDepth.asInstanceOf[js.Any], downsample = downsample.asInstanceOf[js.Any], k1 = k1.asInstanceOf[js.Any], k2 = k2.asInstanceOf[js.Any], rgb2grayVersion = rgb2grayVersion.asInstanceOf[js.Any], ssim = ssim.asInstanceOf[js.Any], windowSize = windowSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBitDepth(value: Double): Self = this.set("bitDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownsample(value: original | fast | `false`): Self = this.set("downsample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK1(value: Double): Self = this.set("k1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK2(value: Double): Self = this.set("k2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgb2grayVersion(value: original | integer): Self = this.set("rgb2grayVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsim(value: fast | original | bezkrovny | weber): Self = this.set("ssim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowSize(value: Double): Self = this.set("windowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
  }
}
