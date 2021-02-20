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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait Abort extends StObject {
    
    var abort: js.Array[_] = js.native
    
    var error: js.Array[_] = js.native
    
    var load: js.Array[_] = js.native
    
    var progress: js.Array[_] = js.native
  }
  object Abort {
    
    @scala.inline
    def apply(abort: js.Array[_], error: js.Array[_], load: js.Array[_], progress: js.Array[_]): Abort = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[Abort]
    }
    
    @scala.inline
    implicit class AbortMutableBuilder[Self <: Abort] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: js.Array[_]): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortVarargs(value: js.Any*): Self = StObject.set(x, "abort", js.Array(value :_*))
      
      @scala.inline
      def setError(value: js.Array[_]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorVarargs(value: js.Any*): Self = StObject.set(x, "error", js.Array(value :_*))
      
      @scala.inline
      def setLoad(value: js.Array[_]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadVarargs(value: js.Any*): Self = StObject.set(x, "load", js.Array(value :_*))
      
      @scala.inline
      def setProgress(value: js.Array[_]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressVarargs(value: js.Any*): Self = StObject.set(x, "progress", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Create extends StObject {
    
    def create(now: Double): SinonFakeTimers = js.native
    def create(now: Date): SinonFakeTimers = js.native
  }
  
  @js.native
  trait Get[T, K /* <: /* keyof T */ String */] extends StObject {
    
    // Methods
    def get(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
    ): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
    @JSName("get")
    var get_Original: SinonSpy[
        js.Array[js.Any], 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ] = js.native
    
    // Methods
    def set(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
    ): Unit = js.native
    @JSName("set")
    var set_Original: SinonSpy[
        js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ], 
        Unit
      ] = js.native
  }
  
  /* Inlined sinon.sinon.MatchArguments<std.Array<any>> */
  @js.native
  trait MatchArgumentsArrayany extends StObject {
    
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
      toString_ : SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String],
      unshift: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ _, Double]]) | (js.Function1[/* repeated */ js.Any, Double]),
      values: SinonMatcher | MatchArguments[js.Function0[IterableIterator[_]]] | js.Function0[IterableIterator[_]]
    ): MatchArgumentsArrayany = {
      val __obj = js.Dynamic.literal(concat = concat.asInstanceOf[js.Any], copyWithin = copyWithin.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], every = every.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], findIndex = findIndex.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any], flatMap = flatMap.asInstanceOf[js.Any], forEach = forEach.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], indexOf = indexOf.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], lastIndexOf = lastIndexOf.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], pop = pop.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], reduce = reduce.asInstanceOf[js.Any], reduceRight = reduceRight.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any], some = some.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], splice = splice.asInstanceOf[js.Any], toLocaleString = toLocaleString.asInstanceOf[js.Any], unshift = unshift.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchArgumentsArrayany]
    }
    
    @scala.inline
    implicit class MatchArgumentsArrayanyMutableBuilder[Self <: MatchArgumentsArrayany] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcat(
        value: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Array[_], js.Array[_]]]) | (js.Function1[/* repeated */ js.Array[_], js.Array[_]])
      ): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcatFunction1(value: /* repeated */ js.Array[_] => js.Array[_]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCopyWithin(
        value: SinonMatcher | (MatchArguments[js.Function2[/* target */ Double, /* start */ Double, MatchArgumentsArrayany]]) | (js.Function2[/* target */ Double, /* start */ Double, MatchArgumentsArrayany])
      ): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyWithinFunction2(value: (/* target */ Double, /* start */ Double) => MatchArgumentsArrayany): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEntries(
        value: SinonMatcher | (MatchArguments[js.Function0[IterableIterator[js.Tuple2[Double, _]]]]) | (js.Function0[IterableIterator[js.Tuple2[Double, _]]])
      ): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesFunction0(value: () => IterableIterator[js.Tuple2[Double, _]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
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
      ): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEveryFunction1(
        value: /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean] => /* is std.Array<any> */ Boolean
      ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFill(
        value: SinonMatcher | (MatchArguments[js.Function1[/* value */ _, MatchArgumentsArrayany]]) | (js.Function1[/* value */ js.Any, MatchArgumentsArrayany])
      ): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillFunction1(value: /* value */ js.Any => MatchArgumentsArrayany): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
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
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFunction1(
        value: /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean] => js.Array[_]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
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
      ): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindFunction1(
        value: /* predicate */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ js.Any, 
              /* index */ Double, 
              /* obj */ js.Array[_], 
              /* is any */ Boolean
            ] => js.UndefOr[_]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
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
      ): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindIndexFunction1(
        value: /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[_], _] => Double
      ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlat(
        value: SinonMatcher | (MatchArguments[js.ThisFunction0[/* this */ _, js.Array[FlatArray[_, `1`]]]]) | (js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, `1`]]])
      ): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
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
      ): Self = StObject.set(x, "flatMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatMapFunction1(
        value: /* callback */ js.ThisFunction3[
              /* this */ js.UndefOr[scala.Nothing], 
              /* value */ js.Any, 
              /* index */ Double, 
              /* array */ js.Array[_], 
              _ | js.Array[_]
            ] => js.Array[_]
      ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
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
      ): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForEachFunction1(
        value: /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Unit] => Unit
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIncludes(
        value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Boolean]]) | (js.Function1[/* searchElement */ js.Any, Boolean])
      ): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludesFunction1(value: /* searchElement */ js.Any => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndexOf(
        value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
      ): Self = StObject.set(x, "indexOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexOfFunction1(value: /* searchElement */ js.Any => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setJoin(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinFunction0(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKeys(
        value: SinonMatcher | MatchArguments[js.Function0[IterableIterator[Double]]] | js.Function0[IterableIterator[Double]]
      ): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysFunction0(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLastIndexOf(
        value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
      ): Self = StObject.set(x, "lastIndexOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastIndexOfFunction1(value: /* searchElement */ js.Any => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLength(value: SinonMatcher | MatchArguments[Double] | Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
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
      ): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapFunction1(
        value: /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], _] => js.Array[_]
      ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPop(value: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[_]]] | js.Function0[js.UndefOr[_]]): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopFunction0(value: () => js.UndefOr[_]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPush(
        value: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ _, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
      ): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushFunction1(value: /* repeated */ js.Any => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
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
      ): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReduceFunction1(
        value: /* callbackfn */ js.Function4[
              /* previousValue */ js.Any, 
              /* currentValue */ js.Any, 
              /* currentIndex */ Double, 
              /* array */ js.Array[_], 
              _
            ] => _
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
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
      ): Self = StObject.set(x, "reduceRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReduceRightFunction1(
        value: /* callbackfn */ js.Function4[
              /* previousValue */ js.Any, 
              /* currentValue */ js.Any, 
              /* currentIndex */ Double, 
              /* array */ js.Array[_], 
              _
            ] => _
      ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReverse(value: SinonMatcher | MatchArguments[js.Function0[js.Array[_]]] | js.Function0[js.Array[_]]): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseFunction0(value: () => js.Array[_]): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShift(value: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[_]]] | js.Function0[js.UndefOr[_]]): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftFunction0(value: () => js.UndefOr[_]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSlice(value: SinonMatcher | MatchArguments[js.Function0[js.Array[_]]] | js.Function0[js.Array[_]]): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliceFunction0(value: () => js.Array[_]): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
      
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
      ): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSomeFunction1(
        value: /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], _] => Boolean
      ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSort(
        value: SinonMatcher | MatchArguments[js.Function0[MatchArgumentsArrayany]] | js.Function0[MatchArgumentsArrayany]
      ): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortFunction0(value: () => MatchArgumentsArrayany): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSplice(
        value: SinonMatcher | (MatchArguments[js.Function1[/* start */ Double, js.Array[_]]]) | (js.Function1[/* start */ Double, js.Array[_]])
      ): Self = StObject.set(x, "splice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpliceFunction1(value: /* start */ Double => js.Array[_]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToLocaleString(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = StObject.set(x, "toLocaleString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToLocaleStringFunction0(value: () => String): Self = StObject.set(x, "toLocaleString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToString_(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToString_Function0(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnshift(
        value: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ _, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
      ): Self = StObject.set(x, "unshift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnshiftFunction1(value: /* repeated */ js.Any => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValues(
        value: SinonMatcher | MatchArguments[js.Function0[IterableIterator[_]]] | js.Function0[IterableIterator[_]]
      ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesFunction0(value: () => IterableIterator[_]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Partial<sinon.sinon.MatchArguments<std.Array<any>>> */
  @js.native
  trait PartialMatchArgumentsArra extends StObject {
    
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
    implicit class PartialMatchArgumentsArraMutableBuilder[Self <: PartialMatchArgumentsArra] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcat(
        value: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ js.Array[_], js.Array[_]]]) | (js.Function1[/* repeated */ js.Array[_], js.Array[_]])
      ): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcatFunction1(value: /* repeated */ js.Array[_] => js.Array[_]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConcatUndefined: Self = StObject.set(x, "concat", js.undefined)
      
      @scala.inline
      def setCopyWithin(
        value: SinonMatcher | (MatchArguments[js.Function2[/* target */ Double, /* start */ Double, PartialMatchArgumentsArra]]) | (js.Function2[/* target */ Double, /* start */ Double, PartialMatchArgumentsArra])
      ): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyWithinFunction2(value: (/* target */ Double, /* start */ Double) => PartialMatchArgumentsArra): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCopyWithinUndefined: Self = StObject.set(x, "copyWithin", js.undefined)
      
      @scala.inline
      def setEntries(
        value: SinonMatcher | (MatchArguments[js.Function0[IterableIterator[js.Tuple2[Double, _]]]]) | (js.Function0[IterableIterator[js.Tuple2[Double, _]]])
      ): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesFunction0(value: () => IterableIterator[js.Tuple2[Double, _]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
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
      ): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEveryFunction1(
        value: /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean] => /* is std.Array<any> */ Boolean
      ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEveryUndefined: Self = StObject.set(x, "every", js.undefined)
      
      @scala.inline
      def setFill(
        value: SinonMatcher | (MatchArguments[js.Function1[/* value */ _, PartialMatchArgumentsArra]]) | (js.Function1[/* value */ js.Any, PartialMatchArgumentsArra])
      ): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillFunction1(value: /* value */ js.Any => PartialMatchArgumentsArra): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
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
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFunction1(
        value: /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], /* is any */ Boolean] => js.Array[_]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
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
      ): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindFunction1(
        value: /* predicate */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ js.Any, 
              /* index */ Double, 
              /* obj */ js.Array[_], 
              /* is any */ Boolean
            ] => js.UndefOr[_]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
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
      ): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindIndexFunction1(
        value: /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* obj */ js.Array[_], _] => Double
      ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFindIndexUndefined: Self = StObject.set(x, "findIndex", js.undefined)
      
      @scala.inline
      def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
      
      @scala.inline
      def setFlat(
        value: SinonMatcher | (MatchArguments[js.ThisFunction0[/* this */ _, js.Array[FlatArray[_, `1`]]]]) | (js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, `1`]]])
      ): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
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
      ): Self = StObject.set(x, "flatMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatMapFunction1(
        value: /* callback */ js.ThisFunction3[
              /* this */ js.UndefOr[scala.Nothing], 
              /* value */ js.Any, 
              /* index */ Double, 
              /* array */ js.Array[_], 
              _ | js.Array[_]
            ] => js.Array[_]
      ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlatMapUndefined: Self = StObject.set(x, "flatMap", js.undefined)
      
      @scala.inline
      def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
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
      ): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForEachFunction1(
        value: /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Unit] => Unit
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
      
      @scala.inline
      def setIncludes(
        value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Boolean]]) | (js.Function1[/* searchElement */ js.Any, Boolean])
      ): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludesFunction1(value: /* searchElement */ js.Any => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
      
      @scala.inline
      def setIndexOf(
        value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
      ): Self = StObject.set(x, "indexOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexOfFunction1(value: /* searchElement */ js.Any => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
      
      @scala.inline
      def setJoin(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinFunction0(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
      
      @scala.inline
      def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      @scala.inline
      def setKeys(
        value: SinonMatcher | MatchArguments[js.Function0[IterableIterator[Double]]] | js.Function0[IterableIterator[Double]]
      ): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysFunction0(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setLastIndexOf(
        value: SinonMatcher | (MatchArguments[js.Function1[/* searchElement */ _, Double]]) | (js.Function1[/* searchElement */ js.Any, Double])
      ): Self = StObject.set(x, "lastIndexOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastIndexOfFunction1(value: /* searchElement */ js.Any => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLastIndexOfUndefined: Self = StObject.set(x, "lastIndexOf", js.undefined)
      
      @scala.inline
      def setLength(value: SinonMatcher | MatchArguments[Double] | Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
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
      ): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapFunction1(
        value: /* callbackfn */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], _] => js.Array[_]
      ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setPop(value: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[_]]] | js.Function0[js.UndefOr[_]]): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopFunction0(value: () => js.UndefOr[_]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
      
      @scala.inline
      def setPush(
        value: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ _, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
      ): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushFunction1(value: /* repeated */ js.Any => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
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
      ): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReduceFunction1(
        value: /* callbackfn */ js.Function4[
              /* previousValue */ js.Any, 
              /* currentValue */ js.Any, 
              /* currentIndex */ Double, 
              /* array */ js.Array[_], 
              _
            ] => _
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
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
      ): Self = StObject.set(x, "reduceRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReduceRightFunction1(
        value: /* callbackfn */ js.Function4[
              /* previousValue */ js.Any, 
              /* currentValue */ js.Any, 
              /* currentIndex */ Double, 
              /* array */ js.Array[_], 
              _
            ] => _
      ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReduceRightUndefined: Self = StObject.set(x, "reduceRight", js.undefined)
      
      @scala.inline
      def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
      
      @scala.inline
      def setReverse(value: SinonMatcher | MatchArguments[js.Function0[js.Array[_]]] | js.Function0[js.Array[_]]): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseFunction0(value: () => js.Array[_]): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setShift(value: SinonMatcher | MatchArguments[js.Function0[js.UndefOr[_]]] | js.Function0[js.UndefOr[_]]): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftFunction0(value: () => js.UndefOr[_]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      
      @scala.inline
      def setSlice(value: SinonMatcher | MatchArguments[js.Function0[js.Array[_]]] | js.Function0[js.Array[_]]): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliceFunction0(value: () => js.Array[_]): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
      
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
      ): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSomeFunction1(
        value: /* predicate */ js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], _] => Boolean
      ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSomeUndefined: Self = StObject.set(x, "some", js.undefined)
      
      @scala.inline
      def setSort(
        value: SinonMatcher | MatchArguments[js.Function0[PartialMatchArgumentsArra]] | js.Function0[PartialMatchArgumentsArra]
      ): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortFunction0(value: () => PartialMatchArgumentsArra): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setSplice(
        value: SinonMatcher | (MatchArguments[js.Function1[/* start */ Double, js.Array[_]]]) | (js.Function1[/* start */ Double, js.Array[_]])
      ): Self = StObject.set(x, "splice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpliceFunction1(value: /* start */ Double => js.Array[_]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSpliceUndefined: Self = StObject.set(x, "splice", js.undefined)
      
      @scala.inline
      def setToLocaleString(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = StObject.set(x, "toLocaleString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToLocaleStringFunction0(value: () => String): Self = StObject.set(x, "toLocaleString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToLocaleStringUndefined: Self = StObject.set(x, "toLocaleString", js.undefined)
      
      @scala.inline
      def setToString_(value: SinonMatcher | MatchArguments[js.Function0[String]] | js.Function0[String]): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToString_Function0(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
      
      @scala.inline
      def setUnshift(
        value: SinonMatcher | (MatchArguments[js.Function1[/* repeated */ _, Double]]) | (js.Function1[/* repeated */ js.Any, Double])
      ): Self = StObject.set(x, "unshift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnshiftFunction1(value: /* repeated */ js.Any => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnshiftUndefined: Self = StObject.set(x, "unshift", js.undefined)
      
      @scala.inline
      def setValues(
        value: SinonMatcher | MatchArguments[js.Function0[IterableIterator[_]]] | js.Function0[IterableIterator[_]]
      ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesFunction0(value: () => IterableIterator[_]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  /* Inlined std.Partial<sinon.sinon.SinonExposeOptions> */
  @js.native
  trait PartialSinonExposeOptions extends StObject {
    
    var includeFail: js.UndefOr[Boolean] = js.native
    
    var prefix: js.UndefOr[String] = js.native
  }
  object PartialSinonExposeOptions {
    
    @scala.inline
    def apply(): PartialSinonExposeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSinonExposeOptions]
    }
    
    @scala.inline
    implicit class PartialSinonExposeOptionsMutableBuilder[Self <: PartialSinonExposeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeFail(value: Boolean): Self = StObject.set(x, "includeFail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeFailUndefined: Self = StObject.set(x, "includeFail", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  /* Inlined std.Partial<sinon.sinon.SinonFakeServerOptions> */
  @js.native
  trait PartialSinonFakeServerOpt extends StObject {
    
    var autoRespond: js.UndefOr[Boolean] = js.native
    
    var autoRespondAfter: js.UndefOr[Double] = js.native
    
    var fakeHTTPMethods: js.UndefOr[Boolean] = js.native
    
    var respondImmediately: js.UndefOr[Boolean] = js.native
  }
  object PartialSinonFakeServerOpt {
    
    @scala.inline
    def apply(): PartialSinonFakeServerOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSinonFakeServerOpt]
    }
    
    @scala.inline
    implicit class PartialSinonFakeServerOptMutableBuilder[Self <: PartialSinonFakeServerOpt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoRespond(value: Boolean): Self = StObject.set(x, "autoRespond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRespondAfter(value: Double): Self = StObject.set(x, "autoRespondAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRespondAfterUndefined: Self = StObject.set(x, "autoRespondAfter", js.undefined)
      
      @scala.inline
      def setAutoRespondUndefined: Self = StObject.set(x, "autoRespond", js.undefined)
      
      @scala.inline
      def setFakeHTTPMethods(value: Boolean): Self = StObject.set(x, "fakeHTTPMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFakeHTTPMethodsUndefined: Self = StObject.set(x, "fakeHTTPMethods", js.undefined)
      
      @scala.inline
      def setRespondImmediately(value: Boolean): Self = StObject.set(x, "respondImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRespondImmediatelyUndefined: Self = StObject.set(x, "respondImmediately", js.undefined)
    }
  }
  
  /* Inlined std.Partial<sinon.sinon.SinonFakeTimersConfig> */
  @js.native
  trait PartialSinonFakeTimersCon extends StObject {
    
    var now: js.UndefOr[Double | Date] = js.native
    
    var shouldAdvanceTime: js.UndefOr[Boolean] = js.native
    
    var toFake: js.UndefOr[js.Array[String]] = js.native
  }
  object PartialSinonFakeTimersCon {
    
    @scala.inline
    def apply(): PartialSinonFakeTimersCon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSinonFakeTimersCon]
    }
    
    @scala.inline
    implicit class PartialSinonFakeTimersConMutableBuilder[Self <: PartialSinonFakeTimersCon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNow(value: Double | Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      @scala.inline
      def setShouldAdvanceTime(value: Boolean): Self = StObject.set(x, "shouldAdvanceTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldAdvanceTimeUndefined: Self = StObject.set(x, "shouldAdvanceTime", js.undefined)
      
      @scala.inline
      def setToFake(value: js.Array[String]): Self = StObject.set(x, "toFake", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToFakeUndefined: Self = StObject.set(x, "toFake", js.undefined)
      
      @scala.inline
      def setToFakeVarargs(value: String*): Self = StObject.set(x, "toFake", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<sinon.sinon.SinonSandboxConfig> */
  @js.native
  trait PartialSinonSandboxConfig extends StObject {
    
    var injectInto: js.UndefOr[js.Object | Null] = js.native
    
    var properties: js.UndefOr[js.Array[String]] = js.native
    
    var useFakeServer: js.UndefOr[Boolean | SinonFakeServer] = js.native
    
    var useFakeTimers: js.UndefOr[Boolean | PartialSinonFakeTimersCon] = js.native
  }
  object PartialSinonSandboxConfig {
    
    @scala.inline
    def apply(): PartialSinonSandboxConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSinonSandboxConfig]
    }
    
    @scala.inline
    implicit class PartialSinonSandboxConfigMutableBuilder[Self <: PartialSinonSandboxConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInjectInto(value: js.Object): Self = StObject.set(x, "injectInto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectIntoNull: Self = StObject.set(x, "injectInto", null)
      
      @scala.inline
      def setInjectIntoUndefined: Self = StObject.set(x, "injectInto", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      @scala.inline
      def setUseFakeServer(value: Boolean | SinonFakeServer): Self = StObject.set(x, "useFakeServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFakeServerUndefined: Self = StObject.set(x, "useFakeServer", js.undefined)
      
      @scala.inline
      def setUseFakeTimers(value: Boolean | PartialSinonFakeTimersCon): Self = StObject.set(x, "useFakeTimers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFakeTimersUndefined: Self = StObject.set(x, "useFakeTimers", js.undefined)
    }
  }
}
