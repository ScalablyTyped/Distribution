package typings.sinon.anon

import typings.sinon.mod.MatchArguments
import typings.sinon.mod.SinonMatcher
import typings.sinon.sinonNumbers.`1`
import typings.std.FlatArray
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined sinon.sinon.MatchArguments<std.Array<any>> */
@js.native
trait MatchArgumentsArrayany extends js.Object {
  
  var concat: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Array[_], js.Array[_]]]) | (js.Function1[/* repeated */ js.Array[_], js.Array[_]]) = js.native
  
  var copyWithin: SinonMatcher | (MatchArguments[js.Function2[/* target */ Double, /* start */ Double, this.type]]) | (js.Function2[/* target */ Double, /* start */ Double, this.type]) = js.native
  
  var entries: SinonMatcher | (MatchArguments[js.Function0[IterableIterator[js.Tuple2[Double, _]]]]) | (js.Function0[IterableIterator[js.Tuple2[Double, _]]]) = js.native
  
  var every: SinonMatcher | (MatchArguments[
    js.Function1[
      /* predicate */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean], 
      /* is std.Array<any> */ Boolean
    ]
  ]) | (js.Function1[
    /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean], 
    /* is std.Array<any> */ Boolean
  ]) = js.native
  
  var fill: SinonMatcher | (MatchArguments[js.Function1[/* value */ _, this.type]]) | (js.Function1[/* value */ js.Any, this.type]) = js.native
  
  var filter: SinonMatcher | (MatchArguments[
    js.Function1[
      /* predicate */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean], 
      js.Array[_]
    ]
  ]) | (js.Function1[
    /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean], 
    js.Array[_]
  ]) = js.native
  
  var find: SinonMatcher | (MatchArguments[
    js.Function1[
      /* predicate */ js.ThisFunction3[
        /* this */ Unit, 
        /* value */ _, 
        /* index */ Double, 
        /* obj */ js.Array[_], 
        /* is any */ Boolean
      ], 
      js.UndefOr[_]
    ]
  ]) | (js.Function1[
    /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ js.Any, 
      /* index */ Double, 
      /* obj */ js.Array[_], 
      /* is any */ Boolean
    ], 
    js.UndefOr[_]
  ]) = js.native
  
  var findIndex: SinonMatcher | (MatchArguments[
    js.Function1[
      /* predicate */ js.Function3[/* value */ _, /* index */ Double, /* obj */ js.Array[_], _], 
      Double
    ]
  ]) | (js.Function1[
    /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[_], _], 
    Double
  ]) = js.native
  
  var flat: SinonMatcher | (MatchArguments[js.ThisFunction0[/* this */ _, js.Array[FlatArray[_, `1`]]]]) | (js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, `1`]]]) = js.native
  
  var flatMap: SinonMatcher | (MatchArguments[
    js.Function1[
      /* callback */ js.ThisFunction3[
        /* this */ js.UndefOr[scala.Nothing], 
        /* value */ _, 
        /* index */ Double, 
        /* array */ js.Array[_], 
        _ | js.Array[_]
      ], 
      js.Array[_]
    ]
  ]) | (js.Function1[
    /* callback */ js.ThisFunction3[
      /* this */ js.UndefOr[scala.Nothing], 
      /* value */ js.Any, 
      /* index */ Double, 
      /* array */ js.Array[_], 
      _ | js.Array[_]
    ], 
    js.Array[_]
  ]) = js.native
  
  var forEach: SinonMatcher | (MatchArguments[
    js.Function1[
      /* callbackfn */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], Unit], 
      Unit
    ]
  ]) | (js.Function1[
    /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Unit], 
    Unit
  ]) = js.native
  
  var includes: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Boolean]]) | (js.Function1[/* searchElement */ js.Any, Boolean]) = js.native
  
  var indexOf: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Double]]) | (js.Function1[/* searchElement */ js.Any, Double]) = js.native
  
  var join: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String] = js.native
  
  var keys: SinonMatcher | MatchArguments[js.Function0[IterableIterator[Double]]] | js.Function0[IterableIterator[Double]] = js.native
  
  var lastIndexOf: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Double]]) | (js.Function1[/* searchElement */ js.Any, Double]) = js.native
  
  var length: SinonMatcher | MatchArguments[Double] | Double = js.native
  
  var map: SinonMatcher | (MatchArguments[
    js.Function1[
      /* callbackfn */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], _], 
      js.Array[_]
    ]
  ]) | (js.Function1[
    /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], _], 
    js.Array[_]
  ]) = js.native
  
  var pop: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[_]]] | js.Function0[js.UndefOr[_]] = js.native
  
  var push: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ _, Double]]) | (js.Function1[/* repeated */ js.Any, Double]) = js.native
  
  var reduce: SinonMatcher | (MatchArguments[
    js.Function1[
      /* callbackfn */ js.Function4[
        /* previousValue */ _, 
        /* currentValue */ _, 
        /* currentIndex */ Double, 
        /* array */ js.Array[_], 
        _
      ], 
      _
    ]
  ]) | (js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ js.Any, 
      /* currentValue */ js.Any, 
      /* currentIndex */ Double, 
      /* array */ js.Array[_], 
      _
    ], 
    _
  ]) = js.native
  
  var reduceRight: SinonMatcher | (MatchArguments[
    js.Function1[
      /* callbackfn */ js.Function4[
        /* previousValue */ _, 
        /* currentValue */ _, 
        /* currentIndex */ Double, 
        /* array */ js.Array[_], 
        _
      ], 
      _
    ]
  ]) | (js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ js.Any, 
      /* currentValue */ js.Any, 
      /* currentIndex */ Double, 
      /* array */ js.Array[_], 
      _
    ], 
    _
  ]) = js.native
  
  var reverse: SinonMatcher | MatchArguments[js.Function0[js.Array[_]]] | js.Function0[js.Array[_]] = js.native
  
  var shift: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[_]]] | js.Function0[js.UndefOr[_]] = js.native
  
  var slice: SinonMatcher | MatchArguments[js.Function0[js.Array[_]]] | js.Function0[js.Array[_]] = js.native
  
  var some: SinonMatcher | (MatchArguments[
    js.Function1[
      /* predicate */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], _], 
      Boolean
    ]
  ]) | (js.Function1[
    /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], _], 
    Boolean
  ]) = js.native
  
  var sort: SinonMatcher | MatchArguments[js.Function0[this.type]] | js.Function0[this.type] = js.native
  
  var splice: SinonMatcher | (MatchArguments[js.Function1[/* start */ Double, js.Array[_]]]) | (js.Function1[/* start */ Double, js.Array[_]]) = js.native
  
  @JSName("toLocaleString")
  var toLocaleString_FMatchArgumentsArrayany: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String] = js.native
  
  @JSName("toString")
  var toString_FMatchArgumentsArrayany: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String] = js.native
  
  var unshift: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ _, Double]]) | (js.Function1[/* repeated */ js.Any, Double]) = js.native
  
  var values: SinonMatcher | MatchArguments[js.Function0[IterableIterator[_]]] | js.Function0[IterableIterator[_]] = js.native
}
object MatchArgumentsArrayany {
  
