package typings.quillDelta

import typings.fastDiff.mod.CursorInfo
import typings.quillDelta.anon.Ops
import typings.quillDelta.iteratorMod.default
import typings.quillDelta.mod.AttributeMap
import typings.quillDelta.opMod.Op
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deltaMod {
  
  @JSImport("quill-delta/dist/Delta", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Delta {
    def this(ops: js.Array[Op]) = this()
    def this(ops: Ops) = this()
  }
  
  /* static member */
  object AttributeMap {
    
    @JSImport("quill-delta/dist/Delta", "AttributeMap")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def compose(a: Unit, b: Unit, keepNull: Boolean): js.UndefOr[typings.quillDelta.mod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], keepNull.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.mod.AttributeMap]]
    @scala.inline
    def compose(a: Unit, b: typings.quillDelta.mod.AttributeMap, keepNull: Boolean): js.UndefOr[typings.quillDelta.mod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], keepNull.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.mod.AttributeMap]]
    @scala.inline
    def compose(a: typings.quillDelta.mod.AttributeMap, b: Unit, keepNull: Boolean): js.UndefOr[typings.quillDelta.mod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], keepNull.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.mod.AttributeMap]]
    @scala.inline
    def compose(a: typings.quillDelta.mod.AttributeMap, b: typings.quillDelta.mod.AttributeMap, keepNull: Boolean): js.UndefOr[typings.quillDelta.mod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], keepNull.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.mod.AttributeMap]]
    
    @scala.inline
    def diff(): js.UndefOr[typings.quillDelta.mod.AttributeMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("diff")().asInstanceOf[js.UndefOr[typings.quillDelta.mod.AttributeMap]]
    @scala.inline
    def diff(a: Unit, b: typings.quillDelta.mod.AttributeMap): js.UndefOr[typings.quillDelta.mod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.mod.AttributeMap]]
    @scala.inline
    def diff(a: typings.quillDelta.mod.AttributeMap): js.UndefOr[typings.quillDelta.mod.AttributeMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("diff")(a.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.quillDelta.mod.AttributeMap]]
    @scala.inline
    def diff(a: typings.quillDelta.mod.AttributeMap, b: typings.quillDelta.mod.AttributeMap): js.UndefOr[typings.quillDelta.mod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.mod.AttributeMap]]
    
    @scala.inline
    def invert(): typings.quillDelta.mod.AttributeMap = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")().asInstanceOf[typings.quillDelta.mod.AttributeMap]
    @scala.inline
    def invert(attr: Unit, base: typings.quillDelta.mod.AttributeMap): typings.quillDelta.mod.AttributeMap = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(attr.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[typings.quillDelta.mod.AttributeMap]
    @scala.inline
    def invert(attr: typings.quillDelta.mod.AttributeMap): typings.quillDelta.mod.AttributeMap = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(attr.asInstanceOf[js.Any]).asInstanceOf[typings.quillDelta.mod.AttributeMap]
    @scala.inline
    def invert(attr: typings.quillDelta.mod.AttributeMap, base: typings.quillDelta.mod.AttributeMap): typings.quillDelta.mod.AttributeMap = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(attr.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[typings.quillDelta.mod.AttributeMap]
    
    @scala.inline
    def transform(): js.UndefOr[typings.quillDelta.mod.AttributeMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")().asInstanceOf[js.UndefOr[typings.quillDelta.mod.AttributeMap]]
    @scala.inline
    def transform(a: Unit, b: Unit, priority: Boolean): js.UndefOr[typings.quillDelta.mod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.mod.AttributeMap]]
    @scala.inline
    def transform(a: Unit, b: typings.quillDelta.mod.AttributeMap): js.UndefOr[typings.quillDelta.mod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.mod.AttributeMap]]
    @scala.inline
    def transform(a: Unit, b: typings.quillDelta.mod.AttributeMap, priority: Boolean): js.UndefOr[typings.quillDelta.mod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.mod.AttributeMap]]
    @scala.inline
    def transform(a: typings.quillDelta.mod.AttributeMap): js.UndefOr[typings.quillDelta.mod.AttributeMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.quillDelta.mod.AttributeMap]]
    @scala.inline
    def transform(a: typings.quillDelta.mod.AttributeMap, b: Unit, priority: Boolean): js.UndefOr[typings.quillDelta.mod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.mod.AttributeMap]]
    @scala.inline
    def transform(a: typings.quillDelta.mod.AttributeMap, b: typings.quillDelta.mod.AttributeMap): js.UndefOr[typings.quillDelta.mod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.mod.AttributeMap]]
    @scala.inline
    def transform(a: typings.quillDelta.mod.AttributeMap, b: typings.quillDelta.mod.AttributeMap, priority: Boolean): js.UndefOr[typings.quillDelta.mod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.mod.AttributeMap]]
  }
  
  /* static member */
  object Op {
    
    @JSImport("quill-delta/dist/Delta", "Op")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def iterator(ops: js.Array[typings.quillDelta.opMod.Op]): default = ^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(ops.asInstanceOf[js.Any]).asInstanceOf[default]
    
    @scala.inline
    def length(op: typings.quillDelta.opMod.Op): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(op.asInstanceOf[js.Any]).asInstanceOf[Double]
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
    def slice(start: Double): Delta = js.native
    def slice(start: Double, end: Double): Delta = js.native
    def slice(start: Unit, end: Double): Delta = js.native
    
    def transform(index: Double): Double = js.native
    def transform(index: Double, priority: Boolean): Double = js.native
    def transform(other: Delta): Delta = js.native
    def transform(other: Delta, priority: Boolean): Delta = js.native
    
    def transformPosition(index: Double): Double = js.native
    def transformPosition(index: Double, priority: Boolean): Double = js.native
  }
}
