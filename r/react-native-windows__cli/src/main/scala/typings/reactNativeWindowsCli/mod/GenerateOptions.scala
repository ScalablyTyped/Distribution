package typings.reactNativeWindowsCli.mod

import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cpp
import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateOptions extends js.Object {
  
  var experimentalNuGetDependency: Boolean = js.native
  
  var language: cpp | cs = js.native
  
  var nuGetTestFeed: js.UndefOr[String] = js.native
  
  var nuGetTestVersion: js.UndefOr[String] = js.native
  
  var overwrite: Boolean = js.native
  
  var telemetry: Boolean = js.native
  
  var useWinUI3: Boolean = js.native
  
  var verbose: Boolean = js.native
}
object GenerateOptions {
  
  @scala.inline
  def apply(
    experimentalNuGetDependency: Boolean,
    language: cpp | cs,
    overwrite: Boolean,
    telemetry: Boolean,
    useWinUI3: Boolean,
    verbose: Boolean
  ): GenerateOptions = {
    val __obj = js.Dynamic.literal(experimentalNuGetDependency = experimentalNuGetDependency.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any], telemetry = telemetry.asInstanceOf[js.Any], useWinUI3 = useWinUI3.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOptions]
  }
  
  @scala.inline
  implicit class GenerateOptionsOps[Self <: GenerateOptions] (val x: Self) extends AnyVal {
    
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
    def setExperimentalNuGetDependency(value: Boolean): Self = this.set("experimentalNuGetDependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: cpp | cs): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelemetry(value: Boolean): Self = this.set("telemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseWinUI3(value: Boolean): Self = this.set("useWinUI3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNuGetTestFeed(value: String): Self = this.set("nuGetTestFeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNuGetTestFeed: Self = this.set("nuGetTestFeed", js.undefined)
    
    @scala.inline
    def setNuGetTestVersion(value: String): Self = this.set("nuGetTestVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNuGetTestVersion: Self = this.set("nuGetTestVersion", js.undefined)
  }
}
