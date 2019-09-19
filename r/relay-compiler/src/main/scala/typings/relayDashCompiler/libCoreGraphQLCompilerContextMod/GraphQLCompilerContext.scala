package typings.relayDashCompiler.libCoreGraphQLCompilerContextMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.relayDashCompiler.libCoreGraphQLIRMod.Fragment
import typings.relayDashCompiler.libCoreGraphQLIRMod.Location
import typings.relayDashCompiler.libCoreGraphQLIRMod.Root
import typings.relayDashCompiler.libReportersGraphQLReporterMod.GraphQLReporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/core/GraphQLCompilerContext", "GraphQLCompilerContext")
@js.native
class GraphQLCompilerContext protected () extends js.Object {
  def this(serverSchema: GraphQLSchema) = this()
  def this(serverSchema: GraphQLSchema, clientSchema: GraphQLSchema) = this()
  def add(node: CompilerContextDocument): GraphQLCompilerContext = js.native
  def addAll(nodes: js.Array[CompilerContextDocument]): GraphQLCompilerContext = js.native
  def applyTransform(transform: IRTransform): GraphQLCompilerContext = js.native
  def applyTransform(transform: IRTransform, reporter: GraphQLReporter): GraphQLCompilerContext = js.native
  def applyTransforms(transforms: js.Array[IRTransform]): GraphQLCompilerContext = js.native
  def applyTransforms(transforms: js.Array[IRTransform], reporter: GraphQLReporter): GraphQLCompilerContext = js.native
  def applyValidations(validations: js.Array[IRValidation]): Unit = js.native
  def applyValidations(validations: js.Array[IRValidation], reporter: GraphQLReporter): Unit = js.native
  def documents(): js.Array[CompilerContextDocument] = js.native
  def forEachDocument(fn: js.Function1[/* doc */ CompilerContextDocument, Unit]): Unit = js.native
  def get(name: String): js.UndefOr[CompilerContextDocument] = js.native
  def getFragment(name: String): Fragment = js.native
  def getFragment(name: String, referencedFrom: Location): Fragment = js.native
  def getRoot(name: String): Root = js.native
  def remove(name: String): GraphQLCompilerContext = js.native
  def replace(node: CompilerContextDocument): GraphQLCompilerContext = js.native
  def withMutations(fn: js.Function1[/* context */ this.type, this.type]): GraphQLCompilerContext = js.native
}

