package typings.reactDocgenTypescript.parserMod

import typings.typescript.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileParser extends js.Object {
  
  def parse(filePathOrPaths: String): js.Array[ComponentDoc] = js.native
  def parse(filePathOrPaths: js.Array[String]): js.Array[ComponentDoc] = js.native
  
  def parseWithProgramProvider(filePathOrPaths: String): js.Array[ComponentDoc] = js.native
  def parseWithProgramProvider(filePathOrPaths: String, programProvider: js.Function0[Program]): js.Array[ComponentDoc] = js.native
  def parseWithProgramProvider(filePathOrPaths: js.Array[String]): js.Array[ComponentDoc] = js.native
  def parseWithProgramProvider(filePathOrPaths: js.Array[String], programProvider: js.Function0[Program]): js.Array[ComponentDoc] = js.native
}
