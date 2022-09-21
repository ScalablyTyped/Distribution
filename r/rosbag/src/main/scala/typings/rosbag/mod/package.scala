package typings.rosbag.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.rosbag.mod.^
import typings.std.Blob
import typings.std.File
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Extracts key/value pair of information out of a buffer
  * @param buffer - The buffer to extract key/value piece of information from.
  */
inline def extractFields(buffer: Buffer): StringDictionary[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractFields")(buffer.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Buffer]]

/**
  * Reads a Time object out of a buffer at the given offset
  * @param buffer - Buffer
  * @param offset - Offset
  */
inline def extractTime(buffer: Buffer, offset: Double): Time = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTime")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Time]

inline def open(filename: String): js.Promise[Bag] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Bag]]
inline def open(filename: Blob): js.Promise[Bag] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Bag]]
/**
  * Opens a bag file and return a bag readable object
  * @param filename - File path or Blob depening on evironment (either node or web)
  */
inline def open(filename: File): js.Promise[Bag] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Bag]]

/**
  * Given a raw message definition string, parse it into an object representation.
  * @param messageDefinition - ROSBAG message definition string.
  */
inline def parseMessageDefinition(messageDefinition: String): js.Array[RosMsgDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMessageDefinition")(messageDefinition.asInstanceOf[js.Any]).asInstanceOf[js.Array[RosMsgDefinition]]

/**
  * A function that must be called with either an error or a value, but not both.
  * @param error - Error object.
  * @param value - passed value to any callback function.
  */
type Callback[T] = (js.Function2[/* error */ js.Error, /* value */ Unit, Unit]) & (js.Function2[/* error */ Null, /* value */ T, Unit])

type Decompress = StringDictionary[js.Function2[/* buffer */ Buffer, /* size */ Double, Buffer]]

type rosPrimitiveTypes = Set[rosType]
