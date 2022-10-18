package typings.reactDocgenTypescript

import typings.reactDocgenTypescript.libParserMod.ComponentDoc
import typings.reactDocgenTypescript.libParserMod.FileParser
import typings.reactDocgenTypescript.libParserMod.ParserOptions
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-docgen-typescript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-docgen-typescript", "Parser")
  @js.native
  open class Parser protected ()
    extends typings.reactDocgenTypescript.libParserMod.Parser {
    def this(program: Program, opts: ParserOptions) = this()
  }
  
  inline def getDefaultExportForFile(source: SourceFile): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultExportForFile")(source.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(filePathOrPaths: String): js.Array[ComponentDoc] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filePathOrPaths.asInstanceOf[js.Any]).asInstanceOf[js.Array[ComponentDoc]]
  inline def parse(filePathOrPaths: String, parserOpts: ParserOptions): js.Array[ComponentDoc] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filePathOrPaths.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentDoc]]
  inline def parse(filePathOrPaths: js.Array[String]): js.Array[ComponentDoc] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filePathOrPaths.asInstanceOf[js.Any]).asInstanceOf[js.Array[ComponentDoc]]
  inline def parse(filePathOrPaths: js.Array[String], parserOpts: ParserOptions): js.Array[ComponentDoc] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filePathOrPaths.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentDoc]]
  
  inline def withCompilerOptions(compilerOptions: CompilerOptions): FileParser = ^.asInstanceOf[js.Dynamic].applyDynamic("withCompilerOptions")(compilerOptions.asInstanceOf[js.Any]).asInstanceOf[FileParser]
  inline def withCompilerOptions(compilerOptions: CompilerOptions, parserOpts: ParserOptions): FileParser = (^.asInstanceOf[js.Dynamic].applyDynamic("withCompilerOptions")(compilerOptions.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any])).asInstanceOf[FileParser]
  
  inline def withCustomConfig(tsconfigPath: String, parserOpts: ParserOptions): FileParser = (^.asInstanceOf[js.Dynamic].applyDynamic("withCustomConfig")(tsconfigPath.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any])).asInstanceOf[FileParser]
  
  inline def withDefaultConfig(): FileParser = ^.asInstanceOf[js.Dynamic].applyDynamic("withDefaultConfig")().asInstanceOf[FileParser]
  inline def withDefaultConfig(parserOpts: ParserOptions): FileParser = ^.asInstanceOf[js.Dynamic].applyDynamic("withDefaultConfig")(parserOpts.asInstanceOf[js.Any]).asInstanceOf[FileParser]
}
