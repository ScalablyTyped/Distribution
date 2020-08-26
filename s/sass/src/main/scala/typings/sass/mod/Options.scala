package typings.sass.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sass.mod.types.SassType
import typings.sass.sassStrings.compressed
import typings.sass.sassStrings.cr
import typings.sass.sassStrings.crlf
import typings.sass.sassStrings.expanded
import typings.sass.sassStrings.lf
import typings.sass.sassStrings.lfcr
import typings.sass.sassStrings.space
import typings.sass.sassStrings.tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * A string to pass to compile.
    *
    * It is recommended that you use `includePaths` in conjunction with this so that sass can find files when using the @import directive.
    *
    * @default null
    */
  var data: js.UndefOr[String] = js.native
  /**
    * Path to a file to compile.
    *
    * @default null
    */
  var file: js.UndefOr[String] = js.native
  /**
    * Holds a collection of custom functions that may be invoked by the sass files being compiled.
    *
    * @default undefined
    */
  var functions: js.UndefOr[StringDictionary[js.Function1[/* repeated */ SassType, SassType | Unit]]] = js.native
  /**
    * Handles when the @import directive is encountered.
    *
    * A custom importer allows extension of the sass engine in both a synchronous and asynchronous manner.
    *
    * @default undefined
    */
  var importer: js.UndefOr[Importer | js.Array[Importer]] = js.native
  /**
    * An array of paths that should be looked in to attempt to resolve your @import declarations.
    * When using `data`, it is recommended that you use this.
    *
    * @default []
    */
  var includePaths: js.UndefOr[js.Array[String]] = js.native
  /**
    * Used to determine whether to use space or tab character for indentation.
    *
    * @default 'space'
    */
  var indentType: js.UndefOr[space | tab] = js.native
  /**
    * Used to determine the number of spaces or tabs to be used for indentation.
    *
    * @default 2
    */
  var indentWidth: js.UndefOr[Double] = js.native
  /**
    * Enable Sass Indented Syntax for parsing the data string or file.
    *
    * @default false
    */
  var indentedSyntax: js.UndefOr[Boolean] = js.native
  /**
    * Used to determine which sequence to use for line breaks.
    *
    * @default 'lf'
    */
  var linefeed: js.UndefOr[cr | crlf | lf | lfcr] = js.native
  /**
    * Disable the inclusion of source map information in the output file.
    *
    * @default false
    */
  var omitSourceMapUrl: js.UndefOr[Boolean] = js.native
  /**
    * Specify the intended location of the output file.
    * Strongly recommended when outputting source maps so that they can properly refer back to their intended files.
    *
    * @default null
    */
  var outFile: js.UndefOr[String] = js.native
  /**
    * Determines the output format of the final CSS style.
    *
    * @default 'expanded'
    */
  var outputStyle: js.UndefOr[compressed | expanded] = js.native
  /**
    * Enables the outputting of a source map.
    *
    * @default undefined
    */
  var sourceMap: js.UndefOr[Boolean | String] = js.native
  /**
    * Includes the contents in the source map information.
    *
    * @default false
    */
  var sourceMapContents: js.UndefOr[Boolean] = js.native
  /**
    * Embeds the source map as a data URI.
    *
    * @default false
    */
  var sourceMapEmbed: js.UndefOr[Boolean] = js.native
  /**
    * The value will be emitted as `sourceRoot` in the source map information.
    *
    * @default undefined
    */
  var sourceMapRoot: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setFunctions(value: StringDictionary[js.Function1[/* repeated */ SassType, SassType | Unit]]): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
    @scala.inline
    def setImporterVarargs(value: Importer*): Self = this.set("importer", js.Array(value :_*))
    @scala.inline
    def setImporterFunction3(
      value: (/* url */ String, /* prev */ String, /* done */ js.Function1[/* data */ ImporterReturnType, Unit]) => ImporterReturnType | Unit
    ): Self = this.set("importer", js.Any.fromFunction3(value))
    @scala.inline
    def setImporter(value: Importer | js.Array[Importer]): Self = this.set("importer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImporter: Self = this.set("importer", js.undefined)
    @scala.inline
    def setIncludePathsVarargs(value: String*): Self = this.set("includePaths", js.Array(value :_*))
    @scala.inline
    def setIncludePaths(value: js.Array[String]): Self = this.set("includePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludePaths: Self = this.set("includePaths", js.undefined)
    @scala.inline
    def setIndentType(value: space | tab): Self = this.set("indentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentType: Self = this.set("indentType", js.undefined)
    @scala.inline
    def setIndentWidth(value: Double): Self = this.set("indentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentWidth: Self = this.set("indentWidth", js.undefined)
    @scala.inline
    def setIndentedSyntax(value: Boolean): Self = this.set("indentedSyntax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentedSyntax: Self = this.set("indentedSyntax", js.undefined)
    @scala.inline
    def setLinefeed(value: cr | crlf | lf | lfcr): Self = this.set("linefeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinefeed: Self = this.set("linefeed", js.undefined)
    @scala.inline
    def setOmitSourceMapUrl(value: Boolean): Self = this.set("omitSourceMapUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOmitSourceMapUrl: Self = this.set("omitSourceMapUrl", js.undefined)
    @scala.inline
    def setOutFile(value: String): Self = this.set("outFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutFile: Self = this.set("outFile", js.undefined)
    @scala.inline
    def setOutputStyle(value: compressed | expanded): Self = this.set("outputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputStyle: Self = this.set("outputStyle", js.undefined)
    @scala.inline
    def setSourceMap(value: Boolean | String): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    @scala.inline
    def setSourceMapContents(value: Boolean): Self = this.set("sourceMapContents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMapContents: Self = this.set("sourceMapContents", js.undefined)
    @scala.inline
    def setSourceMapEmbed(value: Boolean): Self = this.set("sourceMapEmbed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMapEmbed: Self = this.set("sourceMapEmbed", js.undefined)
    @scala.inline
    def setSourceMapRoot(value: String): Self = this.set("sourceMapRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMapRoot: Self = this.set("sourceMapRoot", js.undefined)
  }
  
}

