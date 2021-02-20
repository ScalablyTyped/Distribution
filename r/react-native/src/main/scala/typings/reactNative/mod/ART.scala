package typings.reactNative.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ART extends Shortcut {
  
  @JSImport("react-native", "ART")
  @js.native
  val ^ : ARTStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-native", "ART.ClippingRectangle")
  @js.native
  class ClippingRectangleCls () extends ClippingRectangle
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-native", "ART.Group")
  @js.native
  class GroupCls () extends Group
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-native", "ART.Shape")
  @js.native
  class ShapeCls () extends Shape
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-native", "ART.Surface")
  @js.native
  class SurfaceCls () extends Surface
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-native", "ART.Text")
  @js.native
  class TextCls () extends ARTText
  
  type _To = ARTStatic
  
  /* This means you don't have to write `^`, but can instead just say `ART.foo` */
  override def _to: ARTStatic = ^
}
