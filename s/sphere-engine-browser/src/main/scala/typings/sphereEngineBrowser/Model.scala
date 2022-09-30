package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of related shapes with an associated shader program and transformation
  * matrix.
  */
@js.native
trait Model extends StObject {
  
  /**
    * Render the model to a surface or the backbuffer if no surface is provided.
    * @param surface Surface on which to render the model.
    */
  def draw(): Unit = js.native
  def draw(surface: Surface): Unit = js.native
  
  var shader: Shader = js.native
  
  var transform: Transform = js.native
}
