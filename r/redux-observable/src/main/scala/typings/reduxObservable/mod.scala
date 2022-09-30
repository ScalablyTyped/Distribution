package typings.reduxObservable

import typings.redux.mod.Action
import typings.reduxObservable.createEpicMiddlewareMod.EpicMiddleware
import typings.reduxObservable.createEpicMiddlewareMod.Options
import typings.reduxObservable.epicMod.Epic
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
    extends typings.reduxObservable.stateObservableMod.StateObservable[S] {
    def this(
      input$: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<S> */ Any,
      initialState: S
    ) = this()
  }
  
  inline def combineEpics[T /* <: Action[Any] */, O /* <: T */, S, D](epics: (Epic[T, O, S, D])*): Epic[T, O, S, D] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineEpics")(epics.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Epic[T, O, S, D]]
  
  inline def createEpicMiddleware[T /* <: Action[Any] */, O /* <: T */, S, D](): EpicMiddleware[T, O, S, D] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEpicMiddleware")().asInstanceOf[EpicMiddleware[T, O, S, D]]
  inline def createEpicMiddleware[T /* <: Action[Any] */, O /* <: T */, S, D](options: Options[D]): EpicMiddleware[T, O, S, D] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEpicMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[EpicMiddleware[T, O, S, D]]
  
  inline def ofType[Input /* <: Action[Any] */, Type /* <: /* import warning: importer.ImportType#apply Failed type conversion: Input['type'] */ js.Any */, Output /* <: Input */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param types because its type [Type, ...Array<Type>] is not an array type */ types: Array[Type]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")(types.asInstanceOf[js.Any]).asInstanceOf[Any]
}
