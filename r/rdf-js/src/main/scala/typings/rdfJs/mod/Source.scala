package typings.rdfJs.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source[Q /* <: BaseQuad */] extends js.Object {
  
  /**
    * Returns a stream that processes all quads matching the pattern.
    *
    * @param subject   The optional exact subject or subject regex to match.
    * @param predicate The optional exact predicate or predicate regex to match.
    * @param object    The optional exact object or object regex to match.
    * @param graph     The optional exact graph or graph regex to match.
    * @return The resulting quad stream.
    */
  def `match`(
    subject: js.UndefOr[Term | RegExp],
    predicate: js.UndefOr[Term | RegExp],
    `object`: js.UndefOr[Term | RegExp],
    graph: js.UndefOr[Term | RegExp]
  ): Stream[Q] = js.native
}
object Source {
  
  @scala.inline
  def apply[Q /* <: BaseQuad */](
    `match`: (js.UndefOr[Term | RegExp], js.UndefOr[Term | RegExp], js.UndefOr[Term | RegExp], js.UndefOr[Term | RegExp]) => Stream[Q]
  ): Source[Q] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction4(`match`))
    __obj.asInstanceOf[Source[Q]]
  }
  
  @scala.inline
  implicit class SourceOps[Self <: Source[_], Q /* <: BaseQuad */] (val x: Self with Source[Q]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMatch(
      value: (js.UndefOr[Term | RegExp], js.UndefOr[Term | RegExp], js.UndefOr[Term | RegExp], js.UndefOr[Term | RegExp]) => Stream[Q]
    ): Self = this.set("match", js.Any.fromFunction4(value))
  }
}
