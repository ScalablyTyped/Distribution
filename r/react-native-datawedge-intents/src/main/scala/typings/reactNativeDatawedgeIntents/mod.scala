package typings.reactNativeDatawedgeIntents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-datawedge-intents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerBroadcastReceiver(filter: FilterObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerBroadcastReceiver")(filter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sendBroadcastWithExtras(extrasObject: ExtrasObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendBroadcastWithExtras")(extrasObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ExtrasObject extends StObject {
    
    var action: String
    
    var extras: js.UndefOr[js.Object] = js.undefined
  }
  object ExtrasObject {
    
    inline def apply(action: String): ExtrasObject = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtrasObject]
    }
    
    extension [Self <: ExtrasObject](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setExtras(value: js.Object): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
      
      inline def setExtrasUndefined: Self = StObject.set(x, "extras", js.undefined)
    }
  }
  
  trait FilterObject extends StObject {
    
    var filterActions: js.Array[String]
    
    var filterCategories: js.Array[String]
  }
  object FilterObject {
    
    inline def apply(filterActions: js.Array[String], filterCategories: js.Array[String]): FilterObject = {
      val __obj = js.Dynamic.literal(filterActions = filterActions.asInstanceOf[js.Any], filterCategories = filterCategories.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterObject]
    }
    
    extension [Self <: FilterObject](x: Self) {
      
      inline def setFilterActions(value: js.Array[String]): Self = StObject.set(x, "filterActions", value.asInstanceOf[js.Any])
      
      inline def setFilterActionsVarargs(value: String*): Self = StObject.set(x, "filterActions", js.Array(value :_*))
      
      inline def setFilterCategories(value: js.Array[String]): Self = StObject.set(x, "filterCategories", value.asInstanceOf[js.Any])
      
      inline def setFilterCategoriesVarargs(value: String*): Self = StObject.set(x, "filterCategories", js.Array(value :_*))
    }
  }
}
