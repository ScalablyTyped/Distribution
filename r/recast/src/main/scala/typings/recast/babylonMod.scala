package typings.recast

import typings.babelTypes.mod.File_
import typings.recast.babelMod.BabelParser
import typings.recast.babelOptionsMod.Overrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recast/parsers/babylon", JSImport.Namespace)
@js.native
object babylonMod extends js.Object {
  
  def parse(source: String): File_ = js.native
  def parse(source: String, options: Overrides): File_ = js.native
  
  val parser: BabelParser = js.native
}
