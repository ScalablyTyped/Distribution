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
    
    @scala.inline
    def apply(cards: js.Array[Card], key: Double, navigationState: NavigationState[Params]): Cards = {
      val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cards]
    }
    
    @scala.inline
    implicit class CardsMutableBuilder[Self <: Cards] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCards(value: js.Array[Card]): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardsVarargs(value: Card*): Self = StObject.set(x, "cards", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationState(value: NavigationState[Params]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
    }
  }
  
  trait ForceSync extends StObject {
    
    var forceSync: `false`
  }
  object ForceSync {
    
    @scala.inline
    def apply(): ForceSync = {
      val __obj = js.Dynamic.literal(forceSync = false)
      __obj.asInstanceOf[ForceSync]
    }
    
    @scala.inline
    implicit class ForceSyncMutableBuilder[Self <: ForceSync] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceSync(value: `false`): Self = StObject.set(x, "forceSync", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
      loadedTabs: js.Array[String],
      navigationState: NavigationState[TestID],
      rootIndex: Double,
      tabs: js.Array[Tab],
      tabsHistory: NumberDictionary[js.Array[Location[LocationState]]]
    ): LoadedTabs = {
      val __obj = js.Dynamic.literal(loadedTabs = loadedTabs.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], rootIndex = rootIndex.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], tabsHistory = tabsHistory.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadedTabs]
    }
    
    @scala.inline
    implicit class LoadedTabsMutableBuilder[Self <: LoadedTabs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadedTabs(value: js.Array[String]): Self = StObject.set(x, "loadedTabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedTabsVarargs(value: String*): Self = StObject.set(x, "loadedTabs", js.Array(value :_*))
      
      @scala.inline
      def setNavigationState(value: NavigationState[TestID]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootIndex(value: Double): Self = StObject.set(x, "rootIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabs(value: js.Array[Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsHistory(value: NumberDictionary[js.Array[Location[LocationState]]]): Self = StObject.set(x, "tabsHistory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsVarargs(value: Tab*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    }
  }
  
  trait Params extends StObject {
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object Params {
    
    @scala.inline
    def apply(): Params = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait TestID extends StObject {
    
    var testID: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object TestID {
    
    @scala.inline
    def apply(): TestID = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestID]
    }
    
    @scala.inline
    implicit class TestIDMutableBuilder[Self <: TestID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
