package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataStreamMod {
  
  /**
    * Allows you to read from structured binary files like those used for Sphere game
    * assets (maps, tilesets, etc.) based on a simple JSON read individual binary values
    * from the file.
    * @see FileStream
    */
  @JSImport("data-stream", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DataStream {
    def this(filename: String, fileOp: FileOp) = this()
  }
  object default {
    
    @JSImport("data-stream", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Opens a file asynchronously and returns a promise for a `DataStream` that
      * provides access to the contents of the file.
      * @param filename refers to the SphereFS path to the file
      * @param fileOp specifies the file operation requested.
      */
    /* static member */
    inline def fromFile(filename: String, fileOp: FileOp): js.Promise[DataStream] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(filename.asInstanceOf[js.Any], fileOp.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DataStream]]
  }
  
  /**
    * Allows you to read from structured binary files like those used for Sphere game
    * assets (maps, tilesets, etc.) based on a simple JSON read individual binary values
    * from the file.
    * @see FileStream
    */
  @js.native
  trait DataStream extends StObject {
    
    /**
      * Reads an IEEE floating point value from the data file.
      * @param littleEndian Reads the file in little-endian mode if true.
      */
    def readFloat32(): Double = js.native
    def readFloat32(littleEndian: Boolean): Double = js.native
    
    /**
      * Reads an IEEE floating point value from the data file.
      * @param littleEndian Reads the file in little-endian mode if true.
      */
    def readFloat64(): Double = js.native
    def readFloat64(littleEndian: Boolean): Double = js.native
    
    /**
      * Reads a 16-bit signed integer (-32,768 to 32,767) value from the data file.
      * @param littleEndian Reads in little-endian mode if true.
      */
    def readInt16(): Double = js.native
    def readInt16(littleEndian: Boolean): Double = js.native
    
    /**
      * Reads a 32-bit signed integer (-2,147,483,648 to 2,147,483,647) value from the
      * data file.
      * @param littleEndian Reads in little-endian mode if true.
      */
    def readInt32(): Double = js.native
    def readInt32(littleEndian: Boolean): Double = js.native
    
    /**
      * Reads an 8-bit signed integer (-128 to 127) value from the data file.
      */
    def readInt8(): Double = js.native
    
    /**
      * Reads a UTF-8 length-prefixed string from the data file, where the length
      * in bytes is stored as an unsigned integer.
      * @param littleEndian Reads the file in little-endian mode if true.
      */
    def readString16(): String = js.native
    def readString16(littleEndian: Boolean): String = js.native
    
    /**
      * Reads a UTF-8 length-prefixed string from the data file, where the length
      * in bytes is stored as an unsigned integer.
      * @param littleEndian Reads the file in little-endian mode if true.
      */
    def readString32(): String = js.native
    def readString32(littleEndian: Boolean): String = js.native
    
    /**
      * Reads a UTF-8 length-prefixed string from the data file, where the length
      * in bytes is stored as an unsigned integer.
      */
    def readString8(): String = js.native
    
    /**
      * Reads a UTF-8 string from the data file.
      * @param length Specifies how many bytes to read.
      */
    def readStringRaw(length: Double): String = js.native
    
    /**
      * Reads an object from the data file.
      * @param desc An object describing the layout of the file.
      * @returns An object with the same fields as `desc`, whose values are based on the contents
      * of `desc`.
      * @example
      * // from the miniSphere runtime docs
      * rmp_header = myReader.readStruct({
      *     signature: { type: 'fstring', length: 4 },
      *     version: { type: 'uint16le' },
      *     type: { type: 'uint8' },
      *     numLayers: { type: 'uint8' },
      *     reserved1: { type: 'raw', size: 1 },
      *     numEntities: { type: 'uint16le' },
      *     startX: { type: 'uint16le' },
      *     startY: { type: 'uint16le' },
      *     startLayer: { type: 'uint8' },
      *     startDir: { type: 'uint8' },
      *     numStrings: { type: 'uint16le' },
      *     numZones: { type: 'uint16le' },
      *     repeating: { type: 'bool' },
      *     reserved2: { type: 'raw', size: 234 },
      * });
      */
    def readStruct(desc: FileDescriptor): Any = js.native
    
    /**
      * Reads a 16-bit unsigned integer (0 to 65,535) value from the data file.
      * @param littleEndian Reads in little-endian mode if true.
      */
    def readUint16(): Double = js.native
    def readUint16(littleEndian: Boolean): Double = js.native
    
    /**
      * Reads a 32-bit unsigned integer (0 to 4,294,967,295) value from the data file.
      * @param littleEndian Reads in little-endian mode if true.
      */
    def readUint32(): Double = js.native
    def readUint32(littleEndian: Boolean): Double = js.native
    
    /**
      * Reads an 8-bit unsigned integer (0 to 255) value from the data file.
      */
    def readUint8(): Double = js.native
    
    /**
      * Writes a 32-bit floating point value (-3.4*10^38 to 3.4*10^38) to the data file.
      * @param value The number to be written.
      * @param littleEndian Writes in little-endian mode if true.
      */
    def writeFloat32(value: Double): Unit = js.native
    def writeFloat32(value: Double, littleEndian: Boolean): Unit = js.native
    
    /**
      * Writes a 64-bit floating point value (-1.7*10^308 to 1.7*10^308) to the data file.
      * @param value The number to be written.
      * @param littleEndian Writes in little-endian mode if true.
      */
    def writeFloat64(value: Double): Unit = js.native
    def writeFloat64(value: Double, littleEndian: Boolean): Unit = js.native
    
    /**
      * Writes a 16-bit signed integer (-32,768 to 32,767) value to the data file.
      * @param value The number to be written.
      * @param littleEndian Writes in little-endian mode if true.
      */
    def writeInt16(value: Double): Unit = js.native
    def writeInt16(value: Double, littleEndian: Boolean): Unit = js.native
    
    /**
      * Writes a 32-bit signed integer (-2,147,483,648 to 2,147,483,647) value to the
      * data file.
      * @param value The number to be written.
      * @param littleEndian Writes in little-endian mode if true.
      */
    def writeInt32(value: Double): Unit = js.native
    def writeInt32(value: Double, littleEndian: Boolean): Unit = js.native
    
    /**
      * Writes an 8-bit signed integer (-128 to 127) value to the data file.
      * @param value The number to be written.
      */
    def writeInt8(value: Double): Unit = js.native
    
    /**
      * Writes a UTF-8 length-prefixed string to the data file, where the length is
      * stored as an unsigned integer.
      * @param value The string written to the file.
      * @param littleEndian Reads the file in little-endian mode if true.
      */
    def writeString16(value: String): Unit = js.native
    def writeString16(value: String, littleEndian: Boolean): Unit = js.native
    
    /**
      * Writes a UTF-8 length-prefixed string to the data file, where the length is
      * stored as an unsigned integer.
      * @param value The string written to the file.
      * @param littleEndian Reads the file in little-endian mode if true.
      */
    def writeString32(value: String): Unit = js.native
    def writeString32(value: String, littleEndian: Boolean): Unit = js.native
    
    /**
      * Writes a UTF-8 length-prefixed string to the data file, where the length is
      * stored as an unsigned integer.
      * @param value The string written to the file.
      */
    def writeString8(value: String): Unit = js.native
    
    /**
      * Writes a UTF-8 string to the data file.
      * @param value The string written to the file.
      */
    def writeStringRaw(value: String): Unit = js.native
    
    /**
      * Writes a 16-bit unsigned integer (0 to 65,535) value to the data file.
      * @param value The number to be written.
      * @param littleEndian Writes in little-endian mode if true.
      */
    def writeUint16(value: Double): Unit = js.native
    def writeUint16(value: Double, littleEndian: Boolean): Unit = js.native
    
    /**
      * Writes a 32-bit unsigned integer (0 to 4,294,967,295) value to the data file.
      * @param value The number to be written.
      * @param littleEndian Writes in little-endian mode if true.
      */
    def writeUint32(value: Double): Unit = js.native
    def writeUint32(value: Double, littleEndian: Boolean): Unit = js.native
    
    /**
      * Writes an 8-bit unsigned integer (0 to 255) value to the data file.
      * @param value The number to be written.
      */
    def writeUint8(value: Double): Unit = js.native
  }
}
