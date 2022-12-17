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
  A replaced range with metadata associated with it.
  */
  @JSImport("prosemirror-changeset", "Change")
  @js.native
  open class Change[Data] () extends StObject {
    
    /**
      Data associated with the deleted content. The length of these
      spans adds up to `this.toA - this.fromA`.
      */
    val deleted: js.Array[Span[Data]] = js.native
    
    /**
      The start of the range deleted/replaced in the old document.
      */
    val fromA: Double = js.native
    
    /**
      The start of the range inserted in the new document.
      */
    val fromB: Double = js.native
    
    /**
      Data associated with the inserted content. Length adds up to
      `this.toB - this.toA`.
      */
    val inserted: js.Array[Span[Data]] = js.native
    
    /**
      The end of the range in the old document.
      */
    val toA: Double = js.native
    
    /**
      The end of the range in the new document.
      */
    val toB: Double = js.native
  }
  object Change {
    
    @JSImport("prosemirror-changeset", "Change")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      This merges two changesets (the end document of x should be the
      start document of y) into a single one spanning the start of x to
      the end of y.
      */
    /* static member */
    inline def merge[Data](
      x: js.Array[Change[Data]],
      y: js.Array[Change[Data]],
      combine: js.Function2[/* dataA */ Data, /* dataB */ Data, Data]
    ): js.Array[Change[Data]] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], combine.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change[Data]]]
  }
  
  /**
  A change set tracks the changes to a document from a given point
  in the past. It condenses a number of step maps down to a flat
  sequence of replacements, and simplifies replacments that
  partially undo themselves by comparing their content.
  */
  @JSImport("prosemirror-changeset", "ChangeSet")
  @js.native
  open class ChangeSet[Data] () extends StObject {
    
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
  object ChangeSet {
    
    @JSImport("prosemirror-changeset", "ChangeSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Create a changeset with the given base object and configuration.
      The `combine` function is used to compare and combine metadata—it
      should return null when metadata isn't compatible, and a combined
      version for a merged range when it is.
      */
    /* static member */
    inline def create[Data](doc: Node): ChangeSet[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(doc.asInstanceOf[js.Any]).asInstanceOf[ChangeSet[Data]]
    inline def create[Data](doc: Node, combine: js.Function2[/* dataA */ Data, /* dataB */ Data, Data]): ChangeSet[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(doc.asInstanceOf[js.Any], combine.asInstanceOf[js.Any])).asInstanceOf[ChangeSet[Data]]
  }
  
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
}
