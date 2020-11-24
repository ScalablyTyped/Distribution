package typings.rbx.anon

import typings.std.FlatArray
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Array<string | number>> */
@js.native
trait ReadonlyArraystringnumber extends js.Object {
  
  val concat: js.Function1[/* repeated */ js.Array[String | Double], js.Array[String | Double]] = js.native
  
  val copyWithin: js.Function2[/* target */ Double, /* start */ Double, this.type] = js.native
  
  val entries: js.Function0[IterableIterator[js.Tuple2[Double, String | Double]]] = js.native
  
  val every: js.Function1[
    /* predicate */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      Boolean
    ], 
    /* is std.Array<string | number> */ Boolean
  ] = js.native
  
  val fill: js.Function1[/* value */ String | Double, this.type] = js.native
  
  val filter: js.Function1[
    /* predicate */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      Boolean
    ], 
    js.Array[String | Double]
  ] = js.native
  
  val find: js.Function1[
    /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ String | Double, 
      /* index */ Double, 
      /* obj */ js.Array[String | Double], 
      Boolean
    ], 
    js.UndefOr[String | Double]
  ] = js.native
  
  val findIndex: js.Function1[
    /* predicate */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* obj */ js.Array[String | Double], 
      _
    ], 
    Double
  ] = js.native
  
  val flat: js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, typings.rbx.rbxNumbers.`1`]]] = js.native
  
  val flatMap: js.Function1[
    /* callback */ js.ThisFunction3[
      /* this */ js.UndefOr[scala.Nothing], 
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      _ | js.Array[_]
    ], 
    js.Array[_]
  ] = js.native
  
  val forEach: js.Function1[
    /* callbackfn */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      Unit
    ], 
    Unit
  ] = js.native
  
  val includes: js.Function1[/* searchElement */ String | Double, Boolean] = js.native
  
  val indexOf: js.Function1[/* searchElement */ String | Double, Double] = js.native
  
  val join: js.Function0[String] = js.native
  
  val keys: js.Function0[IterableIterator[Double]] = js.native
  
  val lastIndexOf: js.Function1[/* searchElement */ String | Double, Double] = js.native
  
  val length: Double = js.native
  
  val map: js.Function1[
    /* callbackfn */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      _
    ], 
    js.Array[_]
  ] = js.native
  
  val pop: js.Function0[js.UndefOr[String | Double]] = js.native
  
  val push: js.Function1[/* repeated */ String | Double, Double] = js.native
  
  val reduce: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ String | Double, 
      /* currentValue */ String | Double, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String | Double], 
      String | Double
    ], 
    String | Double
  ] = js.native
  
  val reduceRight: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ String | Double, 
      /* currentValue */ String | Double, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String | Double], 
      String | Double
    ], 
    String | Double
  ] = js.native
  
  val reverse: js.Function0[js.Array[String | Double]] = js.native
  
  val shift: js.Function0[js.UndefOr[String | Double]] = js.native
  
  val slice: js.Function0[js.Array[String | Double]] = js.native
  
  val some: js.Function1[
    /* predicate */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      _
    ], 
    Boolean
  ] = js.native
  
  val sort: js.Function0[this.type] = js.native
  
  val splice: js.Function1[/* start */ Double, js.Array[String | Double]] = js.native
  
  @JSName("toLocaleString")
  val toLocaleString_FReadonlyArraystringnumber: js.Function0[String] = js.native
  
  @JSName("toString")
  val toString_FReadonlyArraystringnumber: js.Function0[String] = js.native
  
  val unshift: js.Function1[/* repeated */ String | Double, Double] = js.native
  
  val values: js.Function0[IterableIterator[String | Double]] = js.native
}
object ReadonlyArraystringnumber {
  
