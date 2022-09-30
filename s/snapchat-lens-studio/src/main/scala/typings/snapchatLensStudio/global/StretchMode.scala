package typings.snapchatLensStudio.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for stretching a mesh to fit a ScreenTransform’s bounding box. Used in MeshVisual’s stretchMode property, as long as the SceneObject has a ScreenTransform attached. Also used in TextFill’s
  * textureStretch property to control texture stretching when drawing text.
  */
@JSGlobal("StretchMode")
@js.native
object StretchMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.StretchMode & Double] = js.native
  
  /* 1 */ val Fill: typings.snapchatLensStudio.StretchMode.Fill & Double = js.native
  
  /* 5 */ val FillAndCut: typings.snapchatLensStudio.StretchMode.FillAndCut & Double = js.native
  
  /* 0 */ val Fit: typings.snapchatLensStudio.StretchMode.Fit & Double = js.native
  
  /* 3 */ val FitHeight: typings.snapchatLensStudio.StretchMode.FitHeight & Double = js.native
  
  /* 4 */ val FitWidth: typings.snapchatLensStudio.StretchMode.FitWidth & Double = js.native
  
  /* 2 */ val Stretch: typings.snapchatLensStudio.StretchMode.Stretch & Double = js.native
}
