package typings.relayCompiler

import typings.graphql.astMod.ASTNode
import typings.graphql.astMod.DefinitionNode
import typings.graphql.definitionMod.GraphQLType
import typings.graphql.mod.GraphQLSchema
import typings.relayCompiler.compilerContextMod.CompilerContextDocument
import typings.relayCompiler.compilerContextMod.IRTransform
import typings.relayCompiler.iRMod.Fragment
import typings.relayCompiler.iRMod.Location
import typings.relayCompiler.iRMod.Root
import typings.relayCompiler.irvisitorMod.NodeVisitor
import typings.relayCompiler.irvisitorMod.VisitNode
import typings.relayCompiler.relayCompilerErrorMod.UserError
import typings.relayCompiler.relayCompilerMainMod.Config
import typings.relayCompiler.schemaMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CompilerContext protected ()
    extends typings.relayCompiler.compilerContextMod.CompilerContext {
    def this(schema: Schema) = this()
  }
  
  @js.native
  class ConsoleReporter ()
    extends typings.relayCompiler.consoleReporterMod.ConsoleReporter
  
  @js.native
  class MultiReporter ()
    extends typings.relayCompiler.multiReporterMod.MultiReporter
  
  var transformASTSchema: js.Function2[/* schema */ GraphQLSchema, /* schemaExtensions */ js.Array[String], GraphQLSchema] = js.native
  def createUserError(message: String): UserError = js.native
  def createUserError(message: String, locations: js.UndefOr[scala.Nothing], nodes: js.Array[ASTNode]): UserError = js.native
  def createUserError(message: String, locations: js.Array[Location]): UserError = js.native
  def createUserError(message: String, locations: js.Array[Location], nodes: js.Array[ASTNode]): UserError = js.native
  def relayCompiler(config: Config): js.Promise[Unit] = js.native
  @js.native
  object ASTConvert extends js.Object {
    def transformASTSchema(schema: GraphQLSchema, schemaExtensions: js.Array[String]): GraphQLSchema = js.native
  }
  
  @js.native
  object IRTransforms extends js.Object {
    val codegenTransforms: js.Array[IRTransform] = js.native
    val commonTransforms: js.Array[IRTransform] = js.native
    val fragmentTransforms: js.Array[IRTransform] = js.native
    val printTransforms: js.Array[IRTransform] = js.native
    val queryTransforms: js.Array[IRTransform] = js.native
    val schemaExtensions: js.Array[String] = js.native
  }
  
  @js.native
  object IRVisitor extends js.Object {
    def visit(root: VisitNode, visitor: NodeVisitor): js.Any = js.native
  }
  
  @js.native
  object Parser extends js.Object {
    def parse(schema: Schema, text: String): js.Array[Root | Fragment] = js.native
    def parse(schema: Schema, text: String, filename: String): js.Array[Root | Fragment] = js.native
    def transform(schema: Schema, documents: js.Array[DefinitionNode]): js.Array[Root | Fragment] = js.native
  }
  
  @js.native
  object Printer extends js.Object {
    def print(node: CompilerContextDocument): String = js.native
  }
  
  @js.native
  object SchemaUtils extends js.Object {
    def isAbstractType(`type`: GraphQLType): Boolean = js.native
  }
  
}

