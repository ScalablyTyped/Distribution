package typings.reactCoinhive

import typings.react.mod.Component
import typings.reactCoinhive.anon.Authedmine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-coinhive", JSImport.Default)
  @js.native
  class default () extends CoinHive
  /* static members */
  object default {
    
    @JSImport("react-coinhive", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-coinhive", "default.getMinerData")
    @js.native
    def getMinerData(miner: js.Any): js.Any = js.native
    
    @JSImport("react-coinhive", "default.src")
    @js.native
    def src: Authedmine = js.native
    @scala.inline
    def src_=(x: Authedmine): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("src")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CoinHive
    extends Component[CoinHiveProps, js.Any, js.Any] {
    
    def onInit(miner: js.Any): js.Any = js.native
    
    def onStart(miner: js.Any): js.Any = js.native
    
    def onStop(miner: js.Any): js.Any = js.native
  }
  
  @js.native
  trait CoinHiveProps extends StObject {
    
    var autoThreads: js.UndefOr[Boolean] = js.native
    
    var onInit: js.UndefOr[js.Function1[/* callback */ js.Any, Unit]] = js.native
    
    var onStart: js.UndefOr[js.Function1[/* callback */ js.Any, Unit]] = js.native
    
    var onStop: js.UndefOr[js.Function1[/* callback */ js.Any, Unit]] = js.native
    
    var run: js.UndefOr[Boolean] = js.native
    
    var siteKey: String = js.native
    
    var src: js.UndefOr[String] = js.native
    
    var threads: js.UndefOr[Double] = js.native
    
    var throttle: js.UndefOr[Double] = js.native
    
    var userName: js.UndefOr[String] = js.native
  }
  object CoinHiveProps {
    
    @scala.inline
    def apply(siteKey: String): CoinHiveProps = {
      val __obj = js.Dynamic.literal(siteKey = siteKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoinHiveProps]
    }
    
    @scala.inline
    implicit class CoinHivePropsMutableBuilder[Self <: CoinHiveProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoThreads(value: Boolean): Self = StObject.set(x, "autoThreads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoThreadsUndefined: Self = StObject.set(x, "autoThreads", js.undefined)
      
      @scala.inline
      def setOnInit(value: /* callback */ js.Any => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      @scala.inline
      def setOnStart(value: /* callback */ js.Any => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setOnStop(value: /* callback */ js.Any => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      @scala.inline
      def setRun(value: Boolean): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
      
      @scala.inline
      def setSiteKey(value: String): Self = StObject.set(x, "siteKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
      
      @scala.inline
      def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      @scala.inline
      def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    }
  }
}