  @scala.inline
  def apply(
    concat: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Array[_], js.Array[_]]]) | (js.Function1[/* repeated */ js.Array[_], js.Array[_]]),
    copyWithin: SinonMatcher | (MatchArguments[js.Function2[/* target */ Double, /* start */ Double, MatchArgumentsArrayany]]) | (js.Function2[/* target */ Double, /* start */ Double, MatchArgumentsArrayany]),
    entries: SinonMatcher | (MatchArguments[js.Function0[IterableIterator[js.Tuple2[Double, _]]]]) | (js.Function0[IterableIterator[js.Tuple2[Double, _]]]),
    every: SinonMatcher | (MatchArguments[
      js.Function1[
        /* predicate */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean], 
        /* is std.Array<any> */ Boolean
      ]
    ]) | (js.Function1[
      /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean], 
      /* is std.Array<any> */ Boolean
    ]),
    fill: SinonMatcher | (MatchArguments[js.Function1[/* value */ _, MatchArgumentsArrayany]]) | (js.Function1[/* value */ js.Any, MatchArgumentsArrayany]),
    filter: SinonMatcher | (MatchArguments[
      js.Function1[
        /* predicate */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean], 
        js.Array[_]
      ]
    ]) | (js.Function1[
      /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean], 
      js.Array[_]
    ]),
    find: SinonMatcher | (MatchArguments[
      js.Function1[
        /* predicate */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ _, 
          /* index */ Double, 
          /* obj */ js.Array[_], 
          /* is any */ Boolean
        ], 
        js.UndefOr[_]
      ]
    ]) | (js.Function1[
      /* predicate */ js.ThisFunction3[
        /* this */ Unit, 
        /* value */ js.Any, 
        /* index */ Double, 
        /* obj */ js.Array[_], 
        /* is any */ Boolean
      ], 
      js.UndefOr[_]
    ]),
    findIndex: SinonMatcher | (MatchArguments[
      js.Function1[
        /* predicate */ js.Function3[/* value */ _, /* index */ Double, /* obj */ js.Array[_], _], 
        Double
      ]
    ]) | (js.Function1[
      /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[_], _], 
      Double
    ]),
    flat: SinonMatcher | (MatchArguments[js.ThisFunction0[/* this */ _, js.Array[FlatArray[_, `1`]]]]) | (js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, `1`]]]),
    flatMap: SinonMatcher | (MatchArguments[
      js.Function1[
        /* callback */ js.ThisFunction3[
          /* this */ js.UndefOr[scala.Nothing], 
          /* value */ _, 
          /* index */ Double, 
          /* array */ js.Array[_], 
          _ | js.Array[_]
        ], 
        js.Array[_]
      ]
    ]) | (js.Function1[
      /* callback */ js.ThisFunction3[
        /* this */ js.UndefOr[scala.Nothing], 
        /* value */ js.Any, 
        /* index */ Double, 
        /* array */ js.Array[_], 
        _ | js.Array[_]
      ], 
      js.Array[_]
    ]),
    forEach: SinonMatcher | (MatchArguments[
      js.Function1[
        /* callbackfn */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], Unit], 
        Unit
      ]
    ]) | (js.Function1[
      /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Unit], 
      Unit
    ]),
    includes: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Boolean]]) | (js.Function1[/* searchElement */ js.Any, Boolean]),
    indexOf: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Double]]) | (js.Function1[/* searchElement */ js.Any, Double]),
    join: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String],
    keys: SinonMatcher | MatchArguments[js.Function0[IterableIterator[Double]]] | js.Function0[IterableIterator[Double]],
    lastIndexOf: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Double]]) | (js.Function1[/* searchElement */ js.Any, Double]),
    length: SinonMatcher | MatchArguments[Double] | Double,
    map: SinonMatcher | (MatchArguments[
      js.Function1[
        /* callbackfn */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], _], 
        js.Array[_]
      ]
    ]) | (js.Function1[
      /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], _], 
      js.Array[_]
    ]),
    pop: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[_]]] | js.Function0[js.UndefOr[_]],
    push: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ _, Double]]) | (js.Function1[/* repeated */ js.Any, Double]),
    reduce: SinonMatcher | (MatchArguments[
      js.Function1[
        /* callbackfn */ js.Function4[
          /* previousValue */ _, 
          /* currentValue */ _, 
          /* currentIndex */ Double, 
          /* array */ js.Array[_], 
          _
        ], 
        _
      ]
    ]) | (js.Function1[
      /* callbackfn */ js.Function4[
        /* previousValue */ js.Any, 
        /* currentValue */ js.Any, 
        /* currentIndex */ Double, 
        /* array */ js.Array[_], 
        _
      ], 
      _
    ]),
    reduceRight: SinonMatcher | (MatchArguments[
      js.Function1[
        /* callbackfn */ js.Function4[
          /* previousValue */ _, 
          /* currentValue */ _, 
          /* currentIndex */ Double, 
          /* array */ js.Array[_], 
          _
        ], 
        _
      ]
    ]) | (js.Function1[
      /* callbackfn */ js.Function4[
        /* previousValue */ js.Any, 
        /* currentValue */ js.Any, 
        /* currentIndex */ Double, 
        /* array */ js.Array[_], 
        _
      ], 
      _
    ]),
    reverse: SinonMatcher | MatchArguments[js.Function0[js.Array[_]]] | js.Function0[js.Array[_]],
    shift: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[_]]] | js.Function0[js.UndefOr[_]],
    slice: SinonMatcher | MatchArguments[js.Function0[js.Array[_]]] | js.Function0[js.Array[_]],
    some: SinonMatcher | (MatchArguments[
      js.Function1[
        /* predicate */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], _], 
        Boolean
      ]
    ]) | (js.Function1[
      /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], _], 
      Boolean
    ]),
    sort: SinonMatcher | MatchArguments[js.Function0[MatchArgumentsArrayany]] | js.Function0[MatchArgumentsArrayany],
    splice: SinonMatcher | (MatchArguments[js.Function1[/* start */ Double, js.Array[_]]]) | (js.Function1[/* start */ Double, js.Array[_]]),
    toLocaleString: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String],
    toString: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String],
    unshift: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ _, Double]]) | (js.Function1[/* repeated */ js.Any, Double]),
    values: SinonMatcher | MatchArguments[js.Function0[IterableIterator[_]]] | js.Function0[IterableIterator[_]]
  ): MatchArgumentsArrayany = {
    val __obj = js.Dynamic.literal(concat = concat.asInstanceOf[js.Any], copyWithin = copyWithin.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], every = every.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], findIndex = findIndex.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any], flatMap = flatMap.asInstanceOf[js.Any], forEach = forEach.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], indexOf = indexOf.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], lastIndexOf = lastIndexOf.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], pop = pop.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], reduce = reduce.asInstanceOf[js.Any], reduceRight = reduceRight.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any], some = some.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], splice = splice.asInstanceOf[js.Any], toLocaleString = toLocaleString.asInstanceOf[js.Any], toString = toString.asInstanceOf[js.Any], unshift = unshift.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchArgumentsArrayany]
  }
  
  @scala.inline
  implicit class MatchArgumentsArrayanyOps[Self <: MatchArgumentsArrayany] (val x: Self) extends AnyVal {
    
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
    def setConcatFunction1(value: /* repeated */ js.Array[_] => js.Array[_]): Self = this.set("concat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConcat(
      value: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Array[_], js.Array[_]]]) | (js.Function1[/* repeated */ js.Array[_], js.Array[_]])
    ): Self = this.set("concat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyWithinFunction2(value: (/* target */ Double, /* start */ Double) => MatchArgumentsArrayany): Self = this.set("copyWithin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCopyWithin(
      value: SinonMatcher | (MatchArguments[js.Function2[/* target */ Double, /* start */ Double, MatchArgumentsArrayany]]) | (js.Function2[/* target */ Double, /* start */ Double, MatchArgumentsArrayany])
    ): Self = this.set("copyWithin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesFunction0(value: () => IterableIterator[js.Tuple2[Double, _]]): Self = this.set("entries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEntries(
      value: SinonMatcher | (MatchArguments[js.Function0[IterableIterator[js.Tuple2[Double, _]]]]) | (js.Function0[IterableIterator[js.Tuple2[Double, _]]])
    ): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEveryFunction1(
      value: /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean] => /* is std.Array<any> */ Boolean
    ): Self = this.set("every", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEvery(
      value: SinonMatcher | (MatchArguments[
          js.Function1[
            /* predicate */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean], 
            /* is std.Array<any> */ Boolean
          ]
        ]) | (js.Function1[
          /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean], 
          /* is std.Array<any> */ Boolean
        ])
    ): Self = this.set("every", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillFunction1(value: /* value */ js.Any => MatchArgumentsArrayany): Self = this.set("fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFill(
      value: SinonMatcher | (MatchArguments[js.Function1[/* value */ _, MatchArgumentsArrayany]]) | (js.Function1[/* value */ js.Any, MatchArgumentsArrayany])
    ): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterFunction1(
      value: /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean] => js.Array[_]
    ): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilter(
      value: SinonMatcher | (MatchArguments[
          js.Function1[
            /* predicate */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean], 
            js.Array[_]
          ]
        ]) | (js.Function1[
          /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean], 
          js.Array[_]
        ])
    ): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindFunction1(
      value: /* predicate */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ js.Any, 
          /* index */ Double, 
          /* obj */ js.Array[_], 
          /* is any */ Boolean
        ] => js.UndefOr[_]
    ): Self = this.set("find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFind(
      value: SinonMatcher | (MatchArguments[
          js.Function1[
            /* predicate */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ _, 
              /* index */ Double, 
              /* obj */ js.Array[_], 
              /* is any */ Boolean
            ], 
            js.UndefOr[_]
          ]
        ]) | (js.Function1[
          /* predicate */ js.ThisFunction3[
            /* this */ Unit, 
            /* value */ js.Any, 
            /* index */ Double, 
            /* obj */ js.Array[_], 
            /* is any */ Boolean
          ], 
          js.UndefOr[_]
        ])
    ): Self = this.set("find", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindIndexFunction1(
      value: /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[_], _] => Double
    ): Self = this.set("findIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindIndex(
      value: SinonMatcher | (MatchArguments[
          js.Function1[
            /* predicate */ js.Function3[/* value */ _, /* index */ Double, /* obj */ js.Array[_], _], 
            Double
          ]
        ]) | (js.Function1[
          /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[_], _], 
          Double
        ])
    ): Self = this.set("findIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlat(
      value: SinonMatcher | (MatchArguments[js.ThisFunction0[/* this */ _, js.Array[FlatArray[_, `1`]]]]) | (js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, `1`]]])
    ): Self = this.set("flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatMapFunction1(
      value: /* callback */ js.ThisFunction3[
          /* this */ js.UndefOr[scala.Nothing], 
          /* value */ js.Any, 
          /* index */ Double, 
          /* array */ js.Array[_], 
          _ | js.Array[_]
        ] => js.Array[_]
    ): Self = this.set("flatMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFlatMap(
      value: SinonMatcher | (MatchArguments[
          js.Function1[
            /* callback */ js.ThisFunction3[
              /* this */ js.UndefOr[scala.Nothing], 
              /* value */ _, 
              /* index */ Double, 
              /* array */ js.Array[_], 
              _ | js.Array[_]
            ], 
            js.Array[_]
          ]
        ]) | (js.Function1[
          /* callback */ js.ThisFunction3[
            /* this */ js.UndefOr[scala.Nothing], 
            /* value */ js.Any, 
            /* index */ Double, 
            /* array */ js.Array[_], 
            _ | js.Array[_]
          ], 
          js.Array[_]
        ])
    ): Self = this.set("flatMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForEachFunction1(
      value: /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Unit] => Unit
    ): Self = this.set("forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForEach(
      value: SinonMatcher | (MatchArguments[
          js.Function1[
            /* callbackfn */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], Unit], 
            Unit
          ]
        ]) | (js.Function1[
          /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Unit], 
          Unit
        ])
    ): Self = this.set("forEach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludesFunction1(value: /* searchElement */ js.Any => Boolean): Self = this.set("includes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncludes(
      value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Boolean]]) | (js.Function1[/* searchElement */ js.Any, Boolean])
    ): Self = this.set("includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexOfFunction1(value: /* searchElement */ js.Any => Double): Self = this.set("indexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexOf(
      value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
    ): Self = this.set("indexOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinFunction0(value: () => String): Self = this.set("join", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJoin(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = this.set("join", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysFunction0(value: () => IterableIterator[Double]): Self = this.set("keys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeys(
      value: SinonMatcher | MatchArguments[js.Function0[IterableIterator[Double]]] | js.Function0[IterableIterator[Double]]
    ): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastIndexOfFunction1(value: /* searchElement */ js.Any => Double): Self = this.set("lastIndexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLastIndexOf(
      value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
    ): Self = this.set("lastIndexOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: SinonMatcher | MatchArguments[Double] | Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapFunction1(
      value: /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], _] => js.Array[_]
    ): Self = this.set("map", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMap(
      value: SinonMatcher | (MatchArguments[
          js.Function1[
            /* callbackfn */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], _], 
            js.Array[_]
          ]
        ]) | (js.Function1[
          /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], _], 
          js.Array[_]
        ])
    ): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopFunction0(value: () => js.UndefOr[_]): Self = this.set("pop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPop(value: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[_]]] | js.Function0[js.UndefOr[_]]): Self = this.set("pop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushFunction1(value: /* repeated */ js.Any => Double): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPush(
      value: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ _, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
    ): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReduceFunction1(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ js.Any, 
          /* currentValue */ js.Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[_], 
          _
        ] => _
    ): Self = this.set("reduce", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReduce(
      value: SinonMatcher | (MatchArguments[
          js.Function1[
            /* callbackfn */ js.Function4[
              /* previousValue */ _, 
              /* currentValue */ _, 
              /* currentIndex */ Double, 
              /* array */ js.Array[_], 
              _
            ], 
            _
          ]
        ]) | (js.Function1[
          /* callbackfn */ js.Function4[
            /* previousValue */ js.Any, 
            /* currentValue */ js.Any, 
            /* currentIndex */ Double, 
            /* array */ js.Array[_], 
            _
          ], 
          _
        ])
    ): Self = this.set("reduce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReduceRightFunction1(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ js.Any, 
          /* currentValue */ js.Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[_], 
          _
        ] => _
    ): Self = this.set("reduceRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReduceRight(
      value: SinonMatcher | (MatchArguments[
          js.Function1[
            /* callbackfn */ js.Function4[
              /* previousValue */ _, 
              /* currentValue */ _, 
              /* currentIndex */ Double, 
              /* array */ js.Array[_], 
              _
            ], 
            _
          ]
        ]) | (js.Function1[
          /* callbackfn */ js.Function4[
            /* previousValue */ js.Any, 
            /* currentValue */ js.Any, 
            /* currentIndex */ Double, 
            /* array */ js.Array[_], 
            _
          ], 
          _
        ])
    ): Self = this.set("reduceRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseFunction0(value: () => js.Array[_]): Self = this.set("reverse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReverse(value: SinonMatcher | MatchArguments[js.Function0[js.Array[_]]] | js.Function0[js.Array[_]]): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftFunction0(value: () => js.UndefOr[_]): Self = this.set("shift", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShift(value: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[_]]] | js.Function0[js.UndefOr[_]]): Self = this.set("shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliceFunction0(value: () => js.Array[_]): Self = this.set("slice", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSlice(value: SinonMatcher | MatchArguments[js.Function0[js.Array[_]]] | js.Function0[js.Array[_]]): Self = this.set("slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSomeFunction1(
      value: /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], _] => Boolean
    ): Self = this.set("some", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSome(
      value: SinonMatcher | (MatchArguments[
          js.Function1[
            /* predicate */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], _], 
            Boolean
          ]
        ]) | (js.Function1[
          /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], _], 
          Boolean
        ])
    ): Self = this.set("some", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortFunction0(value: () => MatchArgumentsArrayany): Self = this.set("sort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSort(
      value: SinonMatcher | MatchArguments[js.Function0[MatchArgumentsArrayany]] | js.Function0[MatchArgumentsArrayany]
    ): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpliceFunction1(value: /* start */ Double => js.Array[_]): Self = this.set("splice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSplice(
      value: SinonMatcher | (MatchArguments[js.Function1[/* start */ Double, js.Array[_]]]) | (js.Function1[/* start */ Double, js.Array[_]])
    ): Self = this.set("splice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToLocaleStringFunction0(value: () => String): Self = this.set("toLocaleString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToLocaleString(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = this.set("toLocaleString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToStringFunction0(value: () => String): Self = this.set("toString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToString(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = this.set("toString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnshiftFunction1(value: /* repeated */ js.Any => Double): Self = this.set("unshift", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnshift(
      value: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ _, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
    ): Self = this.set("unshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesFunction0(value: () => IterableIterator[_]): Self = this.set("values", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValues(
      value: SinonMatcher | MatchArguments[js.Function0[IterableIterator[_]]] | js.Function0[IterableIterator[_]]
    ): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
