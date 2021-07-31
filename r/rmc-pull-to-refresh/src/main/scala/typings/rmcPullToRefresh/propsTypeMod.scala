package typings.rmcPullToRefresh

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.rmcPullToRefresh.rmcPullToRefreshStrings.down
import typings.rmcPullToRefresh.rmcPullToRefreshStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propsTypeMod {
  
  trait Indicator extends StObject {
    
    var activate: js.UndefOr[ReactNode] = js.undefined
    
    var deactivate: js.UndefOr[ReactNode] = js.undefined
    
    var finish: js.UndefOr[ReactNode] = js.undefined
    
    var release: js.UndefOr[ReactNode] = js.undefined
  }
  object Indicator {
    
    @scala.inline
    def apply(): Indicator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Indicator]
    }
    
    @scala.inline
    implicit class IndicatorMutableBuilder[Self <: Indicator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivate(value: ReactNode): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
      
      @scala.inline
      def setDeactivate(value: ReactNode): Self = StObject.set(x, "deactivate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
      
      @scala.inline
      def setFinish(value: ReactNode): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
      
      @scala.inline
      def setRelease(value: ReactNode): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    }
  }
  
  trait PropsType extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var damping: js.UndefOr[Double] = js.undefined
    
    var direction: down | up
    
    var distanceToRefresh: Double
    
    def getScrollContainer(): ReactNode
    
    var indicator: Indicator
    
    def onRefresh(): Unit
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var refreshing: js.UndefOr[Boolean] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object PropsType {
    
    @scala.inline
    def apply(
      direction: down | up,
      distanceToRefresh: Double,
      getScrollContainer: () => ReactNode,
      indicator: Indicator,
      onRefresh: () => Unit
    ): PropsType = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], distanceToRefresh = distanceToRefresh.asInstanceOf[js.Any], getScrollContainer = js.Any.fromFunction0(getScrollContainer), indicator = indicator.asInstanceOf[js.Any], onRefresh = js.Any.fromFunction0(onRefresh))
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit class PropsTypeMutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      @scala.inline
      def setDirection(value: down | up): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceToRefresh(value: Double): Self = StObject.set(x, "distanceToRefresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetScrollContainer(value: () => ReactNode): Self = StObject.set(x, "getScrollContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIndicator(value: Indicator): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRefreshing(value: Boolean): Self = StObject.set(x, "refreshing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshingUndefined: Self = StObject.set(x, "refreshing", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
