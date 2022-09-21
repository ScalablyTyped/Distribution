package typings.rbx.anon

import typings.std.FlatArray
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Array<string | number>> */
trait ReadonlyArraystringnumber extends StObject {
  
  val at: js.Function1[/* index */ Double, js.UndefOr[String | Double]]
  
  val concat: js.Function1[/* repeated */ js.Array[String | Double], js.Array[String | Double]]
  
  val copyWithin: js.Function2[/* target */ Double, /* start */ Double, this.type]
  
  val entries: js.Function0[IterableIterator[js.Tuple2[Double, String | Double]]]
  
  val every: js.Function1[
    /* predicate */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      Boolean
    ], 
    /* is std.Array<string | number> */ Boolean
  ]
  
  val fill: js.Function1[/* value */ String | Double, this.type]
  
  val filter: js.Function1[
    /* predicate */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      Boolean
    ], 
    js.Array[String | Double]
  ]
  
  val find: js.Function1[
    /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ String | Double, 
      /* index */ Double, 
      /* obj */ js.Array[String | Double], 
      Boolean
    ], 
    js.UndefOr[String | Double]
  ]
  
  val findIndex: js.Function1[
    /* predicate */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* obj */ js.Array[String | Double], 
      Any
    ], 
    Double
  ]
  
  val flat: js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, typings.rbx.rbxNumbers.`1`]]]
  
  val flatMap: js.Function1[
    /* callback */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      Any | js.Array[Any]
    ], 
    js.Array[Any]
  ]
  
  val forEach: js.Function1[
    /* callbackfn */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      Unit
    ], 
    Unit
  ]
  
  val includes: js.Function1[/* searchElement */ String | Double, Boolean]
  
  val indexOf: js.Function1[/* searchElement */ String | Double, Double]
  
  val join: js.Function0[String]
  
  val keys: js.Function0[IterableIterator[Double]]
  
  val lastIndexOf: js.Function1[/* searchElement */ String | Double, Double]
  
  val length: Double
  
  val map: js.Function1[
    /* callbackfn */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      Any
    ], 
    js.Array[Any]
  ]
  
  val pop: js.Function0[js.UndefOr[String | Double]]
  
  val push: js.Function1[/* repeated */ String | Double, Double]
  
  val reduce: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ String | Double, 
      /* currentValue */ String | Double, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String | Double], 
      String | Double
    ], 
    String | Double
  ]
  
  val reduceRight: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ String | Double, 
      /* currentValue */ String | Double, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String | Double], 
      String | Double
    ], 
    String | Double
  ]
  
  val reverse: js.Function0[js.Array[String | Double]]
  
  val shift: js.Function0[js.UndefOr[String | Double]]
  
  val slice: js.Function0[js.Array[String | Double]]
  
  val some: js.Function1[
    /* predicate */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      Any
    ], 
    Boolean
  ]
  
  val sort: js.Function0[this.type]
  
  val splice: js.Function1[/* start */ Double, js.Array[String | Double]]
  
  @JSName("toLocaleString")
  val toLocaleString_FReadonlyArraystringnumber: js.Function0[String]
  
  @JSName("toString")
  val toString_FReadonlyArraystringnumber: js.Function0[String]
  
  val unshift: js.Function1[/* repeated */ String | Double, Double]
  
  val values: js.Function0[IterableIterator[String | Double]]
}
object ReadonlyArraystringnumber {
  
