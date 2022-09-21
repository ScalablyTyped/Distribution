package typings.std

import typings.std.stdStrings.ANGLE_instanced_arrays
import typings.std.stdStrings.EXT_blend_minmax
import typings.std.stdStrings.EXT_color_buffer_float
import typings.std.stdStrings.EXT_color_buffer_half_float
import typings.std.stdStrings.EXT_float_blend
import typings.std.stdStrings.EXT_frag_depth
import typings.std.stdStrings.EXT_sRGB
import typings.std.stdStrings.EXT_shader_texture_lod
import typings.std.stdStrings.EXT_texture_filter_anisotropic
import typings.std.stdStrings.KHR_parallel_shader_compile
import typings.std.stdStrings.OES_element_index_uint
import typings.std.stdStrings.OES_standard_derivatives
import typings.std.stdStrings.OES_texture_float
import typings.std.stdStrings.OES_texture_float_linear
import typings.std.stdStrings.OES_texture_half_float
import typings.std.stdStrings.OES_texture_half_float_linear
import typings.std.stdStrings.OES_vertex_array_object
import typings.std.stdStrings.OVR_multiview2
import typings.std.stdStrings.WEBGL_color_buffer_float
import typings.std.stdStrings.WEBGL_compressed_texture_astc
import typings.std.stdStrings.WEBGL_compressed_texture_etc
import typings.std.stdStrings.WEBGL_compressed_texture_etc1
import typings.std.stdStrings.WEBGL_compressed_texture_s3tc
import typings.std.stdStrings.WEBGL_compressed_texture_s3tc_srgb
import typings.std.stdStrings.WEBGL_debug_renderer_info
import typings.std.stdStrings.WEBGL_debug_shaders
import typings.std.stdStrings.WEBGL_depth_texture
import typings.std.stdStrings.WEBGL_draw_buffers
import typings.std.stdStrings.WEBGL_lose_context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLRenderingContextBase extends StObject {
  
  /* standard dom */
  val ACTIVE_ATTRIBUTES: GLenum = js.native
  
  /* standard dom */
  val ACTIVE_TEXTURE: GLenum = js.native
  
  /* standard dom */
  val ACTIVE_UNIFORMS: GLenum = js.native
  
  /* standard dom */
  val ALIASED_LINE_WIDTH_RANGE: GLenum = js.native
  
  /* standard dom */
  val ALIASED_POINT_SIZE_RANGE: GLenum = js.native
  
  /* standard dom */
  val ALPHA: GLenum = js.native
  
  /* standard dom */
  val ALPHA_BITS: GLenum = js.native
  
  /* standard dom */
  val ALWAYS: GLenum = js.native
  
  /* standard dom */
  val ARRAY_BUFFER: GLenum = js.native
  
  /* standard dom */
  val ARRAY_BUFFER_BINDING: GLenum = js.native
  
  /* standard dom */
  val ATTACHED_SHADERS: GLenum = js.native
  
  /* standard dom */
  val BACK: GLenum = js.native
  
  /* standard dom */
  val BLEND: GLenum = js.native
  
  /* standard dom */
  val BLEND_COLOR: GLenum = js.native
  
  /* standard dom */
  val BLEND_DST_ALPHA: GLenum = js.native
  
  /* standard dom */
  val BLEND_DST_RGB: GLenum = js.native
  
  /* standard dom */
  val BLEND_EQUATION: GLenum = js.native
  
  /* standard dom */
  val BLEND_EQUATION_ALPHA: GLenum = js.native
  
  /* standard dom */
  val BLEND_EQUATION_RGB: GLenum = js.native
  
  /* standard dom */
  val BLEND_SRC_ALPHA: GLenum = js.native
  
  /* standard dom */
  val BLEND_SRC_RGB: GLenum = js.native
  
  /* standard dom */
  val BLUE_BITS: GLenum = js.native
  
  /* standard dom */
  val BOOL: GLenum = js.native
  
  /* standard dom */
  val BOOL_VEC2: GLenum = js.native
  
  /* standard dom */
  val BOOL_VEC3: GLenum = js.native
  
  /* standard dom */
  val BOOL_VEC4: GLenum = js.native
  
  /* standard dom */
  val BROWSER_DEFAULT_WEBGL: GLenum = js.native
  
  /* standard dom */
  val BUFFER_SIZE: GLenum = js.native
  
  /* standard dom */
  val BUFFER_USAGE: GLenum = js.native
  
  /* standard dom */
  val BYTE: GLenum = js.native
  
  /* standard dom */
  val CCW: GLenum = js.native
  
  /* standard dom */
  val CLAMP_TO_EDGE: GLenum = js.native
  
  /* standard dom */
  val COLOR_ATTACHMENT0: GLenum = js.native
  
  /* standard dom */
  val COLOR_BUFFER_BIT: GLenum = js.native
  
  /* standard dom */
  val COLOR_CLEAR_VALUE: GLenum = js.native
  
  /* standard dom */
  val COLOR_WRITEMASK: GLenum = js.native
  
  /* standard dom */
  val COMPILE_STATUS: GLenum = js.native
  
  /* standard dom */
  val COMPRESSED_TEXTURE_FORMATS: GLenum = js.native
  
  /* standard dom */
  val CONSTANT_ALPHA: GLenum = js.native
  
  /* standard dom */
  val CONSTANT_COLOR: GLenum = js.native
  
  /* standard dom */
  val CONTEXT_LOST_WEBGL: GLenum = js.native
  
  /* standard dom */
  val CULL_FACE: GLenum = js.native
  
  /* standard dom */
  val CULL_FACE_MODE: GLenum = js.native
  
  /* standard dom */
  val CURRENT_PROGRAM: GLenum = js.native
  
  /* standard dom */
  val CURRENT_VERTEX_ATTRIB: GLenum = js.native
  
  /* standard dom */
  val CW: GLenum = js.native
  
  /* standard dom */
  val DECR: GLenum = js.native
  
  /* standard dom */
  val DECR_WRAP: GLenum = js.native
  
  /* standard dom */
  val DELETE_STATUS: GLenum = js.native
  
  /* standard dom */
  val DEPTH_ATTACHMENT: GLenum = js.native
  
  /* standard dom */
  val DEPTH_BITS: GLenum = js.native
  
  /* standard dom */
  val DEPTH_BUFFER_BIT: GLenum = js.native
  
  /* standard dom */
  val DEPTH_CLEAR_VALUE: GLenum = js.native
  
  /* standard dom */
  val DEPTH_COMPONENT: GLenum = js.native
  
  /* standard dom */
  val DEPTH_COMPONENT16: GLenum = js.native
  
  /* standard dom */
  val DEPTH_FUNC: GLenum = js.native
  
  /* standard dom */
  val DEPTH_RANGE: GLenum = js.native
  
  /* standard dom */
  val DEPTH_STENCIL: GLenum = js.native
  
  /* standard dom */
  val DEPTH_STENCIL_ATTACHMENT: GLenum = js.native
  
  /* standard dom */
  val DEPTH_TEST: GLenum = js.native
  
  /* standard dom */
  val DEPTH_WRITEMASK: GLenum = js.native
  
  /* standard dom */
  val DITHER: GLenum = js.native
  
  /* standard dom */
  val DONT_CARE: GLenum = js.native
  
  /* standard dom */
  val DST_ALPHA: GLenum = js.native
  
  /* standard dom */
  val DST_COLOR: GLenum = js.native
  
  /* standard dom */
  val DYNAMIC_DRAW: GLenum = js.native
  
  /* standard dom */
  val ELEMENT_ARRAY_BUFFER: GLenum = js.native
  
  /* standard dom */
  val ELEMENT_ARRAY_BUFFER_BINDING: GLenum = js.native
  
  /* standard dom */
  val EQUAL: GLenum = js.native
  
  /* standard dom */
  val FASTEST: GLenum = js.native
  
  /* standard dom */
  val FLOAT: GLenum = js.native
  
  /* standard dom */
  val FLOAT_MAT2: GLenum = js.native
  
  /* standard dom */
  val FLOAT_MAT3: GLenum = js.native
  
  /* standard dom */
  val FLOAT_MAT4: GLenum = js.native
  
  /* standard dom */
  val FLOAT_VEC2: GLenum = js.native
  
  /* standard dom */
  val FLOAT_VEC3: GLenum = js.native
  
  /* standard dom */
  val FLOAT_VEC4: GLenum = js.native
  
  /* standard dom */
  val FRAGMENT_SHADER: GLenum = js.native
  
  /* standard dom */
  val FRAMEBUFFER: GLenum = js.native
  
  /* standard dom */
  val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: GLenum = js.native
  
  /* standard dom */
  val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: GLenum = js.native
  
  /* standard dom */
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: GLenum = js.native
  
  /* standard dom */
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: GLenum = js.native
  
  /* standard dom */
  val FRAMEBUFFER_BINDING: GLenum = js.native
  
  /* standard dom */
  val FRAMEBUFFER_COMPLETE: GLenum = js.native
  
  /* standard dom */
  val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: GLenum = js.native
  
  /* standard dom */
  val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: GLenum = js.native
  
  /* standard dom */
  val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: GLenum = js.native
  
  /* standard dom */
  val FRAMEBUFFER_UNSUPPORTED: GLenum = js.native
  
  /* standard dom */
  val FRONT: GLenum = js.native
  
  /* standard dom */
  val FRONT_AND_BACK: GLenum = js.native
  
  /* standard dom */
  val FRONT_FACE: GLenum = js.native
  
  /* standard dom */
  val FUNC_ADD: GLenum = js.native
  
  /* standard dom */
  val FUNC_REVERSE_SUBTRACT: GLenum = js.native
  
  /* standard dom */
  val FUNC_SUBTRACT: GLenum = js.native
  
  /* standard dom */
  val GENERATE_MIPMAP_HINT: GLenum = js.native
  
  /* standard dom */
  val GEQUAL: GLenum = js.native
  
  /* standard dom */
  val GREATER: GLenum = js.native
  
  /* standard dom */
  val GREEN_BITS: GLenum = js.native
  
  /* standard dom */
  val HIGH_FLOAT: GLenum = js.native
  
  /* standard dom */
  val HIGH_INT: GLenum = js.native
  
  /* standard dom */
  val IMPLEMENTATION_COLOR_READ_FORMAT: GLenum = js.native
  
  /* standard dom */
  val IMPLEMENTATION_COLOR_READ_TYPE: GLenum = js.native
  
  /* standard dom */
  val INCR: GLenum = js.native
  
  /* standard dom */
  val INCR_WRAP: GLenum = js.native
  
  /* standard dom */
  val INT: GLenum = js.native
  
  /* standard dom */
  val INT_VEC2: GLenum = js.native
  
  /* standard dom */
  val INT_VEC3: GLenum = js.native
  
  /* standard dom */
  val INT_VEC4: GLenum = js.native
  
  /* standard dom */
  val INVALID_ENUM: GLenum = js.native
  
  /* standard dom */
  val INVALID_FRAMEBUFFER_OPERATION: GLenum = js.native
  
  /* standard dom */
  val INVALID_OPERATION: GLenum = js.native
  
  /* standard dom */
  val INVALID_VALUE: GLenum = js.native
  
  /* standard dom */
  val INVERT: GLenum = js.native
  
  /* standard dom */
  val KEEP: GLenum = js.native
  
  /* standard dom */
  val LEQUAL: GLenum = js.native
  
  /* standard dom */
  val LESS: GLenum = js.native
  
  /* standard dom */
  val LINEAR: GLenum = js.native
  
  /* standard dom */
  val LINEAR_MIPMAP_LINEAR: GLenum = js.native
  
  /* standard dom */
  val LINEAR_MIPMAP_NEAREST: GLenum = js.native
  
  /* standard dom */
  val LINES: GLenum = js.native
  
  /* standard dom */
  val LINE_LOOP: GLenum = js.native
  
  /* standard dom */
  val LINE_STRIP: GLenum = js.native
  
  /* standard dom */
  val LINE_WIDTH: GLenum = js.native
  
  /* standard dom */
  val LINK_STATUS: GLenum = js.native
  
  /* standard dom */
  val LOW_FLOAT: GLenum = js.native
  
  /* standard dom */
  val LOW_INT: GLenum = js.native
  
  /* standard dom */
  val LUMINANCE: GLenum = js.native
  
  /* standard dom */
  val LUMINANCE_ALPHA: GLenum = js.native
  
  /* standard dom */
  val MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum = js.native
  
  /* standard dom */
  val MAX_CUBE_MAP_TEXTURE_SIZE: GLenum = js.native
  
  /* standard dom */
  val MAX_FRAGMENT_UNIFORM_VECTORS: GLenum = js.native
  
  /* standard dom */
  val MAX_RENDERBUFFER_SIZE: GLenum = js.native
  
  /* standard dom */
  val MAX_TEXTURE_IMAGE_UNITS: GLenum = js.native
  
  /* standard dom */
  val MAX_TEXTURE_SIZE: GLenum = js.native
  
  /* standard dom */
  val MAX_VARYING_VECTORS: GLenum = js.native
  
  /* standard dom */
  val MAX_VERTEX_ATTRIBS: GLenum = js.native
  
  /* standard dom */
  val MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum = js.native
  
  /* standard dom */
  val MAX_VERTEX_UNIFORM_VECTORS: GLenum = js.native
  
  /* standard dom */
  val MAX_VIEWPORT_DIMS: GLenum = js.native
  
  /* standard dom */
  val MEDIUM_FLOAT: GLenum = js.native
  
  /* standard dom */
  val MEDIUM_INT: GLenum = js.native
  
  /* standard dom */
  val MIRRORED_REPEAT: GLenum = js.native
  
  /* standard dom */
  val NEAREST: GLenum = js.native
  
  /* standard dom */
  val NEAREST_MIPMAP_LINEAR: GLenum = js.native
  
  /* standard dom */
  val NEAREST_MIPMAP_NEAREST: GLenum = js.native
  
  /* standard dom */
  val NEVER: GLenum = js.native
  
  /* standard dom */
  val NICEST: GLenum = js.native
  
  /* standard dom */
  val NONE: GLenum = js.native
  
  /* standard dom */
  val NOTEQUAL: GLenum = js.native
  
  /* standard dom */
  val NO_ERROR: GLenum = js.native
  
  /* standard dom */
  val ONE: GLenum = js.native
  
  /* standard dom */
  val ONE_MINUS_CONSTANT_ALPHA: GLenum = js.native
  
  /* standard dom */
  val ONE_MINUS_CONSTANT_COLOR: GLenum = js.native
  
  /* standard dom */
  val ONE_MINUS_DST_ALPHA: GLenum = js.native
  
  /* standard dom */
  val ONE_MINUS_DST_COLOR: GLenum = js.native
  
  /* standard dom */
  val ONE_MINUS_SRC_ALPHA: GLenum = js.native
  
  /* standard dom */
  val ONE_MINUS_SRC_COLOR: GLenum = js.native
  
  /* standard dom */
  val OUT_OF_MEMORY: GLenum = js.native
  
  /* standard dom */
  val PACK_ALIGNMENT: GLenum = js.native
  
  /* standard dom */
  val POINTS: GLenum = js.native
  
  /* standard dom */
  val POLYGON_OFFSET_FACTOR: GLenum = js.native
  
  /* standard dom */
  val POLYGON_OFFSET_FILL: GLenum = js.native
  
  /* standard dom */
  val POLYGON_OFFSET_UNITS: GLenum = js.native
  
  /* standard dom */
  val RED_BITS: GLenum = js.native
  
  /* standard dom */
  val RENDERBUFFER: GLenum = js.native
  
  /* standard dom */
  val RENDERBUFFER_ALPHA_SIZE: GLenum = js.native
  
  /* standard dom */
  val RENDERBUFFER_BINDING: GLenum = js.native
  
  /* standard dom */
  val RENDERBUFFER_BLUE_SIZE: GLenum = js.native
  
  /* standard dom */
  val RENDERBUFFER_DEPTH_SIZE: GLenum = js.native
  
  /* standard dom */
  val RENDERBUFFER_GREEN_SIZE: GLenum = js.native
  
  /* standard dom */
  val RENDERBUFFER_HEIGHT: GLenum = js.native
  
  /* standard dom */
  val RENDERBUFFER_INTERNAL_FORMAT: GLenum = js.native
  
  /* standard dom */
  val RENDERBUFFER_RED_SIZE: GLenum = js.native
  
  /* standard dom */
  val RENDERBUFFER_STENCIL_SIZE: GLenum = js.native
  
  /* standard dom */
  val RENDERBUFFER_WIDTH: GLenum = js.native
  
  /* standard dom */
  val RENDERER: GLenum = js.native
  
  /* standard dom */
  val REPEAT: GLenum = js.native
  
  /* standard dom */
  val REPLACE: GLenum = js.native
  
  /* standard dom */
  val RGB: GLenum = js.native
  
  /* standard dom */
  val RGB565: GLenum = js.native
  
  /* standard dom */
  val RGB5_A1: GLenum = js.native
  
  /* standard dom */
  val RGBA: GLenum = js.native
  
  /* standard dom */
  val RGBA4: GLenum = js.native
  
  /* standard dom */
  val SAMPLER_2D: GLenum = js.native
  
  /* standard dom */
  val SAMPLER_CUBE: GLenum = js.native
  
  /* standard dom */
  val SAMPLES: GLenum = js.native
  
  /* standard dom */
  val SAMPLE_ALPHA_TO_COVERAGE: GLenum = js.native
  
  /* standard dom */
  val SAMPLE_BUFFERS: GLenum = js.native
  
  /* standard dom */
  val SAMPLE_COVERAGE: GLenum = js.native
  
  /* standard dom */
  val SAMPLE_COVERAGE_INVERT: GLenum = js.native
  
  /* standard dom */
  val SAMPLE_COVERAGE_VALUE: GLenum = js.native
  
  /* standard dom */
  val SCISSOR_BOX: GLenum = js.native
  
  /* standard dom */
  val SCISSOR_TEST: GLenum = js.native
  
  /* standard dom */
  val SHADER_TYPE: GLenum = js.native
  
  /* standard dom */
  val SHADING_LANGUAGE_VERSION: GLenum = js.native
  
  /* standard dom */
  val SHORT: GLenum = js.native
  
  /* standard dom */
  val SRC_ALPHA: GLenum = js.native
  
  /* standard dom */
  val SRC_ALPHA_SATURATE: GLenum = js.native
  
  /* standard dom */
  val SRC_COLOR: GLenum = js.native
  
  /* standard dom */
  val STATIC_DRAW: GLenum = js.native
  
  /* standard dom */
  val STENCIL_ATTACHMENT: GLenum = js.native
  
  /* standard dom */
  val STENCIL_BACK_FAIL: GLenum = js.native
  
  /* standard dom */
  val STENCIL_BACK_FUNC: GLenum = js.native
  
  /* standard dom */
  val STENCIL_BACK_PASS_DEPTH_FAIL: GLenum = js.native
  
  /* standard dom */
  val STENCIL_BACK_PASS_DEPTH_PASS: GLenum = js.native
  
  /* standard dom */
  val STENCIL_BACK_REF: GLenum = js.native
  
  /* standard dom */
  val STENCIL_BACK_VALUE_MASK: GLenum = js.native
  
  /* standard dom */
  val STENCIL_BACK_WRITEMASK: GLenum = js.native
  
  /* standard dom */
  val STENCIL_BITS: GLenum = js.native
  
  /* standard dom */
  val STENCIL_BUFFER_BIT: GLenum = js.native
  
  /* standard dom */
  val STENCIL_CLEAR_VALUE: GLenum = js.native
  
  /* standard dom */
  val STENCIL_FAIL: GLenum = js.native
  
  /* standard dom */
  val STENCIL_FUNC: GLenum = js.native
  
  /* standard dom */
  val STENCIL_INDEX8: GLenum = js.native
  
  /* standard dom */
  val STENCIL_PASS_DEPTH_FAIL: GLenum = js.native
  
  /* standard dom */
  val STENCIL_PASS_DEPTH_PASS: GLenum = js.native
  
  /* standard dom */
  val STENCIL_REF: GLenum = js.native
  
  /* standard dom */
  val STENCIL_TEST: GLenum = js.native
  
  /* standard dom */
  val STENCIL_VALUE_MASK: GLenum = js.native
  
  /* standard dom */
  val STENCIL_WRITEMASK: GLenum = js.native
  
  /* standard dom */
  val STREAM_DRAW: GLenum = js.native
  
  /* standard dom */
  val SUBPIXEL_BITS: GLenum = js.native
  
  /* standard dom */
  val TEXTURE: GLenum = js.native
  
  /* standard dom */
  val TEXTURE0: GLenum = js.native
  
  /* standard dom */
  val TEXTURE1: GLenum = js.native
  
  /* standard dom */
  val TEXTURE10: GLenum = js.native
  
  /* standard dom */
  val TEXTURE11: GLenum = js.native
  
  /* standard dom */
  val TEXTURE12: GLenum = js.native
  
  /* standard dom */
  val TEXTURE13: GLenum = js.native
  
  /* standard dom */
  val TEXTURE14: GLenum = js.native
  
  /* standard dom */
  val TEXTURE15: GLenum = js.native
  
  /* standard dom */
  val TEXTURE16: GLenum = js.native
  
  /* standard dom */
  val TEXTURE17: GLenum = js.native
  
  /* standard dom */
  val TEXTURE18: GLenum = js.native
  
  /* standard dom */
  val TEXTURE19: GLenum = js.native
  
  /* standard dom */
  val TEXTURE2: GLenum = js.native
  
  /* standard dom */
  val TEXTURE20: GLenum = js.native
  
  /* standard dom */
  val TEXTURE21: GLenum = js.native
  
  /* standard dom */
  val TEXTURE22: GLenum = js.native
  
  /* standard dom */
  val TEXTURE23: GLenum = js.native
  
  /* standard dom */
  val TEXTURE24: GLenum = js.native
  
  /* standard dom */
  val TEXTURE25: GLenum = js.native
  
  /* standard dom */
  val TEXTURE26: GLenum = js.native
  
  /* standard dom */
  val TEXTURE27: GLenum = js.native
  
  /* standard dom */
  val TEXTURE28: GLenum = js.native
  
  /* standard dom */
  val TEXTURE29: GLenum = js.native
  
  /* standard dom */
  val TEXTURE3: GLenum = js.native
  
  /* standard dom */
  val TEXTURE30: GLenum = js.native
  
  /* standard dom */
  val TEXTURE31: GLenum = js.native
  
  /* standard dom */
  val TEXTURE4: GLenum = js.native
  
  /* standard dom */
  val TEXTURE5: GLenum = js.native
  
  /* standard dom */
  val TEXTURE6: GLenum = js.native
  
  /* standard dom */
  val TEXTURE7: GLenum = js.native
  
  /* standard dom */
  val TEXTURE8: GLenum = js.native
  
  /* standard dom */
  val TEXTURE9: GLenum = js.native
  
  /* standard dom */
  val TEXTURE_2D: GLenum = js.native
  
  /* standard dom */
  val TEXTURE_BINDING_2D: GLenum = js.native
  
  /* standard dom */
  val TEXTURE_BINDING_CUBE_MAP: GLenum = js.native
  
  /* standard dom */
  val TEXTURE_CUBE_MAP: GLenum = js.native
  
  /* standard dom */
  val TEXTURE_CUBE_MAP_NEGATIVE_X: GLenum = js.native
  
  /* standard dom */
  val TEXTURE_CUBE_MAP_NEGATIVE_Y: GLenum = js.native
  
  /* standard dom */
  val TEXTURE_CUBE_MAP_NEGATIVE_Z: GLenum = js.native
  
  /* standard dom */
  val TEXTURE_CUBE_MAP_POSITIVE_X: GLenum = js.native
  
  /* standard dom */
  val TEXTURE_CUBE_MAP_POSITIVE_Y: GLenum = js.native
  
  /* standard dom */
  val TEXTURE_CUBE_MAP_POSITIVE_Z: GLenum = js.native
  
  /* standard dom */
  val TEXTURE_MAG_FILTER: GLenum = js.native
  
  /* standard dom */
  val TEXTURE_MIN_FILTER: GLenum = js.native
  
  /* standard dom */
  val TEXTURE_WRAP_S: GLenum = js.native
  
  /* standard dom */
  val TEXTURE_WRAP_T: GLenum = js.native
  
  /* standard dom */
  val TRIANGLES: GLenum = js.native
  
  /* standard dom */
  val TRIANGLE_FAN: GLenum = js.native
  
  /* standard dom */
  val TRIANGLE_STRIP: GLenum = js.native
  
  /* standard dom */
  val UNPACK_ALIGNMENT: GLenum = js.native
  
  /* standard dom */
  val UNPACK_COLORSPACE_CONVERSION_WEBGL: GLenum = js.native
  
  /* standard dom */
  val UNPACK_FLIP_Y_WEBGL: GLenum = js.native
  
  /* standard dom */
  val UNPACK_PREMULTIPLY_ALPHA_WEBGL: GLenum = js.native
  
  /* standard dom */
  val UNSIGNED_BYTE: GLenum = js.native
  
  /* standard dom */
  val UNSIGNED_INT: GLenum = js.native
  
  /* standard dom */
  val UNSIGNED_SHORT: GLenum = js.native
  
  /* standard dom */
  val UNSIGNED_SHORT_4_4_4_4: GLenum = js.native
  
  /* standard dom */
  val UNSIGNED_SHORT_5_5_5_1: GLenum = js.native
  
  /* standard dom */
  val UNSIGNED_SHORT_5_6_5: GLenum = js.native
  
  /* standard dom */
  val VALIDATE_STATUS: GLenum = js.native
  
  /* standard dom */
  val VENDOR: GLenum = js.native
  
  /* standard dom */
  val VERSION: GLenum = js.native
  
  /* standard dom */
  val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: GLenum = js.native
  
  /* standard dom */
  val VERTEX_ATTRIB_ARRAY_ENABLED: GLenum = js.native
  
  /* standard dom */
  val VERTEX_ATTRIB_ARRAY_NORMALIZED: GLenum = js.native
  
  /* standard dom */
  val VERTEX_ATTRIB_ARRAY_POINTER: GLenum = js.native
  
  /* standard dom */
  val VERTEX_ATTRIB_ARRAY_SIZE: GLenum = js.native
  
  /* standard dom */
  val VERTEX_ATTRIB_ARRAY_STRIDE: GLenum = js.native
  
  /* standard dom */
  val VERTEX_ATTRIB_ARRAY_TYPE: GLenum = js.native
  
  /* standard dom */
  val VERTEX_SHADER: GLenum = js.native
  
  /* standard dom */
  val VIEWPORT: GLenum = js.native
  
  /* standard dom */
  val ZERO: GLenum = js.native
  
  /* standard dom */
  def activeTexture(texture: GLenum): Unit = js.native
  
  /* standard dom */
  def attachShader(program: WebGLProgram, shader: WebGLShader): Unit = js.native
  
  /* standard dom */
  def bindAttribLocation(program: WebGLProgram, index: GLuint, name: java.lang.String): Unit = js.native
  
  /* standard dom */
  def bindBuffer(target: GLenum): Unit = js.native
  def bindBuffer(target: GLenum, buffer: WebGLBuffer): Unit = js.native
  
  /* standard dom */
  def bindFramebuffer(target: GLenum): Unit = js.native
  def bindFramebuffer(target: GLenum, framebuffer: WebGLFramebuffer): Unit = js.native
  
  /* standard dom */
  def bindRenderbuffer(target: GLenum): Unit = js.native
  def bindRenderbuffer(target: GLenum, renderbuffer: WebGLRenderbuffer): Unit = js.native
  
  /* standard dom */
  def bindTexture(target: GLenum): Unit = js.native
  def bindTexture(target: GLenum, texture: WebGLTexture): Unit = js.native
  
  /* standard dom */
  def blendColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf): Unit = js.native
  
  /* standard dom */
  def blendEquation(mode: GLenum): Unit = js.native
  
  /* standard dom */
  def blendEquationSeparate(modeRGB: GLenum, modeAlpha: GLenum): Unit = js.native
  
  /* standard dom */
  def blendFunc(sfactor: GLenum, dfactor: GLenum): Unit = js.native
  
  /* standard dom */
  def blendFuncSeparate(srcRGB: GLenum, dstRGB: GLenum, srcAlpha: GLenum, dstAlpha: GLenum): Unit = js.native
  
  /* standard dom */
  val canvas: HTMLCanvasElement = js.native
  
  /* standard dom */
  def checkFramebufferStatus(target: GLenum): GLenum = js.native
  
  /* standard dom */
  def clear(mask: GLbitfield): Unit = js.native
  
  /* standard dom */
  def clearColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf): Unit = js.native
  
  /* standard dom */
  def clearDepth(depth: GLclampf): Unit = js.native
  
  /* standard dom */
  def clearStencil(s: GLint): Unit = js.native
  
  /* standard dom */
  def colorMask(red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean): Unit = js.native
  
  /* standard dom */
  def compileShader(shader: WebGLShader): Unit = js.native
  
  /* standard dom */
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
  
  /* standard dom */
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
  
  /* standard dom */
  def createBuffer(): WebGLBuffer | Null = js.native
  
  /* standard dom */
  def createFramebuffer(): WebGLFramebuffer | Null = js.native
  
  /* standard dom */
  def createProgram(): WebGLProgram | Null = js.native
  
  /* standard dom */
  def createRenderbuffer(): WebGLRenderbuffer | Null = js.native
  
  /* standard dom */
  def createShader(`type`: GLenum): WebGLShader | Null = js.native
  
  /* standard dom */
  def createTexture(): WebGLTexture | Null = js.native
  
  /* standard dom */
  def cullFace(mode: GLenum): Unit = js.native
  
  /* standard dom */
  def deleteBuffer(): Unit = js.native
  def deleteBuffer(buffer: WebGLBuffer): Unit = js.native
  
  /* standard dom */
  def deleteFramebuffer(): Unit = js.native
  def deleteFramebuffer(framebuffer: WebGLFramebuffer): Unit = js.native
  
  /* standard dom */
  def deleteProgram(): Unit = js.native
  def deleteProgram(program: WebGLProgram): Unit = js.native
  
  /* standard dom */
  def deleteRenderbuffer(): Unit = js.native
  def deleteRenderbuffer(renderbuffer: WebGLRenderbuffer): Unit = js.native
  
  /* standard dom */
  def deleteShader(): Unit = js.native
  def deleteShader(shader: WebGLShader): Unit = js.native
  
  /* standard dom */
  def deleteTexture(): Unit = js.native
  def deleteTexture(texture: WebGLTexture): Unit = js.native
  
  /* standard dom */
  def depthFunc(func: GLenum): Unit = js.native
  
  /* standard dom */
  def depthMask(flag: GLboolean): Unit = js.native
  
  /* standard dom */
  def depthRange(zNear: GLclampf, zFar: GLclampf): Unit = js.native
  
  /* standard dom */
  def detachShader(program: WebGLProgram, shader: WebGLShader): Unit = js.native
  
  /* standard dom */
  def disable(cap: GLenum): Unit = js.native
  
  /* standard dom */
  def disableVertexAttribArray(index: GLuint): Unit = js.native
  
  /* standard dom */
  def drawArrays(mode: GLenum, first: GLint, count: GLsizei): Unit = js.native
  
  /* standard dom */
  def drawElements(mode: GLenum, count: GLsizei, `type`: GLenum, offset: GLintptr): Unit = js.native
  
  /* standard dom */
  val drawingBufferHeight: GLsizei = js.native
  
  /* standard dom */
  val drawingBufferWidth: GLsizei = js.native
  
  /* standard dom */
  def enable(cap: GLenum): Unit = js.native
  
  /* standard dom */
  def enableVertexAttribArray(index: GLuint): Unit = js.native
  
  /* standard dom */
  def finish(): Unit = js.native
  
  /* standard dom */
  def flush(): Unit = js.native
  
  /* standard dom */
  def framebufferRenderbuffer(target: GLenum, attachment: GLenum, renderbuffertarget: GLenum): Unit = js.native
  def framebufferRenderbuffer(target: GLenum, attachment: GLenum, renderbuffertarget: GLenum, renderbuffer: WebGLRenderbuffer): Unit = js.native
  
  def framebufferTexture2D(target: GLenum, attachment: GLenum, textarget: GLenum, texture: Null, level: GLint): Unit = js.native
  /* standard dom */
  def framebufferTexture2D(target: GLenum, attachment: GLenum, textarget: GLenum, texture: WebGLTexture, level: GLint): Unit = js.native
  
  /* standard dom */
  def frontFace(mode: GLenum): Unit = js.native
  
  /* standard dom */
  def generateMipmap(target: GLenum): Unit = js.native
  
  /* standard dom */
  def getActiveAttrib(program: WebGLProgram, index: GLuint): WebGLActiveInfo | Null = js.native
  
  /* standard dom */
  def getActiveUniform(program: WebGLProgram, index: GLuint): WebGLActiveInfo | Null = js.native
  
  /* standard dom */
  def getAttachedShaders(program: WebGLProgram): js.Array[WebGLShader] | Null = js.native
  
  /* standard dom */
  def getAttribLocation(program: WebGLProgram, name: java.lang.String): GLint = js.native
  
  /* standard dom */
  def getBufferParameter(target: GLenum, pname: GLenum): Any = js.native
  
  /* standard dom */
  def getContextAttributes(): WebGLContextAttributes | Null = js.native
  
  /* standard dom */
  def getError(): GLenum = js.native
  
  /* standard dom */
  def getExtension(name: java.lang.String): Any = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_ANGLEinstancedarrays(extensionName: ANGLE_instanced_arrays): ANGLEInstancedArrays | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_EXTblendminmax(extensionName: EXT_blend_minmax): EXTBlendMinmax | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_EXTcolorbufferfloat(extensionName: EXT_color_buffer_float): EXTColorBufferFloat | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_EXTcolorbufferhalffloat(extensionName: EXT_color_buffer_half_float): EXTColorBufferHalfFloat | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_EXTfloatblend(extensionName: EXT_float_blend): EXTFloatBlend | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_EXTfragdepth(extensionName: EXT_frag_depth): EXTFragDepth | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_EXTsRGB(extensionName: EXT_sRGB): EXTSRGB | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_EXTshadertexturelod(extensionName: EXT_shader_texture_lod): EXTShaderTextureLod | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_EXTtexturefilteranisotropic(extensionName: EXT_texture_filter_anisotropic): EXTTextureFilterAnisotropic | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_KHRparallelshadercompile(extensionName: KHR_parallel_shader_compile): KHRParallelShaderCompile | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_OESelementindexuint(extensionName: OES_element_index_uint): OESElementIndexUint | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_OESstandardderivatives(extensionName: OES_standard_derivatives): OESStandardDerivatives | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_OEStexturefloat(extensionName: OES_texture_float): OESTextureFloat | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_OEStexturefloatlinear(extensionName: OES_texture_float_linear): OESTextureFloatLinear | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_OEStexturehalffloat(extensionName: OES_texture_half_float): OESTextureHalfFloat | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_OEStexturehalffloatlinear(extensionName: OES_texture_half_float_linear): OESTextureHalfFloatLinear | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_OESvertexarrayobject(extensionName: OES_vertex_array_object): OESVertexArrayObject | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_OVRmultiview2(extensionName: OVR_multiview2): OVRMultiview2 | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_WEBGLcolorbufferfloat(extensionName: WEBGL_color_buffer_float): WEBGLColorBufferFloat | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextureastc(extensionName: WEBGL_compressed_texture_astc): WEBGLCompressedTextureAstc | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextureetc(extensionName: WEBGL_compressed_texture_etc): WEBGLCompressedTextureEtc | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextureetc1(extensionName: WEBGL_compressed_texture_etc1): WEBGLCompressedTextureEtc1 | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextures3tc(extensionName: WEBGL_compressed_texture_s3tc): WEBGLCompressedTextureS3tc | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextures3tcsrgb(extensionName: WEBGL_compressed_texture_s3tc_srgb): WEBGLCompressedTextureS3tcSrgb | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_WEBGLdebugrendererinfo(extensionName: WEBGL_debug_renderer_info): WEBGLDebugRendererInfo | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_WEBGLdebugshaders(extensionName: WEBGL_debug_shaders): WEBGLDebugShaders | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_WEBGLdepthtexture(extensionName: WEBGL_depth_texture): WEBGLDepthTexture | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_WEBGLdrawbuffers(extensionName: WEBGL_draw_buffers): WEBGLDrawBuffers | Null = js.native
  /* standard dom */
  @JSName("getExtension")
  def getExtension_WEBGLlosecontext(extensionName: WEBGL_lose_context): WEBGLLoseContext | Null = js.native
  
  /* standard dom */
  def getFramebufferAttachmentParameter(target: GLenum, attachment: GLenum, pname: GLenum): Any = js.native
  
  /* standard dom */
  def getParameter(pname: GLenum): Any = js.native
  
  /* standard dom */
  def getProgramInfoLog(program: WebGLProgram): java.lang.String | Null = js.native
  
  /* standard dom */
  def getProgramParameter(program: WebGLProgram, pname: GLenum): Any = js.native
  
  /* standard dom */
  def getRenderbufferParameter(target: GLenum, pname: GLenum): Any = js.native
  
  /* standard dom */
  def getShaderInfoLog(shader: WebGLShader): java.lang.String | Null = js.native
  
  /* standard dom */
  def getShaderParameter(shader: WebGLShader, pname: GLenum): Any = js.native
  
  /* standard dom */
  def getShaderPrecisionFormat(shadertype: GLenum, precisiontype: GLenum): WebGLShaderPrecisionFormat | Null = js.native
  
  /* standard dom */
  def getShaderSource(shader: WebGLShader): java.lang.String | Null = js.native
  
  /* standard dom */
  def getSupportedExtensions(): js.Array[java.lang.String] | Null = js.native
  
  /* standard dom */
  def getTexParameter(target: GLenum, pname: GLenum): Any = js.native
  
  /* standard dom */
  def getUniform(program: WebGLProgram, location: WebGLUniformLocation): Any = js.native
  
  /* standard dom */
  def getUniformLocation(program: WebGLProgram, name: java.lang.String): WebGLUniformLocation | Null = js.native
  
  /* standard dom */
  def getVertexAttrib(index: GLuint, pname: GLenum): Any = js.native
  
  /* standard dom */
  def getVertexAttribOffset(index: GLuint, pname: GLenum): GLintptr = js.native
  
  /* standard dom */
  def hint(target: GLenum, mode: GLenum): Unit = js.native
  
  /* standard dom */
  def isBuffer(): GLboolean = js.native
  def isBuffer(buffer: WebGLBuffer): GLboolean = js.native
  
  /* standard dom */
  def isContextLost(): scala.Boolean = js.native
  
  /* standard dom */
  def isEnabled(cap: GLenum): GLboolean = js.native
  
  /* standard dom */
  def isFramebuffer(): GLboolean = js.native
  def isFramebuffer(framebuffer: WebGLFramebuffer): GLboolean = js.native
  
  /* standard dom */
  def isProgram(): GLboolean = js.native
  def isProgram(program: WebGLProgram): GLboolean = js.native
  
  /* standard dom */
  def isRenderbuffer(): GLboolean = js.native
  def isRenderbuffer(renderbuffer: WebGLRenderbuffer): GLboolean = js.native
  
  /* standard dom */
  def isShader(): GLboolean = js.native
  def isShader(shader: WebGLShader): GLboolean = js.native
  
  /* standard dom */
  def isTexture(): GLboolean = js.native
  def isTexture(texture: WebGLTexture): GLboolean = js.native
  
  /* standard dom */
  def lineWidth(width: GLfloat): Unit = js.native
  
  /* standard dom */
  def linkProgram(program: WebGLProgram): Unit = js.native
  
  def pixelStorei(pname: GLenum, param: GLboolean): Unit = js.native
  /* standard dom */
  def pixelStorei(pname: GLenum, param: GLint): Unit = js.native
  
  /* standard dom */
  def polygonOffset(factor: GLfloat, units: GLfloat): Unit = js.native
  
  /* standard dom */
  def renderbufferStorage(target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei): Unit = js.native
  
  /* standard dom */
  def sampleCoverage(value: GLclampf, invert: GLboolean): Unit = js.native
  
  /* standard dom */
  def scissor(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit = js.native
  
  /* standard dom */
  def shaderSource(shader: WebGLShader, source: java.lang.String): Unit = js.native
  
  /* standard dom */
  def stencilFunc(func: GLenum, ref: GLint, mask: GLuint): Unit = js.native
  
  /* standard dom */
  def stencilFuncSeparate(face: GLenum, func: GLenum, ref: GLint, mask: GLuint): Unit = js.native
  
  /* standard dom */
  def stencilMask(mask: GLuint): Unit = js.native
  
  /* standard dom */
  def stencilMaskSeparate(face: GLenum, mask: GLuint): Unit = js.native
  
  /* standard dom */
  def stencilOp(fail: GLenum, zfail: GLenum, zpass: GLenum): Unit = js.native
  
  /* standard dom */
  def stencilOpSeparate(face: GLenum, fail: GLenum, zfail: GLenum, zpass: GLenum): Unit = js.native
  
  /* standard dom */
  def texParameterf(target: GLenum, pname: GLenum, param: GLfloat): Unit = js.native
  
  /* standard dom */
  def texParameteri(target: GLenum, pname: GLenum, param: GLint): Unit = js.native
  
  def uniform1f(location: Null, x: GLfloat): Unit = js.native
  /* standard dom */
  def uniform1f(location: WebGLUniformLocation, x: GLfloat): Unit = js.native
  
  def uniform1i(location: Null, x: GLint): Unit = js.native
  /* standard dom */
  def uniform1i(location: WebGLUniformLocation, x: GLint): Unit = js.native
  
  def uniform2f(location: Null, x: GLfloat, y: GLfloat): Unit = js.native
  /* standard dom */
  def uniform2f(location: WebGLUniformLocation, x: GLfloat, y: GLfloat): Unit = js.native
  
  def uniform2i(location: Null, x: GLint, y: GLint): Unit = js.native
  /* standard dom */
  def uniform2i(location: WebGLUniformLocation, x: GLint, y: GLint): Unit = js.native
  
  def uniform3f(location: Null, x: GLfloat, y: GLfloat, z: GLfloat): Unit = js.native
  /* standard dom */
  def uniform3f(location: WebGLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat): Unit = js.native
  
  def uniform3i(location: Null, x: GLint, y: GLint, z: GLint): Unit = js.native
  /* standard dom */
  def uniform3i(location: WebGLUniformLocation, x: GLint, y: GLint, z: GLint): Unit = js.native
  
  def uniform4f(location: Null, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit = js.native
  /* standard dom */
  def uniform4f(location: WebGLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit = js.native
  
  def uniform4i(location: Null, x: GLint, y: GLint, z: GLint, w: GLint): Unit = js.native
  /* standard dom */
  def uniform4i(location: WebGLUniformLocation, x: GLint, y: GLint, z: GLint, w: GLint): Unit = js.native
  
  /* standard dom */
  def useProgram(): Unit = js.native
  def useProgram(program: WebGLProgram): Unit = js.native
  
  /* standard dom */
  def validateProgram(program: WebGLProgram): Unit = js.native
  
  /* standard dom */
  def vertexAttrib1f(index: GLuint, x: GLfloat): Unit = js.native
  
  /* standard dom */
  /* standard dom.iterable */
  def vertexAttrib1fv(index: GLuint, values: Float32List | js.Iterable[GLfloat]): Unit = js.native
  
  /* standard dom */
  def vertexAttrib2f(index: GLuint, x: GLfloat, y: GLfloat): Unit = js.native
  
  /* standard dom */
  /* standard dom.iterable */
  def vertexAttrib2fv(index: GLuint, values: Float32List | js.Iterable[GLfloat]): Unit = js.native
  
  /* standard dom */
  def vertexAttrib3f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat): Unit = js.native
  
  /* standard dom */
  /* standard dom.iterable */
  def vertexAttrib3fv(index: GLuint, values: Float32List | js.Iterable[GLfloat]): Unit = js.native
  
  /* standard dom */
  def vertexAttrib4f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit = js.native
  
  /* standard dom */
  /* standard dom.iterable */
  def vertexAttrib4fv(index: GLuint, values: Float32List | js.Iterable[GLfloat]): Unit = js.native
  
  /* standard dom */
  def vertexAttribPointer(
    index: GLuint,
    size: GLint,
    `type`: GLenum,
    normalized: GLboolean,
    stride: GLsizei,
    offset: GLintptr
  ): Unit = js.native
  
  /* standard dom */
  def viewport(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit = js.native
}
