package typings.reactSketchapp.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactSketchapp.anon.ClearExistingStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextStyles {
  
  @JSImport("react-sketchapp", "TextStyles")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Reset the registered styles.
    */
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  /**
    * The primary interface to TextStyles. Call this before rendering.
    */
  inline def create(options: ClearExistingStyles, styles: StringDictionary[TextStyle]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Find a stored style by name.
    */
  inline def get(name: String): js.UndefOr[TextStyle] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TextStyle]]
  
  /**
    * Find a stored native Sketch style object for a given JavaScript style object. You probably
    * don't need to use this.
    */
  inline def resolve(style: TextStyle): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(style.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