  inline def apply(
    at: /* index */ Double => js.UndefOr[String | Double],
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
      Any
    ] => Double,
    flat: js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, typings.rbx.rbxNumbers.`1`]]],
    flatMap: /* callback */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      Any | js.Array[Any]
    ] => js.Array[Any],
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
      Any
    ] => js.Array[Any],
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
      Any
    ] => Boolean,
    sort: () => ReadonlyArraystringnumber,
    splice: /* start */ Double => js.Array[String | Double],
    toLocaleString: () => String,
    toString_ : () => String,
    unshift: /* repeated */ String | Double => Double,
    values: () => IterableIterator[String | Double]
  ): ReadonlyArraystringnumber = {
    val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), concat = js.Any.fromFunction1(concat), copyWithin = js.Any.fromFunction2(copyWithin), entries = js.Any.fromFunction0(entries), every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), flat = flat.asInstanceOf[js.Any], flatMap = js.Any.fromFunction1(flatMap), forEach = js.Any.fromFunction1(forEach), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = js.Any.fromFunction0(join), keys = js.Any.fromFunction0(keys), lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = js.Any.fromFunction0(reverse), shift = js.Any.fromFunction0(shift), slice = js.Any.fromFunction0(slice), some = js.Any.fromFunction1(some), sort = js.Any.fromFunction0(sort), splice = js.Any.fromFunction1(splice), toLocaleString = js.Any.fromFunction0(toLocaleString), unshift = js.Any.fromFunction1(unshift), values = js.Any.fromFunction0(values))
    __obj.updateDynamic("toString")(js.Any.fromFunction0(toString_))
    __obj.asInstanceOf[ReadonlyArraystringnumber]
  }
  
  extension [Self <: ReadonlyArraystringnumber](x: Self) {
    
    inline def setAt(value: /* index */ Double => js.UndefOr[String | Double]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
    
    inline def setConcat(value: /* repeated */ js.Array[String | Double] => js.Array[String | Double]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    
    inline def setCopyWithin(value: (/* target */ Double, /* start */ Double) => ReadonlyArraystringnumber): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
    
    inline def setEntries(value: () => IterableIterator[js.Tuple2[Double, String | Double]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
    
    inline def setEvery(
      value: /* predicate */ js.Function3[
          /* value */ String | Double, 
          /* index */ Double, 
          /* array */ js.Array[String | Double], 
          Boolean
        ] => /* is std.Array<string | number> */ Boolean
    ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
    
    inline def setFill(value: /* value */ String | Double => ReadonlyArraystringnumber): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    inline def setFilter(
      value: /* predicate */ js.Function3[
          /* value */ String | Double, 
          /* index */ Double, 
          /* array */ js.Array[String | Double], 
          Boolean
        ] => js.Array[String | Double]
    ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFind(
      value: /* predicate */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String | Double, 
          /* index */ Double, 
          /* obj */ js.Array[String | Double], 
          Boolean
        ] => js.UndefOr[String | Double]
    ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setFindIndex(
      value: /* predicate */ js.Function3[
          /* value */ String | Double, 
          /* index */ Double, 
          /* obj */ js.Array[String | Double], 
          Any
        ] => Double
    ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
    
    inline def setFlat(value: js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, typings.rbx.rbxNumbers.`1`]]]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    inline def setFlatMap(
      value: /* callback */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String | Double, 
          /* index */ Double, 
          /* array */ js.Array[String | Double], 
          Any | js.Array[Any]
        ] => js.Array[Any]
    ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
    
    inline def setForEach(
      value: /* callbackfn */ js.Function3[
          /* value */ String | Double, 
          /* index */ Double, 
          /* array */ js.Array[String | Double], 
          Unit
        ] => Unit
    ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    inline def setIncludes(value: /* searchElement */ String | Double => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
    
    inline def setIndexOf(value: /* searchElement */ String | Double => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setJoin(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
    
    inline def setKeys(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    
    inline def setLastIndexOf(value: /* searchElement */ String | Double => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMap(
      value: /* callbackfn */ js.Function3[
          /* value */ String | Double, 
          /* index */ Double, 
          /* array */ js.Array[String | Double], 
          Any
        ] => js.Array[Any]
    ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setPop(value: () => js.UndefOr[String | Double]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
    
    inline def setPush(value: /* repeated */ String | Double => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setReduce(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ String | Double, 
          /* currentValue */ String | Double, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String | Double], 
          String | Double
        ] => String | Double
    ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
    
    inline def setReduceRight(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ String | Double, 
          /* currentValue */ String | Double, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String | Double], 
          String | Double
        ] => String | Double
    ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
    
    inline def setReverse(value: () => js.Array[String | Double]): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
    
    inline def setShift(value: () => js.UndefOr[String | Double]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
    
    inline def setSlice(value: () => js.Array[String | Double]): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
    
    inline def setSome(
      value: /* predicate */ js.Function3[
          /* value */ String | Double, 
          /* index */ Double, 
          /* array */ js.Array[String | Double], 
          Any
        ] => Boolean
    ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
    
    inline def setSort(value: () => ReadonlyArraystringnumber): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
    
    inline def setSplice(value: /* start */ Double => js.Array[String | Double]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
    
    inline def setToLocaleString(value: () => String): Self = StObject.set(x, "toLocaleString", js.Any.fromFunction0(value))
    
    inline def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
    
    inline def setUnshift(value: /* repeated */ String | Double => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    
    inline def setValues(value: () => IterableIterator[String | Double]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
