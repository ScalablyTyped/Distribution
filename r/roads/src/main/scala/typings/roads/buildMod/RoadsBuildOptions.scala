package typings.roads.buildMod

import typings.babelify.mod.BabelifyOptions
import typings.browserify.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @param  {boolean} [options.use_sourcemaps] Whether or not the build process should include source maps.
  * @param  {Object} [options.envify] An object to pass to envify. This allows you to change values between your server and client scripts.
  * @param  {Array} [options.exclude] An array of files that should not be included in the build process.
  * @param  {Object} [options.babelify] An object containing parameters to pass to the babelify transform
  */
@js.native
trait RoadsBuildOptions extends js.Object {
  
  var babelifyOptions: js.UndefOr[BabelifyOptions] = js.native
  
  var browserifyOptions: js.UndefOr[Options] = js.native
  
  var exclude: js.UndefOr[String | js.Array[String]] = js.native
  
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
}
object RoadsBuildOptions {
  
  @scala.inline
  def apply(): RoadsBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoadsBuildOptions]
  }
  
  @scala.inline
  implicit class RoadsBuildOptionsOps[Self <: RoadsBuildOptions] (val x: Self) extends AnyVal {
    
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
    def setBabelifyOptions(value: BabelifyOptions): Self = this.set("babelifyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBabelifyOptions: Self = this.set("babelifyOptions", js.undefined)
    
    @scala.inline
    def setBrowserifyOptions(value: Options): Self = this.set("browserifyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserifyOptions: Self = this.set("browserifyOptions", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: String | js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: String | js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
  }
}
