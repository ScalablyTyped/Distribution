package typings.progressbarJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type StepFunction = js.Function3[
    /* state */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* path */ typings.progressbarJs.pathMod.^[typings.std.SVGPathElement], 
    /* attachement */ typings.std.SVGPathElement, 
    scala.Unit
  ]
  /** Inline CSS styles for the created SVG element */
  type SvgInlineStyle = org.scalablytyped.runtime.StringDictionary[js.Any | scala.Null]
  type SvgSelector = typings.std.SVGPathElement | java.lang.String
  /** Inline CSS styles for the text element */
  type TextInlineStyle = org.scalablytyped.runtime.StringDictionary[js.Any]
}
