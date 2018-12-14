package typings
package reactDashSketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Flatten extends js.Object {
  var absoluteFill: reactDashSketchappLib.reactDashSketchappMod.StyleReference
  /**
       * Create an optimized `StyleSheet` reference from a style object.
       */
  var create: js.Function1[
    /* t */ org.scalablytyped.runtime.StringDictionary[
      reactDashSketchappLib.reactDashSketchappMod.Style | reactDashSketchappLib.reactDashSketchappMod.TextStyle
    ], 
    reactDashSketchappLib.reactDashSketchappLibStrings.Anon_Flatten with js.Any
  ]
  /**
       * Flatten an array of style objects into one aggregated object, or look up the definition for a
       * registered stylesheet.
       */
  var flatten: js.Function1[
    /* input */ js.UndefOr[
      (js.Array[
        reactDashSketchappLib.reactDashSketchappMod.Style | reactDashSketchappLib.reactDashSketchappMod.TextStyle | reactDashSketchappLib.reactDashSketchappMod.StyleReference
      ]) | reactDashSketchappLib.reactDashSketchappMod.StyleReference | reactDashSketchappLib.reactDashSketchappMod.Style
    ], 
    reactDashSketchappLib.reactDashSketchappMod.Style | reactDashSketchappLib.reactDashSketchappMod.TextStyle
  ]
  var hairlineWidth: reactDashSketchappLib.reactDashSketchappLibNumbers.`1`
   // returns the expanded style or expanded style reference which conforms
  // to the `Style | TextStyle` interface
  /**
       * resolve one style
       */
  var resolve: js.Function1[
    /* style */ reactDashSketchappLib.reactDashSketchappMod.Style | reactDashSketchappLib.reactDashSketchappMod.TextStyle, 
    Anon_Style
  ]
}

