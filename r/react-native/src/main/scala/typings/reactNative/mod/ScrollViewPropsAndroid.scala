package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.always
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.never
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollViewPropsAndroid extends StObject {
  
  /**
    * Sometimes a scrollview takes up more space than its content fills.
    * When this is the case, this prop will fill the rest of the
    * scrollview with a color to avoid setting a background and creating
    * unnecessary overdraw. This is an advanced optimization that is not
    * needed in the general case.
    */
  var endFillColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * Fades out the edges of the the scroll content.
    *
    * If the value is greater than 0, the fading edges will be set accordingly
    * to the current scroll direction and position,
    * indicating if there is more content to show.
    *
    * The default value is 0.
    * @platform android
    */
  var fadingEdgeLength: js.UndefOr[Double] = js.native
  
  /**
    * Enables nested scrolling for Android API level 21+. Nested scrolling is supported by default on iOS.
    */
  var nestedScrollEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Used to override default value of overScroll mode.
    * Possible values:
    *   - 'auto' - Default value, allow a user to over-scroll this view only if the content is large enough to meaningfully scroll.
    *   - 'always' - Always allow a user to over-scroll this view.
    *   - 'never' - Never allow a user to over-scroll this view.
    */
  var overScrollMode: js.UndefOr[auto | always | never] = js.native
  
  /**
    * Causes the scrollbars not to turn transparent when they are not in use. The default value is false.
    */
  var persistentScrollbar: js.UndefOr[Boolean] = js.native
  
  /**
    * Tag used to log scroll performance on this scroll view. Will force
    * momentum events to be turned on (see sendMomentumEvents). This doesn't do
    * anything out of the box and you need to implement a custom native
    * FpsListener for it to be useful.
    * @platform android
    */
  var scrollPerfTag: js.UndefOr[String] = js.native
}
object ScrollViewPropsAndroid {
  
  @scala.inline
  def apply(): ScrollViewPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollViewPropsAndroid]
  }
  
  @scala.inline
  implicit class ScrollViewPropsAndroidMutableBuilder[Self <: ScrollViewPropsAndroid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndFillColor(value: ColorValue): Self = StObject.set(x, "endFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndFillColorUndefined: Self = StObject.set(x, "endFillColor", js.undefined)
    
    @scala.inline
    def setFadingEdgeLength(value: Double): Self = StObject.set(x, "fadingEdgeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadingEdgeLengthUndefined: Self = StObject.set(x, "fadingEdgeLength", js.undefined)
    
    @scala.inline
    def setNestedScrollEnabled(value: Boolean): Self = StObject.set(x, "nestedScrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedScrollEnabledUndefined: Self = StObject.set(x, "nestedScrollEnabled", js.undefined)
    
    @scala.inline
    def setOverScrollMode(value: auto | always | never): Self = StObject.set(x, "overScrollMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverScrollModeUndefined: Self = StObject.set(x, "overScrollMode", js.undefined)
    
    @scala.inline
    def setPersistentScrollbar(value: Boolean): Self = StObject.set(x, "persistentScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentScrollbarUndefined: Self = StObject.set(x, "persistentScrollbar", js.undefined)
    
    @scala.inline
    def setScrollPerfTag(value: String): Self = StObject.set(x, "scrollPerfTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPerfTagUndefined: Self = StObject.set(x, "scrollPerfTag", js.undefined)
  }
}
