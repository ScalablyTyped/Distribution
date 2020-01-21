package typings.relayCompiler

import typings.graphql.astMod.ASTNode
import typings.graphql.astMod.DefinitionNode
import typings.graphql.definitionMod.GraphQLType
import typings.graphql.mod.GraphQLSchema
import typings.relayCompiler.graphQLCompilerContextMod.CompilerContextDocument
import typings.relayCompiler.graphQLCompilerContextMod.IRTransform
import typings.relayCompiler.graphQLConsoleReporterMod.GraphQLMultiReporter
import typings.relayCompiler.graphQLIRMod.Fragment
import typings.relayCompiler.graphQLIRMod.Location
import typings.relayCompiler.graphQLIRMod.Root
import typings.relayCompiler.graphQLIRVisitorMod.NodeVisitor
import typings.relayCompiler.graphQLIRVisitorMod.VisitNode
import typings.relayCompiler.relayCompilerErrorMod.UserError
import typings.relayCompiler.relayCompilerMainMod.Config
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ConsoleReporter () extends GraphQLMultiReporter {
    /* CompleteClass */
    override def reportError(caughtLocation: String, error: Error): Unit = js.native
    /* CompleteClass */
    override def reportMessage(message: String): Unit = js.native
    /* CompleteClass */
    override def reportTime(name: String, ms: Double): Unit = js.native
  }
  
  @js.native
  class GraphQLCompilerContext protected ()
    extends typings.relayCompiler.graphQLCompilerContextMod.GraphQLCompilerContext {
    def this(serverSchema: GraphQLSchema) = this()
    def this(serverSchema: GraphQLSchema, clientSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class MultiReporter ()
    extends typings.relayCompiler.graphQLMultiReporterMod.GraphQLMultiReporter {
    /* CompleteClass */
    override def reportError(caughtLocation: String, error: Error): Unit = js.native
    /* CompleteClass */
    override def reportMessage(message: String): Unit = js.native
    /* CompleteClass */
    override def reportTime(name: String, ms: Double): Unit = js.native
  }
  
  var transformASTSchema: js.Function2[/* schema */ GraphQLSchema, /* transforms */ js.Array[String], GraphQLSchema] = js.native
  def createUserError(message: String): UserError = js.native
  def createUserError(message: String, locations: js.Array[Location]): UserError = js.native
  def createUserError(message: String, locations: js.Array[Location], nodes: js.Array[ASTNode]): UserError = js.native
  def relayCompiler(config: Config): js.Promise[Unit] = js.native
  @js.native
  object ASTConvert extends js.Object {
    def transformASTSchema(schema: GraphQLSchema, transforms: js.Array[String]): GraphQLSchema = js.native
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
    def parse(schema: GraphQLSchema, text: String): js.Array[Root | Fragment] = js.native
    def parse(schema: GraphQLSchema, text: String, filename: String): js.Array[Root | Fragment] = js.native
    def transform(schema: GraphQLSchema, documents: js.Array[DefinitionNode]): js.Array[Root | Fragment] = js.native
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

