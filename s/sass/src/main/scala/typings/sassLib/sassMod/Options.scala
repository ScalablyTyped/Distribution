package typings
package sassLib.sassMod

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
  var data: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Path to a file to compile.
       *
       * @default null
       */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Holds a collection of custom functions that may be invoked by the sass files being compiled.
       *
       * @default undefined
       */
  var functions: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Function0[scala.Unit]]] = js.undefined
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
  var includePaths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * Used to determine whether to use space or tab character for indentation.
       *
       * @default 'space'
       */
  var indentType: js.UndefOr[sassLib.sassLibStrings.space | sassLib.sassLibStrings.tab] = js.undefined
  /**
       * Used to determine the number of spaces or tabs to be used for indentation.
       *
       * @default 2
       */
  var indentWidth: js.UndefOr[scala.Double] = js.undefined
  /**
       * Enable Sass Indented Syntax for parsing the data string or file.
       *
       * @default false
       */
  var indentedSyntax: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Used to determine which sequence to use for line breaks.
       *
       * @default 'lf'
       */
  var linefeed: js.UndefOr[
    sassLib.sassLibStrings.cr | sassLib.sassLibStrings.crlf | sassLib.sassLibStrings.lf | sassLib.sassLibStrings.lfcr
  ] = js.undefined
  /**
       * Disable the inclusion of source map information in the output file.
       *
       * @default false
       */
  var omitSourceMapUrl: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Specify the intended location of the output file.
       * Strongly recommended when outputting source maps so that they can properly refer back to their intended files.
       *
       * @default null
       */
  var outFile: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Determines the output format of the final CSS style.
       *
       * @default 'expanded'
       */
  var outputStyle: js.UndefOr[sassLib.sassLibStrings.compressed | sassLib.sassLibStrings.expanded] = js.undefined
  /**
       * Enables the outputting of a source map.
       *
       * @default undefined
       */
  var sourceMap: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
       * Includes the contents in the source map information.
       *
       * @default false
       */
  var sourceMapContents: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Embeds the source map as a data URI.
       *
       * @default false
       */
  var sourceMapEmbed: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The value will be emitted as `sourceRoot` in the source map information.
       *
       * @default undefined
       */
  var sourceMapRoot: js.UndefOr[java.lang.String] = js.undefined
}

