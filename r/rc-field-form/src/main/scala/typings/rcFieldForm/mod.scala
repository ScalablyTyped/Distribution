package typings.rcFieldForm

import typings.rcFieldForm.anon.FnCall
import typings.rcFieldForm.anon.FnCallDependenciesForm
import typings.rcFieldForm.anon.FnCallForm
import typings.rcFieldForm.anon.Ref
import typings.rcFieldForm.esFieldMod.FieldProps
import typings.rcFieldForm.esFormContextMod.FormProviderProps
import typings.rcFieldForm.esFormMod.FormProps
import typings.rcFieldForm.esInterfaceMod.FormInstance
import typings.rcFieldForm.esInterfaceMod.InternalFormInstance
import typings.rcFieldForm.esInterfaceMod.NamePath
import typings.rcFieldForm.esInterfaceMod.WatchOptions
import typings.rcFieldForm.esListContextMod.ListContextProps
import typings.rcFieldForm.esListMod.ListProps
import typings.rcFieldForm.esUseWatchMod.GetGeneric
import typings.react.mod.Context
import typings.react.mod.FunctionComponent
import typings.react.mod.JSX.Element
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-field-form", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-field-form", JSImport.Default)
  @js.native
  val default: RefFormType = js.native
  
  inline def Field[Values](param0: FieldProps[Values]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Field")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-field-form", "FieldContext")
  @js.native
  val FieldContext: Context[InternalFormInstance] = js.native
  
  @JSImport("rc-field-form", "FormProvider")
  @js.native
  val FormProvider: FunctionComponent[FormProviderProps] = js.native
  
  @JSImport("rc-field-form", "List")
  @js.native
  val List: FunctionComponent[ListProps] = js.native
  
  @JSImport("rc-field-form", "ListContext")
  @js.native
  val ListContext: Context[ListContextProps] = js.native
  
  inline def useForm[Values](): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForm")().asInstanceOf[js.Array[FormInstance[Values]]]
  inline def useForm[Values](form: FormInstance[Values]): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForm")(form.asInstanceOf[js.Any]).asInstanceOf[js.Array[FormInstance[Values]]]
  
  inline def useWatch[TForm /* <: FormInstance[Any] */](dependencies: js.Array[Any]): GetGeneric[TForm] = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[GetGeneric[TForm]]
  inline def useWatch[TForm /* <: FormInstance[Any] */](dependencies: js.Array[Any], form: TForm): GetGeneric[TForm] = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[GetGeneric[TForm]]
  inline def useWatch[TForm /* <: FormInstance[Any] */](dependencies: js.Array[Any], form: WatchOptions[TForm]): GetGeneric[TForm] = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[GetGeneric[TForm]]
  inline def useWatch[TForm /* <: FormInstance[Any] */](dependencies: NamePath): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def useWatch[TForm /* <: FormInstance[Any] */](dependencies: NamePath, form: TForm): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def useWatch[ValueType](dependencies: NamePath, form: FormInstance[Any]): ValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[ValueType]
  inline def useWatch[TForm /* <: FormInstance[Any] */](dependencies: NamePath, form: WatchOptions[TForm]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */](dependencies: js.Tuple2[TDependencies1, TDependencies2]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any]
  inline def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */](dependencies: js.Tuple2[TDependencies1, TDependencies2], form: TForm): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any]
  inline def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */](dependencies: js.Tuple2[TDependencies1, TDependencies2], form: WatchOptions[TForm]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any]
  inline def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */, TDependencies3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any */](dependencies: js.Tuple3[TDependencies1, TDependencies2, TDependencies3]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any]
  inline def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */, TDependencies3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any */](dependencies: js.Tuple3[TDependencies1, TDependencies2, TDependencies3], form: TForm): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any]
  inline def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */, TDependencies3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any */](dependencies: js.Tuple3[TDependencies1, TDependencies2, TDependencies3], form: WatchOptions[TForm]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any]
  inline def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */, TDependencies3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any */, TDependencies4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any */](dependencies: js.Tuple4[TDependencies1, TDependencies2, TDependencies3, TDependencies4]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4] */ js.Any]
  inline def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */, TDependencies3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any */, TDependencies4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any */](
    dependencies: js.Tuple4[TDependencies1, TDependencies2, TDependencies3, TDependencies4],
    form: TForm
  ): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4] */ js.Any]
  inline def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */, TDependencies3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any */, TDependencies4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any */](
    dependencies: js.Tuple4[TDependencies1, TDependencies2, TDependencies3, TDependencies4],
    form: WatchOptions[TForm]
  ): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4] */ js.Any]
  
  inline def useWatch_TDependenciesTForm_Any[TDependencies /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */](dependencies: TDependencies): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any]
  inline def useWatch_TDependenciesTForm_Any[TDependencies /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */](dependencies: TDependencies, form: TForm): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any]
  inline def useWatch_TDependenciesTForm_Any[TDependencies /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */](dependencies: TDependencies, form: WatchOptions[TForm]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any]
  inline def useWatch_TDependenciesTForm_Any[TDependencies /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */](dependencies: js.Array[TDependencies]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any]
  inline def useWatch_TDependenciesTForm_Any[TDependencies /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */](dependencies: js.Array[TDependencies], form: TForm): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any]
  inline def useWatch_TDependenciesTForm_Any[TDependencies /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */](dependencies: js.Array[TDependencies], form: WatchOptions[TForm]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any]
  
  inline def useWatch_ValueType_ValueType[ValueType](dependencies: NamePath): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[ValueType]
  inline def useWatch_ValueType_ValueType[ValueType](dependencies: NamePath, form: WatchOptions[FormInstance[Any]]): ValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[ValueType]
  
  @js.native
  trait InternalFormType extends StObject {
    
    def apply[Values](props: FormProps[Values] & Ref[Values]): ReactElement = js.native
  }
  
  @js.native
  trait RefFormType
    extends StObject
       with InternalFormType {
    
    var Field: FnCall = js.native
    
    var FormProvider: FunctionComponent[FormProviderProps] = js.native
    
    var List: FunctionComponent[ListProps] = js.native
    
    var useForm: FnCallForm = js.native
    
    var useWatch: FnCallDependenciesForm = js.native
  }
}
