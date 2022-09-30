package typings.pulltorefreshjs

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pulltorefreshjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def destroyAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyAll")().asInstanceOf[Unit]
  
  inline def init(): PullToRefreshInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[PullToRefreshInstance]
  inline def init(options: Options): PullToRefreshInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[PullToRefreshInstance]
  
  inline def setPassiveMode(isPassive: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPassiveMode")(isPassive.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
      * What class prefix for the elements?
      * (default: `ptr--`)
      */
    var classPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * What property will be used to calculate the element's proportions?
      * (default: `min-height`)
      */
    var cssProp: js.UndefOr[String] = js.undefined
    
    /**
      * After which distance should we start pulling.
      * (Default: `0`)
      */
    var distIgnore: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum distance possible for the element.
      * (default: `80`)
      */
    var distMax: js.UndefOr[Double] = js.undefined
    
    /**
      * After the `distThreshold` is reached and released, the element will have this height.
      * (default: `50`)
      */
    var distReload: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum distance required to trigger the refresh.
      * (default: `60`)
      */
    var distThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * It returns the default HTML for the widget, __PREFIX__ is replaced.
      */
    var getMarkup: js.UndefOr[js.Function0[String]] = js.undefined
    
    /**
      * It returns the default CSS for the widget, __PREFIX__ is replaced.
      */
    var getStyles: js.UndefOr[js.Function0[String]] = js.undefined
    
    /**
      * The icon for both `instructionsPullToRefresh` and `instructionsReleaseToRefresh`
      * (default: `&#8675;`)
      */
    var iconArrow: js.UndefOr[String] = js.undefined
    
    /**
      * The icon when the refresh is in progress.
      * (default: `&hellip;`)
      */
    var iconRefreshing: js.UndefOr[String] = js.undefined
    
    /**
      * The initial instructions string.
      * (default: `Pull down to refresh`)
      */
    var instructionsPullToRefresh: js.UndefOr[String] = js.undefined
    
    /**
      * The refreshing text.
      * (default: `Refreshing`)
      */
    var instructionsRefreshing: js.UndefOr[String] = js.undefined
    
    /**
      * The instructions string when the `distThreshold` has been reached.
      * (default: `Release to refresh`)
      */
    var instructionsReleaseToRefresh: js.UndefOr[String] = js.undefined
    
    /**
      * Before which element the pull to refresh elements will be?
      * (default: `body`)
      */
    var mainElement: js.UndefOr[String] = js.undefined
    
    /**
      * The initialize function.
      */
    var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * What will the pull to refresh trigger? You can return a promise.
      *
      * Defaults to `window.location.reload()`
      */
    var onRefresh: js.UndefOr[js.Function0[PromiseLike[Unit] | Unit]] = js.undefined
    
    /**
      * What class will the main element have?
      * (default: `.ptr`)
      */
    var ptrElement: js.UndefOr[String] = js.undefined
    
    /**
      * The delay, in milliseconds before the `onRefresh` is triggered.
      * (default: `500`)
      */
    var refreshTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The resistance function, accepts one parameter, must return a number, capping at 1.
      *
      * Defaults to `t => Math.min(1, t / 2.5)`
      */
    var resistanceFunction: js.UndefOr[js.Function1[/* input */ Double, Double]] = js.undefined
    
    /**
      * Which condition should be met for pullToRefresh to trigger?
      *
      * Defaults to `!window.scrollY`
      */
    var shouldPullToRefresh: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /**
      * Which element should trigger the pull to refresh?
      * (default: `body`)
      */
    var triggerElement: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClassPrefix(value: String): Self = StObject.set(x, "classPrefix", value.asInstanceOf[js.Any])
      
      inline def setClassPrefixUndefined: Self = StObject.set(x, "classPrefix", js.undefined)
      
      inline def setCssProp(value: String): Self = StObject.set(x, "cssProp", value.asInstanceOf[js.Any])
      
      inline def setCssPropUndefined: Self = StObject.set(x, "cssProp", js.undefined)
      
      inline def setDistIgnore(value: Double): Self = StObject.set(x, "distIgnore", value.asInstanceOf[js.Any])
      
      inline def setDistIgnoreUndefined: Self = StObject.set(x, "distIgnore", js.undefined)
      
      inline def setDistMax(value: Double): Self = StObject.set(x, "distMax", value.asInstanceOf[js.Any])
      
      inline def setDistMaxUndefined: Self = StObject.set(x, "distMax", js.undefined)
      
      inline def setDistReload(value: Double): Self = StObject.set(x, "distReload", value.asInstanceOf[js.Any])
      
      inline def setDistReloadUndefined: Self = StObject.set(x, "distReload", js.undefined)
      
      inline def setDistThreshold(value: Double): Self = StObject.set(x, "distThreshold", value.asInstanceOf[js.Any])
      
      inline def setDistThresholdUndefined: Self = StObject.set(x, "distThreshold", js.undefined)
      
      inline def setGetMarkup(value: () => String): Self = StObject.set(x, "getMarkup", js.Any.fromFunction0(value))
      
      inline def setGetMarkupUndefined: Self = StObject.set(x, "getMarkup", js.undefined)
      
      inline def setGetStyles(value: () => String): Self = StObject.set(x, "getStyles", js.Any.fromFunction0(value))
      
      inline def setGetStylesUndefined: Self = StObject.set(x, "getStyles", js.undefined)
      
      inline def setIconArrow(value: String): Self = StObject.set(x, "iconArrow", value.asInstanceOf[js.Any])
      
      inline def setIconArrowUndefined: Self = StObject.set(x, "iconArrow", js.undefined)
      
      inline def setIconRefreshing(value: String): Self = StObject.set(x, "iconRefreshing", value.asInstanceOf[js.Any])
      
      inline def setIconRefreshingUndefined: Self = StObject.set(x, "iconRefreshing", js.undefined)
      
      inline def setInstructionsPullToRefresh(value: String): Self = StObject.set(x, "instructionsPullToRefresh", value.asInstanceOf[js.Any])
      
      inline def setInstructionsPullToRefreshUndefined: Self = StObject.set(x, "instructionsPullToRefresh", js.undefined)
      
      inline def setInstructionsRefreshing(value: String): Self = StObject.set(x, "instructionsRefreshing", value.asInstanceOf[js.Any])
      
      inline def setInstructionsRefreshingUndefined: Self = StObject.set(x, "instructionsRefreshing", js.undefined)
      
      inline def setInstructionsReleaseToRefresh(value: String): Self = StObject.set(x, "instructionsReleaseToRefresh", value.asInstanceOf[js.Any])
      
      inline def setInstructionsReleaseToRefreshUndefined: Self = StObject.set(x, "instructionsReleaseToRefresh", js.undefined)
      
      inline def setMainElement(value: String): Self = StObject.set(x, "mainElement", value.asInstanceOf[js.Any])
      
      inline def setMainElementUndefined: Self = StObject.set(x, "mainElement", js.undefined)
      
      inline def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      inline def setOnRefresh(value: () => PromiseLike[Unit] | Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
      
      inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
      
      inline def setPtrElement(value: String): Self = StObject.set(x, "ptrElement", value.asInstanceOf[js.Any])
      
      inline def setPtrElementUndefined: Self = StObject.set(x, "ptrElement", js.undefined)
      
      inline def setRefreshTimeout(value: Double): Self = StObject.set(x, "refreshTimeout", value.asInstanceOf[js.Any])
      
      inline def setRefreshTimeoutUndefined: Self = StObject.set(x, "refreshTimeout", js.undefined)
      
      inline def setResistanceFunction(value: /* input */ Double => Double): Self = StObject.set(x, "resistanceFunction", js.Any.fromFunction1(value))
      
      inline def setResistanceFunctionUndefined: Self = StObject.set(x, "resistanceFunction", js.undefined)
      
      inline def setShouldPullToRefresh(value: () => Boolean): Self = StObject.set(x, "shouldPullToRefresh", js.Any.fromFunction0(value))
      
      inline def setShouldPullToRefreshUndefined: Self = StObject.set(x, "shouldPullToRefresh", js.undefined)
      
      inline def setTriggerElement(value: String): Self = StObject.set(x, "triggerElement", value.asInstanceOf[js.Any])
      
      inline def setTriggerElementUndefined: Self = StObject.set(x, "triggerElement", js.undefined)
    }
  }
  
  trait PullToRefreshInstance extends StObject {
    
    def destroy(): Unit
  }
  object PullToRefreshInstance {
    
    inline def apply(destroy: () => Unit): PullToRefreshInstance = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[PullToRefreshInstance]
    }
    
    extension [Self <: PullToRefreshInstance](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
}
