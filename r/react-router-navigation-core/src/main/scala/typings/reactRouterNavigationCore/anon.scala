package typings.reactRouterNavigationCore

import org.scalablytyped.runtime.NumberDictionary
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.reactRouterNavigationCore.mod.Card
import typings.reactRouterNavigationCore.mod.NavigationState
import typings.reactRouterNavigationCore.mod.Tab
import typings.reactRouterNavigationCore.reactRouterNavigationCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cards extends StObject {
    
    var cards: js.Array[Card]
    
    var key: Double
    
    var navigationState: NavigationState[Params]
  }
  object Cards {
    
    inline def apply(cards: js.Array[Card], key: Double, navigationState: NavigationState[Params]): Cards = {
      val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cards]
    }
    
    extension [Self <: Cards](x: Self) {
      
      inline def setCards(value: js.Array[Card]): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
      
      inline def setCardsVarargs(value: Card*): Self = StObject.set(x, "cards", js.Array(value :_*))
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNavigationState(value: NavigationState[Params]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
    }
  }
  
  trait ForceSync extends StObject {
    
    var forceSync: `false`
  }
  object ForceSync {
    
    inline def apply(): ForceSync = {
      val __obj = js.Dynamic.literal(forceSync = false)
      __obj.asInstanceOf[ForceSync]
    }
    
    extension [Self <: ForceSync](x: Self) {
      
      inline def setForceSync(value: `false`): Self = StObject.set(x, "forceSync", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoadedTabs extends StObject {
    
    var loadedTabs: js.Array[String]
    
    var navigationState: NavigationState[TestID]
    
    var rootIndex: Double
    
    var tabs: js.Array[Tab]
    
    var tabsHistory: NumberDictionary[js.Array[Location[LocationState]]]
  }
  object LoadedTabs {
    
    inline def apply(
      loadedTabs: js.Array[String],
      navigationState: NavigationState[TestID],
      rootIndex: Double,
      tabs: js.Array[Tab],
      tabsHistory: NumberDictionary[js.Array[Location[LocationState]]]
    ): LoadedTabs = {
      val __obj = js.Dynamic.literal(loadedTabs = loadedTabs.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], rootIndex = rootIndex.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], tabsHistory = tabsHistory.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadedTabs]
    }
    
    extension [Self <: LoadedTabs](x: Self) {
      
      inline def setLoadedTabs(value: js.Array[String]): Self = StObject.set(x, "loadedTabs", value.asInstanceOf[js.Any])
      
      inline def setLoadedTabsVarargs(value: String*): Self = StObject.set(x, "loadedTabs", js.Array(value :_*))
      
      inline def setNavigationState(value: NavigationState[TestID]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
      
      inline def setRootIndex(value: Double): Self = StObject.set(x, "rootIndex", value.asInstanceOf[js.Any])
      
      inline def setTabs(value: js.Array[Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsHistory(value: NumberDictionary[js.Array[Location[LocationState]]]): Self = StObject.set(x, "tabsHistory", value.asInstanceOf[js.Any])
      
      inline def setTabsVarargs(value: Tab*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    }
  }
  
  trait Params extends StObject {
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object Params {
    
    inline def apply(): Params = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait TestID extends StObject {
    
    var testID: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object TestID {
    
    inline def apply(): TestID = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestID]
    }
    
    extension [Self <: TestID](x: Self) {
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
