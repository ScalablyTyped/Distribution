package typings.reactSketchapp

import typings.reactSketchapp.moduleTypesMod.ResizeConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonUtilsResizeConstraintMod {
  
  @JSImport("react-sketchapp/lib/module/jsonUtils/resizeConstraint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeResizeConstraint(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("makeResizeConstraint")().asInstanceOf[Double]
  inline def makeResizeConstraint(resizingConstraint: ResizeConstraints): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("makeResizeConstraint")(resizingConstraint.asInstanceOf[js.Any]).asInstanceOf[Double]
}
