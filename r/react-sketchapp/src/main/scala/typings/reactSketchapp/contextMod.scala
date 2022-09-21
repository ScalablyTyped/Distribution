package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.react.mod.Context
import typings.reactSketchapp.anon.ChildrenStyle
import typings.reactSketchapp.anon.State
import typings.reactSketchapp.anon.Viewport
import typings.reactSketchapp.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("react-sketchapp/lib/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/context", "ArtboardContext")
  @js.native
  val ArtboardContext: Context[State] = js.native
  
  inline def ArtboardProvider(hasChildrenViewportStyle: ArtboardProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ArtboardProvider")(hasChildrenViewportStyle.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useWindowDimensions(): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("useWindowDimensions")().asInstanceOf[Width]
  
  type ArtboardProps = InferProps[Viewport] & ChildrenStyle
}
