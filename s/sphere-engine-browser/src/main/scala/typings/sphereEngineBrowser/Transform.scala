package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a transformation matrix for rendering operations.
  */
@js.native
trait Transform extends StObject {
  
  /**
    * Composes another transform with this one. The result is the same as if the two were applied
    * consecutively.
    * @param transform The transform to be applied after this one.
    */
  def compose(transform: Transform): Transform = js.native
  
  /** Reset this transform to the identity matrix. */
  def identity(): Transform = js.native
  
  /** Provides direct access to the 4x4 matrix cells of this transform. */
  val matrix: js.Array[js.Array[Double]] = js.native
  
  /** Add a 2D orthographic projection to the transform. */
  def project2D(left: Double, top: Double, right: Double, bottom: Double): Transform = js.native
  def project2D(left: Double, top: Double, right: Double, bottom: Double, near: Double): Transform = js.native
  def project2D(left: Double, top: Double, right: Double, bottom: Double, near: Double, far: Double): Transform = js.native
  def project2D(left: Double, top: Double, right: Double, bottom: Double, near: Unit, far: Double): Transform = js.native
  
  /** Add a 3D frustum projection to the transform. */
  def project3D(fov: Double, aspect: Double, near: Double, far: Double): Transform = js.native
  
  /**
    * Add a 2D rotation (i.e. rotation about the Z axis) to the transform.
    * @param angle The angle of rotation, in radians.
    */
  def rotate(angle: Double): Transform = js.native
  /**
    * Add a rotation to the transform.
    * @param angle The angle of rotation, in radians.
    * @param vx    The X component of the vector to rotate around.
    * @param vy    The Y component of the vector to rotate around.
    * @param vz    The Z component of the vector to rotate around.
    */
  def rotate(angle: Double, vx: Double, vy: Double, vz: Double): Transform = js.native
  
  /**
    * Add a scaling transformation to the transform.
    * @param sx The scaling factor for the X axis.
    * @param sy The scaling factor for the Y axis.
    * @param sz The scaling factor for the Z axis.
    */
  def scale(sx: Double, sy: Double): Transform = js.native
  def scale(sx: Double, sy: Double, sz: Double): Transform = js.native
  
  /**
    * Add a translation (slide) to the transform.
    * @param tx The amount to move the X axis.
    * @param ty The amount to move the Y axis.
    * @param tz The amount to move the Z axis.
    */
  def translate(tx: Double, ty: Double): Transform = js.native
  def translate(tx: Double, ty: Double, tz: Double): Transform = js.native
}
