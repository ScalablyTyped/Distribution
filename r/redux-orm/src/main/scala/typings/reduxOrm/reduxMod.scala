package typings.reduxOrm

import typings.reduxOrm.ormMod.IndexedModelClasses
import typings.reduxOrm.ormMod.ORM
import typings.reduxOrm.ormMod.OrmState
import typings.reduxOrm.sessionMod.OrmSession
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxMod {
  
  @JSImport("redux-orm/redux", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createReducer[I /* <: IndexedModelClasses[
    js.Object, 
    Extract[
      /* keyof {} */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: {}[keyof {}]['modelName'] */ js.Any
    ]
  ] */, TAction /* <: js.Any */](orm: ORM[I, /* keyof I */ String]): ORMReducer[I, TAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("createReducer")(orm.asInstanceOf[js.Any]).asInstanceOf[ORMReducer[I, TAction]]
  inline def createReducer[I /* <: IndexedModelClasses[
    js.Object, 
    Extract[
      /* keyof {} */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: {}[keyof {}]['modelName'] */ js.Any
    ]
  ] */, TAction /* <: js.Any */](orm: ORM[I, /* keyof I */ String], updater: defaultUpdater[I, TAction]): ORMReducer[I, TAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReducer")(orm.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[ORMReducer[I, TAction]]
  
  inline def createSelector[I, R](orm: ORM[I, /* keyof I */ String], ormSelector: ORMSelector[I, js.Array[js.Any], R]): Selector[OrmState[I], R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelector")(orm.asInstanceOf[js.Any], ormSelector.asInstanceOf[js.Any])).asInstanceOf[Selector[OrmState[I], R]]
  inline def createSelector[S, I, R](
    orm: ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    ormSelector: ORMSelector[I, js.Array[js.Any], R]
  ): Selector[S, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelector")(orm.asInstanceOf[js.Any], ormStateSelector.asInstanceOf[js.Any], ormSelector.asInstanceOf[js.Any])).asInstanceOf[Selector[S, R]]
  inline def createSelector[S, I, R1, R](
    orm: ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    ormSelector: ORMSelector[I, js.Array[R1], R]
  ): Selector[S, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelector")(orm.asInstanceOf[js.Any], ormStateSelector.asInstanceOf[js.Any], selector1.asInstanceOf[js.Any], ormSelector.asInstanceOf[js.Any])).asInstanceOf[Selector[S, R]]
  inline def createSelector[S, I, R1, R2, R](
    orm: ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    ormSelector: ORMSelector[I, js.Tuple2[R1, R2], R]
  ): Selector[S, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelector")(orm.asInstanceOf[js.Any], ormStateSelector.asInstanceOf[js.Any], selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], ormSelector.asInstanceOf[js.Any])).asInstanceOf[Selector[S, R]]
  inline def createSelector[S, I, R1, R2, R3, R](
    orm: ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    ormSelector: ORMSelector[I, js.Tuple3[R1, R2, R3], R]
  ): Selector[S, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelector")(orm.asInstanceOf[js.Any], ormStateSelector.asInstanceOf[js.Any], selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], ormSelector.asInstanceOf[js.Any])).asInstanceOf[Selector[S, R]]
  inline def createSelector[S, I, R1, R2, R3, R4, R](
    orm: ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    ormSelector: ORMSelector[I, js.Tuple4[R1, R2, R3, R4], R]
  ): Selector[S, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelector")(orm.asInstanceOf[js.Any], ormStateSelector.asInstanceOf[js.Any], selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], ormSelector.asInstanceOf[js.Any])).asInstanceOf[Selector[S, R]]
  inline def createSelector[S, I, R1, R2, R3, R4, R5, R](
    orm: ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    ormSelector: ORMSelector[I, js.Tuple5[R1, R2, R3, R4, R5], R]
  ): Selector[S, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelector")(orm.asInstanceOf[js.Any], ormStateSelector.asInstanceOf[js.Any], selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], ormSelector.asInstanceOf[js.Any])).asInstanceOf[Selector[S, R]]
  inline def createSelector[S, I, R1, R2, R3, R4, R5, R6, R](
    orm: ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    ormSelector: ORMSelector[I, js.Tuple6[R1, R2, R3, R4, R5, R6], R]
  ): Selector[S, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelector")(orm.asInstanceOf[js.Any], ormStateSelector.asInstanceOf[js.Any], selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], ormSelector.asInstanceOf[js.Any])).asInstanceOf[Selector[S, R]]
  
  type ORMReducer[I /* <: IndexedModelClasses[
    js.Object, 
    Extract[
      /* keyof {} */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: {}[keyof {}]['modelName'] */ js.Any
    ]
  ] */, TAction /* <: js.Any */] = js.Function2[/* state */ js.UndefOr[OrmState[I]], /* action */ TAction, OrmState[I]]
  
  type ORMSelector[I /* <: IndexedModelClasses[
    js.Object, 
    Extract[
      /* keyof {} */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: {}[keyof {}]['modelName'] */ js.Any
    ]
  ] */, Args /* <: js.Array[js.Any] */, R] = js.Function2[/* session */ OrmSession[I], /* args */ Args, R]
  
  type Selector[S, R] = js.Function1[/* state */ S, R]
  
  type defaultUpdater[I /* <: IndexedModelClasses[
    js.Object, 
    Extract[
      /* keyof {} */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: {}[keyof {}]['modelName'] */ js.Any
    ]
  ] */, TAction /* <: js.Any */] = js.Function2[/* session */ OrmSession[I], /* action */ TAction, Unit]
}
