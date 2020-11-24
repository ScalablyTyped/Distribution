package typings.rdfLoadersRegistry.mod

import typings.clownface.mod.GraphPointer
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.NamedNode
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Term
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderRegistry extends js.Object {
  
  var _literalLoaders: Map[String, _] = js.native
  
  var _nodeLoaders: Map[String, _] = js.native
  
  def load[T /* <: js.Any */, // tslint:disable-next-line:no-unnecessary-generics
  TLoader /* <: Loader[T, TOptions] */, TOptions](node: GraphPointer[Term, DatasetCore[Quad, Quad]]): js.Promise[T | Null] = js.native
  def load[T /* <: js.Any */, // tslint:disable-next-line:no-unnecessary-generics
  TLoader /* <: Loader[T, TOptions] */, TOptions](node: GraphPointer[Term, DatasetCore[Quad, Quad]], options: TOptions): js.Promise[T | Null] = js.native
  
  def loader(node: GraphPointer[Term, DatasetCore[Quad, Quad]]): (Loader[_, _]) | Null = js.native
  
  def registerLiteralLoader(datatype: String, loader: Loader[_, _]): Unit = js.native
  def registerLiteralLoader(datatype: NamedNode[String], loader: Loader[_, _]): Unit = js.native
  
  def registerNodeLoader(`type`: String, loader: Loader[_, _]): Unit = js.native
  def registerNodeLoader(`type`: NamedNode[String], loader: Loader[_, _]): Unit = js.native
}
