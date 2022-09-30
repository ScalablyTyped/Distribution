package typings.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of related shapes with an associated shader program and transformation
  * matrix.
  */
@JSGlobal("Model")
@js.native
open class Model protected ()
  extends StObject
     with typings.sphereEngineBrowser.Model {
  /**
    * Construct a new model from a list of shapes.
    * @param shapes An array of shapes that make up the model.
    * @param shader Shader to use when rendering this model.
    */
  def this(shapes: js.Array[typings.sphereEngineBrowser.Shape]) = this()
  def this(shapes: js.Array[typings.sphereEngineBrowser.Shape], shader: typings.sphereEngineBrowser.Shader) = this()
}
