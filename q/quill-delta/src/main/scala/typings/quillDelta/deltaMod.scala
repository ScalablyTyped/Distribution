package typings.quillDelta

import typings.fastDiff.mod.CursorInfo
import typings.quillDelta.anon.Ops
import typings.quillDelta.iteratorMod.default
import typings.quillDelta.mod.AttributeMap
import typings.quillDelta.opMod.Op
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deltaMod {
  
  @JSImport("quill-delta/dist/Delta", JSImport.Namespace)
  @js.native
  class ^ () extends Delta {
    def this(ops: js.Array[Op]) = this()
    def this(ops: Ops) = this()
  }
  
  /* static member */
  object AttributeMap {
    
    @JSImport("quill-delta/dist/Delta", "AttributeMap.compose")
    @js.native
    def compose(a: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], keepNull: Boolean): js.UndefOr[typings.quillDelta.mod.AttributeMap] = js.native
    @JSImport("quill-delta/dist/Delta", "AttributeMap.compose")
    @js.native
    def compose(a: js.UndefOr[scala.Nothing], b: typings.quillDelta.mod.AttributeMap, keepNull: Boolean): js.UndefOr[typings.quillDelta.mod.AttributeMap] = js.native
    @JSImport("quill-delta/dist/Delta", "AttributeMap.compose")
    @js.native
    def compose(a: typings.quillDelta.mod.AttributeMap, b: js.UndefOr[scala.Nothing], keepNull: Boolean): js.UndefOr[typings.quillDelta.mod.AttributeMap] = js.native
    @JSImport("quill-delta/dist/Delta", "AttributeMap.compose")
    @js.native
    def compose(a: typings.quillDelta.mod.AttributeMap, b: typings.quillDelta.mod.AttributeMap, keepNull: Boolean): js.UndefOr[typings.quillDelta.mod.AttributeMap] = js.native
    
    @JSImport("quill-delta/dist/Delta", "AttributeMap.diff")
    @js.native
    def diff(): js.UndefOr[typings.quillDelta.mod.AttributeMap] = js.native
    @JSImport("quill-delta/dist/Delta", "AttributeMap.diff")
    @js.native
    def diff(a: js.UndefOr[scala.Nothing], b: typings.quillDelta.mod.AttributeMap): js.UndefOr[typings.quillDelta.mod.AttributeMap] = js.native
    @JSImport("quill-delta/dist/Delta", "AttributeMap.diff")
    @js.native
    def diff(a: typings.quillDelta.mod.AttributeMap): js.UndefOr[typings.quillDelta.mod.AttributeMap] = js.native
    @JSImport("quill-delta/dist/Delta", "AttributeMap.diff")
    @js.native
    def diff(a: typings.quillDelta.mod.AttributeMap, b: typings.quillDelta.mod.AttributeMap): js.UndefOr[typings.quillDelta.mod.AttributeMap] = js.native
    
    @JSImport("quill-delta/dist/Delta", "AttributeMap.invert")
    @js.native
    def invert(): typings.quillDelta.mod.AttributeMap = js.native
    @JSImport("quill-delta/dist/Delta", "AttributeMap.invert")
    @js.native
    def invert(attr: js.UndefOr[scala.Nothing], base: typings.quillDelta.mod.AttributeMap): typings.quillDelta.mod.AttributeMap = js.native
    @JSImport("quill-delta/dist/Delta", "AttributeMap.invert")
    @js.native
    def invert(attr: typings.quillDelta.mod.AttributeMap): typings.quillDelta.mod.AttributeMap = js.native
    @JSImport("quill-delta/dist/Delta", "AttributeMap.invert")
    @js.native
    def invert(attr: typings.quillDelta.mod.AttributeMap, base: typings.quillDelta.mod.AttributeMap): typings.quillDelta.mod.AttributeMap = js.native
    
    @JSImport("quill-delta/dist/Delta", "AttributeMap.transform")
    @js.native
    def transform(): js.UndefOr[typings.quillDelta.mod.AttributeMap] = js.native
    @JSImport("quill-delta/dist/Delta", "AttributeMap.transform")
    @js.native
    def transform(a: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], priority: Boolean): js.UndefOr[typings.quillDelta.mod.AttributeMap] = js.native
    @JSImport("quill-delta/dist/Delta", "AttributeMap.transform")
    @js.native
    def transform(a: js.UndefOr[scala.Nothing], b: typings.quillDelta.mod.AttributeMap): js.UndefOr[typings.quillDelta.mod.AttributeMap] = js.native
    @JSImport("quill-delta/dist/Delta", "AttributeMap.transform")
    @js.native
    def transform(a: js.UndefOr[scala.Nothing], b: typings.quillDelta.mod.AttributeMap, priority: Boolean): js.UndefOr[typings.quillDelta.mod.AttributeMap] = js.native
    @JSImport("quill-delta/dist/Delta", "AttributeMap.transform")
    @js.native
    def transform(a: typings.quillDelta.mod.AttributeMap): js.UndefOr[typings.quillDelta.mod.AttributeMap] = js.native
    @JSImport("quill-delta/dist/Delta", "AttributeMap.transform")
    @js.native
    def transform(a: typings.quillDelta.mod.AttributeMap, b: js.UndefOr[scala.Nothing], priority: Boolean): js.UndefOr[typings.quillDelta.mod.AttributeMap] = js.native
    @JSImport("quill-delta/dist/Delta", "AttributeMap.transform")
    @js.native
    def transform(a: typings.quillDelta.mod.AttributeMap, b: typings.quillDelta.mod.AttributeMap): js.UndefOr[typings.quillDelta.mod.AttributeMap] = js.native
    @JSImport("quill-delta/dist/Delta", "AttributeMap.transform")
    @js.native
    def transform(a: typings.quillDelta.mod.AttributeMap, b: typings.quillDelta.mod.AttributeMap, priority: Boolean): js.UndefOr[typings.quillDelta.mod.AttributeMap] = js.native
  }
  
  /* static member */
  object Op {
    
    @JSImport("quill-delta/dist/Delta", "Op.iterator")
    @js.native
    def iterator(ops: js.Array[typings.quillDelta.opMod.Op]): default = js.native
    
    @JSImport("quill-delta/dist/Delta", "Op.length")
    @js.native
    def length(op: typings.quillDelta.opMod.Op): Double = js.native
  }
  
  @js.native
  trait Delta extends StObject {
    
    def changeLength(): Double = js.native
    
    def chop(): this.type = js.native
    
    def compose(other: Delta): Delta = js.native
    
    def concat(other: Delta): Delta = js.native
    
    def delete(length: Double): this.type = js.native
    
    def diff(other: Delta): Delta = js.native
    def diff(other: Delta, cursor: Double): Delta = js.native
    def diff(other: Delta, cursor: CursorInfo): Delta = js.native
    
    def eachLine(
      predicate: js.Function3[
          /* line */ this.type, 
          /* attributes */ AttributeMap, 
          /* index */ Double, 
          Boolean | Unit
        ]
    ): Unit = js.native
    def eachLine(
      predicate: js.Function3[
          /* line */ this.type, 
          /* attributes */ AttributeMap, 
          /* index */ Double, 
          Boolean | Unit
        ],
      newline: String
    ): Unit = js.native
    
    def filter(predicate: js.Function2[/* op */ Op, /* index */ Double, Boolean]): js.Array[Op] = js.native
    
    def forEach(predicate: js.Function2[/* op */ Op, /* index */ Double, Unit]): Unit = js.native
    
    def insert(arg: String): this.type = js.native
    def insert(arg: String, attributes: AttributeMap): this.type = js.native
    def insert(arg: js.Object): this.type = js.native
    def insert(arg: js.Object, attributes: AttributeMap): this.type = js.native
    
    def invert(base: Delta): Delta = js.native
    
    def length(): Double = js.native
    
    def map[T](predicate: js.Function2[/* op */ Op, /* index */ Double, T]): js.Array[T] = js.native
    
    var ops: js.Array[Op] = js.native
    
    def partition(predicate: js.Function1[/* op */ Op, Boolean]): js.Tuple2[js.Array[Op], js.Array[Op]] = js.native
    
    def push(newOp: Op): this.type = js.native
    
    def reduce[T](predicate: js.Function3[/* accum */ T, /* curr */ Op, /* index */ Double, T], initialValue: T): T = js.native
    
    def retain(length: Double): this.type = js.native
    def retain(length: Double, attributes: AttributeMap): this.type = js.native
    
    def slice(): Delta = js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): Delta = js.native
    def slice(start: Double): Delta = js.native
    def slice(start: Double, end: Double): Delta = js.native
    
    def transform(index: Double): Double = js.native
    def transform(index: Double, priority: Boolean): Double = js.native
    def transform(other: Delta): Delta = js.native
    def transform(other: Delta, priority: Boolean): Delta = js.native
    
    def transformPosition(index: Double): Double = js.native
    def transformPosition(index: Double, priority: Boolean): Double = js.native
  }
}
