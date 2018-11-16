package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OES_vertex_array_object extends js.Object {
  val VERTEX_ARRAY_BINDING_OES: scala.Double
  def bindVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): scala.Unit
  def createVertexArrayOES(): WebGLVertexArrayObjectOES
  def deleteVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): scala.Unit
  def isVertexArrayOES(value: js.Any): /* is WebGLVertexArrayObjectOES */scala.Boolean
}

