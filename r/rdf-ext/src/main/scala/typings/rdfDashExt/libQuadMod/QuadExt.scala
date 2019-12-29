package typings.rdfDashExt.libQuadMod

import typings.rdfDashExt.Anon_Graph
import typings.rdfDashExt.libBlankNodeMod.BlankNodeExt
import typings.rdfDashExt.libDefaultGraphMod.DefaultGraphExt
import typings.rdfDashExt.libLiteralMod.LiteralExt
import typings.rdfDashExt.libNamedNodeMod.NamedNodeExt
import typings.rdfDashExt.libVariableMod.VariableExt
import typings.rdfDashJs.rdfDashJsMod.BaseQuad
import typings.rdfDashJs.rdfDashJsMod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuadExt extends Quad {
  @JSName("graph")
  var graph_QuadExt: DefaultGraphExt | NamedNodeExt | BlankNodeExt | VariableExt
  @JSName("object")
  var object_QuadExt: NamedNodeExt | LiteralExt | BlankNodeExt | VariableExt
  @JSName("predicate")
  var predicate_QuadExt: NamedNodeExt | VariableExt
  @JSName("subject")
  var subject_QuadExt: NamedNodeExt | BlankNodeExt | VariableExt
  def toCanonical(): String
  def toJSON(): Anon_Graph
}

object QuadExt {
  @scala.inline
  def apply(
    equals: BaseQuad => Boolean,
    graph: DefaultGraphExt | NamedNodeExt | BlankNodeExt | VariableExt,
    `object`: NamedNodeExt | LiteralExt | BlankNodeExt | VariableExt,
    predicate: NamedNodeExt | VariableExt,
    subject: NamedNodeExt | BlankNodeExt | VariableExt,
    toCanonical: () => String,
    toJSON: () => Anon_Graph
  ): QuadExt = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], toCanonical = js.Any.fromFunction0(toCanonical), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadExt]
  }
}

