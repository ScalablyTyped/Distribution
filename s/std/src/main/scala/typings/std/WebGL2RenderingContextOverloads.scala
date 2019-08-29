package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGL2RenderingContextOverloads extends js.Object {
  def bufferData(target: GLenum, size: GLsizeiptr, usage: GLenum): Unit = js.native
  def bufferData(target: GLenum, srcData: Null, usage: GLenum): Unit = js.native
  def bufferData(target: GLenum, srcData: ArrayBufferView, usage: GLenum, srcOffset: GLuint): Unit = js.native
  def bufferData(target: GLenum, srcData: ArrayBufferView, usage: GLenum, srcOffset: GLuint, length: GLuint): Unit = js.native
  def bufferData(target: GLenum, srcData: BufferSource, usage: GLenum): Unit = js.native
  def bufferSubData(target: GLenum, dstByteOffset: GLintptr, srcData: ArrayBufferView, srcOffset: GLuint): Unit = js.native
  def bufferSubData(
    target: GLenum,
    dstByteOffset: GLintptr,
    srcData: ArrayBufferView,
    srcOffset: GLuint,
    length: GLuint
  ): Unit = js.native
  def bufferSubData(target: GLenum, dstByteOffset: GLintptr, srcData: BufferSource): Unit = js.native
  def compressedTexImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLenum,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    imageSize: GLsizei,
    offset: GLintptr
  ): Unit = js.native
  def compressedTexImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLenum,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    srcData: ArrayBufferView
  ): Unit = js.native
  def compressedTexImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLenum,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    srcData: ArrayBufferView,
    srcOffset: GLuint
  ): Unit = js.native
  def compressedTexImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLenum,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    srcData: ArrayBufferView,
    srcOffset: GLuint,
    srcLengthOverride: GLuint
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    imageSize: GLsizei,
    offset: GLintptr
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    srcData: ArrayBufferView
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    srcData: ArrayBufferView,
    srcOffset: GLuint
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    srcData: ArrayBufferView,
    srcOffset: GLuint,
    srcLengthOverride: GLuint
  ): Unit = js.native
  def readPixels(x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum, `type`: GLenum): Unit = js.native
  def readPixels(
    x: GLint,
    y: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    dstData: ArrayBufferView
  ): Unit = js.native
  def readPixels(
    x: GLint,
    y: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    dstData: ArrayBufferView,
    dstOffset: GLuint
  ): Unit = js.native
  def readPixels(
    x: GLint,
    y: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    offset: GLintptr
  ): Unit = js.native
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSource
  ): Unit = js.native
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    format: GLenum,
    `type`: GLenum
  ): Unit = js.native
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    format: GLenum,
    `type`: GLenum,
    pboOffset: GLintptr
  ): Unit = js.native
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    format: GLenum,
    `type`: GLenum,
    pixels: ArrayBufferView
  ): Unit = js.native
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSource
  ): Unit = js.native
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    format: GLenum,
    `type`: GLenum,
    srcData: ArrayBufferView,
    srcOffset: GLuint
  ): Unit = js.native
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSource
  ): Unit = js.native
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum
  ): Unit = js.native
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    pboOffset: GLintptr
  ): Unit = js.native
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    pixels: ArrayBufferView
  ): Unit = js.native
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSource
  ): Unit = js.native
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    srcData: ArrayBufferView,
    srcOffset: GLuint
  ): Unit = js.native
  def uniform1fv(location: Null, data: Float32List): Unit = js.native
  def uniform1fv(location: Null, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniform1fv(location: Null, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform1fv(location: Null, data: Iterable[GLfloat]): Unit = js.native
  def uniform1fv(location: Null, data: Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniform1fv(location: Null, data: Iterable[GLfloat], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform1fv(location: WebGLUniformLocation, data: Float32List): Unit = js.native
  def uniform1fv(location: WebGLUniformLocation, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniform1fv(location: WebGLUniformLocation, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform1fv(location: WebGLUniformLocation, data: Iterable[GLfloat]): Unit = js.native
  def uniform1fv(location: WebGLUniformLocation, data: Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniform1fv(location: WebGLUniformLocation, data: Iterable[GLfloat], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform1iv(location: Null, data: Int32List): Unit = js.native
  def uniform1iv(location: Null, data: Int32List, srcOffset: GLuint): Unit = js.native
  def uniform1iv(location: Null, data: Int32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform1iv(location: Null, data: Iterable[GLint]): Unit = js.native
  def uniform1iv(location: Null, data: Iterable[GLint], srcOffset: GLuint): Unit = js.native
  def uniform1iv(location: Null, data: Iterable[GLint], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform1iv(location: WebGLUniformLocation, data: Int32List): Unit = js.native
  def uniform1iv(location: WebGLUniformLocation, data: Int32List, srcOffset: GLuint): Unit = js.native
  def uniform1iv(location: WebGLUniformLocation, data: Int32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform1iv(location: WebGLUniformLocation, data: Iterable[GLint]): Unit = js.native
  def uniform1iv(location: WebGLUniformLocation, data: Iterable[GLint], srcOffset: GLuint): Unit = js.native
  def uniform1iv(location: WebGLUniformLocation, data: Iterable[GLint], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform2fv(location: Null, data: Float32List): Unit = js.native
  def uniform2fv(location: Null, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniform2fv(location: Null, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform2fv(location: Null, data: Iterable[GLfloat]): Unit = js.native
  def uniform2fv(location: Null, data: Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniform2fv(location: Null, data: Iterable[GLfloat], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform2fv(location: WebGLUniformLocation, data: Float32List): Unit = js.native
  def uniform2fv(location: WebGLUniformLocation, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniform2fv(location: WebGLUniformLocation, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform2fv(location: WebGLUniformLocation, data: Iterable[GLfloat]): Unit = js.native
  def uniform2fv(location: WebGLUniformLocation, data: Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniform2fv(location: WebGLUniformLocation, data: Iterable[GLfloat], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform2iv(location: Null, data: Int32List): Unit = js.native
  def uniform2iv(location: Null, data: Int32List, srcOffset: GLuint): Unit = js.native
  def uniform2iv(location: Null, data: Int32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform2iv(location: Null, data: Iterable[GLint]): Unit = js.native
  def uniform2iv(location: Null, data: Iterable[GLint], srcOffset: GLuint): Unit = js.native
  def uniform2iv(location: Null, data: Iterable[GLint], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform2iv(location: WebGLUniformLocation, data: Int32List): Unit = js.native
  def uniform2iv(location: WebGLUniformLocation, data: Int32List, srcOffset: GLuint): Unit = js.native
  def uniform2iv(location: WebGLUniformLocation, data: Int32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform2iv(location: WebGLUniformLocation, data: Iterable[GLint]): Unit = js.native
  def uniform2iv(location: WebGLUniformLocation, data: Iterable[GLint], srcOffset: GLuint): Unit = js.native
  def uniform2iv(location: WebGLUniformLocation, data: Iterable[GLint], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform3fv(location: Null, data: Float32List): Unit = js.native
  def uniform3fv(location: Null, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniform3fv(location: Null, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform3fv(location: Null, data: Iterable[GLfloat]): Unit = js.native
  def uniform3fv(location: Null, data: Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniform3fv(location: Null, data: Iterable[GLfloat], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform3fv(location: WebGLUniformLocation, data: Float32List): Unit = js.native
  def uniform3fv(location: WebGLUniformLocation, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniform3fv(location: WebGLUniformLocation, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform3fv(location: WebGLUniformLocation, data: Iterable[GLfloat]): Unit = js.native
  def uniform3fv(location: WebGLUniformLocation, data: Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniform3fv(location: WebGLUniformLocation, data: Iterable[GLfloat], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform3iv(location: Null, data: Int32List): Unit = js.native
  def uniform3iv(location: Null, data: Int32List, srcOffset: GLuint): Unit = js.native
  def uniform3iv(location: Null, data: Int32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform3iv(location: Null, data: Iterable[GLint]): Unit = js.native
  def uniform3iv(location: Null, data: Iterable[GLint], srcOffset: GLuint): Unit = js.native
  def uniform3iv(location: Null, data: Iterable[GLint], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform3iv(location: WebGLUniformLocation, data: Int32List): Unit = js.native
  def uniform3iv(location: WebGLUniformLocation, data: Int32List, srcOffset: GLuint): Unit = js.native
  def uniform3iv(location: WebGLUniformLocation, data: Int32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform3iv(location: WebGLUniformLocation, data: Iterable[GLint]): Unit = js.native
  def uniform3iv(location: WebGLUniformLocation, data: Iterable[GLint], srcOffset: GLuint): Unit = js.native
  def uniform3iv(location: WebGLUniformLocation, data: Iterable[GLint], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform4fv(location: Null, data: Float32List): Unit = js.native
  def uniform4fv(location: Null, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniform4fv(location: Null, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform4fv(location: Null, data: Iterable[GLfloat]): Unit = js.native
  def uniform4fv(location: Null, data: Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniform4fv(location: Null, data: Iterable[GLfloat], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform4fv(location: WebGLUniformLocation, data: Float32List): Unit = js.native
  def uniform4fv(location: WebGLUniformLocation, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniform4fv(location: WebGLUniformLocation, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform4fv(location: WebGLUniformLocation, data: Iterable[GLfloat]): Unit = js.native
  def uniform4fv(location: WebGLUniformLocation, data: Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniform4fv(location: WebGLUniformLocation, data: Iterable[GLfloat], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform4iv(location: Null, data: Int32List): Unit = js.native
  def uniform4iv(location: Null, data: Int32List, srcOffset: GLuint): Unit = js.native
  def uniform4iv(location: Null, data: Int32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform4iv(location: Null, data: Iterable[GLint]): Unit = js.native
  def uniform4iv(location: Null, data: Iterable[GLint], srcOffset: GLuint): Unit = js.native
  def uniform4iv(location: Null, data: Iterable[GLint], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform4iv(location: WebGLUniformLocation, data: Int32List): Unit = js.native
  def uniform4iv(location: WebGLUniformLocation, data: Int32List, srcOffset: GLuint): Unit = js.native
  def uniform4iv(location: WebGLUniformLocation, data: Int32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform4iv(location: WebGLUniformLocation, data: Iterable[GLint]): Unit = js.native
  def uniform4iv(location: WebGLUniformLocation, data: Iterable[GLint], srcOffset: GLuint): Unit = js.native
  def uniform4iv(location: WebGLUniformLocation, data: Iterable[GLint], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: GLboolean, data: Float32List): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: GLboolean, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: GLboolean, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: GLboolean, data: Iterable[GLfloat]): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: GLboolean, data: Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniformMatrix2fv(
    location: Null,
    transpose: GLboolean,
    data: Iterable[GLfloat],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix2fv(location: WebGLUniformLocation, transpose: GLboolean, data: Float32List): Unit = js.native
  def uniformMatrix2fv(location: WebGLUniformLocation, transpose: GLboolean, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniformMatrix2fv(
    location: WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List,
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix2fv(location: WebGLUniformLocation, transpose: GLboolean, data: Iterable[GLfloat]): Unit = js.native
  def uniformMatrix2fv(location: WebGLUniformLocation, transpose: GLboolean, data: Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniformMatrix2fv(
    location: WebGLUniformLocation,
    transpose: GLboolean,
    data: Iterable[GLfloat],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: GLboolean, data: Float32List): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: GLboolean, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: GLboolean, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: GLboolean, data: Iterable[GLfloat]): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: GLboolean, data: Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniformMatrix3fv(
    location: Null,
    transpose: GLboolean,
    data: Iterable[GLfloat],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix3fv(location: WebGLUniformLocation, transpose: GLboolean, data: Float32List): Unit = js.native
  def uniformMatrix3fv(location: WebGLUniformLocation, transpose: GLboolean, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniformMatrix3fv(
    location: WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List,
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix3fv(location: WebGLUniformLocation, transpose: GLboolean, data: Iterable[GLfloat]): Unit = js.native
  def uniformMatrix3fv(location: WebGLUniformLocation, transpose: GLboolean, data: Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniformMatrix3fv(
    location: WebGLUniformLocation,
    transpose: GLboolean,
    data: Iterable[GLfloat],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: GLboolean, data: Float32List): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: GLboolean, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: GLboolean, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: GLboolean, data: Iterable[GLfloat]): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: GLboolean, data: Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniformMatrix4fv(
    location: Null,
    transpose: GLboolean,
    data: Iterable[GLfloat],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix4fv(location: WebGLUniformLocation, transpose: GLboolean, data: Float32List): Unit = js.native
  def uniformMatrix4fv(location: WebGLUniformLocation, transpose: GLboolean, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniformMatrix4fv(
    location: WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List,
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix4fv(location: WebGLUniformLocation, transpose: GLboolean, data: Iterable[GLfloat]): Unit = js.native
  def uniformMatrix4fv(location: WebGLUniformLocation, transpose: GLboolean, data: Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniformMatrix4fv(
    location: WebGLUniformLocation,
    transpose: GLboolean,
    data: Iterable[GLfloat],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
}

