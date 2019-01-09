package typings
package reactDashSketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clear extends js.Object {
  /**
    * Find all of the registered styles. You probably don't need to use this.
    */
  var styles: org.scalablytyped.runtime.StringDictionary[js.UndefOr[reactDashSketchappLib.reactDashSketchappMod.TextStyle]]
  /**
    * Reset the registered styles.
    */
  def clear(): scala.Unit
  /**
    * The primary interface to TextStyles. Call this before rendering.
    */
  def create(
    options: Anon_ClearExistingStyles,
    styles: org.scalablytyped.runtime.StringDictionary[reactDashSketchappLib.reactDashSketchappMod.TextStyle]
  ): js.Any
  /**
    * Find a stored style by name.
    */
  def get(name: java.lang.String): js.UndefOr[reactDashSketchappLib.reactDashSketchappMod.TextStyle]
  /**
    * Find a stored native Sketch style object for a given JavaScript style object. You probably
    * don't need to use this.
    */
  def resolve(style: reactDashSketchappLib.reactDashSketchappMod.TextStyle): js.Any
}

