package typings.roads

import typings.babelify.mod.BabelifyOptions
import typings.browserify.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("roads/types/client/build", JSImport.Default)
  @js.native
  def default(input_file: String, output_file: String, options: RoadsBuildOptions): js.Promise[Unit] = js.native
  
  /**
    * @param  {boolean} [options.use_sourcemaps] Whether or not the build process should include source maps.
    * @param  {Object} [options.envify] An object to pass to envify. This allows you to change values between your server and client scripts.
    * @param  {Array} [options.exclude] An array of files that should not be included in the build process.
    * @param  {Object} [options.babelify] An object containing parameters to pass to the babelify transform
    */
  @js.native
  trait RoadsBuildOptions extends StObject {
    
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
    implicit class RoadsBuildOptionsMutableBuilder[Self <: RoadsBuildOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBabelifyOptions(value: BabelifyOptions): Self = StObject.set(x, "babelifyOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBabelifyOptionsUndefined: Self = StObject.set(x, "babelifyOptions", js.undefined)
      
      @scala.inline
      def setBrowserifyOptions(value: Options): Self = StObject.set(x, "browserifyOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserifyOptionsUndefined: Self = StObject.set(x, "browserifyOptions", js.undefined)
      
      @scala.inline
      def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    }
  }
}
