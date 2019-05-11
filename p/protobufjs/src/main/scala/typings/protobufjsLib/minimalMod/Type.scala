package typings
package protobufjsLib.minimalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", "Type")
@js.native
class Type protected ()
  extends protobufjsLib.protobufjsMod.Type {
  /**
    * Constructs a new reflected message type instance.
    * @param name Message name
    * @param [options] Declared options
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
}

/* static members */
@JSImport("protobufjs/minimal", "Type")
@js.native
object Type extends js.Object {
  /**
    * Type decorator (TypeScript).
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Decorator function
    */
  def d[T /* <: protobufjsLib.protobufjsMod.Message[T] */](): protobufjsLib.protobufjsMod.TypeDecorator[T] = js.native
  def d[T /* <: protobufjsLib.protobufjsMod.Message[T] */](typeName: java.lang.String): protobufjsLib.protobufjsMod.TypeDecorator[T] = js.native
  /**
    * Creates a message type from a message type descriptor.
    * @param name Message name
    * @param json Message type descriptor
    * @returns Created message type
    */
  def fromJSON(name: java.lang.String, json: protobufjsLib.protobufjsMod.IType): protobufjsLib.protobufjsMod.Type = js.native
  /**
    * Generates a constructor function for the specified type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  def generateConstructor(mtype: protobufjsLib.protobufjsMod.Type): protobufjsLib.protobufjsMod.Codegen = js.native
}

