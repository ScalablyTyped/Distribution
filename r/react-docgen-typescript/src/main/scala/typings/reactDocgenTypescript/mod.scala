package typings.reactDocgenTypescript

import typings.reactDocgenTypescript.parserMod.ComponentDoc
import typings.reactDocgenTypescript.parserMod.FileParser
import typings.reactDocgenTypescript.parserMod.ParserOptions
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-docgen-typescript", "Parser")
  @js.native
  class Parser protected ()
    extends typings.reactDocgenTypescript.parserMod.Parser {
    def this(program: Program, opts: ParserOptions) = this()
  }
  
  @JSImport("react-docgen-typescript", "getDefaultExportForFile")
  @js.native
  def getDefaultExportForFile(source: SourceFile): String = js.native
  
  @JSImport("react-docgen-typescript", "parse")
  @js.native
  def parse(filePathOrPaths: String): js.Array[ComponentDoc] = js.native
  @JSImport("react-docgen-typescript", "parse")
  @js.native
  def parse(filePathOrPaths: String, parserOpts: ParserOptions): js.Array[ComponentDoc] = js.native
  @JSImport("react-docgen-typescript", "parse")
  @js.native
  def parse(filePathOrPaths: js.Array[String]): js.Array[ComponentDoc] = js.native
  @JSImport("react-docgen-typescript", "parse")
  @js.native
  def parse(filePathOrPaths: js.Array[String], parserOpts: ParserOptions): js.Array[ComponentDoc] = js.native
  
  @JSImport("react-docgen-typescript", "withCompilerOptions")
  @js.native
  def withCompilerOptions(compilerOptions: CompilerOptions): FileParser = js.native
  @JSImport("react-docgen-typescript", "withCompilerOptions")
  @js.native
  def withCompilerOptions(compilerOptions: CompilerOptions, parserOpts: ParserOptions): FileParser = js.native
  
  @JSImport("react-docgen-typescript", "withCustomConfig")
  @js.native
  def withCustomConfig(tsconfigPath: String, parserOpts: ParserOptions): FileParser = js.native
  
  @JSImport("react-docgen-typescript", "withDefaultConfig")
  @js.native
  def withDefaultConfig(): FileParser = js.native
  @JSImport("react-docgen-typescript", "withDefaultConfig")
  @js.native
  def withDefaultConfig(parserOpts: ParserOptions): FileParser = js.native
}
