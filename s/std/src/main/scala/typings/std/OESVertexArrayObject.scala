package typings.std

import typings.std.stdInts.`0x85B5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_vertex_array_object) */
@js.native
trait OESVertexArrayObject extends StObject {
  
  /* standard dom */
  val VERTEX_ARRAY_BINDING_OES: `0x85B5` = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_vertex_array_object/bindVertexArrayOES) */
  /* standard dom */
  def bindVertexArrayOES(): Unit = js.native
  def bindVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_vertex_array_object/createVertexArrayOES) */
  /* standard dom */
  def createVertexArrayOES(): WebGLVertexArrayObjectOES | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_vertex_array_object/deleteVertexArrayOES) */
  /* standard dom */
  def deleteVertexArrayOES(): Unit = js.native
  def deleteVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_vertex_array_object/isVertexArrayOES) */
  /* standard dom */
  def isVertexArrayOES(): GLboolean = js.native
  def isVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): GLboolean = js.native
}
