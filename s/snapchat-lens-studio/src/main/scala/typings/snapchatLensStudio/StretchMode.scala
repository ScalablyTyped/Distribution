package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StretchMode extends StObject
/**
  * Options for stretching a mesh to fit a ScreenTransform’s bounding box. Used in MeshVisual’s stretchMode property, as long as the SceneObject has a ScreenTransform attached. Also used in TextFill’s
  * textureStretch property to control texture stretching when drawing text.
  */
@JSGlobal("StretchMode")
@js.native
object StretchMode extends StObject {
  
  /** Scale uniformly so that both width and height meet or exceed the bounds. */
  @js.native
  sealed trait Fill
    extends StObject
       with StretchMode
  
  /** Same as Fill, but when used with the Image component any area outside of the bounds is cropped out. */
  @js.native
  sealed trait FillAndCut
    extends StObject
       with StretchMode
  
  /** Scale uniformly so that both width and height fit within the bounds. */
  @js.native
  sealed trait Fit
    extends StObject
       with StretchMode
  
  /** Scale uniformly to match the same height as the bounds. */
  @js.native
  sealed trait FitHeight
    extends StObject
       with StretchMode
  
  /** Scale uniformly to match the same width as the bounds. */
  @js.native
  sealed trait FitWidth
    extends StObject
       with StretchMode
  
  /** Scale non-uniformly to match the exact width and height of the bounds. */
  @js.native
  sealed trait Stretch
    extends StObject
       with StretchMode
}
