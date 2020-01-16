package typings.rdfDashTransformDashTripleDashToDashQuad.rdfDashTransformDashTripleDashToDashQuadMod

import typings.node.Anon_End
import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Transform
import typings.rdfDashJs.rdfDashJsMod.BaseQuad
import typings.rdfDashJs.rdfDashJsMod.Quad_Graph
import typings.rdfDashJs.rdfDashJsMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-transform-triple-to-quad", JSImport.Namespace)
@js.native
class ^[Q /* <: BaseQuad */] ()
  extends Transform
     with Stream[Q] {
  def this(graph: Quad_Graph) = this()
  def this(graph: Quad_Graph, options: TripleToQuadTransformOptions) = this()
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
  /* InferMemberOverrides */
  override def read(): (String | Buffer) with Q = js.native
}

