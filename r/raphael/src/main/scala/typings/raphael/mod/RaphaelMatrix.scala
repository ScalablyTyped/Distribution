package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelMatrix extends js.Object {
  
  /**
    * The matrix component at the first row, first column.
    */
  var a: Double = js.native
  
  /**
    * Adds the given matrix to this matrix component-wise.
    *
    * The parameters a-f form a 2x3 matrix and are arranged like this.
    *
    * ```
    * +---+---+---+
    * | a | c | e |
    * | b | d | f |
    * +---+---+---+
    * ```
    *
    * @param a The matrix component at the first row, first column.
    * @param b The matrix component at the second row, first column.
    * @param c The matrix component at the first row, second column.
    * @param d The matrix component at the second row, second column.
    * @param e The matrix component at the third row, first column.
    * @param f The matrix component at the third row, second column.
    */
  def add(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
  
  /**
    * The matrix component at the second row, first column.
    */
  var b: Double = js.native
  
  /**
    * The matrix component at the first row, second column.
    */
  var c: Double = js.native
  
  /**
    * The matrix component at the second row, second column.
    */
  var d: Double = js.native
  
  /**
    * The matrix component at the third row, first column.
    */
  var e: Double = js.native
  
  /**
    * The matrix component at the third row, second column.
    */
  var f: Double = js.native
  
  /**
    * Creates a new matrix that represents the inverse affine transformation of this matrix.
    * @return A new matrix that represents the inverse affine transformation of this matrix.
    */
  def invert(): RaphaelMatrix = js.native
  
  /**
    * Applies a rotation to this matrix.
    * @param a The angle of the rotation, in degrees.
    * @param x Horizontal coordinate of the origin of the rotation.
    * @param y Vertical coordinate of the origin of the rotation.
    */
  def rotate(a: Double, x: Double, y: Double): Unit = js.native
  
  /**
    * Applies a scaling operation to this matrix.
    * @param x Horizontal coordinate of the origin of the scaling.
    * @param y Vertical coordinate of the origin of the scaling. If not specified, default to same value as `x`.
    */
  def scale(x: Double): Unit = js.native
  def scale(x: Double, y: Double): Unit = js.native
  /**
    * Applies a scaling operation to this matrix.
    * @param x Horizontal coordinate of the origin of the scaling.
    * @param y Vertical coordinate of the origin of the scaling.
    * @param cx Amount by which to scale in the horizontal direction.
    * @param cy Amount by which to scale in the vertical direction.
    */
  def scale(x: Double, y: Double, cx: Double, cy: Double): Unit = js.native
  
  /**
    * Splits matrix into primitive transformations.
    * @return Information regarding how this matrix can be produced by applying a chain of primitive transformations.
    */
  def split(): RaphaelMatrixTransformInfo = js.native
  
  /**
    * Creates a transform string that represents given matrix, such as `t0,0s1,1,0,0r0,0,0`.
    * @return A CSS transform string that represents given matrix.
    */
  def toTransformString(): String = js.native
  
  /**
    * Applies a translation to this matrix.
    * @param dx Amount by which to translate in the horizontal direction.
    * @param dy Amount by which to translate in the vertical direction.
    */
  def translate(x: Double, y: Double): Unit = js.native
  
  /**
    * Applies this transformation matrix to the given point and returns the x coordinate of that transformed point.
    * See also {@link y}.
    * @param x Horizontal coordinate of a point to transform.
    * @param y Vertical coordinate of a point to transform.
    */
  def x(x: Double, y: Double): Double = js.native
  
  /**
    * Applies this transformation matrix to the given point and returns the y coordinate of that transformed point.
    * See also {@link x}.
    * @param x Horizontal coordinate of a point to transform.
    * @param y Vertical coordinate of a point to transform.
    */
  def y(x: Double, y: Double): Double = js.native
}
