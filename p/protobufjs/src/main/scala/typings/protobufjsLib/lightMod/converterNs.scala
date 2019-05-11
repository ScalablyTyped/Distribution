package typings
package protobufjsLib.lightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/light", "converter")
@js.native
object converterNs extends js.Object {
  /**
    * Generates a plain object to runtime message converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  def fromObject(mtype: protobufjsLib.protobufjsMod.Type): protobufjsLib.protobufjsMod.Codegen = js.native
  /**
    * Generates a runtime message to plain object converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  def toObject(mtype: protobufjsLib.protobufjsMod.Type): protobufjsLib.protobufjsMod.Codegen = js.native
}

