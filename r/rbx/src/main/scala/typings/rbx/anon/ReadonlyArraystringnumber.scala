package typings.rbx.anon

import typings.std.FlatArray
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Array<string | number>> */
trait ReadonlyArraystringnumber extends js.Object {
  val concat: js.Function1[/* repeated */ js.Array[String | Double], js.Array[String | Double]]
  val copyWithin: js.Function2[/* target */ Double, /* start */ Double, this.type]
  val entries: js.Function0[IterableIterator[js.Tuple2[Double, String | Double]]]
  val every: js.Function1[
    /* callbackfn */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      _
    ], 
    Boolean
  ]
  val fill: js.Function1[/* value */ String | Double, this.type]
  val filter: js.Function1[
    /* callbackfn */ js.Function3[
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
      _
    ], 
    Double
  ]
  val flat: js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, typings.rbx.rbxNumbers.`1`]]]
  val flatMap: js.Function1[
    /* callback */ js.ThisFunction3[
      /* this */ js.UndefOr[scala.Nothing], 
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      _ | js.Array[_]
    ], 
    js.Array[_]
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
      _
    ], 
    js.Array[_]
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
    /* callbackfn */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      _
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
  @scala.inline
  def apply(
    concat: /* repeated */ js.Array[String | Double] => js.Array[String | Double],
    copyWithin: (/* target */ Double, /* start */ Double) => ReadonlyArraystringnumber,
    entries: () => IterableIterator[js.Tuple2[Double, String | Double]],
    every: /* callbackfn */ js.Function3[
      /* value */ String | Double, 
      /* index */ Double, 
      /* array */ js.Array[String | Double], 
      _
    ] => Boolean,
    fill: /* value */ String | Double => ReadonlyArraystringnumber,
    filter: /* callbackfn */ js.Function3[
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
    some: /* callbackfn */ js.Function3[
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
}

