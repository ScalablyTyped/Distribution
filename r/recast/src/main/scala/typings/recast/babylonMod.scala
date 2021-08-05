package typings.recast

import typings.babelTypes.mod.File_
import typings.recast.babelMod.BabelParser
import typings.recast.babelOptionsMod.Overrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object babylonMod {
  
  @JSImport("recast/parsers/babylon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(source: String): File_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[File_]
  inline def parse(source: String, options: Overrides): File_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[File_]
  
  @JSImport("recast/parsers/babylon", "parser")
  @js.native
  val parser: BabelParser = js.native
}
