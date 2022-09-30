package typings.sodiumUuid

import typings.node.bufferMod.global.Buffer
import typings.sodiumUuid.sodiumUuidInts.`16`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Generate v4 UUIDs using libsodium's RNG.
    *
    * Will fill the first 16 bytes of returned buffer with random bits but set the appropriate
    * bits to be recognised as a UUID v4. This leaves 122 bits of entropy. This method does not
    * insert dashes in the formatting, but this can be done with the `stringify()` method.
    *
    * @param buffer The buffer to generate the UUID to. Must be at least length 128 bits (16 bytes).
    *
    * @example
    * import uuid = require('sodium-uuid')
    *
    * uuid() // => Buffer
    * uuid(Buffer.allocUnsafe(uuid.BYTES)) // => allocUnsafe'ed 16 byte Buffer
    */
  inline def apply(): Buffer = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Buffer]
  inline def apply(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @JSImport("sodium-uuid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** The number of bytes a UUID buffer must be able to contain. */
  @JSImport("sodium-uuid", "BYTES")
  @js.native
  val BYTES: `16` = js.native
  
  /**
    * Check that `uuid` is a valid UUIDv4.
    */
  inline def isUUID(uuid: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUUID")(uuid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isUUID(uuid: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUUID")(uuid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Convert a string to a buffer representation of UUID. Will fail if str is not a valid UUIDv4.
    *
    * @param uuid The UUID to parse.
    * @param buffer The buffer to parse the UUID to. Must be at least length `BYTES`. Will be allocated if not given.
    */
  inline def parse(uuid: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(uuid.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def parse(uuid: String, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(uuid.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /**
    * Convert a buffer to string representation of UUID eg. 4a181507-72e2-45c7-a512-9d9601425b2d.
    * Will only read the first 16 bytes of `buffer`.
    */
  inline def stringify(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
}
