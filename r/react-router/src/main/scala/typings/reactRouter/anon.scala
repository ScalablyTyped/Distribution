package typings.reactRouter

import org.scalablytyped.runtime.TopLevel
import typings.history.mod.LocationState
import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.reactRouter.mod.`match`
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait History[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.History & TopLevel[js.Any] */] extends StObject {
    
    var history: typings.history.mod.History[LocationState]
    
    var route: Location[Params]
  }
  object History {
    
    inline def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reactRouter.reactRouterStrings.History & TopLevel[js.Any] */](history: typings.history.mod.History[LocationState], route: Location[Params]): History[Params] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[History[Params]]
    }
    
    extension [Self <: History[?], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reactRouter.reactRouterStrings.History & TopLevel[js.Any] */](x: Self & History[Params]) {
      
      inline def setHistory(value: typings.history.mod.History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: Location[Params]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait Location[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.Location & TopLevel[js.Any] */] extends StObject {
    
    var location: typings.history.mod.Location[LocationState]
    
    var `match`: typings.reactRouter.mod.`match`[Params]
  }
  object Location {
    
    inline def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reactRouter.reactRouterStrings.Location & TopLevel[js.Any] */](location: typings.history.mod.Location[LocationState], `match`: `match`[Params]): Location[Params] = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location[Params]]
    }
    
    extension [Self <: Location[?], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reactRouter.reactRouterStrings.Location & TopLevel[js.Any] */](x: Self & Location[Params]) {
      
      inline def setLocation(value: typings.history.mod.Location[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: `match`[Params]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    }
  }
  
  trait WrappedComponentRef[C /* <: ComponentType[js.Any] */] extends StObject {
    
    var wrappedComponentRef: js.UndefOr[Ref[InstanceType[C]]] = js.undefined
  }
  object WrappedComponentRef {
    
    inline def apply[C /* <: ComponentType[js.Any] */](): WrappedComponentRef[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrappedComponentRef[C]]
    }
    
    extension [Self <: WrappedComponentRef[?], C /* <: ComponentType[js.Any] */](x: Self & WrappedComponentRef[C]) {
      
      inline def setWrappedComponentRef(value: Ref[InstanceType[C]]): Self = StObject.set(x, "wrappedComponentRef", value.asInstanceOf[js.Any])
      
      inline def setWrappedComponentRefFunction1(value: /* instance */ InstanceType[C] | Null => Unit): Self = StObject.set(x, "wrappedComponentRef", js.Any.fromFunction1(value))
      
      inline def setWrappedComponentRefNull: Self = StObject.set(x, "wrappedComponentRef", null)
      
      inline def setWrappedComponentRefUndefined: Self = StObject.set(x, "wrappedComponentRef", js.undefined)
    }
  }
}
