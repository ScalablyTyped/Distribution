package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OESVertexArrayObject extends StObject {
  
  val VERTEX_ARRAY_BINDING_OES: GLenum = js.native
  
  def bindVertexArrayOES(): Unit = js.native
  def bindVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Unit = js.native
  
  def createVertexArrayOES(): WebGLVertexArrayObjectOES | Null = js.native
  
  def deleteVertexArrayOES(): Unit = js.native
  def deleteVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Unit = js.native
  
  def isVertexArrayOES(): GLboolean = js.native
  def isVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): GLboolean = js.native
}
