package typings.recast.anon

import typings.recast.recastStrings.auto
import typings.recast.recastStrings.double
import typings.recast.recastStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<recast.recast/lib/options.Options> */
@js.native
trait PartialOptions extends js.Object {
  
  var arrayBracketSpacing: js.UndefOr[Boolean] = js.native
  
  var arrowParensAlways: js.UndefOr[Boolean] = js.native
  
  var esprima: js.UndefOr[js.Any] = js.native
  
  var flowObjectCommas: js.UndefOr[Boolean] = js.native
  
  var inputSourceMap: js.UndefOr[String | Null] = js.native
  
  var lineTerminator: js.UndefOr[String] = js.native
  
  var objectCurlySpacing: js.UndefOr[Boolean] = js.native
  
  var parser: js.UndefOr[js.Any] = js.native
  
  var quote: js.UndefOr[single | double | auto | Null] = js.native
  
  var range: js.UndefOr[Boolean] = js.native
  
  var reuseWhitespace: js.UndefOr[Boolean] = js.native
  
  var sourceFileName: js.UndefOr[String | Null] = js.native
  
  var sourceMapName: js.UndefOr[String | Null] = js.native
  
  var sourceRoot: js.UndefOr[String | Null] = js.native
  
  var tabWidth: js.UndefOr[Double] = js.native
  
  var tokens: js.UndefOr[Boolean] = js.native
  
  var tolerant: js.UndefOr[Boolean] = js.native
  
  var trailingComma: js.UndefOr[Boolean] = js.native
  
  var useTabs: js.UndefOr[Boolean] = js.native
  
  var wrapColumn: js.UndefOr[Double] = js.native
}
object PartialOptions {
  
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
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
    def setArrayBracketSpacing(value: Boolean): Self = this.set("arrayBracketSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayBracketSpacing: Self = this.set("arrayBracketSpacing", js.undefined)
    
    @scala.inline
    def setArrowParensAlways(value: Boolean): Self = this.set("arrowParensAlways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowParensAlways: Self = this.set("arrowParensAlways", js.undefined)
    
    @scala.inline
    def setEsprima(value: js.Any): Self = this.set("esprima", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEsprima: Self = this.set("esprima", js.undefined)
    
    @scala.inline
    def setFlowObjectCommas(value: Boolean): Self = this.set("flowObjectCommas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowObjectCommas: Self = this.set("flowObjectCommas", js.undefined)
    
    @scala.inline
    def setInputSourceMap(value: String): Self = this.set("inputSourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputSourceMap: Self = this.set("inputSourceMap", js.undefined)
    
    @scala.inline
    def setInputSourceMapNull: Self = this.set("inputSourceMap", null)
    
    @scala.inline
    def setLineTerminator(value: String): Self = this.set("lineTerminator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineTerminator: Self = this.set("lineTerminator", js.undefined)
    
    @scala.inline
    def setObjectCurlySpacing(value: Boolean): Self = this.set("objectCurlySpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectCurlySpacing: Self = this.set("objectCurlySpacing", js.undefined)
    
    @scala.inline
    def setParser(value: js.Any): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    
    @scala.inline
    def setQuote(value: single | double | auto): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    
    @scala.inline
    def setQuoteNull: Self = this.set("quote", null)
    
    @scala.inline
    def setRange(value: Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setReuseWhitespace(value: Boolean): Self = this.set("reuseWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReuseWhitespace: Self = this.set("reuseWhitespace", js.undefined)
    
    @scala.inline
    def setSourceFileName(value: String): Self = this.set("sourceFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceFileName: Self = this.set("sourceFileName", js.undefined)
    
    @scala.inline
    def setSourceFileNameNull: Self = this.set("sourceFileName", null)
    
    @scala.inline
    def setSourceMapName(value: String): Self = this.set("sourceMapName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMapName: Self = this.set("sourceMapName", js.undefined)
    
    @scala.inline
    def setSourceMapNameNull: Self = this.set("sourceMapName", null)
    
    @scala.inline
    def setSourceRoot(value: String): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRoot: Self = this.set("sourceRoot", js.undefined)
    
    @scala.inline
    def setSourceRootNull: Self = this.set("sourceRoot", null)
    
    @scala.inline
    def setTabWidth(value: Double): Self = this.set("tabWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabWidth: Self = this.set("tabWidth", js.undefined)
    
    @scala.inline
    def setTokens(value: Boolean): Self = this.set("tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
    
    @scala.inline
    def setTolerant(value: Boolean): Self = this.set("tolerant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTolerant: Self = this.set("tolerant", js.undefined)
    
    @scala.inline
    def setTrailingComma(value: Boolean): Self = this.set("trailingComma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailingComma: Self = this.set("trailingComma", js.undefined)
    
    @scala.inline
    def setUseTabs(value: Boolean): Self = this.set("useTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTabs: Self = this.set("useTabs", js.undefined)
    
    @scala.inline
    def setWrapColumn(value: Double): Self = this.set("wrapColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapColumn: Self = this.set("wrapColumn", js.undefined)
  }
}
