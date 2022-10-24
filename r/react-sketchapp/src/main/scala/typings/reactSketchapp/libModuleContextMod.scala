package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.react.mod.Context
import typings.reactSketchapp.anon.ChildrenAny
import typings.reactSketchapp.anon.Scale
import typings.reactSketchapp.anon.State
import typings.reactSketchapp.anon.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleContextMod {
  
  @JSImport("react-sketchapp/lib/module/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/module/context", "ArtboardContext")
  @js.native
  val ArtboardContext: Context[State] = js.native
  
  inline def ArtboardProvider(param0: ArtboardProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ArtboardProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useWindowDimensions(): Scale = ^.asInstanceOf[js.Dynamic].applyDynamic("useWindowDimensions")().asInstanceOf[Scale]
  
  type ArtboardProps = InferProps[Viewport] & ChildrenAny
}
