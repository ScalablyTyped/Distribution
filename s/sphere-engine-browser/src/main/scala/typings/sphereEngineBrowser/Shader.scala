package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a shader program used to control low-level graphics rendering.
  */
@js.native
trait Shader extends StObject {
  
  /**
    * Set the value of a `bool` uniform.
    * @param name  Name of the uniform variable in the GLSL source text.
    * @param value Value to set: either `true` or `false`.
    */
  def setBoolean(name: String, value: Boolean): Unit = js.native
  
  /**
    * Set the values of a `vec4` uniform from the components of a `Color` (RGBA).
    * @param name  Name of a `uniform` variable in the GLSL source text.
    * @param color A `Color` object whose RGBA values will be used.
    */
  def setColorVector(name: String, color: Color): Unit = js.native
  
  /**
    * Set the value of a `float` (floating point) uniform.
    * @param name  Name of a `uniform` variable in the GLSL source text.
    * @param value Value to set.
    */
  def setFloat(name: String, value: Double): Unit = js.native
  
  /**
    * Set the values of a `vec2`, `vec3`, or `vec4` (floating point vector) uniform.
    * @param name   Name of a `uniform` variable in the GLSL source text.
    * @param values Values to set: an array of 2, 3, or 4 numbers.
    */
  def setFloatVector(name: String, values: js.Tuple2[Double, Double]): Unit = js.native
  def setFloatVector(name: String, values: js.Tuple3[Double, Double, Double]): Unit = js.native
  def setFloatVector(name: String, values: js.Tuple4[Double, Double, Double, Double]): Unit = js.native
  
  /**
    * Set the value of an `int` (integer) uniform.
    * @param name  Name of a `uniform` variable in the GLSL source text.
    * @param value Value to set. Anything after the decimal point will be ignored.
    */
  def setInt(name: String, value: Double): Unit = js.native
  
  /**
    * Set the values of an `ivec2`, `ivec3`, or `ivec4` (integer vector) uniform.
    * @param name   Name of a `uniform` variable in the GLSL source text.
    * @param values Values to set: an array of 2, 3, or 4 numbers. Anything after the decimal point
    *               will be ignored.
    */
  def setIntVector(name: String, values: js.Tuple2[Double, Double]): Unit = js.native
  def setIntVector(name: String, values: js.Tuple3[Double, Double, Double]): Unit = js.native
  def setIntVector(name: String, values: js.Tuple4[Double, Double, Double, Double]): Unit = js.native
  
  /**
    * Set the values of a `mat4` (4x4 matrix) uniform from the matrix cells of a `Transform`.
    * @param name      Name of the `uniform` in the GLSL source text.
    * @param transform A `Transform` object whose 4x4 matrix cells will be used.
    */
  def setMatrix(name: String, transform: Transform): Unit = js.native
}
