package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseParseOpts extends js.Object {
  
  /** The number of lines of template above and below a line with an error to include in the error message. */
  var contextLines: js.UndefOr[Double] = js.native
  
  /** Whether or not to produce a map of expression string -> function when parsing the template. */
  var csp: js.UndefOr[Boolean] = js.native
  
  /** The regular mustach delimiters - defaults to {{ }}. */
  var delimiters: js.UndefOr[ParseDelimiters] = js.native
  
  /** Whether or not to collapse consective whitespace into a single space. */
  var preserveWhitespace: js.UndefOr[Boolean] = js.native
  
  /** Whether or not to remove certain elements and event attributes from the parsed template. */
  var sanitize: js.UndefOr[Boolean | SanitizeOpts] = js.native
  
  /** The static mustache delimiters - defaults to [[ ]]. */
  var staticDelimiters: js.UndefOr[ParseDelimiters] = js.native
  
  /** The static triple mustache delimiters - defaults to [[[ ]]]. */
  var staticTripleDelimiters: js.UndefOr[ParseDelimiters] = js.native
  
  /** Whether or not to remove HTML comments from the template. Defaults to true. */
  var stripComments: js.UndefOr[Boolean] = js.native
  
  /** The triple mustache delimiters - defaults to {{{ }}}. */
  var tripleDelimiters: js.UndefOr[ParseDelimiters] = js.native
}
object BaseParseOpts {
  
  @scala.inline
  def apply(): BaseParseOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseParseOpts]
  }
  
  @scala.inline
  implicit class BaseParseOptsOps[Self <: BaseParseOpts] (val x: Self) extends AnyVal {
    
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
    def setContextLines(value: Double): Self = this.set("contextLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextLines: Self = this.set("contextLines", js.undefined)
    
    @scala.inline
    def setCsp(value: Boolean): Self = this.set("csp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsp: Self = this.set("csp", js.undefined)
    
    @scala.inline
    def setDelimiters(value: ParseDelimiters): Self = this.set("delimiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiters: Self = this.set("delimiters", js.undefined)
    
    @scala.inline
    def setPreserveWhitespace(value: Boolean): Self = this.set("preserveWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveWhitespace: Self = this.set("preserveWhitespace", js.undefined)
    
    @scala.inline
    def setSanitize(value: Boolean | SanitizeOpts): Self = this.set("sanitize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSanitize: Self = this.set("sanitize", js.undefined)
    
    @scala.inline
    def setStaticDelimiters(value: ParseDelimiters): Self = this.set("staticDelimiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticDelimiters: Self = this.set("staticDelimiters", js.undefined)
    
    @scala.inline
    def setStaticTripleDelimiters(value: ParseDelimiters): Self = this.set("staticTripleDelimiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticTripleDelimiters: Self = this.set("staticTripleDelimiters", js.undefined)
    
    @scala.inline
    def setStripComments(value: Boolean): Self = this.set("stripComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripComments: Self = this.set("stripComments", js.undefined)
    
    @scala.inline
    def setTripleDelimiters(value: ParseDelimiters): Self = this.set("tripleDelimiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTripleDelimiters: Self = this.set("tripleDelimiters", js.undefined)
  }
}
