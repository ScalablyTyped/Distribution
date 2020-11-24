package typings.sinon.anon

import typings.sinon.mod.MatchArguments
import typings.sinon.mod.SinonMatcher
import typings.sinon.sinonNumbers.`1`
import typings.std.FlatArray
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<sinon.sinon.MatchArguments<std.Array<any>>> */
@js.native
trait PartialMatchArgumentsArra extends js.Object {
  
  var concat: js.UndefOr[
    SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Array[_], js.Array[_]]]) | (js.Function1[/* repeated */ js.Array[_], js.Array[_]])
  ] = js.native
  
  var copyWithin: js.UndefOr[
    SinonMatcher | (MatchArguments[js.Function2[/* target */ Double, /* start */ Double, this.type]]) | (js.Function2[/* target */ Double, /* start */ Double, this.type])
  ] = js.native
  
  var entries: js.UndefOr[
    SinonMatcher | (MatchArguments[js.Function0[IterableIterator[js.Tuple2[Double, _]]]]) | (js.Function0[IterableIterator[js.Tuple2[Double, _]]])
  ] = js.native
  
  var every: js.UndefOr[
    SinonMatcher | (MatchArguments[
      js.Function1[
        /* predicate */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean], 
        /* is std.Array<any> */ Boolean
      ]
    ]) | (js.Function1[
      /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean], 
      /* is std.Array<any> */ Boolean
    ])
  ] = js.native
  
  var fill: js.UndefOr[
    SinonMatcher | (MatchArguments[js.Function1[/* value */ _, this.type]]) | (js.Function1[/* value */ js.Any, this.type])
  ] = js.native
  
  var filter: js.UndefOr[
    SinonMatcher | (MatchArguments[
      js.Function1[
        /* predicate */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean], 
        js.Array[_]
      ]
    ]) | (js.Function1[
      /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean], 
      js.Array[_]
    ])
  ] = js.native
  
  var find: js.UndefOr[
    SinonMatcher | (MatchArguments[
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
  ] = js.native
  
  var findIndex: js.UndefOr[
    SinonMatcher | (MatchArguments[
      js.Function1[
        /* predicate */ js.Function3[/* value */ _, /* index */ Double, /* obj */ js.Array[_], _], 
        Double
      ]
    ]) | (js.Function1[
      /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[_], _], 
      Double
    ])
  ] = js.native
  
  var flat: js.UndefOr[
    SinonMatcher | (MatchArguments[js.ThisFunction0[/* this */ _, js.Array[FlatArray[_, `1`]]]]) | (js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, `1`]]])
  ] = js.native
  
  var flatMap: js.UndefOr[
    SinonMatcher | (MatchArguments[
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
  ] = js.native
  
  var forEach: js.UndefOr[
    SinonMatcher | (MatchArguments[
      js.Function1[
        /* callbackfn */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], Unit], 
        Unit
      ]
    ]) | (js.Function1[
      /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Unit], 
      Unit
    ])
  ] = js.native
  
  var includes: js.UndefOr[
    SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Boolean]]) | (js.Function1[/* searchElement */ js.Any, Boolean])
  ] = js.native
  
  var indexOf: js.UndefOr[
    SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
  ] = js.native
  
  var join: js.UndefOr[SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]] = js.native
  
  var keys: js.UndefOr[
    SinonMatcher | MatchArguments[js.Function0[IterableIterator[Double]]] | js.Function0[IterableIterator[Double]]
  ] = js.native
  
  var lastIndexOf: js.UndefOr[
    SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
  ] = js.native
  
  var length: js.UndefOr[SinonMatcher | MatchArguments[Double] | Double] = js.native
  
  var map: js.UndefOr[
    SinonMatcher | (MatchArguments[
      js.Function1[
        /* callbackfn */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], _], 
        js.Array[_]
      ]
    ]) | (js.Function1[
      /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], _], 
      js.Array[_]
    ])
  ] = js.native
  
  var pop: js.UndefOr[
    SinonMatcher | MatchArguments[js.Function0[js.UndefOr[_]]] | js.Function0[js.UndefOr[_]]
  ] = js.native
  
  var push: js.UndefOr[
    SinonMatcher | (MatchArguments[js.Function1[/* repeated */ _, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
  ] = js.native
  
  var reduce: js.UndefOr[
    SinonMatcher | (MatchArguments[
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
  ] = js.native
  
  var reduceRight: js.UndefOr[
    SinonMatcher | (MatchArguments[
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
  ] = js.native
  
  var reverse: js.UndefOr[
    SinonMatcher | MatchArguments[js.Function0[js.Array[_]]] | js.Function0[js.Array[_]]
  ] = js.native
  
  var shift: js.UndefOr[
    SinonMatcher | MatchArguments[js.Function0[js.UndefOr[_]]] | js.Function0[js.UndefOr[_]]
  ] = js.native
  
  var slice: js.UndefOr[
    SinonMatcher | MatchArguments[js.Function0[js.Array[_]]] | js.Function0[js.Array[_]]
  ] = js.native
  
  var some: js.UndefOr[
    SinonMatcher | (MatchArguments[
      js.Function1[
        /* predicate */ js.Function3[/* value */ _, /* index */ Double, /* array */ js.Array[_], _], 
        Boolean
      ]
    ]) | (js.Function1[
      /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], _], 
      Boolean
    ])
  ] = js.native
  
  var sort: js.UndefOr[SinonMatcher | MatchArguments[js.Function0[this.type]] | js.Function0[this.type]] = js.native
  
  var splice: js.UndefOr[
    SinonMatcher | (MatchArguments[js.Function1[/* start */ Double, js.Array[_]]]) | (js.Function1[/* start */ Double, js.Array[_]])
  ] = js.native
  
  @JSName("toLocaleString")
  var toLocaleString_FPartialMatchArgumentsArra: js.UndefOr[SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]] = js.native
  
  @JSName("toString")
  var toString_FPartialMatchArgumentsArra: js.UndefOr[SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]] = js.native
  
  var unshift: js.UndefOr[
    SinonMatcher | (MatchArguments[js.Function1[/* repeated */ _, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
  ] = js.native
  
  var values: js.UndefOr[
    SinonMatcher | MatchArguments[js.Function0[IterableIterator[_]]] | js.Function0[IterableIterator[_]]
  ] = js.native
}
object PartialMatchArgumentsArra {
  
  @scala.inline
  def apply(): PartialMatchArgumentsArra = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMatchArgumentsArra]
  }
  
  @scala.inline
  implicit class PartialMatchArgumentsArraOps[Self <: PartialMatchArgumentsArra] (val x: Self) extends AnyVal {
    
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
    def deleteConcat: Self = this.set("concat", js.undefined)
    
    @scala.inline
    def setCopyWithinFunction2(value: (/* target */ Double, /* start */ Double) => PartialMatchArgumentsArra): Self = this.set("copyWithin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCopyWithin(
      value: SinonMatcher | (MatchArguments[js.Function2[/* target */ Double, /* start */ Double, PartialMatchArgumentsArra]]) | (js.Function2[/* target */ Double, /* start */ Double, PartialMatchArgumentsArra])
    ): Self = this.set("copyWithin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyWithin: Self = this.set("copyWithin", js.undefined)
    
    @scala.inline
    def setEntriesFunction0(value: () => IterableIterator[js.Tuple2[Double, _]]): Self = this.set("entries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEntries(
      value: SinonMatcher | (MatchArguments[js.Function0[IterableIterator[js.Tuple2[Double, _]]]]) | (js.Function0[IterableIterator[js.Tuple2[Double, _]]])
    ): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
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
    def deleteEvery: Self = this.set("every", js.undefined)
    
    @scala.inline
    def setFillFunction1(value: /* value */ js.Any => PartialMatchArgumentsArra): Self = this.set("fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFill(
      value: SinonMatcher | (MatchArguments[js.Function1[/* value */ _, PartialMatchArgumentsArra]]) | (js.Function1[/* value */ js.Any, PartialMatchArgumentsArra])
    ): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
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
    def deleteFilter: Self = this.set("filter", js.undefined)
    
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
    def deleteFind: Self = this.set("find", js.undefined)
    
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
    def deleteFindIndex: Self = this.set("findIndex", js.undefined)
    
    @scala.inline
    def setFlat(
      value: SinonMatcher | (MatchArguments[js.ThisFunction0[/* this */ _, js.Array[FlatArray[_, `1`]]]]) | (js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, `1`]]])
    ): Self = this.set("flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlat: Self = this.set("flat", js.undefined)
    
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
    def deleteFlatMap: Self = this.set("flatMap", js.undefined)
    
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
    def deleteForEach: Self = this.set("forEach", js.undefined)
    
    @scala.inline
    def setIncludesFunction1(value: /* searchElement */ js.Any => Boolean): Self = this.set("includes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncludes(
      value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Boolean]]) | (js.Function1[/* searchElement */ js.Any, Boolean])
    ): Self = this.set("includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludes: Self = this.set("includes", js.undefined)
    
    @scala.inline
    def setIndexOfFunction1(value: /* searchElement */ js.Any => Double): Self = this.set("indexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexOf(
      value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
    ): Self = this.set("indexOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexOf: Self = this.set("indexOf", js.undefined)
    
    @scala.inline
    def setJoinFunction0(value: () => String): Self = this.set("join", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJoin(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = this.set("join", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoin: Self = this.set("join", js.undefined)
    
    @scala.inline
    def setKeysFunction0(value: () => IterableIterator[Double]): Self = this.set("keys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeys(
      value: SinonMatcher | MatchArguments[js.Function0[IterableIterator[Double]]] | js.Function0[IterableIterator[Double]]
    ): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    
    @scala.inline
    def setLastIndexOfFunction1(value: /* searchElement */ js.Any => Double): Self = this.set("lastIndexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLastIndexOf(
      value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
    ): Self = this.set("lastIndexOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastIndexOf: Self = this.set("lastIndexOf", js.undefined)
    
    @scala.inline
    def setLength(value: SinonMatcher | MatchArguments[Double] | Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
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
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setPopFunction0(value: () => js.UndefOr[_]): Self = this.set("pop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPop(value: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[_]]] | js.Function0[js.UndefOr[_]]): Self = this.set("pop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePop: Self = this.set("pop", js.undefined)
    
    @scala.inline
    def setPushFunction1(value: /* repeated */ js.Any => Double): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPush(
      value: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ _, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
    ): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    
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
    def deleteReduce: Self = this.set("reduce", js.undefined)
    
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
    def deleteReduceRight: Self = this.set("reduceRight", js.undefined)
    
    @scala.inline
    def setReverseFunction0(value: () => js.Array[_]): Self = this.set("reverse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReverse(value: SinonMatcher | MatchArguments[js.Function0[js.Array[_]]] | js.Function0[js.Array[_]]): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setShiftFunction0(value: () => js.UndefOr[_]): Self = this.set("shift", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShift(value: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[_]]] | js.Function0[js.UndefOr[_]]): Self = this.set("shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShift: Self = this.set("shift", js.undefined)
    
    @scala.inline
    def setSliceFunction0(value: () => js.Array[_]): Self = this.set("slice", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSlice(value: SinonMatcher | MatchArguments[js.Function0[js.Array[_]]] | js.Function0[js.Array[_]]): Self = this.set("slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlice: Self = this.set("slice", js.undefined)
    
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
    def deleteSome: Self = this.set("some", js.undefined)
    
    @scala.inline
    def setSortFunction0(value: () => PartialMatchArgumentsArra): Self = this.set("sort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSort(
      value: SinonMatcher | MatchArguments[js.Function0[PartialMatchArgumentsArra]] | js.Function0[PartialMatchArgumentsArra]
    ): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setSpliceFunction1(value: /* start */ Double => js.Array[_]): Self = this.set("splice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSplice(
      value: SinonMatcher | (MatchArguments[js.Function1[/* start */ Double, js.Array[_]]]) | (js.Function1[/* start */ Double, js.Array[_]])
    ): Self = this.set("splice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplice: Self = this.set("splice", js.undefined)
    
    @scala.inline
    def setToLocaleStringFunction0(value: () => String): Self = this.set("toLocaleString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToLocaleString(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = this.set("toLocaleString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToLocaleString: Self = this.set("toLocaleString", js.undefined)
    
    @scala.inline
    def setToStringFunction0(value: () => String): Self = this.set("toString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToString(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = this.set("toString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
    
    @scala.inline
    def setUnshiftFunction1(value: /* repeated */ js.Any => Double): Self = this.set("unshift", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnshift(
      value: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ _, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
    ): Self = this.set("unshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnshift: Self = this.set("unshift", js.undefined)
    
    @scala.inline
    def setValuesFunction0(value: () => IterableIterator[_]): Self = this.set("values", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValues(
      value: SinonMatcher | MatchArguments[js.Function0[IterableIterator[_]]] | js.Function0[IterableIterator[_]]
    ): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
