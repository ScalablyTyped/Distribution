package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.ux.device.analytics.IAbstract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ux {
  
  trait IActionOverFlowMenuButton
    extends StObject
       with IMenuButton {
    
    /** [Property] () */
    var menuItems: js.UndefOr[Any] = js.undefined
  }
  object IActionOverFlowMenuButton {
    
    inline def apply(): IActionOverFlowMenuButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IActionOverFlowMenuButton]
    }
    
    extension [Self <: IActionOverFlowMenuButton](x: Self) {
      
      inline def setMenuItems(value: Any): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      inline def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
    }
  }
  
  trait IApplicationMenu
    extends StObject
       with IMenu
  object IApplicationMenu {
    
    inline def apply(): IApplicationMenu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IApplicationMenu]
    }
  }
  
  type IContextMenu = IMenu
  
  trait IMenuButton
    extends StObject
       with IButton {
    
    /** [Method] Returns the value of menuItems
      * @returns Array
      */
    var getMenuItems: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Sets the value of menuItems
      * @param menuItems Array The new value.
      */
    var setMenuItems: js.UndefOr[js.Function1[/* menuItems */ js.UndefOr[Array], Unit]] = js.undefined
  }
  object IMenuButton {
    
    inline def apply(): IMenuButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMenuButton]
    }
    
    extension [Self <: IMenuButton](x: Self) {
      
      inline def setGetMenuItems(value: () => Array): Self = StObject.set(x, "getMenuItems", js.Any.fromFunction0(value))
      
      inline def setGetMenuItemsUndefined: Self = StObject.set(x, "getMenuItems", js.undefined)
      
      inline def setSetMenuItems(value: /* menuItems */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setMenuItems", js.Any.fromFunction1(value))
      
      inline def setSetMenuItemsUndefined: Self = StObject.set(x, "setMenuItems", js.undefined)
    }
  }
  
  trait ITabMenuButton
    extends StObject
       with IMenuButton {
    
    /** [Property] () */
    var menuItems: js.UndefOr[Any] = js.undefined
  }
  object ITabMenuButton {
    
    inline def apply(): ITabMenuButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITabMenuButton]
    }
    
    extension [Self <: ITabMenuButton](x: Self) {
      
      inline def setMenuItems(value: Any): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      inline def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
    }
  }
  
  object device {
    
    trait Analytics_ extends StObject
    
    trait IAnalytics
      extends StObject
         with IAbstract
    object IAnalytics {
      
      inline def apply(): IAnalytics = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IAnalytics]
      }
    }
    
    trait ITwitter
      extends StObject
         with typings.senchaTouch.Ext.ux.device.twitter.IAbstract
    object ITwitter {
      
      inline def apply(): ITwitter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITwitter]
      }
    }
    
    trait Twitter_ extends StObject
    
    object analytics {
      
      trait IAbstract
        extends StObject
           with IBase {
        
        /** [Method] Returns the value of accountID
          * @returns Object
          */
        var getAccountID: js.UndefOr[js.Function0[Any]] = js.undefined
        
        /** [Method] Registers yur Google Analytics account
          * @param accountID String Your Google Analytics account ID
          */
        var registerAccount: js.UndefOr[js.Function1[/* accountID */ js.UndefOr[java.lang.String], Unit]] = js.undefined
        
        /** [Method] Sets the value of accountID
          * @param accountID Object The new value.
          */
        var setAccountID: js.UndefOr[js.Function1[/* accountID */ js.UndefOr[Any], Unit]] = js.undefined
        
        /** [Method] Track an event in your application
          * @param config Object
          */
        var trackEvent: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Unit]] = js.undefined
        
        /** [Method] Track an pageview in your application
          * @param config String The page you want to track (must start with a slash).
          */
        var trackPageview: js.UndefOr[js.Function1[/* config */ js.UndefOr[java.lang.String], Unit]] = js.undefined
      }
      object IAbstract {
        
        inline def apply(): IAbstract = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IAbstract]
        }
        
        extension [Self <: IAbstract](x: Self) {
          
          inline def setGetAccountID(value: () => Any): Self = StObject.set(x, "getAccountID", js.Any.fromFunction0(value))
          
          inline def setGetAccountIDUndefined: Self = StObject.set(x, "getAccountID", js.undefined)
          
          inline def setRegisterAccount(value: /* accountID */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "registerAccount", js.Any.fromFunction1(value))
          
          inline def setRegisterAccountUndefined: Self = StObject.set(x, "registerAccount", js.undefined)
          
          inline def setSetAccountID(value: /* accountID */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setAccountID", js.Any.fromFunction1(value))
          
          inline def setSetAccountIDUndefined: Self = StObject.set(x, "setAccountID", js.undefined)
          
          inline def setTrackEvent(value: /* config */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "trackEvent", js.Any.fromFunction1(value))
          
          inline def setTrackEventUndefined: Self = StObject.set(x, "trackEvent", js.undefined)
          
          inline def setTrackPageview(value: /* config */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "trackPageview", js.Any.fromFunction1(value))
          
          inline def setTrackPageviewUndefined: Self = StObject.set(x, "trackPageview", js.undefined)
        }
      }
      
      trait ICordova
        extends StObject
           with IAbstract {
        
        /** [Method] Track an pageview in your application
          * @param page Object
          */
        @JSName("trackPageview")
        var trackPageview_ICordova: js.UndefOr[js.Function1[/* page */ js.UndefOr[Any], Unit]] = js.undefined
      }
      object ICordova {
        
        inline def apply(): ICordova = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ICordova]
        }
        
        extension [Self <: ICordova](x: Self) {
          
          inline def setTrackPageview(value: /* page */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "trackPageview", js.Any.fromFunction1(value))
          
          inline def setTrackPageviewUndefined: Self = StObject.set(x, "trackPageview", js.undefined)
        }
      }
    }
    
    object twitter {
      
      trait IAbstract
        extends StObject
           with IBase {
        
        /** [Method] Pops up a Twitter compose sheet view with your specified tweet
          * @param config Object An object which contains the following config options:
          */
        var compose: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Unit]] = js.undefined
        
        /** [Method] Gets Tweets from Twitter Mentions
          * @param config Object An object which contains the following config options:
          */
        var getMentions: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Unit]] = js.undefined
        
        /** [Method] Gets Tweets from Twitter Timeline
          * @param config Object An object which contains the following config options:
          */
        var getPublicTimeline: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Unit]] = js.undefined
        
        /** [Method] Gets a specific Twitter user info
          * @param config Object An object which contains the following config options:
          */
        var getTwitterRequest: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Unit]] = js.undefined
        
        /** [Method] Gets a specific Twitter user info
          * @param config Object An object which contains the following config options:
          */
        var getTwitterUsername: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Unit]] = js.undefined
      }
      object IAbstract {
        
        inline def apply(): typings.senchaTouch.Ext.ux.device.twitter.IAbstract = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.senchaTouch.Ext.ux.device.twitter.IAbstract]
        }
        
        extension [Self <: typings.senchaTouch.Ext.ux.device.twitter.IAbstract](x: Self) {
          
          inline def setCompose(value: /* config */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "compose", js.Any.fromFunction1(value))
          
          inline def setComposeUndefined: Self = StObject.set(x, "compose", js.undefined)
          
          inline def setGetMentions(value: /* config */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "getMentions", js.Any.fromFunction1(value))
          
          inline def setGetMentionsUndefined: Self = StObject.set(x, "getMentions", js.undefined)
          
          inline def setGetPublicTimeline(value: /* config */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "getPublicTimeline", js.Any.fromFunction1(value))
          
          inline def setGetPublicTimelineUndefined: Self = StObject.set(x, "getPublicTimeline", js.undefined)
          
          inline def setGetTwitterRequest(value: /* config */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "getTwitterRequest", js.Any.fromFunction1(value))
          
          inline def setGetTwitterRequestUndefined: Self = StObject.set(x, "getTwitterRequest", js.undefined)
          
          inline def setGetTwitterUsername(value: /* config */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "getTwitterUsername", js.Any.fromFunction1(value))
          
          inline def setGetTwitterUsernameUndefined: Self = StObject.set(x, "getTwitterUsername", js.undefined)
        }
      }
      
      type ICordova = IBase
    }
  }
}
