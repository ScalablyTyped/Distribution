package typings.reselect

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.reselect.anon.ClearCache
import typings.reselect.anon.FnCall
import typings.reselect.defaultMemoizeMod.DefaultMemoizeOptions
import typings.reselect.reselectBooleans.`false`
import typings.reselect.reselectBooleans.`true`
import typings.reselect.typesMod.DropFirst
import typings.reselect.typesMod.EqualityFn
import typings.reselect.typesMod.Expand
import typings.reselect.typesMod.ExtractParams
import typings.reselect.typesMod.GetParamsFromSelectors
import typings.reselect.typesMod.Head
import typings.reselect.typesMod.LastOf
import typings.reselect.typesMod.LongestArray
import typings.reselect.typesMod.MergeParameters
import typings.reselect.typesMod.OutputSelector
import typings.reselect.typesMod.Selector
import typings.reselect.typesMod.SelectorArray
import typings.reselect.typesMod.SelectorResultArray
import typings.reselect.typesMod.Tail
import typings.reselect.typesMod.Transpose
import typings.reselect.typesMod.TuplifyUnion
import typings.std.Parameters
import typings.std.Pick
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reselect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("reselect", "createSelector")
  @js.native
  val createSelector: CreateSelectorFunction[
    js.Function1[/* repeated */ Any, Any], 
    FnCall, 
    js.Array[/* equalityCheckOrOptions */ js.UndefOr[EqualityFn | DefaultMemoizeOptions]], 
    ClearCache
  ] = js.native
  
  inline def createSelectorCreator[/** Selectors will eventually accept some function to be memoized */
  F /* <: js.Function1[/* repeated */ Any, Any] */, /** A memoizer such as defaultMemoize that accepts a function + some possible options */
  MemoizeFunction /* <: js.Function2[/* func */ F, /* repeated */ Any, F] */, /** The additional options arguments to the memoizer */
  MemoizeOptions /* <: js.Array[Any] */](
    memoize: MemoizeFunction,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param memoizeOptionsFromArgs because its type DropFirst<Parameters<MemoizeFunction>> is not an array type */ memoizeOptionsFromArgs: DropFirst[Parameters[MemoizeFunction]]
  ): CreateSelectorFunction[
    F, 
    MemoizeFunction, 
    MemoizeOptions, 
    Expand[
      Pick[ReturnType[MemoizeFunction], /* keyof std.ReturnType<MemoizeFunction> */ String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelectorCreator")(memoize.asInstanceOf[js.Any], memoizeOptionsFromArgs.asInstanceOf[js.Any])).asInstanceOf[CreateSelectorFunction[
    F, 
    MemoizeFunction, 
    MemoizeOptions, 
    Expand[
      Pick[ReturnType[MemoizeFunction], /* keyof std.ReturnType<MemoizeFunction> */ String]
    ]
  ]]
  
  @JSImport("reselect", "createStructuredSelector")
  @js.native
  val createStructuredSelector: StructuredSelectorCreator = js.native
  
  @JSImport("reselect", "defaultEqualityCheck")
  @js.native
  val defaultEqualityCheck: EqualityFn = js.native
  
  inline def defaultMemoize[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F): F & ClearCache = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultMemoize")(func.asInstanceOf[js.Any]).asInstanceOf[F & ClearCache]
  inline def defaultMemoize[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F, equalityCheckOrOptions: DefaultMemoizeOptions): F & ClearCache = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultMemoize")(func.asInstanceOf[js.Any], equalityCheckOrOptions.asInstanceOf[js.Any])).asInstanceOf[F & ClearCache]
  inline def defaultMemoize[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F, equalityCheckOrOptions: EqualityFn): F & ClearCache = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultMemoize")(func.asInstanceOf[js.Any], equalityCheckOrOptions.asInstanceOf[js.Any])).asInstanceOf[F & ClearCache]
  
  @js.native
  trait CreateSelectorFunction[F /* <: js.Function1[/* repeated */ Any, Any] */, MemoizeFunction /* <: js.Function2[/* func */ F, /* repeated */ Any, F] */, MemoizeOptions /* <: js.Array[Any] */, Keys] extends StObject {
    
    /** Input selectors as separate inline arguments */
    /** Input selectors as separate inline arguments with memoizeOptions passed */
    def apply[Selectors /* <: SelectorArray */, Result](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param items because its type [...Selectors, (args : SelectorResultArray<Selectors>): Result] is not an array type */ items: /* import warning: importer.ImportType#apply c repeated non-array type: Selectors */ js.Array[Selectors]
    ): (OutputSelector[
        Selectors, 
        Result, 
        js.Function1[/* args */ SelectorResultArray[Selectors], Result & Keys], 
        GetParamsFromSelectors[
          Selectors, 
          Tail[
            MergeParameters[
              Selectors, 
              ExtractParams[Selectors], 
              Transpose[ExtractParams[Selectors]], 
              TuplifyUnion[
                Transpose[ExtractParams[Selectors]], 
                LastOf[Transpose[ExtractParams[Selectors]]], 
                `false` | `true`
              ], 
              LongestArray[
                TuplifyUnion[
                  Transpose[ExtractParams[Selectors]], 
                  LastOf[Transpose[ExtractParams[Selectors]]], 
                  `false` | `true`
                ]
              ]
            ]
          ]
        ]
      ]) & Keys = js.native
    /** Input selectors as a separate array */
    def apply[Selectors /* <: SelectorArray */, Result](
      selectors: /* import warning: importer.ImportType#apply c repeated non-array type: Selectors */ js.Array[Selectors],
      combiner: js.Function1[/* args */ SelectorResultArray[Selectors], Result]
    ): (OutputSelector[
        Selectors, 
        Result, 
        js.Function1[/* args */ SelectorResultArray[Selectors], Result & Keys], 
        GetParamsFromSelectors[
          Selectors, 
          Tail[
            MergeParameters[
              Selectors, 
              ExtractParams[Selectors], 
              Transpose[ExtractParams[Selectors]], 
              TuplifyUnion[
                Transpose[ExtractParams[Selectors]], 
                LastOf[Transpose[ExtractParams[Selectors]]], 
                `false` | `true`
              ], 
              LongestArray[
                TuplifyUnion[
                  Transpose[ExtractParams[Selectors]], 
                  LastOf[Transpose[ExtractParams[Selectors]]], 
                  `false` | `true`
                ]
              ]
            ]
          ]
        ]
      ]) & Keys = js.native
    def apply[Selectors /* <: SelectorArray */, Result](
      selectors: /* import warning: importer.ImportType#apply c repeated non-array type: Selectors */ js.Array[Selectors],
      combiner: js.Function1[/* args */ SelectorResultArray[Selectors], Result],
      options: CreateSelectorOptions[MemoizeOptions]
    ): (OutputSelector[
        Selectors, 
        Result, 
        js.Function1[/* args */ SelectorResultArray[Selectors], Result & Keys], 
        GetParamsFromSelectors[
          Selectors, 
          Tail[
            MergeParameters[
              Selectors, 
              ExtractParams[Selectors], 
              Transpose[ExtractParams[Selectors]], 
              TuplifyUnion[
                Transpose[ExtractParams[Selectors]], 
                LastOf[Transpose[ExtractParams[Selectors]]], 
                `false` | `true`
              ], 
              LongestArray[
                TuplifyUnion[
                  Transpose[ExtractParams[Selectors]], 
                  LastOf[Transpose[ExtractParams[Selectors]]], 
                  `false` | `true`
                ]
              ]
            ]
          ]
        ]
      ]) & Keys = js.native
  }
  
  trait CreateSelectorOptions[MemoizeOptions /* <: js.Array[Any] */] extends StObject {
    
    var memoizeOptions: (/* import warning: importer.ImportType#apply Failed type conversion: MemoizeOptions[0] */ js.Any) | MemoizeOptions
  }
  object CreateSelectorOptions {
    
    inline def apply[MemoizeOptions /* <: js.Array[Any] */](
      memoizeOptions: (/* import warning: importer.ImportType#apply Failed type conversion: MemoizeOptions[0] */ js.Any) | MemoizeOptions
    ): CreateSelectorOptions[MemoizeOptions] = {
      val __obj = js.Dynamic.literal(memoizeOptions = memoizeOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateSelectorOptions[MemoizeOptions]]
    }
    
    extension [Self <: CreateSelectorOptions[?], MemoizeOptions /* <: js.Array[Any] */](x: Self & CreateSelectorOptions[MemoizeOptions]) {
      
      inline def setMemoizeOptions(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: MemoizeOptions[0] */ js.Any) | MemoizeOptions
      ): Self = StObject.set(x, "memoizeOptions", value.asInstanceOf[js.Any])
    }
  }
  
  type SelectorsObject = StringDictionary[js.Function1[/* repeated */ Any, Any]]
  
  @js.native
  trait StructuredSelectorCreator extends StObject {
    
    def apply[SelectorMap /* <: SelectorsObject */, SelectorParams](selectorMap: SelectorMap): js.Function2[
        /* state */ Head[SelectorParams], 
        /* params */ Tail[SelectorParams], 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ Key in keyof SelectorMap ]: std.ReturnType<SelectorMap[Key]>}
      */ typings.reselect.reselectStrings.StructuredSelectorCreator & TopLevel[SelectorMap]
      ] = js.native
    def apply[SelectorMap /* <: SelectorsObject */, SelectorParams](
      selectorMap: SelectorMap,
      selectorCreator: CreateSelectorFunction[Any, Any, Any, Expand[Pick[ReturnType[Any], /* keyof std.ReturnType<any> */ String]]]
    ): js.Function2[
        /* state */ Head[SelectorParams], 
        /* params */ Tail[SelectorParams], 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ Key in keyof SelectorMap ]: std.ReturnType<SelectorMap[Key]>}
      */ typings.reselect.reselectStrings.StructuredSelectorCreator & TopLevel[SelectorMap]
      ] = js.native
    def apply[State, Result](
      selectors: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Result ]: reselect.reselect/es/types.Selector<State, Result[K], never>}
      */ typings.reselect.reselectStrings.StructuredSelectorCreator & TopLevel[Result]
    ): Selector[State, Result, scala.Nothing] = js.native
    def apply[State, Result](
      selectors: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Result ]: reselect.reselect/es/types.Selector<State, Result[K], never>}
      */ typings.reselect.reselectStrings.StructuredSelectorCreator & TopLevel[Result],
      selectorCreator: CreateSelectorFunction[Any, Any, Any, Expand[Pick[ReturnType[Any], /* keyof std.ReturnType<any> */ String]]]
    ): Selector[State, Result, scala.Nothing] = js.native
  }
}
