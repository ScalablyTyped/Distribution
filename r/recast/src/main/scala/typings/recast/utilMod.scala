package typings.recast

import typings.recast.anon.End
import typings.recast.anon.Line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("recast/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def comparePos(pos1: js.Any, pos2: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("comparePos")(pos1.asInstanceOf[js.Any], pos2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def composeSourceMaps(formerMap: js.Any, latterMap: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("composeSourceMaps")(formerMap.asInstanceOf[js.Any], latterMap.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def copyPos(pos: js.Any): Line = ^.asInstanceOf[js.Dynamic].applyDynamic("copyPos")(pos.asInstanceOf[js.Any]).asInstanceOf[Line]
  
  inline def fixFaultyLocations(node: js.Any, lines: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixFaultyLocations")(node.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getOption(options: js.Any, key: js.Any, defaultValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getOption")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getParentExportDeclaration(path: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getParentExportDeclaration")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getTrueLoc(node: js.Any, lines: js.Any): End | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getTrueLoc")(node.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[End | Null]
  
  inline def getUnionOfKeys(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnionOfKeys")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def isExportDeclaration(node: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTrailingCommaEnabled(options: js.Any, context: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTrailingCommaEnabled")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
