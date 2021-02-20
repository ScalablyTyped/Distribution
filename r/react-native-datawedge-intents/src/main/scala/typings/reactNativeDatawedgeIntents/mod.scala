package typings.reactNativeDatawedgeIntents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-datawedge-intents", "registerBroadcastReceiver")
  @js.native
  def registerBroadcastReceiver(filter: FilterObject): Unit = js.native
  
  @JSImport("react-native-datawedge-intents", "sendBroadcastWithExtras")
  @js.native
  def sendBroadcastWithExtras(extrasObject: ExtrasObject): Unit = js.native
  
  @js.native
  trait ExtrasObject extends StObject {
    
    var action: String = js.native
    
    var extras: js.UndefOr[js.Object] = js.native
  }
  object ExtrasObject {
    
    @scala.inline
    def apply(action: String): ExtrasObject = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtrasObject]
    }
    
    @scala.inline
    implicit class ExtrasObjectMutableBuilder[Self <: ExtrasObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtras(value: js.Object): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtrasUndefined: Self = StObject.set(x, "extras", js.undefined)
    }
  }
  
  @js.native
  trait FilterObject extends StObject {
    
    var filterActions: js.Array[String] = js.native
    
    var filterCategories: js.Array[String] = js.native
  }
  object FilterObject {
    
    @scala.inline
    def apply(filterActions: js.Array[String], filterCategories: js.Array[String]): FilterObject = {
      val __obj = js.Dynamic.literal(filterActions = filterActions.asInstanceOf[js.Any], filterCategories = filterCategories.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterObject]
    }
    
    @scala.inline
    implicit class FilterObjectMutableBuilder[Self <: FilterObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterActions(value: js.Array[String]): Self = StObject.set(x, "filterActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterActionsVarargs(value: String*): Self = StObject.set(x, "filterActions", js.Array(value :_*))
      
      @scala.inline
      def setFilterCategories(value: js.Array[String]): Self = StObject.set(x, "filterCategories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterCategoriesVarargs(value: String*): Self = StObject.set(x, "filterCategories", js.Array(value :_*))
    }
  }
}
