package typings.reactSketchapp.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactSketchapp.anon.ClearExistingStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextStyles {
  
  /**
    * Reset the registered styles.
    */
  @JSImport("react-sketchapp", "TextStyles.clear")
  @js.native
  def clear(): Unit = js.native
  
  /**
    * The primary interface to TextStyles. Call this before rendering.
    */
  @JSImport("react-sketchapp", "TextStyles.create")
  @js.native
  def create(options: ClearExistingStyles, styles: StringDictionary[TextStyle]): js.Any = js.native
  
  /**
    * Find a stored style by name.
    */
  @JSImport("react-sketchapp", "TextStyles.get")
  @js.native
  def get(name: String): js.UndefOr[TextStyle] = js.native
  
  /**
    * Find a stored native Sketch style object for a given JavaScript style object. You probably
    * don't need to use this.
    */
  @JSImport("react-sketchapp", "TextStyles.resolve")
  @js.native
  def resolve(style: TextStyle): js.Any = js.native
  
  /**
    * Find all of the registered styles. You probably don't need to use this.
    */
  object styles
}
