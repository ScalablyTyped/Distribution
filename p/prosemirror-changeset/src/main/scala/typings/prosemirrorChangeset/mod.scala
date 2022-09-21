package typings.prosemirrorChangeset

import typings.prosemirrorChangeset.anon.From
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorTransform.mod.StepMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-changeset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prosemirror-changeset", "Change")
  @js.native
  open class Change protected () extends StObject {
    def this(
      fromA: Double,
      toA: Double,
      fromB: Double,
      toB: Double,
      deleted: js.Array[Span],
      inserted: js.Array[Span]
    ) = this()
    
    def deleted: js.Array[Span] = js.native
    
    def fromA: Double = js.native
    
    def fromB: Double = js.native
    
    def inserted: js.Array[Span] = js.native
    
    def lenA: Double = js.native
    
    def lenB: Double = js.native
    
    def slice(startA: Double, endA: Double, startB: Double, endB: Double): Change = js.native
    
    def toA: Double = js.native
    
    def toB: Double = js.native
  }
  /* static members */
  object Change {
    
    @JSImport("prosemirror-changeset", "Change")
    @js.native
    val ^ : js.Any = js.native
    
    // :: ([Change], [Change], (any, any) → any) → [Change]
    // This merges two changesets (the end document of x should be the
    // start document of y) into a single one spanning the start of x to
    // the end of y.
    inline def merge(x: js.Array[Change], y: js.Array[Change], combine: js.Function2[/* a */ Any, /* b */ Any, Any]): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], combine.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
  }
  
  @JSImport("prosemirror-changeset", "ChangeSet")
  @js.native
  open class ChangeSet[S /* <: Schema[Any, Any] */] protected () extends StObject {
    def this(config: Any, changes: js.Array[Change]) = this()
    
    // :: (Node, [StepMap], union<[any], any>) → ChangeSet
    // Computes a new changeset by adding the given step maps and
    // metadata (either as an array, per-map, or as a single value to be
    // associated with all maps) to the current set. Will not mutate the
    // old set.
    //
    // Note that due to simplification that happens after each add,
    // incrementally adding steps might create a different final set
    // than adding all those changes at once, since different document
    // tokens might be matched during simplification depending on the
    // boundaries of the current changed ranges.
    def addSteps(newDoc: Node, maps: js.Array[StepMap]): ChangeSet[S] = js.native
    def addSteps(newDoc: Node, maps: js.Array[StepMap], data: Any): ChangeSet[S] = js.native
    
    // :: (ChangeSet, ?[StepMap]) → ?{from: number, to: number}
    // Compare two changesets and return the range in which they are
    // changed, if any. If the document changed between the maps, pass
    // the maps for the steps that changed it as second argument, and
    // make sure the method is called on the old set and passed the new
    // set. The returned positions will be in new document coordinates.
    def changedRange(b: ChangeSet[S]): js.UndefOr[From] = js.native
    def changedRange(b: ChangeSet[S], maps: js.Array[StepMap]): js.UndefOr[From] = js.native
    
    def changes: js.Array[Change] = js.native
    
    // :: (f: (range: Change) → any) → ChangeSet
    // Map the span's data values in the given set through a function
    // and construct a new set with the resulting data.
    def map(f: js.Function1[/* range */ Change, Any]): ChangeSet[S] = js.native
    
    // :: Node
    // The starting document of the change set.
    def startDoc: Node = js.native
  }
  /* static members */
  object ChangeSet {
    
    @JSImport("prosemirror-changeset", "ChangeSet")
    @js.native
    val ^ : js.Any = js.native
    
    // :: (Node, ?(a: any, b: any) → any) → ChangeSet
    // Create a changeset with the given base object and configuration.
    // The `combine` function is used to compare and combine metadata—it
    // should return null when metadata isn't compatible, and a combined
    // version for a merged range when it is.
    inline def create[S /* <: Schema[Any, Any] */](doc: Node): ChangeSet[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(doc.asInstanceOf[js.Any]).asInstanceOf[ChangeSet[S]]
    inline def create[S /* <: Schema[Any, Any] */](doc: Node, combine: js.Function2[/* a */ Any, /* b */ Any, Any]): ChangeSet[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(doc.asInstanceOf[js.Any], combine.asInstanceOf[js.Any])).asInstanceOf[ChangeSet[S]]
  }
  
  @JSImport("prosemirror-changeset", "Span")
  @js.native
  open class Span protected () extends StObject {
    def this(length: Double, data: Any) = this()
    
    def cut(length: Double): Span = js.native
    
    def data: Any = js.native
    
    def length: Double = js.native
  }
  /* static members */
  object Span {
    
    @JSImport("prosemirror-changeset", "Span")
    @js.native
    val ^ : js.Any = js.native
    
    inline def join(a: js.Array[Span], b: js.Array[Span], combine: js.Function2[/* a */ Any, /* b */ Any, Any]): js.Array[Span] = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], combine.asInstanceOf[js.Any])).asInstanceOf[js.Array[Span]]
    
    inline def len(spans: js.Array[Span]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("len")(spans.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def slice(spans: js.Array[Span], from: Double, to: Double): js.Array[Span] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(spans.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Array[Span]]
  }
  
  inline def simplifyChanges(changes: js.Array[Change], doc: Node): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyChanges")(changes.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
}
