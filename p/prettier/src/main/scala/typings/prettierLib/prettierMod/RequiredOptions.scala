package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RequiredOptions
  extends prettierLib.prettierMod.docNs.printerNs.Options {
  /**
       * Include parentheses around a sole arrow function parameter.
       */
  var arrowParens: prettierLib.prettierLibStrings.avoid | prettierLib.prettierLibStrings.always
  /**
       * Print spaces between brackets in object literals.
       */
  var bracketSpacing: scala.Boolean
  /**
       * Specify the input filepath. This will be used to do parser inference.
       */
  var filepath: java.lang.String
  /**
       * Prettier can insert a special @format marker at the top of files specifying that
       * the file has been formatted with prettier. This works well when used in tandem with
       * the --require-pragma option. If there is already a docblock at the top of
       * the file then this option will add a newline to it with the @format marker.
       */
  var insertPragma: scala.Boolean
  /**
       * Put the `>` of a multi-line JSX element at the end of the last line instead of being alone on the next line.
       */
  var jsxBracketSameLine: scala.Boolean
  /**
       * Specify which parser to use.
       */
  var parser: BuiltInParserName | CustomParser
  /**
       * The plugin API is in a beta state.
       */
  var plugins: js.Array[java.lang.String | Plugin]
  /**
       * By default, Prettier will wrap markdown text as-is since some services use a linebreak-sensitive renderer.
       * In some cases you may want to rely on editor/viewer soft wrapping instead, so this option allows you to opt out.
       */
  var proseWrap: scala.Boolean | prettierLib.prettierLibStrings.always | prettierLib.prettierLibStrings.never | prettierLib.prettierLibStrings.preserve
  /**
       * Format only a segment of a file.
       */
  var rangeEnd: scala.Double
  /**
       * Format only a segment of a file.
       */
  var rangeStart: scala.Double
  /**
       * Prettier can restrict itself to only format files that contain a special comment, called a pragma, at the top of the file.
       * This is very useful when gradually transitioning large, unformatted codebases to prettier.
       */
  var requirePragma: scala.Boolean
  /**
       * Print semicolons at the ends of statements.
       */
  var semi: scala.Boolean
  /**
       * Use single quotes instead of double quotes.
       */
  var singleQuote: scala.Boolean
  /**
       * Print trailing commas wherever possible.
       */
  var trailingComma: prettierLib.prettierLibStrings.none | prettierLib.prettierLibStrings.es5 | prettierLib.prettierLibStrings.all
}

