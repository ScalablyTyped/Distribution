package typings.quillDelta

import org.scalablytyped.runtime.Instantiable1
import typings.fastDiff.mod.CursorInfo
import typings.quillDelta.anon.Ops
import typings.quillDelta.distAttributeMapMod.AttributeMap
import typings.quillDelta.distOpMod.Op
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeltaMod {
  
  @JSImport("quill-delta/dist/Delta", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Delta {
    def this(ops: js.Array[Op]) = this()
    def this(ops: Ops) = this()
  }
  object default {
    
    @JSImport("quill-delta/dist/Delta", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    /* was `typeof AttributeMap` */
    object AttributeMap {
      
      @JSImport("quill-delta/dist/Delta", "default.AttributeMap")
      @js.native
      val ^ : js.Any = js.native
      
      inline def compose(): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")().asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      inline def compose(a: Unit, b: Unit, keepNull: Boolean): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], keepNull.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      inline def compose(a: Unit, b: typings.quillDelta.distAttributeMapMod.AttributeMap): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      inline def compose(a: Unit, b: typings.quillDelta.distAttributeMapMod.AttributeMap, keepNull: Boolean): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], keepNull.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      inline def compose(a: typings.quillDelta.distAttributeMapMod.AttributeMap): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      inline def compose(a: typings.quillDelta.distAttributeMapMod.AttributeMap, b: Unit, keepNull: Boolean): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], keepNull.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      inline def compose(
        a: typings.quillDelta.distAttributeMapMod.AttributeMap,
        b: typings.quillDelta.distAttributeMapMod.AttributeMap
      ): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      inline def compose(
        a: typings.quillDelta.distAttributeMapMod.AttributeMap,
        b: typings.quillDelta.distAttributeMapMod.AttributeMap,
        keepNull: Boolean
      ): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], keepNull.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      
      inline def diff(): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("diff")().asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      inline def diff(a: Unit, b: typings.quillDelta.distAttributeMapMod.AttributeMap): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      inline def diff(a: typings.quillDelta.distAttributeMapMod.AttributeMap): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("diff")(a.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      inline def diff(
        a: typings.quillDelta.distAttributeMapMod.AttributeMap,
        b: typings.quillDelta.distAttributeMapMod.AttributeMap
      ): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      
      inline def invert(): typings.quillDelta.distAttributeMapMod.AttributeMap = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")().asInstanceOf[typings.quillDelta.distAttributeMapMod.AttributeMap]
      inline def invert(attr: Unit, base: typings.quillDelta.distAttributeMapMod.AttributeMap): typings.quillDelta.distAttributeMapMod.AttributeMap = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(attr.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[typings.quillDelta.distAttributeMapMod.AttributeMap]
      inline def invert(attr: typings.quillDelta.distAttributeMapMod.AttributeMap): typings.quillDelta.distAttributeMapMod.AttributeMap = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(attr.asInstanceOf[js.Any]).asInstanceOf[typings.quillDelta.distAttributeMapMod.AttributeMap]
      inline def invert(
        attr: typings.quillDelta.distAttributeMapMod.AttributeMap,
        base: typings.quillDelta.distAttributeMapMod.AttributeMap
      ): typings.quillDelta.distAttributeMapMod.AttributeMap = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(attr.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[typings.quillDelta.distAttributeMapMod.AttributeMap]
      
      inline def transform(): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")().asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      inline def transform(a: Unit, b: Unit, priority: Boolean): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      inline def transform(a: Unit, b: typings.quillDelta.distAttributeMapMod.AttributeMap): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      inline def transform(a: Unit, b: typings.quillDelta.distAttributeMapMod.AttributeMap, priority: Boolean): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      inline def transform(a: typings.quillDelta.distAttributeMapMod.AttributeMap): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      inline def transform(a: typings.quillDelta.distAttributeMapMod.AttributeMap, b: Unit, priority: Boolean): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      inline def transform(
        a: typings.quillDelta.distAttributeMapMod.AttributeMap,
        b: typings.quillDelta.distAttributeMapMod.AttributeMap
      ): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
      inline def transform(
        a: typings.quillDelta.distAttributeMapMod.AttributeMap,
        b: typings.quillDelta.distAttributeMapMod.AttributeMap,
        priority: Boolean
      ): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    }
    
    /* static member */
    /* was `typeof Op` */
    object Op {
      
      @JSImport("quill-delta/dist/Delta", "default.Op")
      @js.native
      val ^ : js.Any = js.native
      
      inline def length(op: typings.quillDelta.distOpMod.Op): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(op.asInstanceOf[js.Any]).asInstanceOf[Double]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("quill-delta/dist/Delta", "default.OpIterator")
    @js.native
    open class OpIterator protected ()
      extends typings.quillDelta.distOpIteratorMod.default {
      def this(ops: js.Array[Op]) = this()
    }
    /* static member */
    /* was `typeof OpIterator` */
    @JSImport("quill-delta/dist/Delta", "default.OpIterator")
    @js.native
    def OpIterator: Instantiable1[/* ops */ js.Array[Op], typings.quillDelta.distOpIteratorMod.default] = js.native
    inline def OpIterator_=(x: Instantiable1[/* ops */ js.Array[Op], typings.quillDelta.distOpIteratorMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OpIterator")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("quill-delta/dist/Delta", "default.getHandler")
    @js.native
    def getHandler: Any = js.native
    inline def getHandler_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getHandler")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("quill-delta/dist/Delta", "default.handlers")
    @js.native
    def handlers: Any = js.native
    inline def handlers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handlers")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def registerEmbed[T](embedType: String, handler: EmbedHandler[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerEmbed")(embedType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def unregisterEmbed(embedType: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterEmbed")(embedType.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object AttributeMap {
    
    @JSImport("quill-delta/dist/Delta", "AttributeMap")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compose(): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")().asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    inline def compose(a: Unit, b: Unit, keepNull: Boolean): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], keepNull.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    inline def compose(a: Unit, b: typings.quillDelta.distAttributeMapMod.AttributeMap): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    inline def compose(a: Unit, b: typings.quillDelta.distAttributeMapMod.AttributeMap, keepNull: Boolean): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], keepNull.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    inline def compose(a: typings.quillDelta.distAttributeMapMod.AttributeMap): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    inline def compose(a: typings.quillDelta.distAttributeMapMod.AttributeMap, b: Unit, keepNull: Boolean): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], keepNull.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    inline def compose(
      a: typings.quillDelta.distAttributeMapMod.AttributeMap,
      b: typings.quillDelta.distAttributeMapMod.AttributeMap
    ): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    inline def compose(
      a: typings.quillDelta.distAttributeMapMod.AttributeMap,
      b: typings.quillDelta.distAttributeMapMod.AttributeMap,
      keepNull: Boolean
    ): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], keepNull.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    
    inline def diff(): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("diff")().asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    inline def diff(a: Unit, b: typings.quillDelta.distAttributeMapMod.AttributeMap): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    inline def diff(a: typings.quillDelta.distAttributeMapMod.AttributeMap): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("diff")(a.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    inline def diff(
      a: typings.quillDelta.distAttributeMapMod.AttributeMap,
      b: typings.quillDelta.distAttributeMapMod.AttributeMap
    ): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    
    inline def invert(): typings.quillDelta.distAttributeMapMod.AttributeMap = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")().asInstanceOf[typings.quillDelta.distAttributeMapMod.AttributeMap]
    inline def invert(attr: Unit, base: typings.quillDelta.distAttributeMapMod.AttributeMap): typings.quillDelta.distAttributeMapMod.AttributeMap = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(attr.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[typings.quillDelta.distAttributeMapMod.AttributeMap]
    inline def invert(attr: typings.quillDelta.distAttributeMapMod.AttributeMap): typings.quillDelta.distAttributeMapMod.AttributeMap = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(attr.asInstanceOf[js.Any]).asInstanceOf[typings.quillDelta.distAttributeMapMod.AttributeMap]
    inline def invert(
      attr: typings.quillDelta.distAttributeMapMod.AttributeMap,
      base: typings.quillDelta.distAttributeMapMod.AttributeMap
    ): typings.quillDelta.distAttributeMapMod.AttributeMap = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(attr.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[typings.quillDelta.distAttributeMapMod.AttributeMap]
    
    inline def transform(): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")().asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    inline def transform(a: Unit, b: Unit, priority: Boolean): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    inline def transform(a: Unit, b: typings.quillDelta.distAttributeMapMod.AttributeMap): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    inline def transform(a: Unit, b: typings.quillDelta.distAttributeMapMod.AttributeMap, priority: Boolean): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    inline def transform(a: typings.quillDelta.distAttributeMapMod.AttributeMap): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    inline def transform(a: typings.quillDelta.distAttributeMapMod.AttributeMap, b: Unit, priority: Boolean): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    inline def transform(
      a: typings.quillDelta.distAttributeMapMod.AttributeMap,
      b: typings.quillDelta.distAttributeMapMod.AttributeMap
    ): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
    inline def transform(
      a: typings.quillDelta.distAttributeMapMod.AttributeMap,
      b: typings.quillDelta.distAttributeMapMod.AttributeMap,
      priority: Boolean
    ): js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.quillDelta.distAttributeMapMod.AttributeMap]]
  }
  
  object Op {
    
    @JSImport("quill-delta/dist/Delta", "Op")
    @js.native
    val ^ : js.Any = js.native
    
    inline def length(op: typings.quillDelta.distOpMod.Op): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(op.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @JSImport("quill-delta/dist/Delta", "OpIterator")
  @js.native
  open class OpIterator protected ()
    extends typings.quillDelta.distOpIteratorMod.default {
    def this(ops: js.Array[Op]) = this()
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
    def insert(arg: Record[String, Any]): this.type = js.native
    def insert(arg: Record[String, Any], attributes: AttributeMap): this.type = js.native
    
    def invert(base: Delta): Delta = js.native
    
    def length(): Double = js.native
    
    def map[T](predicate: js.Function2[/* op */ Op, /* index */ Double, T]): js.Array[T] = js.native
    
    var ops: js.Array[Op] = js.native
    
    def partition(predicate: js.Function1[/* op */ Op, Boolean]): js.Tuple2[js.Array[Op], js.Array[Op]] = js.native
    
    def push(newOp: Op): this.type = js.native
    
    def reduce[T](predicate: js.Function3[/* accum */ T, /* curr */ Op, /* index */ Double, T], initialValue: T): T = js.native
    
    def retain(length: Double): this.type = js.native
    def retain(length: Double, attributes: AttributeMap): this.type = js.native
    def retain(length: Record[String, Any]): this.type = js.native
    def retain(length: Record[String, Any], attributes: AttributeMap): this.type = js.native
    
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
  
  trait EmbedHandler[T] extends StObject {
    
    def compose(a: T, b: T, keepNull: Boolean): T
    
    def invert(a: T, b: T): T
    
    def transform(a: T, b: T, priority: Boolean): T
  }
  object EmbedHandler {
    
    inline def apply[T](compose: (T, T, Boolean) => T, invert: (T, T) => T, transform: (T, T, Boolean) => T): EmbedHandler[T] = {
      val __obj = js.Dynamic.literal(compose = js.Any.fromFunction3(compose), invert = js.Any.fromFunction2(invert), transform = js.Any.fromFunction3(transform))
      __obj.asInstanceOf[EmbedHandler[T]]
    }
    
    extension [Self <: EmbedHandler[?], T](x: Self & EmbedHandler[T]) {
      
      inline def setCompose(value: (T, T, Boolean) => T): Self = StObject.set(x, "compose", js.Any.fromFunction3(value))
      
      inline def setInvert(value: (T, T) => T): Self = StObject.set(x, "invert", js.Any.fromFunction2(value))
      
      inline def setTransform(value: (T, T, Boolean) => T): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
    }
  }
}
