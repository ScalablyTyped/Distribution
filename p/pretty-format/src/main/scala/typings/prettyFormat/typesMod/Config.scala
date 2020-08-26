package typings.prettyFormat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var callToJSON: Boolean = js.native
  var colors: Colors = js.native
  var escapeRegex: Boolean = js.native
  var escapeString: Boolean = js.native
  var indent: String = js.native
  var maxDepth: Double = js.native
  var min: Boolean = js.native
  var plugins: Plugins = js.native
  var printFunctionName: Boolean = js.native
  var spacingInner: String = js.native
  var spacingOuter: String = js.native
}

object Config {
  @scala.inline
  def apply(
    callToJSON: Boolean,
    colors: Colors,
    escapeRegex: Boolean,
    escapeString: Boolean,
    indent: String,
    maxDepth: Double,
    min: Boolean,
    plugins: Plugins,
    printFunctionName: Boolean,
    spacingInner: String,
    spacingOuter: String
  ): Config = {
    val __obj = js.Dynamic.literal(callToJSON = callToJSON.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], escapeRegex = escapeRegex.asInstanceOf[js.Any], escapeString = escapeString.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], printFunctionName = printFunctionName.asInstanceOf[js.Any], spacingInner = spacingInner.asInstanceOf[js.Any], spacingOuter = spacingOuter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setColors(value: Colors): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setEscapeRegex(value: Boolean): Self = this.set("escapeRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def setEscapeString(value: Boolean): Self = this.set("escapeString", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
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
    def setSpacingInner(value: String): Self = this.set("spacingInner", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpacingOuter(value: String): Self = this.set("spacingOuter", value.asInstanceOf[js.Any])
  }
  
}

