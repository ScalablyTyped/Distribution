package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OESVertexArrayObject extends StObject {
  
  /* standard dom */
  val VERTEX_ARRAY_BINDING_OES: GLenum = js.native
  
  /* standard dom */
  def bindVertexArrayOES(): Unit = js.native
  def bindVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Unit = js.native
  
  /* standard dom */
  def createVertexArrayOES(): WebGLVertexArrayObjectOES | Null = js.native
  
  /* standard dom */
  def deleteVertexArrayOES(): Unit = js.native
  def deleteVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Unit = js.native
  
  /* standard dom */
  def isVertexArrayOES(): GLboolean = js.native
  def isVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): GLboolean = js.native
}
