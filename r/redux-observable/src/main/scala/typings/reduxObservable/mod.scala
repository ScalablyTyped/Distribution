package typings.reduxObservable

import typings.redux.mod.Action
import typings.reduxObservable.distTypesCreateEpicMiddlewareMod.EpicMiddleware
import typings.reduxObservable.distTypesCreateEpicMiddlewareMod.Options
import typings.reduxObservable.distTypesEpicMod.Epic
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-observable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FORTESTINGResetDeprecationsSeen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("__FOR_TESTING__resetDeprecationsSeen")().asInstanceOf[Unit]
  
  @JSImport("redux-observable", "StateObservable")
  @js.native
  open class StateObservable[S] protected ()
    extends typings.reduxObservable.distTypesStateObservableMod.StateObservable[S] {
    def this(input$: Observable_[S], initialState: S) = this()
  }
  
  inline def combineEpics[T /* <: Action[Any] */, O /* <: T */, S, D](epics: (Epic[T, O, S, D])*): Epic[T, O, S, D] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineEpics")(epics.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Epic[T, O, S, D]]
  
  inline def createEpicMiddleware[T /* <: Action[Any] */, O /* <: T */, S, D](): EpicMiddleware[T, O, S, D] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEpicMiddleware")().asInstanceOf[EpicMiddleware[T, O, S, D]]
  inline def createEpicMiddleware[T /* <: Action[Any] */, O /* <: T */, S, D](options: Options[D]): EpicMiddleware[T, O, S, D] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEpicMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[EpicMiddleware[T, O, S, D]]
  
  inline def ofType[Input /* <: Action[Any] */, Type /* <: /* import warning: importer.ImportType#apply Failed type conversion: Input['type'] */ js.Any */, Output /* <: Input */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param types because its type [Type, ...Array<Type>] is not an array type */ types: Array[Type]
  ): OperatorFunction[Input, Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")(types.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Input, Output]]
}
