package typings.sinon

import typings.sinon.mod.MatchArguments
import typings.sinon.mod.SinonFakeServer
import typings.sinon.mod.SinonFakeTimers
import typings.sinon.mod.SinonMatcher
import typings.sinon.mod.SinonSandbox
import typings.sinon.mod.SinonSpy
import typings.sinon.sinonNumbers.`1`
import typings.std.Date
import typings.std.FlatArray
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    /**
      * @deprecated Since 5.0, use `sinon.createSandbox` instead
      */
    def create(): SinonSandbox = js.native
    def create(config: PartialSinonSandboxConfig): SinonSandbox = js.native
  }
  
  trait Abort extends StObject {
    
    var abort: js.Array[js.Any]
    
    var error: js.Array[js.Any]
    
    var load: js.Array[js.Any]
    
    var progress: js.Array[js.Any]
  }
  object Abort {
    
    inline def apply(
      abort: js.Array[js.Any],
      error: js.Array[js.Any],
      load: js.Array[js.Any],
      progress: js.Array[js.Any]
    ): Abort = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[Abort]
    }
    
    extension [Self <: Abort](x: Self) {
      
      inline def setAbort(value: js.Array[js.Any]): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      inline def setAbortVarargs(value: js.Any*): Self = StObject.set(x, "abort", js.Array(value :_*))
      
      inline def setError(value: js.Array[js.Any]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorVarargs(value: js.Any*): Self = StObject.set(x, "error", js.Array(value :_*))
      
      inline def setLoad(value: js.Array[js.Any]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      inline def setLoadVarargs(value: js.Any*): Self = StObject.set(x, "load", js.Array(value :_*))
      
      inline def setProgress(value: js.Array[js.Any]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressVarargs(value: js.Any*): Self = StObject.set(x, "progress", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Create extends StObject {
    
    def create(now: Double): SinonFakeTimers = js.native
    def create(now: Date): SinonFakeTimers = js.native
  }
  
  trait Get[T, K /* <: /* keyof T */ String */] extends StObject {
    
    // Methods
    def get(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
    ): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    @JSName("get")
    var get_Original: SinonSpy[
        js.Array[js.Any], 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ]
    
    // Methods
    def set(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
    ): Unit
    @JSName("set")
    var set_Original: SinonSpy[
        js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ], 
        Unit
      ]
  }
  object Get {
    
    inline def apply[T, K /* <: /* keyof T */ String */](
      get: SinonSpy[
          js.Array[js.Any], 
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ],
      set: SinonSpy[
          js.Array[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
          ], 
          Unit
        ]
    ): Get[T, K] = {
      val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.asInstanceOf[Get[T, K]]
    }
    
    extension [Self <: Get[?, ?], T, K /* <: /* keyof T */ String */](x: Self & (Get[T, K])) {
      
      inline def setGet(
        value: SinonSpy[
              js.Array[js.Any], 
              /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
            ]
      ): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setSet(
        value: SinonSpy[
              js.Array[
                /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
              ], 
              Unit
            ]
      ): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined sinon.sinon.MatchArguments<std.Array<any>> */
  trait MatchArgumentsArrayany extends StObject {
    
    var concat: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Array[js.Any], js.Array[js.Any]]]) | (js.Function1[/* repeated */ js.Array[js.Any], js.Array[js.Any]])
    
    var copyWithin: SinonMatcher | (MatchArguments[js.Function2[/* target */ Double, /* start */ Double, this.type]]) | (js.Function2[/* target */ Double, /* start */ Double, this.type])
    
    var entries: SinonMatcher | (MatchArguments[js.Function0[IterableIterator[js.Tuple2[Double, js.Any]]]]) | (js.Function0[IterableIterator[js.Tuple2[Double, js.Any]]])
    
    var every: SinonMatcher | (MatchArguments[
        js.Function1[
          /* predicate */ js.Function3[
            /* value */ js.Any, 
            /* index */ Double, 
            /* array */ js.Array[js.Any], 
            /* is any */ Boolean
          ], 
          /* is std.Array<any> */ Boolean
        ]
      ]) | (js.Function1[
        /* predicate */ js.Function3[
          /* value */ js.Any, 
          /* index */ Double, 
          /* array */ js.Array[js.Any], 
          /* is any */ Boolean
        ], 
        /* is std.Array<any> */ Boolean
      ])
    
    var fill: SinonMatcher | (MatchArguments[js.Function1[/* value */ js.Any, this.type]]) | (js.Function1[/* value */ js.Any, this.type])
    
    var filter: SinonMatcher | (MatchArguments[
        js.Function1[
          /* predicate */ js.Function3[
            /* value */ js.Any, 
            /* index */ Double, 
            /* array */ js.Array[js.Any], 
            /* is any */ Boolean
          ], 
          js.Array[js.Any]
        ]
      ]) | (js.Function1[
        /* predicate */ js.Function3[
          /* value */ js.Any, 
          /* index */ Double, 
          /* array */ js.Array[js.Any], 
          /* is any */ Boolean
        ], 
        js.Array[js.Any]
      ])
    
    var find: SinonMatcher | (MatchArguments[
        js.Function1[
          /* predicate */ js.ThisFunction3[
            /* this */ Unit, 
            /* value */ js.Any, 
            /* index */ Double, 
            /* obj */ js.Array[js.Any], 
            /* is any */ Boolean
          ], 
          js.UndefOr[js.Any]
        ]
      ]) | (js.Function1[
        /* predicate */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ js.Any, 
          /* index */ Double, 
          /* obj */ js.Array[js.Any], 
          /* is any */ Boolean
        ], 
        js.UndefOr[js.Any]
      ])
    
    var findIndex: SinonMatcher | (MatchArguments[
        js.Function1[
          /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[js.Any], js.Any], 
          Double
        ]
      ]) | (js.Function1[
        /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[js.Any], js.Any], 
        Double
      ])
    
    var flat: SinonMatcher | (MatchArguments[js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[js.Any, `1`]]]]) | (js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[js.Any, `1`]]])
    
    var flatMap: SinonMatcher | (MatchArguments[
        js.Function1[
          /* callback */ js.ThisFunction3[
            /* this */ Unit, 
            /* value */ js.Any, 
            /* index */ Double, 
            /* array */ js.Array[js.Any], 
            js.Any | js.Array[js.Any]
          ], 
          js.Array[js.Any]
        ]
      ]) | (js.Function1[
        /* callback */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ js.Any, 
          /* index */ Double, 
          /* array */ js.Array[js.Any], 
          js.Any | js.Array[js.Any]
        ], 
        js.Array[js.Any]
      ])
    
    var forEach: SinonMatcher | (MatchArguments[
        js.Function1[
          /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], Unit], 
          Unit
        ]
      ]) | (js.Function1[
        /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], Unit], 
        Unit
      ])
    
    var includes: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ js.Any, Boolean]]) | (js.Function1[/* searchElement */ js.Any, Boolean])
    
    var indexOf: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ js.Any, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
    
    var join: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]
    
    var keys: SinonMatcher | MatchArguments[js.Function0[IterableIterator[Double]]] | js.Function0[IterableIterator[Double]]
    
    var lastIndexOf: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ js.Any, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
    
    var length: SinonMatcher | MatchArguments[Double] | Double
    
    var map: SinonMatcher | (MatchArguments[
        js.Function1[
          /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
          js.Array[js.Any]
        ]
      ]) | (js.Function1[
        /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
        js.Array[js.Any]
      ])
    
    var pop: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[js.Any]]] | js.Function0[js.UndefOr[js.Any]]
    
    var push: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Any, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
    
    var reduce: SinonMatcher | (MatchArguments[
        js.Function1[
          /* callbackfn */ js.Function4[
            /* previousValue */ js.Any, 
            /* currentValue */ js.Any, 
            /* currentIndex */ Double, 
            /* array */ js.Array[js.Any], 
            js.Any
          ], 
          js.Any
        ]
      ]) | (js.Function1[
        /* callbackfn */ js.Function4[
          /* previousValue */ js.Any, 
          /* currentValue */ js.Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[js.Any], 
          js.Any
        ], 
        js.Any
      ])
    
    var reduceRight: SinonMatcher | (MatchArguments[
        js.Function1[
          /* callbackfn */ js.Function4[
            /* previousValue */ js.Any, 
            /* currentValue */ js.Any, 
            /* currentIndex */ Double, 
            /* array */ js.Array[js.Any], 
            js.Any
          ], 
          js.Any
        ]
      ]) | (js.Function1[
        /* callbackfn */ js.Function4[
          /* previousValue */ js.Any, 
          /* currentValue */ js.Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[js.Any], 
          js.Any
        ], 
        js.Any
      ])
    
    var reverse: SinonMatcher | MatchArguments[js.Function0[js.Array[js.Any]]] | js.Function0[js.Array[js.Any]]
    
    var shift: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[js.Any]]] | js.Function0[js.UndefOr[js.Any]]
    
    var slice: SinonMatcher | MatchArguments[js.Function0[js.Array[js.Any]]] | js.Function0[js.Array[js.Any]]
    
    var some: SinonMatcher | (MatchArguments[
        js.Function1[
          /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
          Boolean
        ]
      ]) | (js.Function1[
        /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
        Boolean
      ])
    
    var sort: SinonMatcher | MatchArguments[js.Function0[this.type]] | js.Function0[this.type]
    
    var splice: SinonMatcher | (MatchArguments[js.Function1[/* start */ Double, js.Array[js.Any]]]) | (js.Function1[/* start */ Double, js.Array[js.Any]])
    
    @JSName("toLocaleString")
    var toLocaleString_FMatchArgumentsArrayany: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]
    
    @JSName("toString")
    var toString_FMatchArgumentsArrayany: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]
    
    var unshift: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Any, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
    
    var values: SinonMatcher | MatchArguments[js.Function0[IterableIterator[js.Any]]] | js.Function0[IterableIterator[js.Any]]
  }
  object MatchArgumentsArrayany {
    
    inline def apply(
      concat: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Array[js.Any], js.Array[js.Any]]]) | (js.Function1[/* repeated */ js.Array[js.Any], js.Array[js.Any]]),
      copyWithin: SinonMatcher | (MatchArguments[js.Function2[/* target */ Double, /* start */ Double, MatchArgumentsArrayany]]) | (js.Function2[/* target */ Double, /* start */ Double, MatchArgumentsArrayany]),
      entries: SinonMatcher | (MatchArguments[js.Function0[IterableIterator[js.Tuple2[Double, js.Any]]]]) | (js.Function0[IterableIterator[js.Tuple2[Double, js.Any]]]),
      every: SinonMatcher | (MatchArguments[
          js.Function1[
            /* predicate */ js.Function3[
              /* value */ js.Any, 
              /* index */ Double, 
              /* array */ js.Array[js.Any], 
              /* is any */ Boolean
            ], 
            /* is std.Array<any> */ Boolean
          ]
        ]) | (js.Function1[
          /* predicate */ js.Function3[
            /* value */ js.Any, 
            /* index */ Double, 
            /* array */ js.Array[js.Any], 
            /* is any */ Boolean
          ], 
          /* is std.Array<any> */ Boolean
        ]),
      fill: SinonMatcher | (MatchArguments[js.Function1[/* value */ js.Any, MatchArgumentsArrayany]]) | (js.Function1[/* value */ js.Any, MatchArgumentsArrayany]),
      filter: SinonMatcher | (MatchArguments[
          js.Function1[
            /* predicate */ js.Function3[
              /* value */ js.Any, 
              /* index */ Double, 
              /* array */ js.Array[js.Any], 
              /* is any */ Boolean
            ], 
            js.Array[js.Any]
          ]
        ]) | (js.Function1[
          /* predicate */ js.Function3[
            /* value */ js.Any, 
            /* index */ Double, 
            /* array */ js.Array[js.Any], 
            /* is any */ Boolean
          ], 
          js.Array[js.Any]
        ]),
      find: SinonMatcher | (MatchArguments[
          js.Function1[
            /* predicate */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ js.Any, 
              /* index */ Double, 
              /* obj */ js.Array[js.Any], 
              /* is any */ Boolean
            ], 
            js.UndefOr[js.Any]
          ]
        ]) | (js.Function1[
          /* predicate */ js.ThisFunction3[
            /* this */ Unit, 
            /* value */ js.Any, 
            /* index */ Double, 
            /* obj */ js.Array[js.Any], 
            /* is any */ Boolean
          ], 
          js.UndefOr[js.Any]
        ]),
      findIndex: SinonMatcher | (MatchArguments[
          js.Function1[
            /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[js.Any], js.Any], 
            Double
          ]
        ]) | (js.Function1[
          /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[js.Any], js.Any], 
          Double
        ]),
      flat: SinonMatcher | (MatchArguments[js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[js.Any, `1`]]]]) | (js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[js.Any, `1`]]]),
      flatMap: SinonMatcher | (MatchArguments[
          js.Function1[
            /* callback */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ js.Any, 
              /* index */ Double, 
              /* array */ js.Array[js.Any], 
              js.Any | js.Array[js.Any]
            ], 
            js.Array[js.Any]
          ]
        ]) | (js.Function1[
          /* callback */ js.ThisFunction3[
            /* this */ Unit, 
            /* value */ js.Any, 
            /* index */ Double, 
            /* array */ js.Array[js.Any], 
            js.Any | js.Array[js.Any]
          ], 
          js.Array[js.Any]
        ]),
      forEach: SinonMatcher | (MatchArguments[
          js.Function1[
            /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], Unit], 
            Unit
          ]
        ]) | (js.Function1[
          /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], Unit], 
          Unit
        ]),
      includes: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ js.Any, Boolean]]) | (js.Function1[/* searchElement */ js.Any, Boolean]),
      indexOf: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ js.Any, Double]]) | (js.Function1[/* searchElement */ js.Any, Double]),
      join: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String],
      keys: SinonMatcher | MatchArguments[js.Function0[IterableIterator[Double]]] | js.Function0[IterableIterator[Double]],
      lastIndexOf: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ js.Any, Double]]) | (js.Function1[/* searchElement */ js.Any, Double]),
      length: SinonMatcher | MatchArguments[Double] | Double,
      map: SinonMatcher | (MatchArguments[
          js.Function1[
            /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
            js.Array[js.Any]
          ]
        ]) | (js.Function1[
          /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
          js.Array[js.Any]
        ]),
      pop: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[js.Any]]] | js.Function0[js.UndefOr[js.Any]],
      push: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Any, Double]]) | (js.Function1[/* repeated */ js.Any, Double]),
      reduce: SinonMatcher | (MatchArguments[
          js.Function1[
            /* callbackfn */ js.Function4[
              /* previousValue */ js.Any, 
              /* currentValue */ js.Any, 
              /* currentIndex */ Double, 
              /* array */ js.Array[js.Any], 
              js.Any
            ], 
            js.Any
          ]
        ]) | (js.Function1[
          /* callbackfn */ js.Function4[
            /* previousValue */ js.Any, 
            /* currentValue */ js.Any, 
            /* currentIndex */ Double, 
            /* array */ js.Array[js.Any], 
            js.Any
          ], 
          js.Any
        ]),
      reduceRight: SinonMatcher | (MatchArguments[
          js.Function1[
            /* callbackfn */ js.Function4[
              /* previousValue */ js.Any, 
              /* currentValue */ js.Any, 
              /* currentIndex */ Double, 
              /* array */ js.Array[js.Any], 
              js.Any
            ], 
            js.Any
          ]
        ]) | (js.Function1[
          /* callbackfn */ js.Function4[
            /* previousValue */ js.Any, 
            /* currentValue */ js.Any, 
            /* currentIndex */ Double, 
            /* array */ js.Array[js.Any], 
            js.Any
          ], 
          js.Any
        ]),
      reverse: SinonMatcher | MatchArguments[js.Function0[js.Array[js.Any]]] | js.Function0[js.Array[js.Any]],
      shift: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[js.Any]]] | js.Function0[js.UndefOr[js.Any]],
      slice: SinonMatcher | MatchArguments[js.Function0[js.Array[js.Any]]] | js.Function0[js.Array[js.Any]],
      some: SinonMatcher | (MatchArguments[
          js.Function1[
            /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
            Boolean
          ]
        ]) | (js.Function1[
          /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
          Boolean
        ]),
      sort: SinonMatcher | MatchArguments[js.Function0[MatchArgumentsArrayany]] | js.Function0[MatchArgumentsArrayany],
      splice: SinonMatcher | (MatchArguments[js.Function1[/* start */ Double, js.Array[js.Any]]]) | (js.Function1[/* start */ Double, js.Array[js.Any]]),
      toLocaleString: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String],
      toString_ : SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String],
      unshift: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Any, Double]]) | (js.Function1[/* repeated */ js.Any, Double]),
      values: SinonMatcher | MatchArguments[js.Function0[IterableIterator[js.Any]]] | js.Function0[IterableIterator[js.Any]]
    ): MatchArgumentsArrayany = {
      val __obj = js.Dynamic.literal(concat = concat.asInstanceOf[js.Any], copyWithin = copyWithin.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], every = every.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], findIndex = findIndex.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any], flatMap = flatMap.asInstanceOf[js.Any], forEach = forEach.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], indexOf = indexOf.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], lastIndexOf = lastIndexOf.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], pop = pop.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], reduce = reduce.asInstanceOf[js.Any], reduceRight = reduceRight.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any], some = some.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], splice = splice.asInstanceOf[js.Any], toLocaleString = toLocaleString.asInstanceOf[js.Any], unshift = unshift.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchArgumentsArrayany]
    }
    
    extension [Self <: MatchArgumentsArrayany](x: Self) {
      
      inline def setConcat(
        value: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Array[js.Any], js.Array[js.Any]]]) | (js.Function1[/* repeated */ js.Array[js.Any], js.Array[js.Any]])
      ): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
      
      inline def setConcatFunction1(value: /* repeated */ js.Array[js.Any] => js.Array[js.Any]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setCopyWithin(
        value: SinonMatcher | (MatchArguments[js.Function2[/* target */ Double, /* start */ Double, MatchArgumentsArrayany]]) | (js.Function2[/* target */ Double, /* start */ Double, MatchArgumentsArrayany])
      ): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
      
      inline def setCopyWithinFunction2(value: (/* target */ Double, /* start */ Double) => MatchArgumentsArrayany): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
      
      inline def setEntries(
        value: SinonMatcher | (MatchArguments[js.Function0[IterableIterator[js.Tuple2[Double, js.Any]]]]) | (js.Function0[IterableIterator[js.Tuple2[Double, js.Any]]])
      ): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesFunction0(value: () => IterableIterator[js.Tuple2[Double, js.Any]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setEvery(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* predicate */ js.Function3[
                  /* value */ js.Any, 
                  /* index */ Double, 
                  /* array */ js.Array[js.Any], 
                  /* is any */ Boolean
                ], 
                /* is std.Array<any> */ Boolean
              ]
            ]) | (js.Function1[
              /* predicate */ js.Function3[
                /* value */ js.Any, 
                /* index */ Double, 
                /* array */ js.Array[js.Any], 
                /* is any */ Boolean
              ], 
              /* is std.Array<any> */ Boolean
            ])
      ): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
      
      inline def setEveryFunction1(
        value: /* predicate */ js.Function3[
              /* value */ js.Any, 
              /* index */ Double, 
              /* array */ js.Array[js.Any], 
              /* is any */ Boolean
            ] => /* is std.Array<any> */ Boolean
      ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      inline def setFill(
        value: SinonMatcher | (MatchArguments[js.Function1[/* value */ js.Any, MatchArgumentsArrayany]]) | (js.Function1[/* value */ js.Any, MatchArgumentsArrayany])
      ): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillFunction1(value: /* value */ js.Any => MatchArgumentsArrayany): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setFilter(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* predicate */ js.Function3[
                  /* value */ js.Any, 
                  /* index */ Double, 
                  /* array */ js.Array[js.Any], 
                  /* is any */ Boolean
                ], 
                js.Array[js.Any]
              ]
            ]) | (js.Function1[
              /* predicate */ js.Function3[
                /* value */ js.Any, 
                /* index */ Double, 
                /* array */ js.Array[js.Any], 
                /* is any */ Boolean
              ], 
              js.Array[js.Any]
            ])
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction1(
        value: /* predicate */ js.Function3[
              /* value */ js.Any, 
              /* index */ Double, 
              /* array */ js.Array[js.Any], 
              /* is any */ Boolean
            ] => js.Array[js.Any]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFind(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* predicate */ js.ThisFunction3[
                  /* this */ Unit, 
                  /* value */ js.Any, 
                  /* index */ Double, 
                  /* obj */ js.Array[js.Any], 
                  /* is any */ Boolean
                ], 
                js.UndefOr[js.Any]
              ]
            ]) | (js.Function1[
              /* predicate */ js.ThisFunction3[
                /* this */ Unit, 
                /* value */ js.Any, 
                /* index */ Double, 
                /* obj */ js.Array[js.Any], 
                /* is any */ Boolean
              ], 
              js.UndefOr[js.Any]
            ])
      ): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setFindFunction1(
        value: /* predicate */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ js.Any, 
              /* index */ Double, 
              /* obj */ js.Array[js.Any], 
              /* is any */ Boolean
            ] => js.UndefOr[js.Any]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindIndex(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[js.Any], js.Any], 
                Double
              ]
            ]) | (js.Function1[
              /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[js.Any], js.Any], 
              Double
            ])
      ): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
      
      inline def setFindIndexFunction1(
        value: /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[js.Any], js.Any] => Double
      ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      inline def setFlat(
        value: SinonMatcher | (MatchArguments[js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[js.Any, `1`]]]]) | (js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[js.Any, `1`]]])
      ): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatMap(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* callback */ js.ThisFunction3[
                  /* this */ Unit, 
                  /* value */ js.Any, 
                  /* index */ Double, 
                  /* array */ js.Array[js.Any], 
                  js.Any | js.Array[js.Any]
                ], 
                js.Array[js.Any]
              ]
            ]) | (js.Function1[
              /* callback */ js.ThisFunction3[
                /* this */ Unit, 
                /* value */ js.Any, 
                /* index */ Double, 
                /* array */ js.Array[js.Any], 
                js.Any | js.Array[js.Any]
              ], 
              js.Array[js.Any]
            ])
      ): Self = StObject.set(x, "flatMap", value.asInstanceOf[js.Any])
      
      inline def setFlatMapFunction1(
        value: /* callback */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ js.Any, 
              /* index */ Double, 
              /* array */ js.Array[js.Any], 
              js.Any | js.Array[js.Any]
            ] => js.Array[js.Any]
      ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setForEach(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], Unit], 
                Unit
              ]
            ]) | (js.Function1[
              /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], Unit], 
              Unit
            ])
      ): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
      
      inline def setForEachFunction1(
        value: /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], Unit] => Unit
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setIncludes(
        value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ js.Any, Boolean]]) | (js.Function1[/* searchElement */ js.Any, Boolean])
      ): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesFunction1(value: /* searchElement */ js.Any => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      inline def setIndexOf(
        value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ js.Any, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
      ): Self = StObject.set(x, "indexOf", value.asInstanceOf[js.Any])
      
      inline def setIndexOfFunction1(value: /* searchElement */ js.Any => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setJoin(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinFunction0(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
      
      inline def setKeys(
        value: SinonMatcher | MatchArguments[js.Function0[IterableIterator[Double]]] | js.Function0[IterableIterator[Double]]
      ): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysFunction0(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setLastIndexOf(
        value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ js.Any, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
      ): Self = StObject.set(x, "lastIndexOf", value.asInstanceOf[js.Any])
      
      inline def setLastIndexOfFunction1(value: /* searchElement */ js.Any => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      inline def setLength(value: SinonMatcher | MatchArguments[Double] | Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMap(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
                js.Array[js.Any]
              ]
            ]) | (js.Function1[
              /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
              js.Array[js.Any]
            ])
      ): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapFunction1(
        value: /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any] => js.Array[js.Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setPop(
        value: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[js.Any]]] | js.Function0[js.UndefOr[js.Any]]
      ): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
      
      inline def setPopFunction0(value: () => js.UndefOr[js.Any]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      inline def setPush(
        value: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Any, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
      ): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushFunction1(value: /* repeated */ js.Any => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setReduce(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* callbackfn */ js.Function4[
                  /* previousValue */ js.Any, 
                  /* currentValue */ js.Any, 
                  /* currentIndex */ Double, 
                  /* array */ js.Array[js.Any], 
                  js.Any
                ], 
                js.Any
              ]
            ]) | (js.Function1[
              /* callbackfn */ js.Function4[
                /* previousValue */ js.Any, 
                /* currentValue */ js.Any, 
                /* currentIndex */ Double, 
                /* array */ js.Array[js.Any], 
                js.Any
              ], 
              js.Any
            ])
      ): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
      
      inline def setReduceFunction1(
        value: /* callbackfn */ js.Function4[
              /* previousValue */ js.Any, 
              /* currentValue */ js.Any, 
              /* currentIndex */ Double, 
              /* array */ js.Array[js.Any], 
              js.Any
            ] => js.Any
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setReduceRight(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* callbackfn */ js.Function4[
                  /* previousValue */ js.Any, 
                  /* currentValue */ js.Any, 
                  /* currentIndex */ Double, 
                  /* array */ js.Array[js.Any], 
                  js.Any
                ], 
                js.Any
              ]
            ]) | (js.Function1[
              /* callbackfn */ js.Function4[
                /* previousValue */ js.Any, 
                /* currentValue */ js.Any, 
                /* currentIndex */ Double, 
                /* array */ js.Array[js.Any], 
                js.Any
              ], 
              js.Any
            ])
      ): Self = StObject.set(x, "reduceRight", value.asInstanceOf[js.Any])
      
      inline def setReduceRightFunction1(
        value: /* callbackfn */ js.Function4[
              /* previousValue */ js.Any, 
              /* currentValue */ js.Any, 
              /* currentIndex */ Double, 
              /* array */ js.Array[js.Any], 
              js.Any
            ] => js.Any
      ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
      
      inline def setReverse(
        value: SinonMatcher | MatchArguments[js.Function0[js.Array[js.Any]]] | js.Function0[js.Array[js.Any]]
      ): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseFunction0(value: () => js.Array[js.Any]): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      inline def setShift(
        value: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[js.Any]]] | js.Function0[js.UndefOr[js.Any]]
      ): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      inline def setShiftFunction0(value: () => js.UndefOr[js.Any]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
      
      inline def setSlice(
        value: SinonMatcher | MatchArguments[js.Function0[js.Array[js.Any]]] | js.Function0[js.Array[js.Any]]
      ): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
      
      inline def setSliceFunction0(value: () => js.Array[js.Any]): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
      
      inline def setSome(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
                Boolean
              ]
            ]) | (js.Function1[
              /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
              Boolean
            ])
      ): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
      
      inline def setSomeFunction1(
        value: /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any] => Boolean
      ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      inline def setSort(
        value: SinonMatcher | MatchArguments[js.Function0[MatchArgumentsArrayany]] | js.Function0[MatchArgumentsArrayany]
      ): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortFunction0(value: () => MatchArgumentsArrayany): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
      
      inline def setSplice(
        value: SinonMatcher | (MatchArguments[js.Function1[/* start */ Double, js.Array[js.Any]]]) | (js.Function1[/* start */ Double, js.Array[js.Any]])
      ): Self = StObject.set(x, "splice", value.asInstanceOf[js.Any])
      
      inline def setSpliceFunction1(value: /* start */ Double => js.Array[js.Any]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
      
      inline def setToLocaleString(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = StObject.set(x, "toLocaleString", value.asInstanceOf[js.Any])
      
      inline def setToLocaleStringFunction0(value: () => String): Self = StObject.set(x, "toLocaleString", js.Any.fromFunction0(value))
      
      inline def setToString_(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      inline def setToString_Function0(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
      
      inline def setUnshift(
        value: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Any, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
      ): Self = StObject.set(x, "unshift", value.asInstanceOf[js.Any])
      
      inline def setUnshiftFunction1(value: /* repeated */ js.Any => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
      
      inline def setValues(
        value: SinonMatcher | MatchArguments[js.Function0[IterableIterator[js.Any]]] | js.Function0[IterableIterator[js.Any]]
      ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesFunction0(value: () => IterableIterator[js.Any]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Partial<sinon.sinon.MatchArguments<std.Array<any>>> */
  trait PartialMatchArgumentsArra extends StObject {
    
    var concat: js.UndefOr[
        SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Array[js.Any], js.Array[js.Any]]]) | (js.Function1[/* repeated */ js.Array[js.Any], js.Array[js.Any]])
      ] = js.undefined
    
    var copyWithin: js.UndefOr[
        SinonMatcher | (MatchArguments[js.Function2[/* target */ Double, /* start */ Double, this.type]]) | (js.Function2[/* target */ Double, /* start */ Double, this.type])
      ] = js.undefined
    
    var entries: js.UndefOr[
        SinonMatcher | (MatchArguments[js.Function0[IterableIterator[js.Tuple2[Double, js.Any]]]]) | (js.Function0[IterableIterator[js.Tuple2[Double, js.Any]]])
      ] = js.undefined
    
    var every: js.UndefOr[
        SinonMatcher | (MatchArguments[
          js.Function1[
            /* predicate */ js.Function3[
              /* value */ js.Any, 
              /* index */ Double, 
              /* array */ js.Array[js.Any], 
              /* is any */ Boolean
            ], 
            /* is std.Array<any> */ Boolean
          ]
        ]) | (js.Function1[
          /* predicate */ js.Function3[
            /* value */ js.Any, 
            /* index */ Double, 
            /* array */ js.Array[js.Any], 
            /* is any */ Boolean
          ], 
          /* is std.Array<any> */ Boolean
        ])
      ] = js.undefined
    
    var fill: js.UndefOr[
        SinonMatcher | (MatchArguments[js.Function1[/* value */ js.Any, this.type]]) | (js.Function1[/* value */ js.Any, this.type])
      ] = js.undefined
    
    var filter: js.UndefOr[
        SinonMatcher | (MatchArguments[
          js.Function1[
            /* predicate */ js.Function3[
              /* value */ js.Any, 
              /* index */ Double, 
              /* array */ js.Array[js.Any], 
              /* is any */ Boolean
            ], 
            js.Array[js.Any]
          ]
        ]) | (js.Function1[
          /* predicate */ js.Function3[
            /* value */ js.Any, 
            /* index */ Double, 
            /* array */ js.Array[js.Any], 
            /* is any */ Boolean
          ], 
          js.Array[js.Any]
        ])
      ] = js.undefined
    
    var find: js.UndefOr[
        SinonMatcher | (MatchArguments[
          js.Function1[
            /* predicate */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ js.Any, 
              /* index */ Double, 
              /* obj */ js.Array[js.Any], 
              /* is any */ Boolean
            ], 
            js.UndefOr[js.Any]
          ]
        ]) | (js.Function1[
          /* predicate */ js.ThisFunction3[
            /* this */ Unit, 
            /* value */ js.Any, 
            /* index */ Double, 
            /* obj */ js.Array[js.Any], 
            /* is any */ Boolean
          ], 
          js.UndefOr[js.Any]
        ])
      ] = js.undefined
    
    var findIndex: js.UndefOr[
        SinonMatcher | (MatchArguments[
          js.Function1[
            /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[js.Any], js.Any], 
            Double
          ]
        ]) | (js.Function1[
          /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[js.Any], js.Any], 
          Double
        ])
      ] = js.undefined
    
    var flat: js.UndefOr[
        SinonMatcher | (MatchArguments[js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[js.Any, `1`]]]]) | (js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[js.Any, `1`]]])
      ] = js.undefined
    
    var flatMap: js.UndefOr[
        SinonMatcher | (MatchArguments[
          js.Function1[
            /* callback */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ js.Any, 
              /* index */ Double, 
              /* array */ js.Array[js.Any], 
              js.Any | js.Array[js.Any]
            ], 
            js.Array[js.Any]
          ]
        ]) | (js.Function1[
          /* callback */ js.ThisFunction3[
            /* this */ Unit, 
            /* value */ js.Any, 
            /* index */ Double, 
            /* array */ js.Array[js.Any], 
            js.Any | js.Array[js.Any]
          ], 
          js.Array[js.Any]
        ])
      ] = js.undefined
    
    var forEach: js.UndefOr[
        SinonMatcher | (MatchArguments[
          js.Function1[
            /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], Unit], 
            Unit
          ]
        ]) | (js.Function1[
          /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], Unit], 
          Unit
        ])
      ] = js.undefined
    
    var includes: js.UndefOr[
        SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ js.Any, Boolean]]) | (js.Function1[/* searchElement */ js.Any, Boolean])
      ] = js.undefined
    
    var indexOf: js.UndefOr[
        SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ js.Any, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
      ] = js.undefined
    
    var join: js.UndefOr[SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]] = js.undefined
    
    var keys: js.UndefOr[
        SinonMatcher | MatchArguments[js.Function0[IterableIterator[Double]]] | js.Function0[IterableIterator[Double]]
      ] = js.undefined
    
    var lastIndexOf: js.UndefOr[
        SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ js.Any, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
      ] = js.undefined
    
    var length: js.UndefOr[SinonMatcher | MatchArguments[Double] | Double] = js.undefined
    
    var map: js.UndefOr[
        SinonMatcher | (MatchArguments[
          js.Function1[
            /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
            js.Array[js.Any]
          ]
        ]) | (js.Function1[
          /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
          js.Array[js.Any]
        ])
      ] = js.undefined
    
    var pop: js.UndefOr[
        SinonMatcher | MatchArguments[js.Function0[js.UndefOr[js.Any]]] | js.Function0[js.UndefOr[js.Any]]
      ] = js.undefined
    
    var push: js.UndefOr[
        SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Any, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
      ] = js.undefined
    
    var reduce: js.UndefOr[
        SinonMatcher | (MatchArguments[
          js.Function1[
            /* callbackfn */ js.Function4[
              /* previousValue */ js.Any, 
              /* currentValue */ js.Any, 
              /* currentIndex */ Double, 
              /* array */ js.Array[js.Any], 
              js.Any
            ], 
            js.Any
          ]
        ]) | (js.Function1[
          /* callbackfn */ js.Function4[
            /* previousValue */ js.Any, 
            /* currentValue */ js.Any, 
            /* currentIndex */ Double, 
            /* array */ js.Array[js.Any], 
            js.Any
          ], 
          js.Any
        ])
      ] = js.undefined
    
    var reduceRight: js.UndefOr[
        SinonMatcher | (MatchArguments[
          js.Function1[
            /* callbackfn */ js.Function4[
              /* previousValue */ js.Any, 
              /* currentValue */ js.Any, 
              /* currentIndex */ Double, 
              /* array */ js.Array[js.Any], 
              js.Any
            ], 
            js.Any
          ]
        ]) | (js.Function1[
          /* callbackfn */ js.Function4[
            /* previousValue */ js.Any, 
            /* currentValue */ js.Any, 
            /* currentIndex */ Double, 
            /* array */ js.Array[js.Any], 
            js.Any
          ], 
          js.Any
        ])
      ] = js.undefined
    
    var reverse: js.UndefOr[
        SinonMatcher | MatchArguments[js.Function0[js.Array[js.Any]]] | js.Function0[js.Array[js.Any]]
      ] = js.undefined
    
    var shift: js.UndefOr[
        SinonMatcher | MatchArguments[js.Function0[js.UndefOr[js.Any]]] | js.Function0[js.UndefOr[js.Any]]
      ] = js.undefined
    
    var slice: js.UndefOr[
        SinonMatcher | MatchArguments[js.Function0[js.Array[js.Any]]] | js.Function0[js.Array[js.Any]]
      ] = js.undefined
    
    var some: js.UndefOr[
        SinonMatcher | (MatchArguments[
          js.Function1[
            /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
            Boolean
          ]
        ]) | (js.Function1[
          /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
          Boolean
        ])
      ] = js.undefined
    
    var sort: js.UndefOr[SinonMatcher | MatchArguments[js.Function0[this.type]] | js.Function0[this.type]] = js.undefined
    
    var splice: js.UndefOr[
        SinonMatcher | (MatchArguments[js.Function1[/* start */ Double, js.Array[js.Any]]]) | (js.Function1[/* start */ Double, js.Array[js.Any]])
      ] = js.undefined
    
    @JSName("toLocaleString")
    var toLocaleString_FPartialMatchArgumentsArra: js.UndefOr[SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]] = js.undefined
    
    @JSName("toString")
    var toString_FPartialMatchArgumentsArra: js.UndefOr[SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]] = js.undefined
    
    var unshift: js.UndefOr[
        SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Any, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
      ] = js.undefined
    
    var values: js.UndefOr[
        SinonMatcher | MatchArguments[js.Function0[IterableIterator[js.Any]]] | js.Function0[IterableIterator[js.Any]]
      ] = js.undefined
  }
  object PartialMatchArgumentsArra {
    
    inline def apply(): PartialMatchArgumentsArra = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMatchArgumentsArra]
    }
    
    extension [Self <: PartialMatchArgumentsArra](x: Self) {
      
      inline def setConcat(
        value: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Array[js.Any], js.Array[js.Any]]]) | (js.Function1[/* repeated */ js.Array[js.Any], js.Array[js.Any]])
      ): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
      
      inline def setConcatFunction1(value: /* repeated */ js.Array[js.Any] => js.Array[js.Any]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setConcatUndefined: Self = StObject.set(x, "concat", js.undefined)
      
      inline def setCopyWithin(
        value: SinonMatcher | (MatchArguments[js.Function2[/* target */ Double, /* start */ Double, PartialMatchArgumentsArra]]) | (js.Function2[/* target */ Double, /* start */ Double, PartialMatchArgumentsArra])
      ): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
      
      inline def setCopyWithinFunction2(value: (/* target */ Double, /* start */ Double) => PartialMatchArgumentsArra): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
      
      inline def setCopyWithinUndefined: Self = StObject.set(x, "copyWithin", js.undefined)
      
      inline def setEntries(
        value: SinonMatcher | (MatchArguments[js.Function0[IterableIterator[js.Tuple2[Double, js.Any]]]]) | (js.Function0[IterableIterator[js.Tuple2[Double, js.Any]]])
      ): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesFunction0(value: () => IterableIterator[js.Tuple2[Double, js.Any]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setEvery(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* predicate */ js.Function3[
                  /* value */ js.Any, 
                  /* index */ Double, 
                  /* array */ js.Array[js.Any], 
                  /* is any */ Boolean
                ], 
                /* is std.Array<any> */ Boolean
              ]
            ]) | (js.Function1[
              /* predicate */ js.Function3[
                /* value */ js.Any, 
                /* index */ Double, 
                /* array */ js.Array[js.Any], 
                /* is any */ Boolean
              ], 
              /* is std.Array<any> */ Boolean
            ])
      ): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
      
      inline def setEveryFunction1(
        value: /* predicate */ js.Function3[
              /* value */ js.Any, 
              /* index */ Double, 
              /* array */ js.Array[js.Any], 
              /* is any */ Boolean
            ] => /* is std.Array<any> */ Boolean
      ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      inline def setEveryUndefined: Self = StObject.set(x, "every", js.undefined)
      
      inline def setFill(
        value: SinonMatcher | (MatchArguments[js.Function1[/* value */ js.Any, PartialMatchArgumentsArra]]) | (js.Function1[/* value */ js.Any, PartialMatchArgumentsArra])
      ): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillFunction1(value: /* value */ js.Any => PartialMatchArgumentsArra): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFilter(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* predicate */ js.Function3[
                  /* value */ js.Any, 
                  /* index */ Double, 
                  /* array */ js.Array[js.Any], 
                  /* is any */ Boolean
                ], 
                js.Array[js.Any]
              ]
            ]) | (js.Function1[
              /* predicate */ js.Function3[
                /* value */ js.Any, 
                /* index */ Double, 
                /* array */ js.Array[js.Any], 
                /* is any */ Boolean
              ], 
              js.Array[js.Any]
            ])
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction1(
        value: /* predicate */ js.Function3[
              /* value */ js.Any, 
              /* index */ Double, 
              /* array */ js.Array[js.Any], 
              /* is any */ Boolean
            ] => js.Array[js.Any]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFind(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* predicate */ js.ThisFunction3[
                  /* this */ Unit, 
                  /* value */ js.Any, 
                  /* index */ Double, 
                  /* obj */ js.Array[js.Any], 
                  /* is any */ Boolean
                ], 
                js.UndefOr[js.Any]
              ]
            ]) | (js.Function1[
              /* predicate */ js.ThisFunction3[
                /* this */ Unit, 
                /* value */ js.Any, 
                /* index */ Double, 
                /* obj */ js.Array[js.Any], 
                /* is any */ Boolean
              ], 
              js.UndefOr[js.Any]
            ])
      ): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setFindFunction1(
        value: /* predicate */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ js.Any, 
              /* index */ Double, 
              /* obj */ js.Array[js.Any], 
              /* is any */ Boolean
            ] => js.UndefOr[js.Any]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindIndex(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[js.Any], js.Any], 
                Double
              ]
            ]) | (js.Function1[
              /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[js.Any], js.Any], 
              Double
            ])
      ): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
      
      inline def setFindIndexFunction1(
        value: /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[js.Any], js.Any] => Double
      ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      inline def setFindIndexUndefined: Self = StObject.set(x, "findIndex", js.undefined)
      
      inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
      
      inline def setFlat(
        value: SinonMatcher | (MatchArguments[js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[js.Any, `1`]]]]) | (js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[js.Any, `1`]]])
      ): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatMap(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* callback */ js.ThisFunction3[
                  /* this */ Unit, 
                  /* value */ js.Any, 
                  /* index */ Double, 
                  /* array */ js.Array[js.Any], 
                  js.Any | js.Array[js.Any]
                ], 
                js.Array[js.Any]
              ]
            ]) | (js.Function1[
              /* callback */ js.ThisFunction3[
                /* this */ Unit, 
                /* value */ js.Any, 
                /* index */ Double, 
                /* array */ js.Array[js.Any], 
                js.Any | js.Array[js.Any]
              ], 
              js.Array[js.Any]
            ])
      ): Self = StObject.set(x, "flatMap", value.asInstanceOf[js.Any])
      
      inline def setFlatMapFunction1(
        value: /* callback */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ js.Any, 
              /* index */ Double, 
              /* array */ js.Array[js.Any], 
              js.Any | js.Array[js.Any]
            ] => js.Array[js.Any]
      ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setFlatMapUndefined: Self = StObject.set(x, "flatMap", js.undefined)
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setForEach(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], Unit], 
                Unit
              ]
            ]) | (js.Function1[
              /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], Unit], 
              Unit
            ])
      ): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
      
      inline def setForEachFunction1(
        value: /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], Unit] => Unit
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
      
      inline def setIncludes(
        value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ js.Any, Boolean]]) | (js.Function1[/* searchElement */ js.Any, Boolean])
      ): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesFunction1(value: /* searchElement */ js.Any => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
      
      inline def setIndexOf(
        value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ js.Any, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
      ): Self = StObject.set(x, "indexOf", value.asInstanceOf[js.Any])
      
      inline def setIndexOfFunction1(value: /* searchElement */ js.Any => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
      
      inline def setJoin(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinFunction0(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
      
      inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      inline def setKeys(
        value: SinonMatcher | MatchArguments[js.Function0[IterableIterator[Double]]] | js.Function0[IterableIterator[Double]]
      ): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysFunction0(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setLastIndexOf(
        value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ js.Any, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
      ): Self = StObject.set(x, "lastIndexOf", value.asInstanceOf[js.Any])
      
      inline def setLastIndexOfFunction1(value: /* searchElement */ js.Any => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      inline def setLastIndexOfUndefined: Self = StObject.set(x, "lastIndexOf", js.undefined)
      
      inline def setLength(value: SinonMatcher | MatchArguments[Double] | Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMap(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
                js.Array[js.Any]
              ]
            ]) | (js.Function1[
              /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
              js.Array[js.Any]
            ])
      ): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapFunction1(
        value: /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any] => js.Array[js.Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPop(
        value: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[js.Any]]] | js.Function0[js.UndefOr[js.Any]]
      ): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
      
      inline def setPopFunction0(value: () => js.UndefOr[js.Any]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      inline def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
      
      inline def setPush(
        value: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Any, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
      ): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushFunction1(value: /* repeated */ js.Any => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setReduce(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* callbackfn */ js.Function4[
                  /* previousValue */ js.Any, 
                  /* currentValue */ js.Any, 
                  /* currentIndex */ Double, 
                  /* array */ js.Array[js.Any], 
                  js.Any
                ], 
                js.Any
              ]
            ]) | (js.Function1[
              /* callbackfn */ js.Function4[
                /* previousValue */ js.Any, 
                /* currentValue */ js.Any, 
                /* currentIndex */ Double, 
                /* array */ js.Array[js.Any], 
                js.Any
              ], 
              js.Any
            ])
      ): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
      
      inline def setReduceFunction1(
        value: /* callbackfn */ js.Function4[
              /* previousValue */ js.Any, 
              /* currentValue */ js.Any, 
              /* currentIndex */ Double, 
              /* array */ js.Array[js.Any], 
              js.Any
            ] => js.Any
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setReduceRight(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* callbackfn */ js.Function4[
                  /* previousValue */ js.Any, 
                  /* currentValue */ js.Any, 
                  /* currentIndex */ Double, 
                  /* array */ js.Array[js.Any], 
                  js.Any
                ], 
                js.Any
              ]
            ]) | (js.Function1[
              /* callbackfn */ js.Function4[
                /* previousValue */ js.Any, 
                /* currentValue */ js.Any, 
                /* currentIndex */ Double, 
                /* array */ js.Array[js.Any], 
                js.Any
              ], 
              js.Any
            ])
      ): Self = StObject.set(x, "reduceRight", value.asInstanceOf[js.Any])
      
      inline def setReduceRightFunction1(
        value: /* callbackfn */ js.Function4[
              /* previousValue */ js.Any, 
              /* currentValue */ js.Any, 
              /* currentIndex */ Double, 
              /* array */ js.Array[js.Any], 
              js.Any
            ] => js.Any
      ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
      
      inline def setReduceRightUndefined: Self = StObject.set(x, "reduceRight", js.undefined)
      
      inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
      
      inline def setReverse(
        value: SinonMatcher | MatchArguments[js.Function0[js.Array[js.Any]]] | js.Function0[js.Array[js.Any]]
      ): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseFunction0(value: () => js.Array[js.Any]): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setShift(
        value: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[js.Any]]] | js.Function0[js.UndefOr[js.Any]]
      ): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      inline def setShiftFunction0(value: () => js.UndefOr[js.Any]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
      
      inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      
      inline def setSlice(
        value: SinonMatcher | MatchArguments[js.Function0[js.Array[js.Any]]] | js.Function0[js.Array[js.Any]]
      ): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
      
      inline def setSliceFunction0(value: () => js.Array[js.Any]): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
      
      inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
      
      inline def setSome(
        value: SinonMatcher | (MatchArguments[
              js.Function1[
                /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
                Boolean
              ]
            ]) | (js.Function1[
              /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any], 
              Boolean
            ])
      ): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
      
      inline def setSomeFunction1(
        value: /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[js.Any], js.Any] => Boolean
      ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      inline def setSomeUndefined: Self = StObject.set(x, "some", js.undefined)
      
      inline def setSort(
        value: SinonMatcher | MatchArguments[js.Function0[PartialMatchArgumentsArra]] | js.Function0[PartialMatchArgumentsArra]
      ): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortFunction0(value: () => PartialMatchArgumentsArra): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSplice(
        value: SinonMatcher | (MatchArguments[js.Function1[/* start */ Double, js.Array[js.Any]]]) | (js.Function1[/* start */ Double, js.Array[js.Any]])
      ): Self = StObject.set(x, "splice", value.asInstanceOf[js.Any])
      
      inline def setSpliceFunction1(value: /* start */ Double => js.Array[js.Any]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
      
      inline def setSpliceUndefined: Self = StObject.set(x, "splice", js.undefined)
      
      inline def setToLocaleString(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = StObject.set(x, "toLocaleString", value.asInstanceOf[js.Any])
      
      inline def setToLocaleStringFunction0(value: () => String): Self = StObject.set(x, "toLocaleString", js.Any.fromFunction0(value))
      
      inline def setToLocaleStringUndefined: Self = StObject.set(x, "toLocaleString", js.undefined)
      
      inline def setToString_(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      inline def setToString_Function0(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
      
      inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
      
      inline def setUnshift(
        value: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Any, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
      ): Self = StObject.set(x, "unshift", value.asInstanceOf[js.Any])
      
      inline def setUnshiftFunction1(value: /* repeated */ js.Any => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
      
      inline def setUnshiftUndefined: Self = StObject.set(x, "unshift", js.undefined)
      
      inline def setValues(
        value: SinonMatcher | MatchArguments[js.Function0[IterableIterator[js.Any]]] | js.Function0[IterableIterator[js.Any]]
      ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesFunction0(value: () => IterableIterator[js.Any]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  /* Inlined std.Partial<sinon.sinon.SinonExposeOptions> */
  trait PartialSinonExposeOptions extends StObject {
    
    var includeFail: js.UndefOr[Boolean] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object PartialSinonExposeOptions {
    
    inline def apply(): PartialSinonExposeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSinonExposeOptions]
    }
    
    extension [Self <: PartialSinonExposeOptions](x: Self) {
      
      inline def setIncludeFail(value: Boolean): Self = StObject.set(x, "includeFail", value.asInstanceOf[js.Any])
      
      inline def setIncludeFailUndefined: Self = StObject.set(x, "includeFail", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  /* Inlined std.Partial<sinon.sinon.SinonFakeServerOptions> */
  trait PartialSinonFakeServerOpt extends StObject {
    
    var autoRespond: js.UndefOr[Boolean] = js.undefined
    
    var autoRespondAfter: js.UndefOr[Double] = js.undefined
    
    var fakeHTTPMethods: js.UndefOr[Boolean] = js.undefined
    
    var respondImmediately: js.UndefOr[Boolean] = js.undefined
  }
  object PartialSinonFakeServerOpt {
    
    inline def apply(): PartialSinonFakeServerOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSinonFakeServerOpt]
    }
    
    extension [Self <: PartialSinonFakeServerOpt](x: Self) {
      
      inline def setAutoRespond(value: Boolean): Self = StObject.set(x, "autoRespond", value.asInstanceOf[js.Any])
      
      inline def setAutoRespondAfter(value: Double): Self = StObject.set(x, "autoRespondAfter", value.asInstanceOf[js.Any])
      
      inline def setAutoRespondAfterUndefined: Self = StObject.set(x, "autoRespondAfter", js.undefined)
      
      inline def setAutoRespondUndefined: Self = StObject.set(x, "autoRespond", js.undefined)
      
      inline def setFakeHTTPMethods(value: Boolean): Self = StObject.set(x, "fakeHTTPMethods", value.asInstanceOf[js.Any])
      
      inline def setFakeHTTPMethodsUndefined: Self = StObject.set(x, "fakeHTTPMethods", js.undefined)
      
      inline def setRespondImmediately(value: Boolean): Self = StObject.set(x, "respondImmediately", value.asInstanceOf[js.Any])
      
      inline def setRespondImmediatelyUndefined: Self = StObject.set(x, "respondImmediately", js.undefined)
    }
  }
  
  /* Inlined std.Partial<sinon.sinon.SinonFakeTimersConfig> */
  trait PartialSinonFakeTimersCon extends StObject {
    
    var now: js.UndefOr[Double | Date] = js.undefined
    
    var shouldAdvanceTime: js.UndefOr[Boolean] = js.undefined
    
    var toFake: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PartialSinonFakeTimersCon {
    
    inline def apply(): PartialSinonFakeTimersCon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSinonFakeTimersCon]
    }
    
    extension [Self <: PartialSinonFakeTimersCon](x: Self) {
      
      inline def setNow(value: Double | Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setShouldAdvanceTime(value: Boolean): Self = StObject.set(x, "shouldAdvanceTime", value.asInstanceOf[js.Any])
      
      inline def setShouldAdvanceTimeUndefined: Self = StObject.set(x, "shouldAdvanceTime", js.undefined)
      
      inline def setToFake(value: js.Array[String]): Self = StObject.set(x, "toFake", value.asInstanceOf[js.Any])
      
      inline def setToFakeUndefined: Self = StObject.set(x, "toFake", js.undefined)
      
      inline def setToFakeVarargs(value: String*): Self = StObject.set(x, "toFake", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<sinon.sinon.SinonSandboxConfig> */
  trait PartialSinonSandboxConfig extends StObject {
    
    var injectInto: js.UndefOr[js.Object | Null] = js.undefined
    
    var properties: js.UndefOr[js.Array[String]] = js.undefined
    
    var useFakeServer: js.UndefOr[Boolean | SinonFakeServer] = js.undefined
    
    var useFakeTimers: js.UndefOr[Boolean | PartialSinonFakeTimersCon] = js.undefined
  }
  object PartialSinonSandboxConfig {
    
    inline def apply(): PartialSinonSandboxConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSinonSandboxConfig]
    }
    
    extension [Self <: PartialSinonSandboxConfig](x: Self) {
      
      inline def setInjectInto(value: js.Object): Self = StObject.set(x, "injectInto", value.asInstanceOf[js.Any])
      
      inline def setInjectIntoNull: Self = StObject.set(x, "injectInto", null)
      
      inline def setInjectIntoUndefined: Self = StObject.set(x, "injectInto", js.undefined)
      
      inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      inline def setUseFakeServer(value: Boolean | SinonFakeServer): Self = StObject.set(x, "useFakeServer", value.asInstanceOf[js.Any])
      
      inline def setUseFakeServerUndefined: Self = StObject.set(x, "useFakeServer", js.undefined)
      
      inline def setUseFakeTimers(value: Boolean | PartialSinonFakeTimersCon): Self = StObject.set(x, "useFakeTimers", value.asInstanceOf[js.Any])
      
      inline def setUseFakeTimersUndefined: Self = StObject.set(x, "useFakeTimers", js.undefined)
    }
  }
}
