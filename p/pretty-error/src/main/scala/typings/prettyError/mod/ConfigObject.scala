package typings.prettyError.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigObject extends js.Object {
  
  var aliases: js.UndefOr[Boolean | js.Object] = js.native
  
  // assuming this is optional
  var filters: js.UndefOr[Boolean | Callback | js.Array[Callback]] = js.native
  
  var maxItems: js.UndefOr[Double] = js.native
  
  var parsedErrorFilters: js.UndefOr[Boolean | Callback | js.Array[Callback]] = js.native
  
  var skip: js.UndefOr[Boolean | Callback | js.Array[Callback]] = js.native
  
  var skipNodeFiles: js.UndefOr[Boolean | js.Any] = js.native
  
  var skipPackages: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  var skipPaths: js.UndefOr[Boolean | js.Array[String]] = js.native
}
object ConfigObject {
  
  @scala.inline
  def apply(): ConfigObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigObject]
  }
  
  @scala.inline
  implicit class ConfigObjectOps[Self <: ConfigObject] (val x: Self) extends AnyVal {
    
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
    def setAliases(value: Boolean | js.Object): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Callback*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: Boolean | Callback | js.Array[Callback]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setMaxItems(value: Double): Self = this.set("maxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItems: Self = this.set("maxItems", js.undefined)
    
    @scala.inline
    def setParsedErrorFiltersVarargs(value: Callback*): Self = this.set("parsedErrorFilters", js.Array(value :_*))
    
    @scala.inline
    def setParsedErrorFilters(value: Boolean | Callback | js.Array[Callback]): Self = this.set("parsedErrorFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParsedErrorFilters: Self = this.set("parsedErrorFilters", js.undefined)
    
    @scala.inline
    def setSkipVarargs(value: Callback*): Self = this.set("skip", js.Array(value :_*))
    
    @scala.inline
    def setSkip(value: Boolean | Callback | js.Array[Callback]): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setSkipNodeFiles(value: Boolean | js.Any): Self = this.set("skipNodeFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipNodeFiles: Self = this.set("skipNodeFiles", js.undefined)
    
    @scala.inline
    def setSkipPackagesVarargs(value: String*): Self = this.set("skipPackages", js.Array(value :_*))
    
    @scala.inline
    def setSkipPackages(value: Boolean | js.Array[String]): Self = this.set("skipPackages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipPackages: Self = this.set("skipPackages", js.undefined)
    
    @scala.inline
    def setSkipPathsVarargs(value: String*): Self = this.set("skipPaths", js.Array(value :_*))
    
    @scala.inline
    def setSkipPaths(value: Boolean | js.Array[String]): Self = this.set("skipPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipPaths: Self = this.set("skipPaths", js.undefined)
  }
}
