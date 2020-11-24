package typings.sharpie.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sharpie.anon.Assignment
import typings.sharpie.sharpieBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharpieOptions extends js.Object {
  
  /** @default false */
  var bg: js.UndefOr[String | Boolean] = js.native
  
  /** @default 'center' */
  var crop: js.UndefOr[String] = js.native
  
  /** @default false */
  var fg: js.UndefOr[String | Boolean] = js.native
  
  /** @default false */
  var flatten: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  /**
    * whitelist hostnames that sharpie can proxy
    * @default false
    */
  var hostnames: js.UndefOr[
    `false` | js.Array[String] | StringDictionary[Boolean] | (js.Function1[/* hostname */ String, Boolean])
  ] = js.native
  
  /**
    * Since version 3.4 it is possible to use imagemagick to convert to ico file format
    */
  var im: js.UndefOr[String] = js.native
  
  /** @default undefined */
  var mean: js.UndefOr[String] = js.native
  
  /** @default 'url' */
  var param: js.UndefOr[String] = js.native
  
  /** @default 90 */
  var q: js.UndefOr[Double] = js.native
  
  /** @default 'xMinYMin' */
  var ratio: js.UndefOr[String] = js.native
  
  /** @default 'w:2048,h:2048,max' */
  var rs: js.UndefOr[String] = js.native
  
  var signs: js.UndefOr[Assignment] = js.native
  
  /**
    * the sizes of the favicon in ico format, separated by a comma
    * @defautl '64,32,16'
    */
  var sizes: js.UndefOr[String] = js.native
  
  /** @default false */
  var style: js.UndefOr[Boolean] = js.native
}
object SharpieOptions {
  
  @scala.inline
  def apply(): SharpieOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharpieOptions]
  }
  
  @scala.inline
  implicit class SharpieOptionsOps[Self <: SharpieOptions] (val x: Self) extends AnyVal {
    
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
    def setBg(value: String | Boolean): Self = this.set("bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBg: Self = this.set("bg", js.undefined)
    
    @scala.inline
    def setCrop(value: String): Self = this.set("crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    
    @scala.inline
    def setFg(value: String | Boolean): Self = this.set("fg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFg: Self = this.set("fg", js.undefined)
    
    @scala.inline
    def setFlatten(value: Boolean): Self = this.set("flatten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlatten: Self = this.set("flatten", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHostnamesVarargs(value: String*): Self = this.set("hostnames", js.Array(value :_*))
    
    @scala.inline
    def setHostnamesFunction1(value: /* hostname */ String => Boolean): Self = this.set("hostnames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHostnames(
      value: `false` | js.Array[String] | StringDictionary[Boolean] | (js.Function1[/* hostname */ String, Boolean])
    ): Self = this.set("hostnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostnames: Self = this.set("hostnames", js.undefined)
    
    @scala.inline
    def setIm(value: String): Self = this.set("im", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIm: Self = this.set("im", js.undefined)
    
    @scala.inline
    def setMean(value: String): Self = this.set("mean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMean: Self = this.set("mean", js.undefined)
    
    @scala.inline
    def setParam(value: String): Self = this.set("param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParam: Self = this.set("param", js.undefined)
    
    @scala.inline
    def setQ(value: Double): Self = this.set("q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    
    @scala.inline
    def setRatio(value: String): Self = this.set("ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
    
    @scala.inline
    def setRs(value: String): Self = this.set("rs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRs: Self = this.set("rs", js.undefined)
    
    @scala.inline
    def setSigns(value: Assignment): Self = this.set("signs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigns: Self = this.set("signs", js.undefined)
    
    @scala.inline
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    
    @scala.inline
    def setStyle(value: Boolean): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
