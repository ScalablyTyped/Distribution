package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp", "TextStyles")
@js.native
object TextStyles extends js.Object {
  /**
    * Find all of the registered styles. You probably don't need to use this.
    */
  var styles: org.scalablytyped.runtime.StringDictionary[js.UndefOr[reactDashSketchappLib.reactDashSketchappMod.TextStyle]] = js.native
  /**
    * Reset the registered styles.
    */
  def clear(): scala.Unit = js.native
  /**
    * The primary interface to TextStyles. Call this before rendering.
    */
  def create(
    options: reactDashSketchappLib.Anon_ClearExistingStyles,
    styles: org.scalablytyped.runtime.StringDictionary[reactDashSketchappLib.reactDashSketchappMod.TextStyle]
  ): js.Any = js.native
  /**
    * Find a stored style by name.
    */
  def get(name: java.lang.String): js.UndefOr[reactDashSketchappLib.reactDashSketchappMod.TextStyle] = js.native
  /**
    * Find a stored native Sketch style object for a given JavaScript style object. You probably
    * don't need to use this.
    */
  def resolve(style: reactDashSketchappLib.reactDashSketchappMod.TextStyle): js.Any = js.native
}

