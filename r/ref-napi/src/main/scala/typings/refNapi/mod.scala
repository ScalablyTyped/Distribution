package typings.refNapi

import typings.node.bufferMod.global.BufferEncoding
import typings.refNapi.mod.global.Buffer
import typings.refNapi.refNapiInts.`0`
import typings.refNapi.refNapiStrings.BE
import typings.refNapi.refNapiStrings.CString
import typings.refNapi.refNapiStrings.LE
import typings.refNapi.refNapiStrings.Object
import typings.refNapi.refNapiStrings.bool
import typings.refNapi.refNapiStrings.byte
import typings.refNapi.refNapiStrings.char
import typings.refNapi.refNapiStrings.double
import typings.refNapi.refNapiStrings.float
import typings.refNapi.refNapiStrings.int
import typings.refNapi.refNapiStrings.int16
import typings.refNapi.refNapiStrings.int32
import typings.refNapi.refNapiStrings.int64
import typings.refNapi.refNapiStrings.int8
import typings.refNapi.refNapiStrings.long
import typings.refNapi.refNapiStrings.longlong
import typings.refNapi.refNapiStrings.pointer
import typings.refNapi.refNapiStrings.short
import typings.refNapi.refNapiStrings.size_t
import typings.refNapi.refNapiStrings.string
import typings.refNapi.refNapiStrings.uchar
import typings.refNapi.refNapiStrings.uint
import typings.refNapi.refNapiStrings.uint16
import typings.refNapi.refNapiStrings.uint32
import typings.refNapi.refNapiStrings.uint64
import typings.refNapi.refNapiStrings.uint8
import typings.refNapi.refNapiStrings.ulong
import typings.refNapi.refNapiStrings.ulonglong
import typings.refNapi.refNapiStrings.ushort
import typings.refNapi.refNapiStrings.void
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ref-napi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ref-napi", "NULL")
  @js.native
  def NULL: Value[Null] = js.native
  inline def NULL_=(x: Value[Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
  
  @JSImport("ref-napi", "NULL_POINTER")
  @js.native
  def NULL_POINTER: Pointer[Value[Null]] = js.native
  inline def NULL_POINTER_=(x: Pointer[Value[Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL_POINTER")(x.asInstanceOf[js.Any])
  
  inline def _reinterpret(buffer: Buffer, size: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("_reinterpret")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def _reinterpret(buffer: Buffer, size: Double, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("_reinterpret")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def _reinterpretUntilZeros(buffer: Buffer, size: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("_reinterpretUntilZeros")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def _reinterpretUntilZeros(buffer: Buffer, size: Double, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("_reinterpretUntilZeros")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def _writeObject(buffer: Buffer, offset: Double, `object`: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_writeObject")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def _writeObject_0[T](buffer: Value[T], offset: `0`, `object`: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_writeObject")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def _writePointer(buffer: Buffer, offset: Double, pointer: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_writePointer")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def address(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("address")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("ref-napi", "alignof")
  @js.native
  def alignof: AlignofRegistry = js.native
  inline def alignof_=(x: AlignofRegistry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignof")(x.asInstanceOf[js.Any])
  
  inline def alloc(`type`: /* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType</ * template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} * / string>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType</ * template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} * / string> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType</ * template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} * / string> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType</ * template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} * / string>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType</ * template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} * / string>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType</ * template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} * / string> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType</ * template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} * / string> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType</ * template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} * / string>> */ js.Any]
  inline def alloc(
    `type`: /* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String,
    value: UnderlyingType[/* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String]
  ): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType</ * template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} * / string>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType</ * template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} * / string> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType</ * template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} * / string> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType</ * template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} * / string>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType</ * template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} * / string>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType</ * template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} * / string> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType</ * template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} * / string> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType</ * template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} * / string>> */ js.Any]
  inline def alloc[TType /* <: string | pointer */](`type`: TType): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<TType>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<TType> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<TType> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<TType>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<TType>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<TType> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<TType> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<TType>> */ js.Any]
  inline def alloc[TType /* <: string | pointer */](`type`: TType, value: UnderlyingType[TType]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<TType>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<TType> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<TType> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<TType>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<TType>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<TType> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<TType> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<TType>> */ js.Any]
  
  inline def allocCString(): Value[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("allocCString")().asInstanceOf[Value[String | Null]]
  inline def allocCString(string: String): Value[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("allocCString")(string.asInstanceOf[js.Any]).asInstanceOf[Value[String]]
  inline def allocCString(string: String, encoding: BufferEncoding): Value[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("allocCString")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Value[String]]
  inline def allocCString(string: Null, encoding: BufferEncoding): Value[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("allocCString")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Value[String | Null]]
  
  inline def alloc_CString(`type`: CString): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'CString'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'CString'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'CString'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'CString'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'CString'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'CString'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'CString'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'CString'>> */ js.Any]
  inline def alloc_CString(`type`: CString, value: UnderlyingType[CString]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'CString'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'CString'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'CString'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'CString'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'CString'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'CString'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'CString'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'CString'>> */ js.Any]
  
  inline def alloc_Object(`type`: Object): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'Object'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'Object'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'Object'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'Object'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'Object'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'Object'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'Object'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'Object'>> */ js.Any]
  inline def alloc_Object(`type`: Object, value: UnderlyingType[Object]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'Object'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'Object'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'Object'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'Object'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'Object'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'Object'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'Object'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'Object'>> */ js.Any]
  
  inline def alloc_bool(`type`: bool): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'bool'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'bool'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'bool'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'bool'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'bool'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'bool'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'bool'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'bool'>> */ js.Any]
  inline def alloc_bool(`type`: bool, value: UnderlyingType[bool]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'bool'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'bool'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'bool'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'bool'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'bool'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'bool'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'bool'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'bool'>> */ js.Any]
  
  inline def alloc_byte(`type`: byte): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'byte'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'byte'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'byte'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'byte'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'byte'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'byte'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'byte'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'byte'>> */ js.Any]
  inline def alloc_byte(`type`: byte, value: UnderlyingType[byte]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'byte'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'byte'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'byte'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'byte'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'byte'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'byte'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'byte'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'byte'>> */ js.Any]
  
  inline def alloc_char(`type`: char): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'char'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'char'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'char'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'char'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'char'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'char'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'char'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'char'>> */ js.Any]
  inline def alloc_char(`type`: char, value: UnderlyingType[char]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'char'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'char'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'char'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'char'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'char'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'char'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'char'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'char'>> */ js.Any]
  
  inline def alloc_double(`type`: double): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'double'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'double'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'double'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'double'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'double'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'double'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'double'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'double'>> */ js.Any]
  inline def alloc_double(`type`: double, value: UnderlyingType[double]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'double'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'double'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'double'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'double'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'double'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'double'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'double'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'double'>> */ js.Any]
  
  inline def alloc_float(`type`: float): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'float'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'float'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'float'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'float'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'float'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'float'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'float'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'float'>> */ js.Any]
  inline def alloc_float(`type`: float, value: UnderlyingType[float]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'float'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'float'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'float'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'float'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'float'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'float'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'float'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'float'>> */ js.Any]
  
  inline def alloc_int(`type`: int): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int'>> */ js.Any]
  inline def alloc_int(`type`: int, value: UnderlyingType[int]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int'>> */ js.Any]
  
  inline def alloc_int16(`type`: int16): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int16'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int16'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int16'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int16'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int16'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int16'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int16'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int16'>> */ js.Any]
  inline def alloc_int16(`type`: int16, value: UnderlyingType[int16]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int16'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int16'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int16'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int16'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int16'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int16'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int16'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int16'>> */ js.Any]
  
  inline def alloc_int32(`type`: int32): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int32'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int32'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int32'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int32'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int32'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int32'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int32'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int32'>> */ js.Any]
  inline def alloc_int32(`type`: int32, value: UnderlyingType[int32]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int32'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int32'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int32'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int32'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int32'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int32'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int32'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int32'>> */ js.Any]
  
  inline def alloc_int64(`type`: int64): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int64'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int64'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int64'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int64'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int64'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int64'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int64'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int64'>> */ js.Any]
  inline def alloc_int64(`type`: int64, value: UnderlyingType[int64]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int64'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int64'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int64'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int64'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int64'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int64'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int64'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int64'>> */ js.Any]
  
  inline def alloc_int8(`type`: int8): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int8'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int8'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int8'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int8'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int8'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int8'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int8'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int8'>> */ js.Any]
  inline def alloc_int8(`type`: int8, value: UnderlyingType[int8]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int8'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int8'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int8'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int8'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'int8'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'int8'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'int8'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'int8'>> */ js.Any]
  
  inline def alloc_long(`type`: long): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'long'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'long'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'long'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'long'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'long'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'long'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'long'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'long'>> */ js.Any]
  inline def alloc_long(`type`: long, value: UnderlyingType[long]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'long'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'long'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'long'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'long'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'long'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'long'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'long'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'long'>> */ js.Any]
  
  inline def alloc_longlong(`type`: longlong): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'longlong'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'longlong'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'longlong'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'longlong'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'longlong'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'longlong'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'longlong'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'longlong'>> */ js.Any]
  inline def alloc_longlong(`type`: longlong, value: UnderlyingType[longlong]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'longlong'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'longlong'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'longlong'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'longlong'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'longlong'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'longlong'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'longlong'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'longlong'>> */ js.Any]
  
  inline def alloc_short(`type`: short): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'short'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'short'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'short'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'short'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'short'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'short'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'short'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'short'>> */ js.Any]
  inline def alloc_short(`type`: short, value: UnderlyingType[short]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'short'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'short'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'short'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'short'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'short'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'short'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'short'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'short'>> */ js.Any]
  
  inline def alloc_sizet(`type`: size_t): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'size_t'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'size_t'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'size_t'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'size_t'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'size_t'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'size_t'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'size_t'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'size_t'>> */ js.Any]
  inline def alloc_sizet(`type`: size_t, value: UnderlyingType[size_t]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'size_t'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'size_t'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'size_t'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'size_t'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'size_t'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'size_t'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'size_t'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'size_t'>> */ js.Any]
  
  inline def alloc_uchar(`type`: uchar): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uchar'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uchar'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uchar'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uchar'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uchar'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uchar'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uchar'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uchar'>> */ js.Any]
  inline def alloc_uchar(`type`: uchar, value: UnderlyingType[uchar]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uchar'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uchar'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uchar'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uchar'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uchar'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uchar'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uchar'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uchar'>> */ js.Any]
  
  inline def alloc_uint(`type`: uint): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint'>> */ js.Any]
  inline def alloc_uint(`type`: uint, value: UnderlyingType[uint]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint'>> */ js.Any]
  
  inline def alloc_uint16(`type`: uint16): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint16'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint16'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint16'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint16'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint16'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint16'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint16'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint16'>> */ js.Any]
  inline def alloc_uint16(`type`: uint16, value: UnderlyingType[uint16]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint16'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint16'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint16'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint16'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint16'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint16'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint16'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint16'>> */ js.Any]
  
  inline def alloc_uint32(`type`: uint32): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint32'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint32'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint32'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint32'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint32'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint32'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint32'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint32'>> */ js.Any]
  inline def alloc_uint32(`type`: uint32, value: UnderlyingType[uint32]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint32'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint32'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint32'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint32'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint32'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint32'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint32'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint32'>> */ js.Any]
  
  inline def alloc_uint64(`type`: uint64): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint64'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint64'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint64'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint64'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint64'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint64'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint64'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint64'>> */ js.Any]
  inline def alloc_uint64(`type`: uint64, value: UnderlyingType[uint64]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint64'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint64'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint64'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint64'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint64'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint64'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint64'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint64'>> */ js.Any]
  
  inline def alloc_uint8(`type`: uint8): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint8'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint8'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint8'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint8'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint8'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint8'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint8'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint8'>> */ js.Any]
  inline def alloc_uint8(`type`: uint8, value: UnderlyingType[uint8]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint8'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint8'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint8'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint8'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'uint8'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'uint8'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'uint8'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'uint8'>> */ js.Any]
  
  inline def alloc_ulong(`type`: ulong): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'ulong'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'ulong'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'ulong'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'ulong'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'ulong'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'ulong'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'ulong'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'ulong'>> */ js.Any]
  inline def alloc_ulong(`type`: ulong, value: UnderlyingType[ulong]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'ulong'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'ulong'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'ulong'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'ulong'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'ulong'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'ulong'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'ulong'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'ulong'>> */ js.Any]
  
  inline def alloc_ulonglong(`type`: ulonglong): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'ulonglong'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'ulonglong'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'ulonglong'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'ulonglong'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'ulonglong'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'ulonglong'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'ulonglong'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'ulonglong'>> */ js.Any]
  inline def alloc_ulonglong(`type`: ulonglong, value: UnderlyingType[ulonglong]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'ulonglong'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'ulonglong'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'ulonglong'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'ulonglong'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'ulonglong'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'ulonglong'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'ulonglong'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'ulonglong'>> */ js.Any]
  
  inline def alloc_ushort(`type`: ushort): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'ushort'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'ushort'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'ushort'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'ushort'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'ushort'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'ushort'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'ushort'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'ushort'>> */ js.Any]
  inline def alloc_ushort(`type`: ushort, value: UnderlyingType[ushort]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'ushort'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'ushort'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'ushort'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'ushort'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'ushort'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'ushort'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'ushort'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'ushort'>> */ js.Any]
  
  inline def alloc_void(`type`: void): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'void'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'void'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'void'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'void'>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'void'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'void'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'void'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'void'>> */ js.Any]
  inline def alloc_void(`type`: void, value: UnderlyingType[void]): /* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'void'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'void'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'void'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'void'>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ref-napi.ref-napi.UnderlyingType<'void'>] extends [never] | [0] ? ref-napi.ref-napi.Value<any> : ref-napi.ref-napi.UnderlyingType<'void'> extends ref-napi.ref-napi.<global>.Buffer ? ref-napi.ref-napi.UnderlyingType<'void'> : ref-napi.ref-napi.Value<ref-napi.ref-napi.UnderlyingType<'void'>> */ js.Any]
  
  inline def attach(buffer: Buffer, `object`: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_attach")(buffer.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def coerceType(`type`: /* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String): Type[
    UnderlyingType[/* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[
    UnderlyingType[/* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String]
  ]]
  inline def coerceType[T /* <: string | pointer */](`type`: T): Type[UnderlyingType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[T]]]
  
  inline def coerceType_CString(`type`: CString): Type[UnderlyingType[CString]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[CString]]]
  
  inline def coerceType_Object(`type`: Object): Type[UnderlyingType[Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[Object]]]
  
  inline def coerceType_bool(`type`: bool): Type[UnderlyingType[bool]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[bool]]]
  
  inline def coerceType_byte(`type`: byte): Type[UnderlyingType[byte]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[byte]]]
  
  inline def coerceType_char(`type`: char): Type[UnderlyingType[char]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[char]]]
  
  inline def coerceType_double(`type`: double): Type[UnderlyingType[double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[double]]]
  
  inline def coerceType_float(`type`: float): Type[UnderlyingType[float]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[float]]]
  
  inline def coerceType_int(`type`: int): Type[UnderlyingType[int]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[int]]]
  
  inline def coerceType_int16(`type`: int16): Type[UnderlyingType[int16]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[int16]]]
  
  inline def coerceType_int32(`type`: int32): Type[UnderlyingType[int32]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[int32]]]
  
  inline def coerceType_int64(`type`: int64): Type[UnderlyingType[int64]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[int64]]]
  
  inline def coerceType_int8(`type`: int8): Type[UnderlyingType[int8]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[int8]]]
  
  inline def coerceType_long(`type`: long): Type[UnderlyingType[long]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[long]]]
  
  inline def coerceType_longlong(`type`: longlong): Type[UnderlyingType[longlong]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[longlong]]]
  
  inline def coerceType_short(`type`: short): Type[UnderlyingType[short]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[short]]]
  
  inline def coerceType_sizet(`type`: size_t): Type[UnderlyingType[size_t]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[size_t]]]
  
  inline def coerceType_uchar(`type`: uchar): Type[UnderlyingType[uchar]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[uchar]]]
  
  inline def coerceType_uint(`type`: uint): Type[UnderlyingType[uint]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[uint]]]
  
  inline def coerceType_uint16(`type`: uint16): Type[UnderlyingType[uint16]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[uint16]]]
  
  inline def coerceType_uint32(`type`: uint32): Type[UnderlyingType[uint32]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[uint32]]]
  
  inline def coerceType_uint64(`type`: uint64): Type[UnderlyingType[uint64]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[uint64]]]
  
  inline def coerceType_uint8(`type`: uint8): Type[UnderlyingType[uint8]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[uint8]]]
  
  inline def coerceType_ulong(`type`: ulong): Type[UnderlyingType[ulong]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[ulong]]]
  
  inline def coerceType_ulonglong(`type`: ulonglong): Type[UnderlyingType[ulonglong]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[ulonglong]]]
  
  inline def coerceType_ushort(`type`: ushort): Type[UnderlyingType[ushort]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[ushort]]]
  
  inline def coerceType_void(`type`: void): Type[UnderlyingType[void]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[UnderlyingType[void]]]
  
  inline def deref(buffer: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deref")(buffer.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def deref[T](buffer: Pointer[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deref")(buffer.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def derefType(`type`: /* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String): DerefType_[/* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[/* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String]]
  inline def derefType(`type`: TypeLike): Type[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Any]]
  
  inline def derefType_CString(`type`: CString): DerefType_[CString] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[CString]]
  
  inline def derefType_Object(`type`: Object): DerefType_[Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[Object]]
  
  inline def derefType_T_DerefType_[T /* <: string | pointer */](`type`: T): DerefType_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[T]]
  
  inline def derefType_bool(`type`: bool): DerefType_[bool] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[bool]]
  
  inline def derefType_byte(`type`: byte): DerefType_[byte] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[byte]]
  
  inline def derefType_char(`type`: char): DerefType_[char] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[char]]
  
  inline def derefType_double(`type`: double): DerefType_[double] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[double]]
  
  inline def derefType_float(`type`: float): DerefType_[float] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[float]]
  
  inline def derefType_int(`type`: int): DerefType_[int] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[int]]
  
  inline def derefType_int16(`type`: int16): DerefType_[int16] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[int16]]
  
  inline def derefType_int32(`type`: int32): DerefType_[int32] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[int32]]
  
  inline def derefType_int64(`type`: int64): DerefType_[int64] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[int64]]
  
  inline def derefType_int8(`type`: int8): DerefType_[int8] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[int8]]
  
  inline def derefType_long(`type`: long): DerefType_[long] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[long]]
  
  inline def derefType_longlong(`type`: longlong): DerefType_[longlong] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[longlong]]
  
  inline def derefType_short(`type`: short): DerefType_[short] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[short]]
  
  inline def derefType_sizet(`type`: size_t): DerefType_[size_t] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[size_t]]
  
  inline def derefType_uchar(`type`: uchar): DerefType_[uchar] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[uchar]]
  
  inline def derefType_uint(`type`: uint): DerefType_[uint] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[uint]]
  
  inline def derefType_uint16(`type`: uint16): DerefType_[uint16] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[uint16]]
  
  inline def derefType_uint32(`type`: uint32): DerefType_[uint32] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[uint32]]
  
  inline def derefType_uint64(`type`: uint64): DerefType_[uint64] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[uint64]]
  
  inline def derefType_uint8(`type`: uint8): DerefType_[uint8] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[uint8]]
  
  inline def derefType_ulong(`type`: ulong): DerefType_[ulong] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[ulong]]
  
  inline def derefType_ulonglong(`type`: ulonglong): DerefType_[ulonglong] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[ulonglong]]
  
  inline def derefType_ushort(`type`: ushort): DerefType_[ushort] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[ushort]]
  
  inline def derefType_void(`type`: void): DerefType_[void] = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DerefType_[void]]
  
  @JSImport("ref-napi", "endianness")
  @js.native
  def endianness: LE | BE = js.native
  inline def endianness_=(x: LE | BE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endianness")(x.asInstanceOf[js.Any])
  
  inline def get(buffer: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def get(buffer: Buffer, offset: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def get(
    buffer: Buffer,
    offset: Double,
    `type`: /* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String
  ): UnderlyingType[/* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[/* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String]]
  inline def get(buffer: Buffer, offset: Double, `type`: TypeLike): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def get(
    buffer: Buffer,
    offset: Unit,
    `type`: /* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String
  ): UnderlyingType[/* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[/* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String]]
  inline def get(buffer: Buffer, offset: Unit, `type`: TypeLike): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def get[T](buffer: Pointer[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def get[T](buffer: Value[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def getType(buffer: Buffer): Type[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(buffer.asInstanceOf[js.Any]).asInstanceOf[Type[Any]]
  inline def getType[T](buffer: Pointer[T]): Type[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(buffer.asInstanceOf[js.Any]).asInstanceOf[Type[T]]
  
  inline def get_0[T](buffer: Pointer[T], offset: `0`): T = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def get_0[T](buffer: Value[T], offset: `0`): T = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def get_CString(buffer: Buffer, offset: Double, `type`: CString): UnderlyingType[CString] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[CString]]
  inline def get_CString(buffer: Buffer, offset: Unit, `type`: CString): UnderlyingType[CString] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[CString]]
  
  inline def get_Object(buffer: Buffer, offset: Double, `type`: Object): UnderlyingType[Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[Object]]
  inline def get_Object(buffer: Buffer, offset: Unit, `type`: Object): UnderlyingType[Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[Object]]
  
  inline def get_T_UnderlyingType[T /* <: string | pointer */](buffer: Buffer, offset: Double, `type`: T): UnderlyingType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[T]]
  inline def get_T_UnderlyingType[T /* <: string | pointer */](buffer: Buffer, offset: Unit, `type`: T): UnderlyingType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[T]]
  
  inline def get_bool(buffer: Buffer, offset: Double, `type`: bool): UnderlyingType[bool] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[bool]]
  inline def get_bool(buffer: Buffer, offset: Unit, `type`: bool): UnderlyingType[bool] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[bool]]
  
  inline def get_byte(buffer: Buffer, offset: Double, `type`: byte): UnderlyingType[byte] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[byte]]
  inline def get_byte(buffer: Buffer, offset: Unit, `type`: byte): UnderlyingType[byte] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[byte]]
  
  inline def get_char(buffer: Buffer, offset: Double, `type`: char): UnderlyingType[char] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[char]]
  inline def get_char(buffer: Buffer, offset: Unit, `type`: char): UnderlyingType[char] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[char]]
  
  inline def get_double(buffer: Buffer, offset: Double, `type`: double): UnderlyingType[double] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[double]]
  inline def get_double(buffer: Buffer, offset: Unit, `type`: double): UnderlyingType[double] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[double]]
  
  inline def get_float(buffer: Buffer, offset: Double, `type`: float): UnderlyingType[float] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[float]]
  inline def get_float(buffer: Buffer, offset: Unit, `type`: float): UnderlyingType[float] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[float]]
  
  inline def get_int(buffer: Buffer, offset: Double, `type`: int): UnderlyingType[int] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[int]]
  inline def get_int(buffer: Buffer, offset: Unit, `type`: int): UnderlyingType[int] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[int]]
  
  inline def get_int16(buffer: Buffer, offset: Double, `type`: int16): UnderlyingType[int16] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[int16]]
  inline def get_int16(buffer: Buffer, offset: Unit, `type`: int16): UnderlyingType[int16] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[int16]]
  
  inline def get_int32(buffer: Buffer, offset: Double, `type`: int32): UnderlyingType[int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[int32]]
  inline def get_int32(buffer: Buffer, offset: Unit, `type`: int32): UnderlyingType[int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[int32]]
  
  inline def get_int64(buffer: Buffer, offset: Double, `type`: int64): UnderlyingType[int64] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[int64]]
  inline def get_int64(buffer: Buffer, offset: Unit, `type`: int64): UnderlyingType[int64] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[int64]]
  
  inline def get_int8(buffer: Buffer, offset: Double, `type`: int8): UnderlyingType[int8] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[int8]]
  inline def get_int8(buffer: Buffer, offset: Unit, `type`: int8): UnderlyingType[int8] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[int8]]
  
  inline def get_long(buffer: Buffer, offset: Double, `type`: long): UnderlyingType[long] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[long]]
  inline def get_long(buffer: Buffer, offset: Unit, `type`: long): UnderlyingType[long] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[long]]
  
  inline def get_longlong(buffer: Buffer, offset: Double, `type`: longlong): UnderlyingType[longlong] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[longlong]]
  inline def get_longlong(buffer: Buffer, offset: Unit, `type`: longlong): UnderlyingType[longlong] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[longlong]]
  
  inline def get_short(buffer: Buffer, offset: Double, `type`: short): UnderlyingType[short] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[short]]
  inline def get_short(buffer: Buffer, offset: Unit, `type`: short): UnderlyingType[short] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[short]]
  
  inline def get_sizet(buffer: Buffer, offset: Double, `type`: size_t): UnderlyingType[size_t] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[size_t]]
  inline def get_sizet(buffer: Buffer, offset: Unit, `type`: size_t): UnderlyingType[size_t] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[size_t]]
  
  inline def get_uchar(buffer: Buffer, offset: Double, `type`: uchar): UnderlyingType[uchar] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[uchar]]
  inline def get_uchar(buffer: Buffer, offset: Unit, `type`: uchar): UnderlyingType[uchar] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[uchar]]
  
  inline def get_uint(buffer: Buffer, offset: Double, `type`: uint): UnderlyingType[uint] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[uint]]
  inline def get_uint(buffer: Buffer, offset: Unit, `type`: uint): UnderlyingType[uint] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[uint]]
  
  inline def get_uint16(buffer: Buffer, offset: Double, `type`: uint16): UnderlyingType[uint16] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[uint16]]
  inline def get_uint16(buffer: Buffer, offset: Unit, `type`: uint16): UnderlyingType[uint16] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[uint16]]
  
  inline def get_uint32(buffer: Buffer, offset: Double, `type`: uint32): UnderlyingType[uint32] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[uint32]]
  inline def get_uint32(buffer: Buffer, offset: Unit, `type`: uint32): UnderlyingType[uint32] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[uint32]]
  
  inline def get_uint64(buffer: Buffer, offset: Double, `type`: uint64): UnderlyingType[uint64] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[uint64]]
  inline def get_uint64(buffer: Buffer, offset: Unit, `type`: uint64): UnderlyingType[uint64] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[uint64]]
  
  inline def get_uint8(buffer: Buffer, offset: Double, `type`: uint8): UnderlyingType[uint8] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[uint8]]
  inline def get_uint8(buffer: Buffer, offset: Unit, `type`: uint8): UnderlyingType[uint8] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[uint8]]
  
  inline def get_ulong(buffer: Buffer, offset: Double, `type`: ulong): UnderlyingType[ulong] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[ulong]]
  inline def get_ulong(buffer: Buffer, offset: Unit, `type`: ulong): UnderlyingType[ulong] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[ulong]]
  
  inline def get_ulonglong(buffer: Buffer, offset: Double, `type`: ulonglong): UnderlyingType[ulonglong] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[ulonglong]]
  inline def get_ulonglong(buffer: Buffer, offset: Unit, `type`: ulonglong): UnderlyingType[ulonglong] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[ulonglong]]
  
  inline def get_ushort(buffer: Buffer, offset: Double, `type`: ushort): UnderlyingType[ushort] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[ushort]]
  inline def get_ushort(buffer: Buffer, offset: Unit, `type`: ushort): UnderlyingType[ushort] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[ushort]]
  
  inline def get_void(buffer: Buffer, offset: Double, `type`: void): UnderlyingType[void] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[void]]
  inline def get_void(buffer: Buffer, offset: Unit, `type`: void): UnderlyingType[void] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnderlyingType[void]]
  
  inline def hexAddress(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexAddress")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isNull(buffer: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(buffer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def readCString(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readCString")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def readCString(buffer: Buffer, offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readCString")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def readInt64BE(buffer: Buffer): Double | String = ^.asInstanceOf[js.Dynamic].applyDynamic("readInt64BE")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double | String]
  inline def readInt64BE(buffer: Buffer, offset: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("readInt64BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  
  inline def readInt64LE(buffer: Buffer): Double | String = ^.asInstanceOf[js.Dynamic].applyDynamic("readInt64LE")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double | String]
  inline def readInt64LE(buffer: Buffer, offset: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("readInt64LE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  
  inline def readObject(buffer: Buffer): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("readObject")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def readObject(buffer: Buffer, offset: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("readObject")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def readObject[T](buffer: Pointer[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("readObject")(buffer.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def readObject_0[T](buffer: Pointer[T], offset: `0`): T = (^.asInstanceOf[js.Dynamic].applyDynamic("readObject")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def readPointer(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readPointer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def readPointer(buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readPointer")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def readPointer(buffer: Buffer, offset: Double, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readPointer")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def readPointer(buffer: Buffer, offset: Unit, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readPointer")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def readUInt64BE(buffer: Buffer): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUInt64BE")(buffer.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  inline def readUInt64BE(buffer: Buffer, offset: Double): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt64BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  inline def readUInt64LE(buffer: Buffer): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUInt64LE")(buffer.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  inline def readUInt64LE(buffer: Buffer, offset: Double): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt64LE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  inline def ref(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def ref[T](buffer: Pointer[T]): Pointer[Pointer[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(buffer.asInstanceOf[js.Any]).asInstanceOf[Pointer[Pointer[T]]]
  inline def ref[T](buffer: Value[T]): Pointer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(buffer.asInstanceOf[js.Any]).asInstanceOf[Pointer[T]]
  
  inline def refType(`type`: /* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String): Type[
    Pointer[
      UnderlyingType[/* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[
    Pointer[
      UnderlyingType[/* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String]
    ]
  ]]
  inline def refType(`type`: TypeLike): Type[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Any]]
  
  inline def refType_CString(`type`: CString): Type[Pointer[UnderlyingType[CString]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[CString]]]]
  
  inline def refType_Object(`type`: Object): Type[Pointer[UnderlyingType[Object]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[Object]]]]
  
  inline def refType_T[T /* <: Type[Any] | string | pointer */](`type`: T): Type[Pointer[UnderlyingType[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[T]]]]
  
  inline def refType_bool(`type`: bool): Type[Pointer[UnderlyingType[bool]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[bool]]]]
  
  inline def refType_byte(`type`: byte): Type[Pointer[UnderlyingType[byte]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[byte]]]]
  
  inline def refType_char(`type`: char): Type[Pointer[UnderlyingType[char]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[char]]]]
  
  inline def refType_double(`type`: double): Type[Pointer[UnderlyingType[double]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[double]]]]
  
  inline def refType_float(`type`: float): Type[Pointer[UnderlyingType[float]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[float]]]]
  
  inline def refType_int(`type`: int): Type[Pointer[UnderlyingType[int]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[int]]]]
  
  inline def refType_int16(`type`: int16): Type[Pointer[UnderlyingType[int16]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[int16]]]]
  
  inline def refType_int32(`type`: int32): Type[Pointer[UnderlyingType[int32]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[int32]]]]
  
  inline def refType_int64(`type`: int64): Type[Pointer[UnderlyingType[int64]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[int64]]]]
  
  inline def refType_int8(`type`: int8): Type[Pointer[UnderlyingType[int8]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[int8]]]]
  
  inline def refType_long(`type`: long): Type[Pointer[UnderlyingType[long]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[long]]]]
  
  inline def refType_longlong(`type`: longlong): Type[Pointer[UnderlyingType[longlong]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[longlong]]]]
  
  inline def refType_short(`type`: short): Type[Pointer[UnderlyingType[short]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[short]]]]
  
  inline def refType_sizet(`type`: size_t): Type[Pointer[UnderlyingType[size_t]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[size_t]]]]
  
  inline def refType_uchar(`type`: uchar): Type[Pointer[UnderlyingType[uchar]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[uchar]]]]
  
  inline def refType_uint(`type`: uint): Type[Pointer[UnderlyingType[uint]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[uint]]]]
  
  inline def refType_uint16(`type`: uint16): Type[Pointer[UnderlyingType[uint16]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[uint16]]]]
  
  inline def refType_uint32(`type`: uint32): Type[Pointer[UnderlyingType[uint32]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[uint32]]]]
  
  inline def refType_uint64(`type`: uint64): Type[Pointer[UnderlyingType[uint64]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[uint64]]]]
  
  inline def refType_uint8(`type`: uint8): Type[Pointer[UnderlyingType[uint8]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[uint8]]]]
  
  inline def refType_ulong(`type`: ulong): Type[Pointer[UnderlyingType[ulong]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[ulong]]]]
  
  inline def refType_ulonglong(`type`: ulonglong): Type[Pointer[UnderlyingType[ulonglong]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[ulonglong]]]]
  
  inline def refType_ushort(`type`: ushort): Type[Pointer[UnderlyingType[ushort]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[ushort]]]]
  
  inline def refType_void(`type`: void): Type[Pointer[UnderlyingType[void]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type[Pointer[UnderlyingType[void]]]]
  
  inline def reinterpret(buffer: Buffer, size: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("reinterpret")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def reinterpret(buffer: Buffer, size: Double, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("reinterpret")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def reinterpretUntilZeros(buffer: Buffer, size: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("reinterpretUntilZeros")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def reinterpretUntilZeros(buffer: Buffer, size: Double, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("reinterpretUntilZeros")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def set(buffer: Buffer, offset: Double, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set(buffer: Buffer, offset: Double, value: Any, `type`: TypeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set(
    buffer: Buffer,
    offset: Double,
    value: UnderlyingType[/* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String],
    `type`: /* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set[T /* <: string | pointer */](buffer: Buffer, offset: Double, value: UnderlyingType[T], `type`: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_0[T](buffer: Pointer[T], offset: `0`, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set_0[T](buffer: Value[T], offset: `0`, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_CString(buffer: Buffer, offset: Double, value: UnderlyingType[CString], `type`: CString): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_Object(buffer: Buffer, offset: Double, value: UnderlyingType[Object], `type`: Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_bool(buffer: Buffer, offset: Double, value: UnderlyingType[bool], `type`: bool): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_byte(buffer: Buffer, offset: Double, value: UnderlyingType[byte], `type`: byte): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_char(buffer: Buffer, offset: Double, value: UnderlyingType[char], `type`: char): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_double(buffer: Buffer, offset: Double, value: UnderlyingType[double], `type`: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_float(buffer: Buffer, offset: Double, value: UnderlyingType[float], `type`: float): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_int(buffer: Buffer, offset: Double, value: UnderlyingType[int], `type`: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_int16(buffer: Buffer, offset: Double, value: UnderlyingType[int16], `type`: int16): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_int32(buffer: Buffer, offset: Double, value: UnderlyingType[int32], `type`: int32): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_int64(buffer: Buffer, offset: Double, value: UnderlyingType[int64], `type`: int64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_int8(buffer: Buffer, offset: Double, value: UnderlyingType[int8], `type`: int8): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_long(buffer: Buffer, offset: Double, value: UnderlyingType[long], `type`: long): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_longlong(buffer: Buffer, offset: Double, value: UnderlyingType[longlong], `type`: longlong): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_short(buffer: Buffer, offset: Double, value: UnderlyingType[short], `type`: short): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_sizet(buffer: Buffer, offset: Double, value: UnderlyingType[size_t], `type`: size_t): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_uchar(buffer: Buffer, offset: Double, value: UnderlyingType[uchar], `type`: uchar): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_uint(buffer: Buffer, offset: Double, value: UnderlyingType[uint], `type`: uint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_uint16(buffer: Buffer, offset: Double, value: UnderlyingType[uint16], `type`: uint16): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_uint32(buffer: Buffer, offset: Double, value: UnderlyingType[uint32], `type`: uint32): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_uint64(buffer: Buffer, offset: Double, value: UnderlyingType[uint64], `type`: uint64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_uint8(buffer: Buffer, offset: Double, value: UnderlyingType[uint8], `type`: uint8): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_ulong(buffer: Buffer, offset: Double, value: UnderlyingType[ulong], `type`: ulong): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_ulonglong(buffer: Buffer, offset: Double, value: UnderlyingType[ulonglong], `type`: ulonglong): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_ushort(buffer: Buffer, offset: Double, value: UnderlyingType[ushort], `type`: ushort): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_void(buffer: Buffer, offset: Double, value: UnderlyingType[void], `type`: void): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("ref-napi", "sizeof")
  @js.native
  def sizeof: SizeofRegistry = js.native
  inline def sizeof_=(x: SizeofRegistry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sizeof")(x.asInstanceOf[js.Any])
  
  @JSImport("ref-napi", "types")
  @js.native
  def types: TypesRegistry = js.native
  inline def types_=(x: TypesRegistry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
  
  inline def writeCString(buffer: Buffer, offset: Double, string: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCString")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeCString(buffer: Buffer, offset: Double, string: String, encoding: BufferEncoding): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCString")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeInt64BE(buffer: Buffer, offset: Double, input: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeInt64BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeInt64BE(buffer: Buffer, offset: Double, input: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeInt64BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeInt64LE(buffer: Buffer, offset: Double, input: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeInt64LE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeInt64LE(buffer: Buffer, offset: Double, input: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeInt64LE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeObject(buffer: Buffer, offset: Double, `object`: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeObject")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeObject_0[T](buffer: Value[T], offset: `0`, `object`: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeObject")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writePointer(buffer: Buffer, offset: Double, pointer: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writePointer")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUInt64BE(buffer: Buffer, offset: Double, input: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt64BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeUInt64BE(buffer: Buffer, offset: Double, input: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt64BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUInt64LE(buffer: Buffer, offset: Double, input: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt64LE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeUInt64LE(buffer: Buffer, offset: Double, input: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt64LE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait AlignofRegistry extends StObject {
    
    var Object: Double
    
    var bool: Double
    
    var byte: Double
    
    var char: Double
    
    var double: Double
    
    var float: Double
    
    var int: Double
    
    var int16: Double
    
    var int32: Double
    
    var int64: Double
    
    var int8: Double
    
    var long: Double
    
    var longlong: Double
    
    var pointer: Double
    
    var short: Double
    
    var size_t: Double
    
    var uchar: Double
    
    var uint: Double
    
    var uint16: Double
    
    var uint32: Double
    
    var uint64: Double
    
    var uint8: Double
    
    var ulong: Double
    
    var ulonglong: Double
    
    var ushort: Double
  }
  object AlignofRegistry {
    
    inline def apply(
      Object: Double,
      bool: Double,
      byte: Double,
      char: Double,
      double: Double,
      float: Double,
      int: Double,
      int16: Double,
      int32: Double,
      int64: Double,
      int8: Double,
      long: Double,
      longlong: Double,
      pointer: Double,
      short: Double,
      size_t: Double,
      uchar: Double,
      uint: Double,
      uint16: Double,
      uint32: Double,
      uint64: Double,
      uint8: Double,
      ulong: Double,
      ulonglong: Double,
      ushort: Double
    ): AlignofRegistry = {
      val __obj = js.Dynamic.literal(Object = Object.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], byte = byte.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], int16 = int16.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], int64 = int64.asInstanceOf[js.Any], int8 = int8.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], longlong = longlong.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], size_t = size_t.asInstanceOf[js.Any], uchar = uchar.asInstanceOf[js.Any], uint = uint.asInstanceOf[js.Any], uint16 = uint16.asInstanceOf[js.Any], uint32 = uint32.asInstanceOf[js.Any], uint64 = uint64.asInstanceOf[js.Any], uint8 = uint8.asInstanceOf[js.Any], ulong = ulong.asInstanceOf[js.Any], ulonglong = ulonglong.asInstanceOf[js.Any], ushort = ushort.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlignofRegistry]
    }
    
    extension [Self <: AlignofRegistry](x: Self) {
      
      inline def setBool(value: Double): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setByte(value: Double): Self = StObject.set(x, "byte", value.asInstanceOf[js.Any])
      
      inline def setChar(value: Double): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def setDouble(value: Double): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
      
      inline def setFloat(value: Double): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setInt(value: Double): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
      
      inline def setInt16(value: Double): Self = StObject.set(x, "int16", value.asInstanceOf[js.Any])
      
      inline def setInt32(value: Double): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
      
      inline def setInt64(value: Double): Self = StObject.set(x, "int64", value.asInstanceOf[js.Any])
      
      inline def setInt8(value: Double): Self = StObject.set(x, "int8", value.asInstanceOf[js.Any])
      
      inline def setLong(value: Double): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setLonglong(value: Double): Self = StObject.set(x, "longlong", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Double): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      inline def setPointer(value: Double): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setShort(value: Double): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setSize_t(value: Double): Self = StObject.set(x, "size_t", value.asInstanceOf[js.Any])
      
      inline def setUchar(value: Double): Self = StObject.set(x, "uchar", value.asInstanceOf[js.Any])
      
      inline def setUint(value: Double): Self = StObject.set(x, "uint", value.asInstanceOf[js.Any])
      
      inline def setUint16(value: Double): Self = StObject.set(x, "uint16", value.asInstanceOf[js.Any])
      
      inline def setUint32(value: Double): Self = StObject.set(x, "uint32", value.asInstanceOf[js.Any])
      
      inline def setUint64(value: Double): Self = StObject.set(x, "uint64", value.asInstanceOf[js.Any])
      
      inline def setUint8(value: Double): Self = StObject.set(x, "uint8", value.asInstanceOf[js.Any])
      
      inline def setUlong(value: Double): Self = StObject.set(x, "ulong", value.asInstanceOf[js.Any])
      
      inline def setUlonglong(value: Double): Self = StObject.set(x, "ulonglong", value.asInstanceOf[js.Any])
      
      inline def setUshort(value: Double): Self = StObject.set(x, "ushort", value.asInstanceOf[js.Any])
    }
  }
  
  type CoerceType_[T /* <: TypeLike */] = Type[UnderlyingType[T]]
  
  /* Inlined std.Extract<{[ P in keyof T ]: P extends / * template literal string: ${number} * / string? ref-napi.ref-napi.CoerceType<std.Extract<T[P], ref-napi.ref-napi.TypeLike>> : T[P]}, std.Array<any>> */
  type CoerceTypes[T /* <: js.Array[TypeLike] */] = scala.Nothing
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ref-napi.ref-napi.UnderlyingType<T> extends ref-napi.ref-napi.Pointer<infer U> ? ref-napi.ref-napi.Type<U> : never
    }}}
    */
  @js.native
  trait DerefType_[T /* <: TypeLike */] extends StObject
  
  /* Inlined std.Extract<{[ P in keyof T ]: P extends / * template literal string: ${number} * / string? ref-napi.ref-napi.DerefType<std.Extract<T[P], ref-napi.ref-napi.TypeLike>> : T[P]}, std.Array<any>> */
  type DerefTypes[T /* <: js.Array[TypeLike] */] = scala.Nothing
  
  /* Rewritten from type alias, can be one of: 
    - typings.refNapi.refNapiStrings.string
    - typings.refNapi.refNapiStrings.pointer
    - typings.refNapi.refNapiStrings.void
    - typings.refNapi.refNapiStrings.int64
    - typings.refNapi.refNapiStrings.ushort
    - typings.refNapi.refNapiStrings.int
    - typings.refNapi.refNapiStrings.uint64
    - typings.refNapi.refNapiStrings.float
    - typings.refNapi.refNapiStrings.uint
    - typings.refNapi.refNapiStrings.long
    - typings.refNapi.refNapiStrings.double
    - typings.refNapi.refNapiStrings.int8
    - typings.refNapi.refNapiStrings.ulong
    - typings.refNapi.refNapiStrings.Object
    - typings.refNapi.refNapiStrings.uint8
    - typings.refNapi.refNapiStrings.longlong
    - typings.refNapi.refNapiStrings.CString
    - typings.refNapi.refNapiStrings.int16
    - typings.refNapi.refNapiStrings.ulonglong
    - typings.refNapi.refNapiStrings.bool
    - typings.refNapi.refNapiStrings.uint16
    - typings.refNapi.refNapiStrings.char
    - typings.refNapi.refNapiStrings.byte
    - typings.refNapi.refNapiStrings.int32
    - typings.refNapi.refNapiStrings.uchar
    - typings.refNapi.refNapiStrings.size_t
    - typings.refNapi.refNapiStrings.uint32
    - typings.refNapi.refNapiStrings.short
    - / * template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} * / java.lang.String
  */
  type NamedType = _NamedType | (/* template literal string: ${keyofTypesDefaultRegistry}${*| *|**| **} */ String)
  
  type NamedTypeLike = Type[Any] | NamedType
  
  @js.native
  trait Pointer[T]
    extends StObject
       with Buffer {
    
    @JSName("type")
    var type_Pointer: Type[T] = js.native
  }
  
  trait SizeofRegistry extends StObject {
    
    var Object: Double
    
    var bool: Double
    
    var byte: Double
    
    var char: Double
    
    var double: Double
    
    var float: Double
    
    var int: Double
    
    var int16: Double
    
    var int32: Double
    
    var int64: Double
    
    var int8: Double
    
    var long: Double
    
    var longlong: Double
    
    var pointer: Double
    
    var short: Double
    
    var size_t: Double
    
    var uchar: Double
    
    var uint: Double
    
    var uint16: Double
    
    var uint32: Double
    
    var uint64: Double
    
    var uint8: Double
    
    var ulong: Double
    
    var ulonglong: Double
    
    var ushort: Double
  }
  object SizeofRegistry {
    
    inline def apply(
      Object: Double,
      bool: Double,
      byte: Double,
      char: Double,
      double: Double,
      float: Double,
      int: Double,
      int16: Double,
      int32: Double,
      int64: Double,
      int8: Double,
      long: Double,
      longlong: Double,
      pointer: Double,
      short: Double,
      size_t: Double,
      uchar: Double,
      uint: Double,
      uint16: Double,
      uint32: Double,
      uint64: Double,
      uint8: Double,
      ulong: Double,
      ulonglong: Double,
      ushort: Double
    ): SizeofRegistry = {
      val __obj = js.Dynamic.literal(Object = Object.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], byte = byte.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], int16 = int16.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], int64 = int64.asInstanceOf[js.Any], int8 = int8.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], longlong = longlong.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], size_t = size_t.asInstanceOf[js.Any], uchar = uchar.asInstanceOf[js.Any], uint = uint.asInstanceOf[js.Any], uint16 = uint16.asInstanceOf[js.Any], uint32 = uint32.asInstanceOf[js.Any], uint64 = uint64.asInstanceOf[js.Any], uint8 = uint8.asInstanceOf[js.Any], ulong = ulong.asInstanceOf[js.Any], ulonglong = ulonglong.asInstanceOf[js.Any], ushort = ushort.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizeofRegistry]
    }
    
    extension [Self <: SizeofRegistry](x: Self) {
      
      inline def setBool(value: Double): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setByte(value: Double): Self = StObject.set(x, "byte", value.asInstanceOf[js.Any])
      
      inline def setChar(value: Double): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def setDouble(value: Double): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
      
      inline def setFloat(value: Double): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setInt(value: Double): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
      
      inline def setInt16(value: Double): Self = StObject.set(x, "int16", value.asInstanceOf[js.Any])
      
      inline def setInt32(value: Double): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
      
      inline def setInt64(value: Double): Self = StObject.set(x, "int64", value.asInstanceOf[js.Any])
      
      inline def setInt8(value: Double): Self = StObject.set(x, "int8", value.asInstanceOf[js.Any])
      
      inline def setLong(value: Double): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setLonglong(value: Double): Self = StObject.set(x, "longlong", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Double): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      inline def setPointer(value: Double): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setShort(value: Double): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setSize_t(value: Double): Self = StObject.set(x, "size_t", value.asInstanceOf[js.Any])
      
      inline def setUchar(value: Double): Self = StObject.set(x, "uchar", value.asInstanceOf[js.Any])
      
      inline def setUint(value: Double): Self = StObject.set(x, "uint", value.asInstanceOf[js.Any])
      
      inline def setUint16(value: Double): Self = StObject.set(x, "uint16", value.asInstanceOf[js.Any])
      
      inline def setUint32(value: Double): Self = StObject.set(x, "uint32", value.asInstanceOf[js.Any])
      
      inline def setUint64(value: Double): Self = StObject.set(x, "uint64", value.asInstanceOf[js.Any])
      
      inline def setUint8(value: Double): Self = StObject.set(x, "uint8", value.asInstanceOf[js.Any])
      
      inline def setUlong(value: Double): Self = StObject.set(x, "ulong", value.asInstanceOf[js.Any])
      
      inline def setUlonglong(value: Double): Self = StObject.set(x, "ulonglong", value.asInstanceOf[js.Any])
      
      inline def setUshort(value: Double): Self = StObject.set(x, "ushort", value.asInstanceOf[js.Any])
    }
  }
  
  // Helper type that trims leading and trailing spaces from a string
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    // NOTE: look for double and single space characters to reduce recursion
  S extends / * template literal string:   ${inferU} * / string ? ref-napi.ref-napi.Trim</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U * / any> : S extends / * template literal string:  ${inferU} * / string ? ref-napi.ref-napi.Trim</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U * / any> : S extends / * template literal string: ${inferU}   * / string ? ref-napi.ref-napi.Trim</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U * / any> : S extends / * template literal string: ${inferU}  * / string ? ref-napi.ref-napi.Trim</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U * / any> : S
    }}}
    */
  @js.native
  trait Trim[S /* <: String */] extends StObject
  
  trait Type[T] extends StObject {
    
    /** The alignment of this datatype when placed inside a struct. */
    var alignment: js.UndefOr[Double] = js.undefined
    
    /** To invoke when `ref.get` is invoked on a buffer of this type. */
    def get(buffer: Buffer, offset: Double): T
    
    /** The current level of indirection of the buffer. */
    var indirection: Double
    
    /** The name to use during debugging for this datatype. */
    var name: js.UndefOr[String] = js.undefined
    
    /** To invoke when `ref.set` is invoked on a buffer of this type. */
    def set(buffer: Buffer, offset: Double, value: T): Unit
    
    /** The size in bytes required to hold this datatype. */
    var size: Double
  }
  object Type {
    
    inline def apply[T](get: (Buffer, Double) => T, indirection: Double, set: (Buffer, Double, T) => Unit, size: Double): Type[T] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), indirection = indirection.asInstanceOf[js.Any], set = js.Any.fromFunction3(set), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type[T]]
    }
    
    extension [Self <: Type[?], T](x: Self & Type[T]) {
      
      inline def setAlignment(value: Double): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setGet(value: (Buffer, Double) => T): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setIndirection(value: Double): Self = StObject.set(x, "indirection", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSet(value: (Buffer, Double, T) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeLike = Type[Any] | String
  
  trait TypesDefaultRegistry extends StObject {
    
    var CString: Type[String | Null]
    
    var Object: Type[Any]
    
    var bool: Type[Boolean]
    
    var byte: Type[Double]
    
    var char: Type[Double]
    
    var double: Type[Double]
    
    var float: Type[Double]
    
    var int: Type[Double]
    
    var int16: Type[Double]
    
    var int32: Type[Double]
    
    var int64: Type[String | Double]
    
    var int8: Type[Double]
    
    var long: Type[String | Double]
    
    var longlong: Type[String | Double]
    
    var short: Type[Double]
    
    var size_t: Type[String | Double]
    
    var uchar: Type[Double]
    
    var uint: Type[Double]
    
    var uint16: Type[Double]
    
    var uint32: Type[Double]
    
    var uint64: Type[String | Double]
    
    var uint8: Type[Double]
    
    var ulong: Type[String | Double]
    
    var ulonglong: Type[String | Double]
    
    var ushort: Type[Double]
    
    var void: Type[Unit]
  }
  object TypesDefaultRegistry {
    
    inline def apply(
      CString: Type[String | Null],
      Object: Type[Any],
      bool: Type[Boolean],
      byte: Type[Double],
      char: Type[Double],
      double: Type[Double],
      float: Type[Double],
      int: Type[Double],
      int16: Type[Double],
      int32: Type[Double],
      int64: Type[String | Double],
      int8: Type[Double],
      long: Type[String | Double],
      longlong: Type[String | Double],
      short: Type[Double],
      size_t: Type[String | Double],
      uchar: Type[Double],
      uint: Type[Double],
      uint16: Type[Double],
      uint32: Type[Double],
      uint64: Type[String | Double],
      uint8: Type[Double],
      ulong: Type[String | Double],
      ulonglong: Type[String | Double],
      ushort: Type[Double],
      void: Type[Unit]
    ): TypesDefaultRegistry = {
      val __obj = js.Dynamic.literal(CString = CString.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], byte = byte.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], int16 = int16.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], int64 = int64.asInstanceOf[js.Any], int8 = int8.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], longlong = longlong.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], size_t = size_t.asInstanceOf[js.Any], uchar = uchar.asInstanceOf[js.Any], uint = uint.asInstanceOf[js.Any], uint16 = uint16.asInstanceOf[js.Any], uint32 = uint32.asInstanceOf[js.Any], uint64 = uint64.asInstanceOf[js.Any], uint8 = uint8.asInstanceOf[js.Any], ulong = ulong.asInstanceOf[js.Any], ulonglong = ulonglong.asInstanceOf[js.Any], ushort = ushort.asInstanceOf[js.Any], void = void.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypesDefaultRegistry]
    }
    
    extension [Self <: TypesDefaultRegistry](x: Self) {
      
      inline def setBool(value: Type[Boolean]): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setByte(value: Type[Double]): Self = StObject.set(x, "byte", value.asInstanceOf[js.Any])
      
      inline def setCString(value: Type[String | Null]): Self = StObject.set(x, "CString", value.asInstanceOf[js.Any])
      
      inline def setChar(value: Type[Double]): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def setDouble(value: Type[Double]): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
      
      inline def setFloat(value: Type[Double]): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setInt(value: Type[Double]): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
      
      inline def setInt16(value: Type[Double]): Self = StObject.set(x, "int16", value.asInstanceOf[js.Any])
      
      inline def setInt32(value: Type[Double]): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
      
      inline def setInt64(value: Type[String | Double]): Self = StObject.set(x, "int64", value.asInstanceOf[js.Any])
      
      inline def setInt8(value: Type[Double]): Self = StObject.set(x, "int8", value.asInstanceOf[js.Any])
      
      inline def setLong(value: Type[String | Double]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setLonglong(value: Type[String | Double]): Self = StObject.set(x, "longlong", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Type[Any]): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      inline def setShort(value: Type[Double]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setSize_t(value: Type[String | Double]): Self = StObject.set(x, "size_t", value.asInstanceOf[js.Any])
      
      inline def setUchar(value: Type[Double]): Self = StObject.set(x, "uchar", value.asInstanceOf[js.Any])
      
      inline def setUint(value: Type[Double]): Self = StObject.set(x, "uint", value.asInstanceOf[js.Any])
      
      inline def setUint16(value: Type[Double]): Self = StObject.set(x, "uint16", value.asInstanceOf[js.Any])
      
      inline def setUint32(value: Type[Double]): Self = StObject.set(x, "uint32", value.asInstanceOf[js.Any])
      
      inline def setUint64(value: Type[String | Double]): Self = StObject.set(x, "uint64", value.asInstanceOf[js.Any])
      
      inline def setUint8(value: Type[Double]): Self = StObject.set(x, "uint8", value.asInstanceOf[js.Any])
      
      inline def setUlong(value: Type[String | Double]): Self = StObject.set(x, "ulong", value.asInstanceOf[js.Any])
      
      inline def setUlonglong(value: Type[String | Double]): Self = StObject.set(x, "ulonglong", value.asInstanceOf[js.Any])
      
      inline def setUshort(value: Type[Double]): Self = StObject.set(x, "ushort", value.asInstanceOf[js.Any])
      
      inline def setVoid(value: Type[Unit]): Self = StObject.set(x, "void", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypesOverrideRegistry extends StObject
  
  /* Inlined parent std.Omit<ref-napi.ref-napi.TypesDefaultRegistry, keyof ref-napi.ref-napi.TypesOverrideRegistry> */
  /* Inlined parent ref-napi.ref-napi.TypesOverrideRegistry */
  trait TypesRegistry extends StObject {
    
    var CString: Type[String | Null]
    
    var Object: Type[Any]
    
    var bool: Type[Boolean]
    
    var byte: Type[Double]
    
    var char: Type[Double]
    
    var double: Type[Double]
    
    var float: Type[Double]
    
    var int: Type[Double]
    
    var int16: Type[Double]
    
    var int32: Type[Double]
    
    var int64: Type[String | Double]
    
    var int8: Type[Double]
    
    var long: Type[String | Double]
    
    var longlong: Type[String | Double]
    
    var short: Type[Double]
    
    var size_t: Type[String | Double]
    
    var uchar: Type[Double]
    
    var uint: Type[Double]
    
    var uint16: Type[Double]
    
    var uint32: Type[Double]
    
    var uint64: Type[String | Double]
    
    var uint8: Type[Double]
    
    var ulong: Type[String | Double]
    
    var ulonglong: Type[String | Double]
    
    var ushort: Type[Double]
    
    var void: Type[Unit]
  }
  object TypesRegistry {
    
    inline def apply(
      CString: Type[String | Null],
      Object: Type[Any],
      bool: Type[Boolean],
      byte: Type[Double],
      char: Type[Double],
      double: Type[Double],
      float: Type[Double],
      int: Type[Double],
      int16: Type[Double],
      int32: Type[Double],
      int64: Type[String | Double],
      int8: Type[Double],
      long: Type[String | Double],
      longlong: Type[String | Double],
      short: Type[Double],
      size_t: Type[String | Double],
      uchar: Type[Double],
      uint: Type[Double],
      uint16: Type[Double],
      uint32: Type[Double],
      uint64: Type[String | Double],
      uint8: Type[Double],
      ulong: Type[String | Double],
      ulonglong: Type[String | Double],
      ushort: Type[Double],
      void: Type[Unit]
    ): TypesRegistry = {
      val __obj = js.Dynamic.literal(CString = CString.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], byte = byte.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], int16 = int16.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], int64 = int64.asInstanceOf[js.Any], int8 = int8.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], longlong = longlong.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], size_t = size_t.asInstanceOf[js.Any], uchar = uchar.asInstanceOf[js.Any], uint = uint.asInstanceOf[js.Any], uint16 = uint16.asInstanceOf[js.Any], uint32 = uint32.asInstanceOf[js.Any], uint64 = uint64.asInstanceOf[js.Any], uint8 = uint8.asInstanceOf[js.Any], ulong = ulong.asInstanceOf[js.Any], ulonglong = ulonglong.asInstanceOf[js.Any], ushort = ushort.asInstanceOf[js.Any], void = void.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypesRegistry]
    }
    
    extension [Self <: TypesRegistry](x: Self) {
      
      inline def setBool(value: Type[Boolean]): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setByte(value: Type[Double]): Self = StObject.set(x, "byte", value.asInstanceOf[js.Any])
      
      inline def setCString(value: Type[String | Null]): Self = StObject.set(x, "CString", value.asInstanceOf[js.Any])
      
      inline def setChar(value: Type[Double]): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def setDouble(value: Type[Double]): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
      
      inline def setFloat(value: Type[Double]): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setInt(value: Type[Double]): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
      
      inline def setInt16(value: Type[Double]): Self = StObject.set(x, "int16", value.asInstanceOf[js.Any])
      
      inline def setInt32(value: Type[Double]): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
      
      inline def setInt64(value: Type[String | Double]): Self = StObject.set(x, "int64", value.asInstanceOf[js.Any])
      
      inline def setInt8(value: Type[Double]): Self = StObject.set(x, "int8", value.asInstanceOf[js.Any])
      
      inline def setLong(value: Type[String | Double]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setLonglong(value: Type[String | Double]): Self = StObject.set(x, "longlong", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Type[Any]): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      inline def setShort(value: Type[Double]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setSize_t(value: Type[String | Double]): Self = StObject.set(x, "size_t", value.asInstanceOf[js.Any])
      
      inline def setUchar(value: Type[Double]): Self = StObject.set(x, "uchar", value.asInstanceOf[js.Any])
      
      inline def setUint(value: Type[Double]): Self = StObject.set(x, "uint", value.asInstanceOf[js.Any])
      
      inline def setUint16(value: Type[Double]): Self = StObject.set(x, "uint16", value.asInstanceOf[js.Any])
      
      inline def setUint32(value: Type[Double]): Self = StObject.set(x, "uint32", value.asInstanceOf[js.Any])
      
      inline def setUint64(value: Type[String | Double]): Self = StObject.set(x, "uint64", value.asInstanceOf[js.Any])
      
      inline def setUint8(value: Type[Double]): Self = StObject.set(x, "uint8", value.asInstanceOf[js.Any])
      
      inline def setUlong(value: Type[String | Double]): Self = StObject.set(x, "ulong", value.asInstanceOf[js.Any])
      
      inline def setUlonglong(value: Type[String | Double]): Self = StObject.set(x, "ulonglong", value.asInstanceOf[js.Any])
      
      inline def setUshort(value: Type[Double]): Self = StObject.set(x, "ushort", value.asInstanceOf[js.Any])
      
      inline def setVoid(value: Type[Unit]): Self = StObject.set(x, "void", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends ref-napi.ref-napi.Type<infer U> ? U : // Allow for user-defined type overrides
  T extends keyof ref-napi.ref-napi.UnderlyingTypeOverrideRegistry ? ref-napi.ref-napi.UnderlyingTypeOverrideRegistry[T] : // Use default type map
  T extends 'long' | 'CString' | 'ulonglong' | 'char *' | 'int64' | 'uint64' | 'byte' | 'int32' | 'float' | 'int16' | 'longlong' | 'uchar' | 'uint' | 'size_t' | 'char*' | 'int' | 'byte*' | 'int8' | 'double' | 'void' | 'pointer' | 'void*' | 'void *' | 'ushort' | 'uint32' | 'ulong' | 'string' | 'byte *' | 'short' | 'uint16' | 'uint8' | 'bool' | 'char' | 'Object' ? ref-napi.ref-napi.UnderlyingTypeRegistry[T] : // Coerce pointer types into relevant references.
  T extends / * template literal string: ${inferU}* * / string ? ref-napi.ref-napi.Trim<U> extends 'char' ? string | null : // `char*` is a string type
  ref-napi.ref-napi.Trim<U> extends 'byte' ? ref-napi.ref-napi.<global>.Buffer | ref-napi.ref-napi.Pointer<number> : // `byte*` is either a `Buffer` or a `Pointer` to a single byte
  ref-napi.ref-napi.Trim<U> extends 'void' ? ref-napi.ref-napi.Pointer<unknown> : // `void*` is a `Pointer` to some unknown value.
  ref-napi.ref-napi.Pointer<ref-napi.ref-napi.UnderlyingType<U>> : // Treat this as a `Pointer` to the underlying type.
  unknown
    }}}
    */
  @js.native
  trait UnderlyingType[T /* <: TypeLike */] extends StObject
  
  trait UnderlyingTypeDefaultRegistry extends StObject {
    
    var CString: String | Null
    
    var Object: Any
    
    // tslint:disable-line void-return
    var bool: Boolean
    
    var byte: Double
    
    @JSName("byte *")
    var `byte Asterisk`: Buffer | Pointer[Double]
    
    @JSName("byte*")
    var byteAsterisk: Buffer | Pointer[Double]
    
    var char: Double
    
    @JSName("char *")
    var `char Asterisk`: String
    
    @JSName("char*")
    var charAsterisk: String
    
    var double: Double
    
    var float: Double
    
    var int: Double
    
    var int16: Double
    
    var int32: Double
    
    var int64: String | Double
    
    var int8: Double
    
    var long: String | Double
    
    var longlong: String | Double
    
    var pointer: Pointer[Any]
    
    var short: Double
    
    var size_t: String | Double
    
    var string: String | Null
    
    var uchar: Double
    
    var uint: Double
    
    var uint16: Double
    
    var uint32: Double
    
    var uint64: String | Double
    
    var uint8: Double
    
    var ulong: String | Double
    
    var ulonglong: String | Double
    
    var ushort: Double
    
    var void: Unit
    
    @JSName("void *")
    var `void Asterisk`: Pointer[Any]
    
    @JSName("void*")
    var voidAsterisk: Pointer[Any]
  }
  object UnderlyingTypeDefaultRegistry {
    
    inline def apply(
      Object: Any,
      bool: Boolean,
      byte: Double,
      `byte Asterisk`: Buffer | Pointer[Double],
      byteAsterisk: Buffer | Pointer[Double],
      char: Double,
      `char Asterisk`: String,
      charAsterisk: String,
      double: Double,
      float: Double,
      int: Double,
      int16: Double,
      int32: Double,
      int64: String | Double,
      int8: Double,
      long: String | Double,
      longlong: String | Double,
      pointer: Pointer[Any],
      short: Double,
      size_t: String | Double,
      uchar: Double,
      uint: Double,
      uint16: Double,
      uint32: Double,
      uint64: String | Double,
      uint8: Double,
      ulong: String | Double,
      ulonglong: String | Double,
      ushort: Double,
      void: Unit,
      `void Asterisk`: Pointer[Any],
      voidAsterisk: Pointer[Any]
    ): UnderlyingTypeDefaultRegistry = {
      val __obj = js.Dynamic.literal(Object = Object.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], byte = byte.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], int16 = int16.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], int64 = int64.asInstanceOf[js.Any], int8 = int8.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], longlong = longlong.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], size_t = size_t.asInstanceOf[js.Any], uchar = uchar.asInstanceOf[js.Any], uint = uint.asInstanceOf[js.Any], uint16 = uint16.asInstanceOf[js.Any], uint32 = uint32.asInstanceOf[js.Any], uint64 = uint64.asInstanceOf[js.Any], uint8 = uint8.asInstanceOf[js.Any], ulong = ulong.asInstanceOf[js.Any], ulonglong = ulonglong.asInstanceOf[js.Any], ushort = ushort.asInstanceOf[js.Any], void = void.asInstanceOf[js.Any], CString = null, string = null)
      __obj.updateDynamic("byte *")((`byte Asterisk`).asInstanceOf[js.Any])
      __obj.updateDynamic("byte*")(byteAsterisk.asInstanceOf[js.Any])
      __obj.updateDynamic("char *")((`char Asterisk`).asInstanceOf[js.Any])
      __obj.updateDynamic("char*")(charAsterisk.asInstanceOf[js.Any])
      __obj.updateDynamic("void *")((`void Asterisk`).asInstanceOf[js.Any])
      __obj.updateDynamic("void*")(voidAsterisk.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnderlyingTypeDefaultRegistry]
    }
    
    extension [Self <: UnderlyingTypeDefaultRegistry](x: Self) {
      
      inline def setBool(value: Boolean): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setByte(value: Double): Self = StObject.set(x, "byte", value.asInstanceOf[js.Any])
      
      inline def `setByte Asterisk`(value: Buffer | Pointer[Double]): Self = StObject.set(x, "byte *", value.asInstanceOf[js.Any])
      
      inline def setByteAsterisk(value: Buffer | Pointer[Double]): Self = StObject.set(x, "byte*", value.asInstanceOf[js.Any])
      
      inline def setCString(value: String): Self = StObject.set(x, "CString", value.asInstanceOf[js.Any])
      
      inline def setCStringNull: Self = StObject.set(x, "CString", null)
      
      inline def setChar(value: Double): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def `setChar Asterisk`(value: String): Self = StObject.set(x, "char *", value.asInstanceOf[js.Any])
      
      inline def setCharAsterisk(value: String): Self = StObject.set(x, "char*", value.asInstanceOf[js.Any])
      
      inline def setDouble(value: Double): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
      
      inline def setFloat(value: Double): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setInt(value: Double): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
      
      inline def setInt16(value: Double): Self = StObject.set(x, "int16", value.asInstanceOf[js.Any])
      
      inline def setInt32(value: Double): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
      
      inline def setInt64(value: String | Double): Self = StObject.set(x, "int64", value.asInstanceOf[js.Any])
      
      inline def setInt8(value: Double): Self = StObject.set(x, "int8", value.asInstanceOf[js.Any])
      
      inline def setLong(value: String | Double): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setLonglong(value: String | Double): Self = StObject.set(x, "longlong", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Any): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      inline def setPointer(value: Pointer[Any]): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setShort(value: Double): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setSize_t(value: String | Double): Self = StObject.set(x, "size_t", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringNull: Self = StObject.set(x, "string", null)
      
      inline def setUchar(value: Double): Self = StObject.set(x, "uchar", value.asInstanceOf[js.Any])
      
      inline def setUint(value: Double): Self = StObject.set(x, "uint", value.asInstanceOf[js.Any])
      
      inline def setUint16(value: Double): Self = StObject.set(x, "uint16", value.asInstanceOf[js.Any])
      
      inline def setUint32(value: Double): Self = StObject.set(x, "uint32", value.asInstanceOf[js.Any])
      
      inline def setUint64(value: String | Double): Self = StObject.set(x, "uint64", value.asInstanceOf[js.Any])
      
      inline def setUint8(value: Double): Self = StObject.set(x, "uint8", value.asInstanceOf[js.Any])
      
      inline def setUlong(value: String | Double): Self = StObject.set(x, "ulong", value.asInstanceOf[js.Any])
      
      inline def setUlonglong(value: String | Double): Self = StObject.set(x, "ulonglong", value.asInstanceOf[js.Any])
      
      inline def setUshort(value: Double): Self = StObject.set(x, "ushort", value.asInstanceOf[js.Any])
      
      inline def setVoid(value: Unit): Self = StObject.set(x, "void", value.asInstanceOf[js.Any])
      
      inline def `setVoid Asterisk`(value: Pointer[Any]): Self = StObject.set(x, "void *", value.asInstanceOf[js.Any])
      
      inline def setVoidAsterisk(value: Pointer[Any]): Self = StObject.set(x, "void*", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnderlyingTypeOverrideRegistry extends StObject
  
  /* Inlined parent std.Omit<ref-napi.ref-napi.UnderlyingTypeDefaultRegistry, keyof ref-napi.ref-napi.UnderlyingTypeOverrideRegistry> */
  /* Inlined parent ref-napi.ref-napi.UnderlyingTypeOverrideRegistry */
  trait UnderlyingTypeRegistry extends StObject {
    
    var CString: js.UndefOr[String | Null] = js.undefined
    
    var Object: Any
    
    var bool: Boolean
    
    var byte: Double
    
    @JSName("byte *")
    var `byte Asterisk`: Buffer | Pointer[Double]
    
    @JSName("byte*")
    var byteAsterisk: Buffer | Pointer[Double]
    
    var char: Double
    
    @JSName("char *")
    var `char Asterisk`: String
    
    @JSName("char*")
    var charAsterisk: String
    
    var double: Double
    
    var float: Double
    
    var int: Double
    
    var int16: Double
    
    var int32: Double
    
    var int64: String | Double
    
    var int8: Double
    
    var long: String | Double
    
    var longlong: String | Double
    
    var pointer: Pointer[Any]
    
    var short: Double
    
    var size_t: String | Double
    
    var string: js.UndefOr[String | Null] = js.undefined
    
    var uchar: Double
    
    var uint: Double
    
    var uint16: Double
    
    var uint32: Double
    
    var uint64: String | Double
    
    var uint8: Double
    
    var ulong: String | Double
    
    var ulonglong: String | Double
    
    var ushort: Double
    
    var void: Unit
    
    @JSName("void *")
    var `void Asterisk`: Pointer[Any]
    
    @JSName("void*")
    var voidAsterisk: Pointer[Any]
  }
  object UnderlyingTypeRegistry {
    
    inline def apply(
      Object: Any,
      bool: Boolean,
      byte: Double,
      `byte Asterisk`: Buffer | Pointer[Double],
      byteAsterisk: Buffer | Pointer[Double],
      char: Double,
      `char Asterisk`: String,
      charAsterisk: String,
      double: Double,
      float: Double,
      int: Double,
      int16: Double,
      int32: Double,
      int64: String | Double,
      int8: Double,
      long: String | Double,
      longlong: String | Double,
      pointer: Pointer[Any],
      short: Double,
      size_t: String | Double,
      uchar: Double,
      uint: Double,
      uint16: Double,
      uint32: Double,
      uint64: String | Double,
      uint8: Double,
      ulong: String | Double,
      ulonglong: String | Double,
      ushort: Double,
      void: Unit,
      `void Asterisk`: Pointer[Any],
      voidAsterisk: Pointer[Any]
    ): UnderlyingTypeRegistry = {
      val __obj = js.Dynamic.literal(Object = Object.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], byte = byte.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], int16 = int16.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], int64 = int64.asInstanceOf[js.Any], int8 = int8.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], longlong = longlong.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], size_t = size_t.asInstanceOf[js.Any], uchar = uchar.asInstanceOf[js.Any], uint = uint.asInstanceOf[js.Any], uint16 = uint16.asInstanceOf[js.Any], uint32 = uint32.asInstanceOf[js.Any], uint64 = uint64.asInstanceOf[js.Any], uint8 = uint8.asInstanceOf[js.Any], ulong = ulong.asInstanceOf[js.Any], ulonglong = ulonglong.asInstanceOf[js.Any], ushort = ushort.asInstanceOf[js.Any], void = void.asInstanceOf[js.Any])
      __obj.updateDynamic("byte *")((`byte Asterisk`).asInstanceOf[js.Any])
      __obj.updateDynamic("byte*")(byteAsterisk.asInstanceOf[js.Any])
      __obj.updateDynamic("char *")((`char Asterisk`).asInstanceOf[js.Any])
      __obj.updateDynamic("char*")(charAsterisk.asInstanceOf[js.Any])
      __obj.updateDynamic("void *")((`void Asterisk`).asInstanceOf[js.Any])
      __obj.updateDynamic("void*")(voidAsterisk.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnderlyingTypeRegistry]
    }
    
    extension [Self <: UnderlyingTypeRegistry](x: Self) {
      
      inline def setBool(value: Boolean): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setByte(value: Double): Self = StObject.set(x, "byte", value.asInstanceOf[js.Any])
      
      inline def `setByte Asterisk`(value: Buffer | Pointer[Double]): Self = StObject.set(x, "byte *", value.asInstanceOf[js.Any])
      
      inline def setByteAsterisk(value: Buffer | Pointer[Double]): Self = StObject.set(x, "byte*", value.asInstanceOf[js.Any])
      
      inline def setCString(value: String): Self = StObject.set(x, "CString", value.asInstanceOf[js.Any])
      
      inline def setCStringNull: Self = StObject.set(x, "CString", null)
      
      inline def setCStringUndefined: Self = StObject.set(x, "CString", js.undefined)
      
      inline def setChar(value: Double): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def `setChar Asterisk`(value: String): Self = StObject.set(x, "char *", value.asInstanceOf[js.Any])
      
      inline def setCharAsterisk(value: String): Self = StObject.set(x, "char*", value.asInstanceOf[js.Any])
      
      inline def setDouble(value: Double): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
      
      inline def setFloat(value: Double): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setInt(value: Double): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
      
      inline def setInt16(value: Double): Self = StObject.set(x, "int16", value.asInstanceOf[js.Any])
      
      inline def setInt32(value: Double): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
      
      inline def setInt64(value: String | Double): Self = StObject.set(x, "int64", value.asInstanceOf[js.Any])
      
      inline def setInt8(value: Double): Self = StObject.set(x, "int8", value.asInstanceOf[js.Any])
      
      inline def setLong(value: String | Double): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setLonglong(value: String | Double): Self = StObject.set(x, "longlong", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Any): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      inline def setPointer(value: Pointer[Any]): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setShort(value: Double): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setSize_t(value: String | Double): Self = StObject.set(x, "size_t", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringNull: Self = StObject.set(x, "string", null)
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setUchar(value: Double): Self = StObject.set(x, "uchar", value.asInstanceOf[js.Any])
      
      inline def setUint(value: Double): Self = StObject.set(x, "uint", value.asInstanceOf[js.Any])
      
      inline def setUint16(value: Double): Self = StObject.set(x, "uint16", value.asInstanceOf[js.Any])
      
      inline def setUint32(value: Double): Self = StObject.set(x, "uint32", value.asInstanceOf[js.Any])
      
      inline def setUint64(value: String | Double): Self = StObject.set(x, "uint64", value.asInstanceOf[js.Any])
      
      inline def setUint8(value: Double): Self = StObject.set(x, "uint8", value.asInstanceOf[js.Any])
      
      inline def setUlong(value: String | Double): Self = StObject.set(x, "ulong", value.asInstanceOf[js.Any])
      
      inline def setUlonglong(value: String | Double): Self = StObject.set(x, "ulonglong", value.asInstanceOf[js.Any])
      
      inline def setUshort(value: Double): Self = StObject.set(x, "ushort", value.asInstanceOf[js.Any])
      
      inline def setVoid(value: Unit): Self = StObject.set(x, "void", value.asInstanceOf[js.Any])
      
      inline def `setVoid Asterisk`(value: Pointer[Any]): Self = StObject.set(x, "void *", value.asInstanceOf[js.Any])
      
      inline def setVoidAsterisk(value: Pointer[Any]): Self = StObject.set(x, "void*", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Extract<{[ P in keyof T ]: P extends / * template literal string: ${number} * / string? ref-napi.ref-napi.UnderlyingType<std.Extract<T[P], ref-napi.ref-napi.TypeLike>> : T[P]}, std.Array<any>> */
  type UnderlyingTypes[T /* <: js.Array[TypeLike] */] = scala.Nothing
  
  @js.native
  trait Value[T]
    extends StObject
       with Buffer {
    
    @JSName("type")
    var type_Value: Type[T] = js.native
  }
  
  trait _NamedType extends StObject
  
  object global {
    
    @js.native
    trait Buffer extends StObject {
      
      def address(): Double = js.native
      
      def deref(): Any = js.native
      
      def hexAddress(): String = js.native
      
      def isNull(): Boolean = js.native
      
      def readCString(): String = js.native
      def readCString(offset: Double): String = js.native
      
      def readInt64BE(): String | Double = js.native
      def readInt64BE(offset: Double): String | Double = js.native
      
      def readInt64LE(): String | Double = js.native
      def readInt64LE(offset: Double): String | Double = js.native
      
      def readObject(): js.Object = js.native
      def readObject(offset: Double): js.Object = js.native
      
      def readPointer(): Buffer = js.native
      def readPointer(offset: Double): Buffer = js.native
      def readPointer(offset: Double, length: Double): Buffer = js.native
      def readPointer(offset: Unit, length: Double): Buffer = js.native
      
      def readUInt64BE(): String | Double = js.native
      def readUInt64BE(offset: Double): String | Double = js.native
      
      def readUInt64LE(): String | Double = js.native
      def readUInt64LE(offset: Double): String | Double = js.native
      
      def ref(): Buffer = js.native
      
      def reinterpret(size: Double): Buffer = js.native
      def reinterpret(size: Double, offset: Double): Buffer = js.native
      
      def reinterpretUntilZeros(size: Double): Buffer = js.native
      def reinterpretUntilZeros(size: Double, offset: Double): Buffer = js.native
      
      var `type`: js.UndefOr[Type[Any]] = js.native
      
      def writeCString(string: String): Unit = js.native
      def writeCString(string: String, offset: Double): Unit = js.native
      def writeCString(string: String, offset: Double, encoding: String): Unit = js.native
      def writeCString(string: String, offset: Unit, encoding: String): Unit = js.native
      
      def writeInt64BE(input: String): Unit = js.native
      def writeInt64BE(input: String, offset: Double): Unit = js.native
      def writeInt64BE(input: Double): Unit = js.native
      def writeInt64BE(input: Double, offset: Double): Unit = js.native
      
      def writeInt64LE(input: String): Unit = js.native
      def writeInt64LE(input: String, offset: Double): Unit = js.native
      def writeInt64LE(input: Double): Unit = js.native
      def writeInt64LE(input: Double, offset: Double): Unit = js.native
      
      def writeObject(`object`: js.Object): Unit = js.native
      def writeObject(`object`: js.Object, offset: Double): Unit = js.native
      
      def writePointer(pointer: Buffer): Unit = js.native
      def writePointer(pointer: Buffer, offset: Double): Unit = js.native
      
      def writeUInt64BE(input: String): Unit = js.native
      def writeUInt64BE(input: String, offset: Double): Unit = js.native
      def writeUInt64BE(input: Double): Unit = js.native
      def writeUInt64BE(input: Double, offset: Double): Unit = js.native
      
      def writeUInt64LE(input: String): Unit = js.native
      def writeUInt64LE(input: String, offset: Double): Unit = js.native
      def writeUInt64LE(input: Double): Unit = js.native
      def writeUInt64LE(input: Double, offset: Double): Unit = js.native
    }
  }
}
