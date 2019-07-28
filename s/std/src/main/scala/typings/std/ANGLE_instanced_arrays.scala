package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ANGLE_instanced_arrays extension is part of the WebGL API and allows to draw the same object, or groups of similar objects multiple times, if they share the same vertex data, primitive count and type. */
trait ANGLE_instanced_arrays extends js.Object {
  val VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: GLenum
  def drawArraysInstancedANGLE(mode: GLenum, first: GLint, count: GLsizei, primcount: GLsizei): Unit
  def drawElementsInstancedANGLE(mode: GLenum, count: GLsizei, `type`: GLenum, offset: GLintptr, primcount: GLsizei): Unit
  def vertexAttribDivisorANGLE(index: GLuint, divisor: GLuint): Unit
}

object ANGLE_instanced_arrays {
  @scala.inline
  def apply(
    VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: GLenum,
    drawArraysInstancedANGLE: (GLenum, GLint, GLsizei, GLsizei) => Unit,
    drawElementsInstancedANGLE: (GLenum, GLsizei, GLenum, GLintptr, GLsizei) => Unit,
    vertexAttribDivisorANGLE: (GLuint, GLuint) => Unit
  ): ANGLE_instanced_arrays = {
    val __obj = js.Dynamic.literal(VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE = VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE, drawArraysInstancedANGLE = js.Any.fromFunction4(drawArraysInstancedANGLE), drawElementsInstancedANGLE = js.Any.fromFunction5(drawElementsInstancedANGLE), vertexAttribDivisorANGLE = js.Any.fromFunction2(vertexAttribDivisorANGLE))
  
    __obj.asInstanceOf[ANGLE_instanced_arrays]
  }
}

