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

trait Options extends js.Object {
  /**
    * A string to pass to compile.
    *
    * It is recommended that you use `includePaths` in conjunction with this so that sass can find files when using the @import directive.
    *
    * @default null
    */
  var data: js.UndefOr[String] = js.undefined
  /**
    * Path to a file to compile.
    *
    * @default null
    */
  var file: js.UndefOr[String] = js.undefined
  /**
    * Holds a collection of custom functions that may be invoked by the sass files being compiled.
    *
    * @default undefined
    */
  var functions: js.UndefOr[StringDictionary[js.Function1[/* repeated */ SassType, SassType | Unit]]] = js.undefined
  /**
    * Handles when the @import directive is encountered.
    *
    * A custom importer allows extension of the sass engine in both a synchronous and asynchronous manner.
    *
    * @default undefined
    */
  var importer: js.UndefOr[Importer | js.Array[Importer]] = js.undefined
  /**
    * An array of paths that should be looked in to attempt to resolve your @import declarations.
    * When using `data`, it is recommended that you use this.
    *
    * @default []
    */
  var includePaths: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Used to determine whether to use space or tab character for indentation.
    *
    * @default 'space'
    */
  var indentType: js.UndefOr[space | tab] = js.undefined
  /**
    * Used to determine the number of spaces or tabs to be used for indentation.
    *
    * @default 2
    */
  var indentWidth: js.UndefOr[Double] = js.undefined
  /**
    * Enable Sass Indented Syntax for parsing the data string or file.
    *
    * @default false
    */
  var indentedSyntax: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to determine which sequence to use for line breaks.
    *
    * @default 'lf'
    */
  var linefeed: js.UndefOr[cr | crlf | lf | lfcr] = js.undefined
  /**
    * Disable the inclusion of source map information in the output file.
    *
    * @default false
    */
  var omitSourceMapUrl: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify the intended location of the output file.
    * Strongly recommended when outputting source maps so that they can properly refer back to their intended files.
    *
    * @default null
    */
  var outFile: js.UndefOr[String] = js.undefined
  /**
    * Determines the output format of the final CSS style.
    *
    * @default 'expanded'
    */
  var outputStyle: js.UndefOr[compressed | expanded] = js.undefined
  /**
    * Enables the outputting of a source map.
    *
    * @default undefined
    */
  var sourceMap: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Includes the contents in the source map information.
    *
    * @default false
    */
  var sourceMapContents: js.UndefOr[Boolean] = js.undefined
  /**
    * Embeds the source map as a data URI.
    *
    * @default false
    */
  var sourceMapEmbed: js.UndefOr[Boolean] = js.undefined
  /**
    * The value will be emitted as `sourceRoot` in the source map information.
    *
    * @default undefined
    */
  var sourceMapRoot: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    data: String = null,
    file: String = null,
    functions: StringDictionary[js.Function1[/* repeated */ SassType, SassType | Unit]] = null,
    importer: Importer | js.Array[Importer] = null,
    includePaths: js.Array[String] = null,
    indentType: space | tab = null,
    indentWidth: js.UndefOr[Double] = js.undefined,
    indentedSyntax: js.UndefOr[Boolean] = js.undefined,
    linefeed: cr | crlf | lf | lfcr = null,
    omitSourceMapUrl: js.UndefOr[Boolean] = js.undefined,
    outFile: String = null,
    outputStyle: compressed | expanded = null,
    sourceMap: Boolean | String = null,
    sourceMapContents: js.UndefOr[Boolean] = js.undefined,
    sourceMapEmbed: js.UndefOr[Boolean] = js.undefined,
    sourceMapRoot: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (importer != null) __obj.updateDynamic("importer")(importer.asInstanceOf[js.Any])
    if (includePaths != null) __obj.updateDynamic("includePaths")(includePaths.asInstanceOf[js.Any])
    if (indentType != null) __obj.updateDynamic("indentType")(indentType.asInstanceOf[js.Any])
    if (!js.isUndefined(indentWidth)) __obj.updateDynamic("indentWidth")(indentWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indentedSyntax)) __obj.updateDynamic("indentedSyntax")(indentedSyntax.get.asInstanceOf[js.Any])
    if (linefeed != null) __obj.updateDynamic("linefeed")(linefeed.asInstanceOf[js.Any])
    if (!js.isUndefined(omitSourceMapUrl)) __obj.updateDynamic("omitSourceMapUrl")(omitSourceMapUrl.get.asInstanceOf[js.Any])
    if (outFile != null) __obj.updateDynamic("outFile")(outFile.asInstanceOf[js.Any])
    if (outputStyle != null) __obj.updateDynamic("outputStyle")(outputStyle.asInstanceOf[js.Any])
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapContents)) __obj.updateDynamic("sourceMapContents")(sourceMapContents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapEmbed)) __obj.updateDynamic("sourceMapEmbed")(sourceMapEmbed.get.asInstanceOf[js.Any])
    if (sourceMapRoot != null) __obj.updateDynamic("sourceMapRoot")(sourceMapRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

