package typings.recast

import typings.recast.anon.End
import typings.recast.anon.Line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("recast/lib/util", "comparePos")
  @js.native
  def comparePos(pos1: js.Any, pos2: js.Any): Double = js.native
  
  @JSImport("recast/lib/util", "composeSourceMaps")
  @js.native
  def composeSourceMaps(formerMap: js.Any, latterMap: js.Any): js.Any = js.native
  
  @JSImport("recast/lib/util", "copyPos")
  @js.native
  def copyPos(pos: js.Any): Line = js.native
  
  @JSImport("recast/lib/util", "fixFaultyLocations")
  @js.native
  def fixFaultyLocations(node: js.Any, lines: js.Any): Unit = js.native
  
  @JSImport("recast/lib/util", "getOption")
  @js.native
  def getOption(options: js.Any, key: js.Any, defaultValue: js.Any): js.Any = js.native
  
  @JSImport("recast/lib/util", "getParentExportDeclaration")
  @js.native
  def getParentExportDeclaration(path: js.Any): js.Any = js.native
  
  @JSImport("recast/lib/util", "getTrueLoc")
  @js.native
  def getTrueLoc(node: js.Any, lines: js.Any): End | Null = js.native
  
  @JSImport("recast/lib/util", "getUnionOfKeys")
  @js.native
  def getUnionOfKeys(args: js.Any*): js.Any = js.native
  
  @JSImport("recast/lib/util", "isExportDeclaration")
  @js.native
  def isExportDeclaration(node: js.Any): Boolean = js.native
  
  @JSImport("recast/lib/util", "isTrailingCommaEnabled")
  @js.native
  def isTrailingCommaEnabled(options: js.Any, context: js.Any): Boolean = js.native
}