  @scala.inline
  def apply(
    concat: /* repeated */ js.Array[String | Double] => js.Array[String | Double],
    copyWithin: (/* target */ Double, /* start */ Double) => ReadonlyArraystringnumber,
    entries: () => IterableIterator[js.Tuple2[Double, String | Double]],
    every: /* predicate */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      Boolean
    ] => /* is std.Array<string | number> */ Boolean,
    fill: /* value */ String | Double => ReadonlyArraystringnumber,
    filter: /* predicate */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      Boolean
    ] => js.Array[String | Double],
    find: /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ String | Double, 
      /* index */ Double, 
      /* obj */ js.Array[String | Double], 
      Boolean
    ] => js.UndefOr[String | Double],
    findIndex: /* predicate */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* obj */ js.Array[String | Double], 
      _
    ] => Double,
    flat: js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, typings.rbx.rbxNumbers.`1`]]],
    flatMap: /* callback */ js.ThisFunction3[
      /* this */ js.UndefOr[scala.Nothing], 
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      _ | js.Array[_]
    ] => js.Array[_],
    forEach: /* callbackfn */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      Unit
    ] => Unit,
    includes: /* searchElement */ String | Double => Boolean,
    indexOf: /* searchElement */ String | Double => Double,
    join: () => String,
    keys: () => IterableIterator[Double],
    lastIndexOf: /* searchElement */ String | Double => Double,
    length: Double,
    map: /* callbackfn */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      _
    ] => js.Array[_],
    pop: () => js.UndefOr[String | Double],
    push: /* repeated */ String | Double => Double,
    reduce: /* callbackfn */ js.Function4[
      /* previousValue */ String | Double, 
      /* currentValue */ String | Double, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String | Double], 
      String | Double
    ] => String | Double,
    reduceRight: /* callbackfn */ js.Function4[
      /* previousValue */ String | Double, 
      /* currentValue */ String | Double, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String | Double], 
      String | Double
    ] => String | Double,
    reverse: () => js.Array[String | Double],
    shift: () => js.UndefOr[String | Double],
    slice: () => js.Array[String | Double],
    some: /* predicate */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      _
    ] => Boolean,
    sort: () => ReadonlyArraystringnumber,
    splice: /* start */ Double => js.Array[String | Double],
    toLocaleString: () => String,
    toString: () => String,
    unshift: /* repeated */ String | Double => Double,
    values: () => IterableIterator[String | Double]
  ): ReadonlyArraystringnumber = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), copyWithin = js.Any.fromFunction2(copyWithin), entries = js.Any.fromFunction0(entries), every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), flat = flat.asInstanceOf[js.Any], flatMap = js.Any.fromFunction1(flatMap), forEach = js.Any.fromFunction1(forEach), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = js.Any.fromFunction0(join), keys = js.Any.fromFunction0(keys), lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = js.Any.fromFunction0(reverse), shift = js.Any.fromFunction0(shift), slice = js.Any.fromFunction0(slice), some = js.Any.fromFunction1(some), sort = js.Any.fromFunction0(sort), splice = js.Any.fromFunction1(splice), toLocaleString = js.Any.fromFunction0(toLocaleString), toString = js.Any.fromFunction0(toString), unshift = js.Any.fromFunction1(unshift), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ReadonlyArraystringnumber]
  }
  
  @scala.inline
  implicit class ReadonlyArraystringnumberOps[Self <: ReadonlyArraystringnumber] (val x: Self) extends AnyVal {
    
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
    def setConcat(value: /* repeated */ js.Array[String | Double] => js.Array[String | Double]): Self = this.set("concat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopyWithin(value: (/* target */ Double, /* start */ Double) => ReadonlyArraystringnumber): Self = this.set("copyWithin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEntries(value: () => IterableIterator[js.Tuple2[Double, String | Double]]): Self = this.set("entries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEvery(
      value: /* predicate */ js.Function3[
          /* value */ String | Double, 
          /* index */ Double, 
          /* array */ js.Array[String | Double], 
          Boolean
        ] => /* is std.Array<string | number> */ Boolean
    ): Self = this.set("every", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFill(value: /* value */ String | Double => ReadonlyArraystringnumber): Self = this.set("fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilter(
      value: /* predicate */ js.Function3[
          /* value */ String | Double, 
          /* index */ Double, 
          /* array */ js.Array[String | Double], 
          Boolean
        ] => js.Array[String | Double]
    ): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFind(
      value: /* predicate */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String | Double, 
          /* index */ Double, 
          /* obj */ js.Array[String | Double], 
          Boolean
        ] => js.UndefOr[String | Double]
    ): Self = this.set("find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindIndex(
      value: /* predicate */ js.Function3[
          /* value */ String | Double, 
          /* index */ Double, 
          /* obj */ js.Array[String | Double], 
          _
        ] => Double
    ): Self = this.set("findIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFlat(value: js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, typings.rbx.rbxNumbers.`1`]]]): Self = this.set("flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatMap(
      value: /* callback */ js.ThisFunction3[
          /* this */ js.UndefOr[scala.Nothing], 
          /* value */ String | Double, 
          /* index */ Double, 
          /* array */ js.Array[String | Double], 
          _ | js.Array[_]
        ] => js.Array[_]
    ): Self = this.set("flatMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForEach(
      value: /* callbackfn */ js.Function3[
          /* value */ String | Double, 
          /* index */ Double, 
          /* array */ js.Array[String | Double], 
          Unit
        ] => Unit
    ): Self = this.set("forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncludes(value: /* searchElement */ String | Double => Boolean): Self = this.set("includes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexOf(value: /* searchElement */ String | Double => Double): Self = this.set("indexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJoin(value: () => String): Self = this.set("join", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeys(value: () => IterableIterator[Double]): Self = this.set("keys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastIndexOf(value: /* searchElement */ String | Double => Double): Self = this.set("lastIndexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(
      value: /* callbackfn */ js.Function3[
          /* value */ String | Double, 
          /* index */ Double, 
          /* array */ js.Array[String | Double], 
          _
        ] => js.Array[_]
    ): Self = this.set("map", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPop(value: () => js.UndefOr[String | Double]): Self = this.set("pop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPush(value: /* repeated */ String | Double => Double): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReduce(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ String | Double, 
          /* currentValue */ String | Double, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String | Double], 
          String | Double
        ] => String | Double
    ): Self = this.set("reduce", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReduceRight(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ String | Double, 
          /* currentValue */ String | Double, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String | Double], 
          String | Double
        ] => String | Double
    ): Self = this.set("reduceRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReverse(value: () => js.Array[String | Double]): Self = this.set("reverse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShift(value: () => js.UndefOr[String | Double]): Self = this.set("shift", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSlice(value: () => js.Array[String | Double]): Self = this.set("slice", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSome(
      value: /* predicate */ js.Function3[
          /* value */ String | Double, 
          /* index */ Double, 
          /* array */ js.Array[String | Double], 
          _
        ] => Boolean
    ): Self = this.set("some", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSort(value: () => ReadonlyArraystringnumber): Self = this.set("sort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSplice(value: /* start */ Double => js.Array[String | Double]): Self = this.set("splice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToLocaleString(value: () => String): Self = this.set("toLocaleString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToString(value: () => String): Self = this.set("toString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnshift(value: /* repeated */ String | Double => Double): Self = this.set("unshift", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValues(value: () => IterableIterator[String | Double]): Self = this.set("values", js.Any.fromFunction0(value))
  }
}
