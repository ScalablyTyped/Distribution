package typings.recast

import typings.recast.anon.End
import typings.recast.anon.Line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recast/lib/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def comparePos(pos1: js.Any, pos2: js.Any): Double = js.native
  
  def composeSourceMaps(formerMap: js.Any, latterMap: js.Any): js.Any = js.native
  
  def copyPos(pos: js.Any): Line = js.native
  
  def fixFaultyLocations(node: js.Any, lines: js.Any): Unit = js.native
  
  def getOption(options: js.Any, key: js.Any, defaultValue: js.Any): js.Any = js.native
  
  def getParentExportDeclaration(path: js.Any): js.Any = js.native
  
  def getTrueLoc(node: js.Any, lines: js.Any): End | Null = js.native
  
  def getUnionOfKeys(args: js.Any*): js.Any = js.native
  
  def isExportDeclaration(node: js.Any): Boolean = js.native
  
  def isTrailingCommaEnabled(options: js.Any, context: js.Any): Boolean = js.native
}
