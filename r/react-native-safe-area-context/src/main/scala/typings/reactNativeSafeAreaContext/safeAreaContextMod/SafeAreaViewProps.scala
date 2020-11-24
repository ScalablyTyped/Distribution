package typings.reactNativeSafeAreaContext.safeAreaContextMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.Metrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafeAreaViewProps extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var initialMetrics: js.UndefOr[Metrics | Null] = js.native
  
  /**
    * @deprecated
    */
  var initialSafeAreaInsets: js.UndefOr[EdgeInsets | Null] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object SafeAreaViewProps {
  
  @scala.inline
  def apply(): SafeAreaViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeAreaViewProps]
  }
  
  @scala.inline
  implicit class SafeAreaViewPropsOps[Self <: SafeAreaViewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setInitialMetrics(value: Metrics): Self = this.set("initialMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialMetrics: Self = this.set("initialMetrics", js.undefined)
    
    @scala.inline
    def setInitialMetricsNull: Self = this.set("initialMetrics", null)
    
    @scala.inline
    def setInitialSafeAreaInsets(value: EdgeInsets): Self = this.set("initialSafeAreaInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialSafeAreaInsets: Self = this.set("initialSafeAreaInsets", js.undefined)
    
    @scala.inline
    def setInitialSafeAreaInsetsNull: Self = this.set("initialSafeAreaInsets", null)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
