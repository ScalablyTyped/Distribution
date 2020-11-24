package typings.recast.optionsMod

import typings.recast.recastStrings.auto
import typings.recast.recastStrings.double
import typings.recast.recastStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<ast-types.ast-types/types.Omit<recast.recast/lib/options.Options, keyof recast.recast/lib/options.DeprecatedOptions>> */
@js.native
trait NormalizedOptions extends js.Object {
  
  var arrayBracketSpacing: Boolean = js.native
  
  var arrowParensAlways: Boolean = js.native
  
  var flowObjectCommas: Boolean = js.native
  
  var inputSourceMap: String = js.native
  
  var lineTerminator: String = js.native
  
  var objectCurlySpacing: Boolean = js.native
  
  var parser: js.Any = js.native
  
  var quote: single | double | auto = js.native
  
  var range: Boolean = js.native
  
  var reuseWhitespace: Boolean = js.native
  
  var sourceFileName: String = js.native
  
  var sourceMapName: String = js.native
  
  var sourceRoot: String = js.native
  
  var tabWidth: Double = js.native
  
  var tokens: Boolean = js.native
  
  var tolerant: Boolean = js.native
  
  var trailingComma: Boolean = js.native
  
  var useTabs: Boolean = js.native
  
  var wrapColumn: Double = js.native
}
object NormalizedOptions {
  
  @scala.inline
  def apply(
    arrayBracketSpacing: Boolean,
    arrowParensAlways: Boolean,
    flowObjectCommas: Boolean,
    inputSourceMap: String,
    lineTerminator: String,
    objectCurlySpacing: Boolean,
    parser: js.Any,
    quote: single | double | auto,
    range: Boolean,
    reuseWhitespace: Boolean,
    sourceFileName: String,
    sourceMapName: String,
    sourceRoot: String,
    tabWidth: Double,
    tokens: Boolean,
    tolerant: Boolean,
    trailingComma: Boolean,
    useTabs: Boolean,
    wrapColumn: Double
  ): NormalizedOptions = {
    val __obj = js.Dynamic.literal(arrayBracketSpacing = arrayBracketSpacing.asInstanceOf[js.Any], arrowParensAlways = arrowParensAlways.asInstanceOf[js.Any], flowObjectCommas = flowObjectCommas.asInstanceOf[js.Any], inputSourceMap = inputSourceMap.asInstanceOf[js.Any], lineTerminator = lineTerminator.asInstanceOf[js.Any], objectCurlySpacing = objectCurlySpacing.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], quote = quote.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], reuseWhitespace = reuseWhitespace.asInstanceOf[js.Any], sourceFileName = sourceFileName.asInstanceOf[js.Any], sourceMapName = sourceMapName.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], tabWidth = tabWidth.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], tolerant = tolerant.asInstanceOf[js.Any], trailingComma = trailingComma.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any], wrapColumn = wrapColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedOptions]
  }
  
  @scala.inline
  implicit class NormalizedOptionsOps[Self <: NormalizedOptions] (val x: Self) extends AnyVal {
    
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
    def setArrowParensAlways(value: Boolean): Self = this.set("arrowParensAlways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowObjectCommas(value: Boolean): Self = this.set("flowObjectCommas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSourceMap(value: String): Self = this.set("inputSourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineTerminator(value: String): Self = this.set("lineTerminator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectCurlySpacing(value: Boolean): Self = this.set("objectCurlySpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParser(value: js.Any): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuote(value: single | double | auto): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReuseWhitespace(value: Boolean): Self = this.set("reuseWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFileName(value: String): Self = this.set("sourceFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapName(value: String): Self = this.set("sourceMapName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRoot(value: String): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabWidth(value: Double): Self = this.set("tabWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokens(value: Boolean): Self = this.set("tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTolerant(value: Boolean): Self = this.set("tolerant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingComma(value: Boolean): Self = this.set("trailingComma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTabs(value: Boolean): Self = this.set("useTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapColumn(value: Double): Self = this.set("wrapColumn", value.asInstanceOf[js.Any])
  }
}
