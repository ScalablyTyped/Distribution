package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OES_vertex_array_object extends js.Object {
  val VERTEX_ARRAY_BINDING_OES: GLenum = js.native
  def bindVertexArrayOES(): Unit = js.native
  def bindVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Unit = js.native
  def createVertexArrayOES(): WebGLVertexArrayObjectOES | Null = js.native
  def deleteVertexArrayOES(): Unit = js.native
  def deleteVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Unit = js.native
  def isVertexArrayOES(): GLboolean = js.native
  def isVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): GLboolean = js.native
}

