package typings.prettyFormat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var callToJSON: Boolean = js.native
  var escapeRegex: Boolean = js.native
  var escapeString: Boolean = js.native
  var highlight: Boolean = js.native
  var indent: Double = js.native
  var maxDepth: Double = js.native
  var min: Boolean = js.native
  var plugins: Plugins = js.native
  var printFunctionName: Boolean = js.native
  var theme: Theme = js.native
}

object Options {
  @scala.inline
  def apply(
    callToJSON: Boolean,
    escapeRegex: Boolean,
    escapeString: Boolean,
    highlight: Boolean,
    indent: Double,
    maxDepth: Double,
    min: Boolean,
    plugins: Plugins,
    printFunctionName: Boolean,
    theme: Theme
  ): Options = {
    val __obj = js.Dynamic.literal(callToJSON = callToJSON.asInstanceOf[js.Any], escapeRegex = escapeRegex.asInstanceOf[js.Any], escapeString = escapeString.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], printFunctionName = printFunctionName.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
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
    def setCallToJSON(value: Boolean): Self = this.set("callToJSON", value.asInstanceOf[js.Any])
    @scala.inline
    def setEscapeRegex(value: Boolean): Self = this.set("escapeRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def setEscapeString(value: Boolean): Self = this.set("escapeString", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlight(value: Boolean): Self = this.set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Boolean): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setPluginsVarargs(value: Plugin*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: Plugins): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintFunctionName(value: Boolean): Self = this.set("printFunctionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
  
}

