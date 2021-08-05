package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ux {
  
  object device {
    
    @JSGlobal("Ext.ux.device.Analytics")
    @js.native
    class Analytics_ ()
      extends StObject
         with typings.senchaTouch.Ext.ux.device.Analytics_
    /* static members */
    object Analytics_ {
      
      @JSGlobal("Ext.ux.device.Analytics")
      @js.native
      val ^ : js.Any = js.native
      
      /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
        * @returns Object Returns the result of calling the overridden method
        */
      inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
      inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Method] Call the parent method of the current method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
        * @returns Object Returns the result of calling the parent method
        */
      inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
      inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
        * @returns Object Returns the result of calling the superclass method
        */
      inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
      inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Method]  */
      inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
      
      /** [Method] Returns the value of accountID
        * @returns Object
        */
      inline def getAccountID(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountID")().asInstanceOf[js.Any]
      
      /** [Method] Returns the initial configuration passed to constructor
        * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
        * @returns Object/Mixed
        */
      inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
      inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Method] Initialize configuration for this class
        * @param instanceConfig Object
        * @returns Object mixins The mixin prototypes as key - value pairs
        */
      inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
      inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Method] Registers yur Google Analytics account
        * @param accountID String Your Google Analytics account ID
        */
      inline def registerAccount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAccount")().asInstanceOf[Unit]
      inline def registerAccount(accountID: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAccount")(accountID.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /** [Property] (Ext.Class) */
      @JSGlobal("Ext.ux.device.Analytics.self")
      @js.native
      def self: IClass = js.native
      inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
      
      /** [Method] Sets the value of accountID
        * @param accountID Object The new value.
        */
      inline def setAccountID(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAccountID")().asInstanceOf[Unit]
      inline def setAccountID(accountID: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAccountID")(accountID.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
      
      /** [Method] Track an event in your application
        * @param config Object
        */
      inline def trackEvent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackEvent")().asInstanceOf[Unit]
      inline def trackEvent(config: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackEvent")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /** [Method] Track an pageview in your application
        * @param config String The page you want to track (must start with a slash).
        */
      inline def trackPageview(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackPageview")().asInstanceOf[Unit]
      inline def trackPageview(config: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackPageview")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    @JSGlobal("Ext.ux.device.Twitter")
    @js.native
    class Twitter_ ()
      extends StObject
         with typings.senchaTouch.Ext.ux.device.Twitter_
    /* static members */
    object Twitter_ {
      
      @JSGlobal("Ext.ux.device.Twitter")
      @js.native
      val ^ : js.Any = js.native
      
      /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
        * @returns Object Returns the result of calling the overridden method
        */
      inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
      inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Method] Call the parent method of the current method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
        * @returns Object Returns the result of calling the parent method
        */
      inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
      inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
        * @returns Object Returns the result of calling the superclass method
        */
      inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
      inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Method] Pops up a Twitter compose sheet view with your specified tweet
        * @param config Object An object which contains the following config options:
        */
      inline def compose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")().asInstanceOf[Unit]
      inline def compose(config: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /** [Method]  */
      inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
      
      /** [Method] Returns the initial configuration passed to constructor
        * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
        * @returns Object/Mixed
        */
      inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
      inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Method] Gets Tweets from Twitter Mentions
        * @param config Object An object which contains the following config options:
        */
      inline def getMentions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getMentions")().asInstanceOf[Unit]
      inline def getMentions(config: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getMentions")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /** [Method] Gets Tweets from Twitter Timeline
        * @param config Object An object which contains the following config options:
        */
      inline def getPublicTimeline(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicTimeline")().asInstanceOf[Unit]
      inline def getPublicTimeline(config: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicTimeline")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /** [Method] Gets a specific Twitter user info
        * @param config Object An object which contains the following config options:
        */
      inline def getTwitterRequest(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTwitterRequest")().asInstanceOf[Unit]
      inline def getTwitterRequest(config: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTwitterRequest")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /** [Method] Gets a specific Twitter user info
        * @param config Object An object which contains the following config options:
        */
      inline def getTwitterUsername(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTwitterUsername")().asInstanceOf[Unit]
      inline def getTwitterUsername(config: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTwitterUsername")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /** [Method] Initialize configuration for this class
        * @param instanceConfig Object
        * @returns Object mixins The mixin prototypes as key - value pairs
        */
      inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
      inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Property] (Ext.Class) */
      @JSGlobal("Ext.ux.device.Twitter.self")
      @js.native
      def self: IClass = js.native
      inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    }
  }
}
