package typings.protobufjs.minimalMod

import typings.protobufjs.mod.IParseOptions
import typings.protobufjs.mod.IParserResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protobufjs/minimal", "parse")
@js.native
object parse extends js.Object {
  
  def apply(source: String): IParserResult = js.native
  def apply(source: String, options: IParseOptions): IParserResult = js.native
  def apply(source: String, root: typings.protobufjs.mod.Root): IParserResult = js.native
  def apply(source: String, root: typings.protobufjs.mod.Root, options: IParseOptions): IParserResult = js.native
}
