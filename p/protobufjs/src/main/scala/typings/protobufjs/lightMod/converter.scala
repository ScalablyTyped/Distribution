package typings.protobufjs.lightMod

import typings.protobufjs.mod.Codegen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object converter {
  
  /**
    * Generates a plain object to runtime message converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  @JSImport("protobufjs/light", "converter.fromObject")
  @js.native
  def fromObject(mtype: typings.protobufjs.mod.Type): Codegen = js.native
  
  /**
    * Generates a runtime message to plain object converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  @JSImport("protobufjs/light", "converter.toObject")
  @js.native
  def toObject(mtype: typings.protobufjs.mod.Type): Codegen = js.native
}
