package typings.std

import typings.std.stdStrings.ANGLE_instanced_arrays
import typings.std.stdStrings.EXT_blend_minmax
import typings.std.stdStrings.EXT_frag_depth
import typings.std.stdStrings.EXT_sRGB
import typings.std.stdStrings.EXT_shader_texture_lod
import typings.std.stdStrings.EXT_texture_filter_anisotropic
import typings.std.stdStrings.OES_element_index_uint
import typings.std.stdStrings.OES_standard_derivatives
import typings.std.stdStrings.OES_texture_float
import typings.std.stdStrings.OES_texture_float_linear
import typings.std.stdStrings.OES_texture_half_float
import typings.std.stdStrings.OES_texture_half_float_linear
import typings.std.stdStrings.OES_vertex_array_object
import typings.std.stdStrings.WEBGL_color_buffer_float
import typings.std.stdStrings.WEBGL_compressed_texture_astc
import typings.std.stdStrings.WEBGL_compressed_texture_s3tc
import typings.std.stdStrings.WEBGL_compressed_texture_s3tc_srgb
import typings.std.stdStrings.WEBGL_debug_renderer_info
import typings.std.stdStrings.WEBGL_debug_shaders
import typings.std.stdStrings.WEBGL_depth_texture
import typings.std.stdStrings.WEBGL_draw_buffers
import typings.std.stdStrings.WEBGL_lose_context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLRenderingContextBase extends js.Object {
  val ACTIVE_ATTRIBUTES: GLenum = js.native
  val ACTIVE_TEXTURE: GLenum = js.native
  val ACTIVE_UNIFORMS: GLenum = js.native
  val ALIASED_LINE_WIDTH_RANGE: GLenum = js.native
  val ALIASED_POINT_SIZE_RANGE: GLenum = js.native
  val ALPHA: GLenum = js.native
  val ALPHA_BITS: GLenum = js.native
  val ALWAYS: GLenum = js.native
  val ARRAY_BUFFER: GLenum = js.native
  val ARRAY_BUFFER_BINDING: GLenum = js.native
  val ATTACHED_SHADERS: GLenum = js.native
  val BACK: GLenum = js.native
  val BLEND: GLenum = js.native
  val BLEND_COLOR: GLenum = js.native
  val BLEND_DST_ALPHA: GLenum = js.native
  val BLEND_DST_RGB: GLenum = js.native
  val BLEND_EQUATION: GLenum = js.native
  val BLEND_EQUATION_ALPHA: GLenum = js.native
  val BLEND_EQUATION_RGB: GLenum = js.native
  val BLEND_SRC_ALPHA: GLenum = js.native
  val BLEND_SRC_RGB: GLenum = js.native
  val BLUE_BITS: GLenum = js.native
  val BOOL: GLenum = js.native
  val BOOL_VEC2: GLenum = js.native
  val BOOL_VEC3: GLenum = js.native
  val BOOL_VEC4: GLenum = js.native
  val BROWSER_DEFAULT_WEBGL: GLenum = js.native
  val BUFFER_SIZE: GLenum = js.native
  val BUFFER_USAGE: GLenum = js.native
  val BYTE: GLenum = js.native
  val CCW: GLenum = js.native
  val CLAMP_TO_EDGE: GLenum = js.native
  val COLOR_ATTACHMENT0: GLenum = js.native
  val COLOR_BUFFER_BIT: GLenum = js.native
  val COLOR_CLEAR_VALUE: GLenum = js.native
  val COLOR_WRITEMASK: GLenum = js.native
  val COMPILE_STATUS: GLenum = js.native
  val COMPRESSED_TEXTURE_FORMATS: GLenum = js.native
  val CONSTANT_ALPHA: GLenum = js.native
  val CONSTANT_COLOR: GLenum = js.native
  val CONTEXT_LOST_WEBGL: GLenum = js.native
  val CULL_FACE: GLenum = js.native
  val CULL_FACE_MODE: GLenum = js.native
  val CURRENT_PROGRAM: GLenum = js.native
  val CURRENT_VERTEX_ATTRIB: GLenum = js.native
  val CW: GLenum = js.native
  val DECR: GLenum = js.native
  val DECR_WRAP: GLenum = js.native
  val DELETE_STATUS: GLenum = js.native
  val DEPTH_ATTACHMENT: GLenum = js.native
  val DEPTH_BITS: GLenum = js.native
  val DEPTH_BUFFER_BIT: GLenum = js.native
  val DEPTH_CLEAR_VALUE: GLenum = js.native
  val DEPTH_COMPONENT: GLenum = js.native
  val DEPTH_COMPONENT16: GLenum = js.native
  val DEPTH_FUNC: GLenum = js.native
  val DEPTH_RANGE: GLenum = js.native
  val DEPTH_STENCIL: GLenum = js.native
  val DEPTH_STENCIL_ATTACHMENT: GLenum = js.native
  val DEPTH_TEST: GLenum = js.native
  val DEPTH_WRITEMASK: GLenum = js.native
  val DITHER: GLenum = js.native
  val DONT_CARE: GLenum = js.native
  val DST_ALPHA: GLenum = js.native
  val DST_COLOR: GLenum = js.native
  val DYNAMIC_DRAW: GLenum = js.native
  val ELEMENT_ARRAY_BUFFER: GLenum = js.native
  val ELEMENT_ARRAY_BUFFER_BINDING: GLenum = js.native
  val EQUAL: GLenum = js.native
  val FASTEST: GLenum = js.native
  val FLOAT: GLenum = js.native
  val FLOAT_MAT2: GLenum = js.native
  val FLOAT_MAT3: GLenum = js.native
  val FLOAT_MAT4: GLenum = js.native
  val FLOAT_VEC2: GLenum = js.native
  val FLOAT_VEC3: GLenum = js.native
  val FLOAT_VEC4: GLenum = js.native
  val FRAGMENT_SHADER: GLenum = js.native
  val FRAMEBUFFER: GLenum = js.native
  val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: GLenum = js.native
  val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: GLenum = js.native
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: GLenum = js.native
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: GLenum = js.native
  val FRAMEBUFFER_BINDING: GLenum = js.native
  val FRAMEBUFFER_COMPLETE: GLenum = js.native
  val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: GLenum = js.native
  val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: GLenum = js.native
  val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: GLenum = js.native
  val FRAMEBUFFER_UNSUPPORTED: GLenum = js.native
  val FRONT: GLenum = js.native
  val FRONT_AND_BACK: GLenum = js.native
  val FRONT_FACE: GLenum = js.native
  val FUNC_ADD: GLenum = js.native
  val FUNC_REVERSE_SUBTRACT: GLenum = js.native
  val FUNC_SUBTRACT: GLenum = js.native
  val GENERATE_MIPMAP_HINT: GLenum = js.native
  val GEQUAL: GLenum = js.native
  val GREATER: GLenum = js.native
  val GREEN_BITS: GLenum = js.native
  val HIGH_FLOAT: GLenum = js.native
  val HIGH_INT: GLenum = js.native
  val IMPLEMENTATION_COLOR_READ_FORMAT: GLenum = js.native
  val IMPLEMENTATION_COLOR_READ_TYPE: GLenum = js.native
  val INCR: GLenum = js.native
  val INCR_WRAP: GLenum = js.native
  val INT: GLenum = js.native
  val INT_VEC2: GLenum = js.native
  val INT_VEC3: GLenum = js.native
  val INT_VEC4: GLenum = js.native
  val INVALID_ENUM: GLenum = js.native
  val INVALID_FRAMEBUFFER_OPERATION: GLenum = js.native
  val INVALID_OPERATION: GLenum = js.native
  val INVALID_VALUE: GLenum = js.native
  val INVERT: GLenum = js.native
  val KEEP: GLenum = js.native
  val LEQUAL: GLenum = js.native
  val LESS: GLenum = js.native
  val LINEAR: GLenum = js.native
  val LINEAR_MIPMAP_LINEAR: GLenum = js.native
  val LINEAR_MIPMAP_NEAREST: GLenum = js.native
  val LINES: GLenum = js.native
  val LINE_LOOP: GLenum = js.native
  val LINE_STRIP: GLenum = js.native
  val LINE_WIDTH: GLenum = js.native
  val LINK_STATUS: GLenum = js.native
  val LOW_FLOAT: GLenum = js.native
  val LOW_INT: GLenum = js.native
  val LUMINANCE: GLenum = js.native
  val LUMINANCE_ALPHA: GLenum = js.native
  val MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum = js.native
  val MAX_CUBE_MAP_TEXTURE_SIZE: GLenum = js.native
  val MAX_FRAGMENT_UNIFORM_VECTORS: GLenum = js.native
  val MAX_RENDERBUFFER_SIZE: GLenum = js.native
  val MAX_TEXTURE_IMAGE_UNITS: GLenum = js.native
  val MAX_TEXTURE_SIZE: GLenum = js.native
  val MAX_VARYING_VECTORS: GLenum = js.native
  val MAX_VERTEX_ATTRIBS: GLenum = js.native
  val MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum = js.native
  val MAX_VERTEX_UNIFORM_VECTORS: GLenum = js.native
  val MAX_VIEWPORT_DIMS: GLenum = js.native
  val MEDIUM_FLOAT: GLenum = js.native
  val MEDIUM_INT: GLenum = js.native
  val MIRRORED_REPEAT: GLenum = js.native
  val NEAREST: GLenum = js.native
  val NEAREST_MIPMAP_LINEAR: GLenum = js.native
  val NEAREST_MIPMAP_NEAREST: GLenum = js.native
  val NEVER: GLenum = js.native
  val NICEST: GLenum = js.native
  val NONE: GLenum = js.native
  val NOTEQUAL: GLenum = js.native
  val NO_ERROR: GLenum = js.native
  val ONE: GLenum = js.native
  val ONE_MINUS_CONSTANT_ALPHA: GLenum = js.native
  val ONE_MINUS_CONSTANT_COLOR: GLenum = js.native
  val ONE_MINUS_DST_ALPHA: GLenum = js.native
  val ONE_MINUS_DST_COLOR: GLenum = js.native
  val ONE_MINUS_SRC_ALPHA: GLenum = js.native
  val ONE_MINUS_SRC_COLOR: GLenum = js.native
  val OUT_OF_MEMORY: GLenum = js.native
  val PACK_ALIGNMENT: GLenum = js.native
  val POINTS: GLenum = js.native
  val POLYGON_OFFSET_FACTOR: GLenum = js.native
  val POLYGON_OFFSET_FILL: GLenum = js.native
  val POLYGON_OFFSET_UNITS: GLenum = js.native
  val RED_BITS: GLenum = js.native
  val RENDERBUFFER: GLenum = js.native
  val RENDERBUFFER_ALPHA_SIZE: GLenum = js.native
  val RENDERBUFFER_BINDING: GLenum = js.native
  val RENDERBUFFER_BLUE_SIZE: GLenum = js.native
  val RENDERBUFFER_DEPTH_SIZE: GLenum = js.native
  val RENDERBUFFER_GREEN_SIZE: GLenum = js.native
  val RENDERBUFFER_HEIGHT: GLenum = js.native
  val RENDERBUFFER_INTERNAL_FORMAT: GLenum = js.native
  val RENDERBUFFER_RED_SIZE: GLenum = js.native
  val RENDERBUFFER_STENCIL_SIZE: GLenum = js.native
  val RENDERBUFFER_WIDTH: GLenum = js.native
  val RENDERER: GLenum = js.native
  val REPEAT: GLenum = js.native
  val REPLACE: GLenum = js.native
  val RGB: GLenum = js.native
  val RGB565: GLenum = js.native
  val RGB5_A1: GLenum = js.native
  val RGBA: GLenum = js.native
  val RGBA4: GLenum = js.native
  val SAMPLER_2D: GLenum = js.native
  val SAMPLER_CUBE: GLenum = js.native
  val SAMPLES: GLenum = js.native
  val SAMPLE_ALPHA_TO_COVERAGE: GLenum = js.native
  val SAMPLE_BUFFERS: GLenum = js.native
  val SAMPLE_COVERAGE: GLenum = js.native
  val SAMPLE_COVERAGE_INVERT: GLenum = js.native
  val SAMPLE_COVERAGE_VALUE: GLenum = js.native
  val SCISSOR_BOX: GLenum = js.native
  val SCISSOR_TEST: GLenum = js.native
  val SHADER_TYPE: GLenum = js.native
  val SHADING_LANGUAGE_VERSION: GLenum = js.native
  val SHORT: GLenum = js.native
  val SRC_ALPHA: GLenum = js.native
  val SRC_ALPHA_SATURATE: GLenum = js.native
  val SRC_COLOR: GLenum = js.native
  val STATIC_DRAW: GLenum = js.native
  val STENCIL_ATTACHMENT: GLenum = js.native
  val STENCIL_BACK_FAIL: GLenum = js.native
  val STENCIL_BACK_FUNC: GLenum = js.native
  val STENCIL_BACK_PASS_DEPTH_FAIL: GLenum = js.native
  val STENCIL_BACK_PASS_DEPTH_PASS: GLenum = js.native
  val STENCIL_BACK_REF: GLenum = js.native
  val STENCIL_BACK_VALUE_MASK: GLenum = js.native
  val STENCIL_BACK_WRITEMASK: GLenum = js.native
  val STENCIL_BITS: GLenum = js.native
  val STENCIL_BUFFER_BIT: GLenum = js.native
  val STENCIL_CLEAR_VALUE: GLenum = js.native
  val STENCIL_FAIL: GLenum = js.native
  val STENCIL_FUNC: GLenum = js.native
  val STENCIL_INDEX8: GLenum = js.native
  val STENCIL_PASS_DEPTH_FAIL: GLenum = js.native
  val STENCIL_PASS_DEPTH_PASS: GLenum = js.native
  val STENCIL_REF: GLenum = js.native
  val STENCIL_TEST: GLenum = js.native
  val STENCIL_VALUE_MASK: GLenum = js.native
  val STENCIL_WRITEMASK: GLenum = js.native
  val STREAM_DRAW: GLenum = js.native
  val SUBPIXEL_BITS: GLenum = js.native
  val TEXTURE: GLenum = js.native
  val TEXTURE0: GLenum = js.native
  val TEXTURE1: GLenum = js.native
  val TEXTURE10: GLenum = js.native
  val TEXTURE11: GLenum = js.native
  val TEXTURE12: GLenum = js.native
  val TEXTURE13: GLenum = js.native
  val TEXTURE14: GLenum = js.native
  val TEXTURE15: GLenum = js.native
  val TEXTURE16: GLenum = js.native
  val TEXTURE17: GLenum = js.native
  val TEXTURE18: GLenum = js.native
  val TEXTURE19: GLenum = js.native
  val TEXTURE2: GLenum = js.native
  val TEXTURE20: GLenum = js.native
  val TEXTURE21: GLenum = js.native
  val TEXTURE22: GLenum = js.native
  val TEXTURE23: GLenum = js.native
  val TEXTURE24: GLenum = js.native
  val TEXTURE25: GLenum = js.native
  val TEXTURE26: GLenum = js.native
  val TEXTURE27: GLenum = js.native
  val TEXTURE28: GLenum = js.native
  val TEXTURE29: GLenum = js.native
  val TEXTURE3: GLenum = js.native
  val TEXTURE30: GLenum = js.native
  val TEXTURE31: GLenum = js.native
  val TEXTURE4: GLenum = js.native
  val TEXTURE5: GLenum = js.native
  val TEXTURE6: GLenum = js.native
  val TEXTURE7: GLenum = js.native
  val TEXTURE8: GLenum = js.native
  val TEXTURE9: GLenum = js.native
  val TEXTURE_2D: GLenum = js.native
  val TEXTURE_BINDING_2D: GLenum = js.native
  val TEXTURE_BINDING_CUBE_MAP: GLenum = js.native
  val TEXTURE_CUBE_MAP: GLenum = js.native
  val TEXTURE_CUBE_MAP_NEGATIVE_X: GLenum = js.native
  val TEXTURE_CUBE_MAP_NEGATIVE_Y: GLenum = js.native
  val TEXTURE_CUBE_MAP_NEGATIVE_Z: GLenum = js.native
  val TEXTURE_CUBE_MAP_POSITIVE_X: GLenum = js.native
  val TEXTURE_CUBE_MAP_POSITIVE_Y: GLenum = js.native
  val TEXTURE_CUBE_MAP_POSITIVE_Z: GLenum = js.native
  val TEXTURE_MAG_FILTER: GLenum = js.native
  val TEXTURE_MIN_FILTER: GLenum = js.native
  val TEXTURE_WRAP_S: GLenum = js.native
  val TEXTURE_WRAP_T: GLenum = js.native
  val TRIANGLES: GLenum = js.native
  val TRIANGLE_FAN: GLenum = js.native
  val TRIANGLE_STRIP: GLenum = js.native
  val UNPACK_ALIGNMENT: GLenum = js.native
  val UNPACK_COLORSPACE_CONVERSION_WEBGL: GLenum = js.native
  val UNPACK_FLIP_Y_WEBGL: GLenum = js.native
  val UNPACK_PREMULTIPLY_ALPHA_WEBGL: GLenum = js.native
  val UNSIGNED_BYTE: GLenum = js.native
  val UNSIGNED_INT: GLenum = js.native
  val UNSIGNED_SHORT: GLenum = js.native
  val UNSIGNED_SHORT_4_4_4_4: GLenum = js.native
  val UNSIGNED_SHORT_5_5_5_1: GLenum = js.native
  val UNSIGNED_SHORT_5_6_5: GLenum = js.native
  val VALIDATE_STATUS: GLenum = js.native
  val VENDOR: GLenum = js.native
  val VERSION: GLenum = js.native
  val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: GLenum = js.native
  val VERTEX_ATTRIB_ARRAY_ENABLED: GLenum = js.native
  val VERTEX_ATTRIB_ARRAY_NORMALIZED: GLenum = js.native
  val VERTEX_ATTRIB_ARRAY_POINTER: GLenum = js.native
  val VERTEX_ATTRIB_ARRAY_SIZE: GLenum = js.native
  val VERTEX_ATTRIB_ARRAY_STRIDE: GLenum = js.native
  val VERTEX_ATTRIB_ARRAY_TYPE: GLenum = js.native
  val VERTEX_SHADER: GLenum = js.native
  val VIEWPORT: GLenum = js.native
  val ZERO: GLenum = js.native
  val canvas: HTMLCanvasElement | OffscreenCanvas = js.native
  val drawingBufferHeight: GLsizei = js.native
  val drawingBufferWidth: GLsizei = js.native
  def activeTexture(texture: GLenum): Unit = js.native
  def attachShader(program: WebGLProgram, shader: WebGLShader): Unit = js.native
  def bindAttribLocation(program: WebGLProgram, index: GLuint, name: java.lang.String): Unit = js.native
  def bindBuffer(target: GLenum): Unit = js.native
  def bindBuffer(target: GLenum, buffer: WebGLBuffer): Unit = js.native
  def bindFramebuffer(target: GLenum): Unit = js.native
  def bindFramebuffer(target: GLenum, framebuffer: WebGLFramebuffer): Unit = js.native
  def bindRenderbuffer(target: GLenum): Unit = js.native
  def bindRenderbuffer(target: GLenum, renderbuffer: WebGLRenderbuffer): Unit = js.native
  def bindTexture(target: GLenum): Unit = js.native
  def bindTexture(target: GLenum, texture: WebGLTexture): Unit = js.native
  def blendColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf): Unit = js.native
  def blendEquation(mode: GLenum): Unit = js.native
  def blendEquationSeparate(modeRGB: GLenum, modeAlpha: GLenum): Unit = js.native
  def blendFunc(sfactor: GLenum, dfactor: GLenum): Unit = js.native
  def blendFuncSeparate(srcRGB: GLenum, dstRGB: GLenum, srcAlpha: GLenum, dstAlpha: GLenum): Unit = js.native
  def checkFramebufferStatus(target: GLenum): GLenum = js.native
  def clear(mask: GLbitfield): Unit = js.native
  def clearColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf): Unit = js.native
  def clearDepth(depth: GLclampf): Unit = js.native
  def clearStencil(s: GLint): Unit = js.native
  def colorMask(red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean): Unit = js.native
  def compileShader(shader: WebGLShader): Unit = js.native
  def copyTexImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLenum,
    x: GLint,
    y: GLint,
    width: GLsizei,
    height: GLsizei,
    border: GLint
  ): Unit = js.native
  def copyTexSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    x: GLint,
    y: GLint,
    width: GLsizei,
    height: GLsizei
  ): Unit = js.native
  def createBuffer(): WebGLBuffer | Null = js.native
  def createFramebuffer(): WebGLFramebuffer | Null = js.native
  def createProgram(): WebGLProgram | Null = js.native
  def createRenderbuffer(): WebGLRenderbuffer | Null = js.native
  def createShader(`type`: GLenum): WebGLShader | Null = js.native
  def createTexture(): WebGLTexture | Null = js.native
  def cullFace(mode: GLenum): Unit = js.native
  def deleteBuffer(): Unit = js.native
  def deleteBuffer(buffer: WebGLBuffer): Unit = js.native
  def deleteFramebuffer(): Unit = js.native
  def deleteFramebuffer(framebuffer: WebGLFramebuffer): Unit = js.native
  def deleteProgram(): Unit = js.native
  def deleteProgram(program: WebGLProgram): Unit = js.native
  def deleteRenderbuffer(): Unit = js.native
  def deleteRenderbuffer(renderbuffer: WebGLRenderbuffer): Unit = js.native
  def deleteShader(): Unit = js.native
  def deleteShader(shader: WebGLShader): Unit = js.native
  def deleteTexture(): Unit = js.native
  def deleteTexture(texture: WebGLTexture): Unit = js.native
  def depthFunc(func: GLenum): Unit = js.native
  def depthMask(flag: GLboolean): Unit = js.native
  def depthRange(zNear: GLclampf, zFar: GLclampf): Unit = js.native
  def detachShader(program: WebGLProgram, shader: WebGLShader): Unit = js.native
  def disable(cap: GLenum): Unit = js.native
  def disableVertexAttribArray(index: GLuint): Unit = js.native
  def drawArrays(mode: GLenum, first: GLint, count: GLsizei): Unit = js.native
  def drawElements(mode: GLenum, count: GLsizei, `type`: GLenum, offset: GLintptr): Unit = js.native
  def enable(cap: GLenum): Unit = js.native
  def enableVertexAttribArray(index: GLuint): Unit = js.native
  def finish(): Unit = js.native
  def flush(): Unit = js.native
  def framebufferRenderbuffer(target: GLenum, attachment: GLenum, renderbuffertarget: GLenum): Unit = js.native
  def framebufferRenderbuffer(target: GLenum, attachment: GLenum, renderbuffertarget: GLenum, renderbuffer: WebGLRenderbuffer): Unit = js.native
  def framebufferTexture2D(target: GLenum, attachment: GLenum, textarget: GLenum, texture: Null, level: GLint): Unit = js.native
  def framebufferTexture2D(target: GLenum, attachment: GLenum, textarget: GLenum, texture: WebGLTexture, level: GLint): Unit = js.native
  def frontFace(mode: GLenum): Unit = js.native
  def generateMipmap(target: GLenum): Unit = js.native
  def getActiveAttrib(program: WebGLProgram, index: GLuint): WebGLActiveInfo | Null = js.native
  def getActiveUniform(program: WebGLProgram, index: GLuint): WebGLActiveInfo | Null = js.native
  def getAttachedShaders(program: WebGLProgram): js.Array[WebGLShader] | Null = js.native
  def getAttribLocation(program: WebGLProgram, name: java.lang.String): GLint = js.native
  def getBufferParameter(target: GLenum, pname: GLenum): js.Any = js.native
  def getContextAttributes(): WebGLContextAttributes | Null = js.native
  def getError(): GLenum = js.native
  def getExtension(extensionName: java.lang.String): js.Any = js.native
  @JSName("getExtension")
  def getExtension_ANGLEinstancedarrays(extensionName: ANGLE_instanced_arrays): ANGLEInstancedArrays | Null = js.native
  @JSName("getExtension")
  def getExtension_EXTblendminmax(extensionName: EXT_blend_minmax): EXTBlendMinmax | Null = js.native
  @JSName("getExtension")
  def getExtension_EXTfragdepth(extensionName: EXT_frag_depth): EXTFragDepth | Null = js.native
  @JSName("getExtension")
  def getExtension_EXTsRGB(extensionName: EXT_sRGB): EXTSRGB | Null = js.native
  @JSName("getExtension")
  def getExtension_EXTshadertexturelod(extensionName: EXT_shader_texture_lod): EXTShaderTextureLod | Null = js.native
  @JSName("getExtension")
  def getExtension_EXTtexturefilteranisotropic(extensionName: EXT_texture_filter_anisotropic): EXTTextureFilterAnisotropic | Null = js.native
  @JSName("getExtension")
  def getExtension_OESelementindexuint(extensionName: OES_element_index_uint): OESElementIndexUint | Null = js.native
  @JSName("getExtension")
  def getExtension_OESstandardderivatives(extensionName: OES_standard_derivatives): OESStandardDerivatives | Null = js.native
  @JSName("getExtension")
  def getExtension_OEStexturefloat(extensionName: OES_texture_float): OESTextureFloat | Null = js.native
  @JSName("getExtension")
  def getExtension_OEStexturefloatlinear(extensionName: OES_texture_float_linear): OESTextureFloatLinear | Null = js.native
  @JSName("getExtension")
  def getExtension_OEStexturehalffloat(extensionName: OES_texture_half_float): OESTextureHalfFloat | Null = js.native
  @JSName("getExtension")
  def getExtension_OEStexturehalffloatlinear(extensionName: OES_texture_half_float_linear): OESTextureHalfFloatLinear | Null = js.native
  @JSName("getExtension")
  def getExtension_OESvertexarrayobject(extensionName: OES_vertex_array_object): OESVertexArrayObject | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLcolorbufferfloat(extensionName: WEBGL_color_buffer_float): WEBGLColorBufferFloat | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextureastc(extensionName: WEBGL_compressed_texture_astc): WEBGLCompressedTextureAstc | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextures3tc(extensionName: WEBGL_compressed_texture_s3tc): WEBGLCompressedTextureS3tc | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextures3tcsrgb(extensionName: WEBGL_compressed_texture_s3tc_srgb): WEBGLCompressedTextureS3tcSrgb | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLdebugrendererinfo(extensionName: WEBGL_debug_renderer_info): WEBGLDebugRendererInfo | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLdebugshaders(extensionName: WEBGL_debug_shaders): WEBGLDebugShaders | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLdepthtexture(extensionName: WEBGL_depth_texture): WEBGLDepthTexture | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLdrawbuffers(extensionName: WEBGL_draw_buffers): WEBGLDrawBuffers | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLlosecontext(extensionName: WEBGL_lose_context): WEBGLLoseContext | Null = js.native
  def getFramebufferAttachmentParameter(target: GLenum, attachment: GLenum, pname: GLenum): js.Any = js.native
  def getParameter(pname: GLenum): js.Any = js.native
  def getProgramInfoLog(program: WebGLProgram): java.lang.String | Null = js.native
  def getProgramParameter(program: WebGLProgram, pname: GLenum): js.Any = js.native
  def getRenderbufferParameter(target: GLenum, pname: GLenum): js.Any = js.native
  def getShaderInfoLog(shader: WebGLShader): java.lang.String | Null = js.native
  def getShaderParameter(shader: WebGLShader, pname: GLenum): js.Any = js.native
  def getShaderPrecisionFormat(shadertype: GLenum, precisiontype: GLenum): WebGLShaderPrecisionFormat | Null = js.native
  def getShaderSource(shader: WebGLShader): java.lang.String | Null = js.native
  def getSupportedExtensions(): js.Array[java.lang.String] | Null = js.native
  def getTexParameter(target: GLenum, pname: GLenum): js.Any = js.native
  def getUniform(program: WebGLProgram, location: WebGLUniformLocation): js.Any = js.native
  def getUniformLocation(program: WebGLProgram, name: java.lang.String): WebGLUniformLocation | Null = js.native
  def getVertexAttrib(index: GLuint, pname: GLenum): js.Any = js.native
  def getVertexAttribOffset(index: GLuint, pname: GLenum): GLintptr = js.native
  def hint(target: GLenum, mode: GLenum): Unit = js.native
  def isBuffer(): GLboolean = js.native
  def isBuffer(buffer: WebGLBuffer): GLboolean = js.native
  def isContextLost(): scala.Boolean = js.native
  def isEnabled(cap: GLenum): GLboolean = js.native
  def isFramebuffer(): GLboolean = js.native
  def isFramebuffer(framebuffer: WebGLFramebuffer): GLboolean = js.native
  def isProgram(): GLboolean = js.native
  def isProgram(program: WebGLProgram): GLboolean = js.native
  def isRenderbuffer(): GLboolean = js.native
  def isRenderbuffer(renderbuffer: WebGLRenderbuffer): GLboolean = js.native
  def isShader(): GLboolean = js.native
  def isShader(shader: WebGLShader): GLboolean = js.native
  def isTexture(): GLboolean = js.native
  def isTexture(texture: WebGLTexture): GLboolean = js.native
  def lineWidth(width: GLfloat): Unit = js.native
  def linkProgram(program: WebGLProgram): Unit = js.native
  def pixelStorei(pname: GLenum, param: GLboolean): Unit = js.native
  def pixelStorei(pname: GLenum, param: GLint): Unit = js.native
  def polygonOffset(factor: GLfloat, units: GLfloat): Unit = js.native
  def renderbufferStorage(target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei): Unit = js.native
  def sampleCoverage(value: GLclampf, invert: GLboolean): Unit = js.native
  def scissor(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit = js.native
  def shaderSource(shader: WebGLShader, source: java.lang.String): Unit = js.native
  def stencilFunc(func: GLenum, ref: GLint, mask: GLuint): Unit = js.native
  def stencilFuncSeparate(face: GLenum, func: GLenum, ref: GLint, mask: GLuint): Unit = js.native
  def stencilMask(mask: GLuint): Unit = js.native
  def stencilMaskSeparate(face: GLenum, mask: GLuint): Unit = js.native
  def stencilOp(fail: GLenum, zfail: GLenum, zpass: GLenum): Unit = js.native
  def stencilOpSeparate(face: GLenum, fail: GLenum, zfail: GLenum, zpass: GLenum): Unit = js.native
  def texParameterf(target: GLenum, pname: GLenum, param: GLfloat): Unit = js.native
  def texParameteri(target: GLenum, pname: GLenum, param: GLint): Unit = js.native
  def uniform1f(location: Null, x: GLfloat): Unit = js.native
  def uniform1f(location: WebGLUniformLocation, x: GLfloat): Unit = js.native
  def uniform1i(location: Null, x: GLint): Unit = js.native
  def uniform1i(location: WebGLUniformLocation, x: GLint): Unit = js.native
  def uniform2f(location: Null, x: GLfloat, y: GLfloat): Unit = js.native
  def uniform2f(location: WebGLUniformLocation, x: GLfloat, y: GLfloat): Unit = js.native
  def uniform2i(location: Null, x: GLint, y: GLint): Unit = js.native
  def uniform2i(location: WebGLUniformLocation, x: GLint, y: GLint): Unit = js.native
  def uniform3f(location: Null, x: GLfloat, y: GLfloat, z: GLfloat): Unit = js.native
  def uniform3f(location: WebGLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat): Unit = js.native
  def uniform3i(location: Null, x: GLint, y: GLint, z: GLint): Unit = js.native
  def uniform3i(location: WebGLUniformLocation, x: GLint, y: GLint, z: GLint): Unit = js.native
  def uniform4f(location: Null, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit = js.native
  def uniform4f(location: WebGLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit = js.native
  def uniform4i(location: Null, x: GLint, y: GLint, z: GLint, w: GLint): Unit = js.native
  def uniform4i(location: WebGLUniformLocation, x: GLint, y: GLint, z: GLint, w: GLint): Unit = js.native
  def useProgram(): Unit = js.native
  def useProgram(program: WebGLProgram): Unit = js.native
  def validateProgram(program: WebGLProgram): Unit = js.native
  def vertexAttrib1f(index: GLuint, x: GLfloat): Unit = js.native
  def vertexAttrib1fv(index: GLuint, values: Float32List): Unit = js.native
  def vertexAttrib1fv(index: GLuint, values: Iterable[GLfloat]): Unit = js.native
  def vertexAttrib2f(index: GLuint, x: GLfloat, y: GLfloat): Unit = js.native
  def vertexAttrib2fv(index: GLuint, values: Float32List): Unit = js.native
  def vertexAttrib2fv(index: GLuint, values: Iterable[GLfloat]): Unit = js.native
  def vertexAttrib3f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat): Unit = js.native
  def vertexAttrib3fv(index: GLuint, values: Float32List): Unit = js.native
  def vertexAttrib3fv(index: GLuint, values: Iterable[GLfloat]): Unit = js.native
  def vertexAttrib4f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit = js.native
  def vertexAttrib4fv(index: GLuint, values: Float32List): Unit = js.native
  def vertexAttrib4fv(index: GLuint, values: Iterable[GLfloat]): Unit = js.native
  def vertexAttribPointer(
    index: GLuint,
    size: GLint,
    `type`: GLenum,
    normalized: GLboolean,
    stride: GLsizei,
    offset: GLintptr
  ): Unit = js.native
  def viewport(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit = js.native
}

