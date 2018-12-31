package typings
package reactDashSketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clear extends js.Object {
  /**
    * Reset the registered styles.
    */
  var clear: js.Function0[scala.Unit]
  /**
    * The primary interface to TextStyles. Call this before rendering.
    */
  var create: js.Function2[
    /* options */ Anon_ClearExistingStyles, 
    /* styles */ org.scalablytyped.runtime.StringDictionary[reactDashSketchappLib.reactDashSketchappMod.TextStyle], 
    _
  ]
  /**
    * Find a stored style by name.
    */
  var get: js.Function1[
    /* name */ java.lang.String, 
    js.UndefOr[reactDashSketchappLib.reactDashSketchappMod.TextStyle]
  ]
  /**
    * Find a stored native Sketch style object for a given JavaScript style object. You probably
    * don't need to use this.
    */
  var resolve: js.Function1[/* style */ reactDashSketchappLib.reactDashSketchappMod.TextStyle, _]
  /**
    * Find all of the registered styles. You probably don't need to use this.
    */
  var styles: org.scalablytyped.runtime.StringDictionary[js.UndefOr[reactDashSketchappLib.reactDashSketchappMod.TextStyle]]
}

