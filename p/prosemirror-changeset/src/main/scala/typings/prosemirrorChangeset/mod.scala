package typings.prosemirrorChangeset

import typings.prosemirrorChangeset.anon.From
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorTransform.mod.StepMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-changeset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Stores metadata for a part of a change.
  */
  @JSImport("prosemirror-changeset", "Span")
  @js.native
  open class Span[Data] () extends StObject {
    
    /**
      The data associated with this span.
      */
    val data: Data = js.native
    
    /**
      The length of this span.
      */
    val length: Double = js.native
  }
  
  /**
  Simplifies a set of changes for presentation. This makes the
  assumption that having both insertions and deletions within a word
  is confusing, and, when such changes occur without a word boundary
  between them, they should be expanded to cover the entire set of
  words (in the new document) they touch. An exception is made for
  single-character replacements.
  */
  inline def simplifyChanges(changes: js.Array[Change[Any]], doc: Node): js.Array[Change[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyChanges")(changes.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change[Any]]]
  
  /**
  A replaced range with metadata associated with it.
  */
  trait Change[Data] extends StObject {
    
    /**
      Data associated with the deleted content. The length of these
      spans adds up to `this.toA - this.fromA`.
      */
    val deleted: js.Array[Span[Data]]
    
    /**
      The start of the range deleted/replaced in the old document.
      */
    val fromA: Double
    
    /**
      The start of the range inserted in the new document.
      */
    val fromB: Double
    
    /**
      Data associated with the inserted content. Length adds up to
      `this.toB - this.toA`.
      */
    val inserted: js.Array[Span[Data]]
    
    /**
      The end of the range in the old document.
      */
    val toA: Double
    
    /**
      The end of the range in the new document.
      */
    val toB: Double
  }
  object Change {
    
    inline def apply[Data](
      deleted: js.Array[Span[Data]],
      fromA: Double,
      fromB: Double,
      inserted: js.Array[Span[Data]],
      toA: Double,
      toB: Double
    ): Change[Data] = {
      val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], fromA = fromA.asInstanceOf[js.Any], fromB = fromB.asInstanceOf[js.Any], inserted = inserted.asInstanceOf[js.Any], toA = toA.asInstanceOf[js.Any], toB = toB.asInstanceOf[js.Any])
      __obj.asInstanceOf[Change[Data]]
    }
    
    extension [Self <: Change[?], Data](x: Self & Change[Data]) {
      
      inline def setDeleted(value: js.Array[Span[Data]]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      inline def setDeletedVarargs(value: Span[Data]*): Self = StObject.set(x, "deleted", js.Array(value*))
      
      inline def setFromA(value: Double): Self = StObject.set(x, "fromA", value.asInstanceOf[js.Any])
      
      inline def setFromB(value: Double): Self = StObject.set(x, "fromB", value.asInstanceOf[js.Any])
      
      inline def setInserted(value: js.Array[Span[Data]]): Self = StObject.set(x, "inserted", value.asInstanceOf[js.Any])
      
      inline def setInsertedVarargs(value: Span[Data]*): Self = StObject.set(x, "inserted", js.Array(value*))
      
      inline def setToA(value: Double): Self = StObject.set(x, "toA", value.asInstanceOf[js.Any])
      
      inline def setToB(value: Double): Self = StObject.set(x, "toB", value.asInstanceOf[js.Any])
    }
  }
  
  /**
  A change set tracks the changes to a document from a given point
  in the past. It condenses a number of step maps down to a flat
  sequence of replacements, and simplifies replacments that
  partially undo themselves by comparing their content.
  */
  @js.native
  trait ChangeSet[Data] extends StObject {
    
    /**
      Computes a new changeset by adding the given step maps and
      metadata (either as an array, per-map, or as a single value to be
      associated with all maps) to the current set. Will not mutate the
      old set.
      
      Note that due to simplification that happens after each add,
      incrementally adding steps might create a different final set
      than adding all those changes at once, since different document
      tokens might be matched during simplification depending on the
      boundaries of the current changed ranges.
      */
    def addSteps(newDoc: Node, maps: js.Array[StepMap], data: Data): ChangeSet[Data] = js.native
    def addSteps(newDoc: Node, maps: js.Array[StepMap], data: js.Array[Data]): ChangeSet[Data] = js.native
    
    /**
      Compare two changesets and return the range in which they are
      changed, if any. If the document changed between the maps, pass
      the maps for the steps that changed it as second argument, and
      make sure the method is called on the old set and passed the new
      set. The returned positions will be in new document coordinates.
      */
    def changedRange(b: ChangeSet[Any]): From | Null = js.native
    def changedRange(b: ChangeSet[Any], maps: js.Array[StepMap]): From | Null = js.native
    
    /**
      Replaced regions.
      */
    val changes: js.Array[Change[Data]] = js.native
    
    /**
      Map the span's data values in the given set through a function
      and construct a new set with the resulting data.
      */
    def map(f: js.Function1[/* range */ Span[Data], Data]): ChangeSet[Data] = js.native
    
    /**
      The starting document of the change set.
      */
    def startDoc: Node = js.native
  }
}
