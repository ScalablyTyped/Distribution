package typings.reactVis.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactVis.reactVisStrings.`partition-pivot`
import typings.reactVis.reactVisStrings.binary
import typings.reactVis.reactVisStrings.circlePack
import typings.reactVis.reactVisStrings.color
import typings.reactVis.reactVisStrings.dice
import typings.reactVis.reactVisStrings.partition
import typings.reactVis.reactVisStrings.resquarify
import typings.reactVis.reactVisStrings.size
import typings.reactVis.reactVisStrings.slice
import typings.reactVis.reactVisStrings.slicedice
import typings.reactVis.reactVisStrings.squarify
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreemapProps extends StObject {
  
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  // default: ''
  var data: js.UndefOr[TreemapPoint] = js.native
  
  var getColor: js.UndefOr[RVGet[TreemapPoint, color]] = js.native
  
  var getSize: js.UndefOr[RVGet[TreemapPoint, size]] = js.native
  
  // default: {'children':[]}
  var height: Double = js.native
  
  var hideRootNode: js.UndefOr[Boolean] = js.native
  
  // default: false
  var margin: js.UndefOr[Margin | Double] = js.native
  
  // default: {'left':40,'right':10,'top':10,'bottom':40}
  var mode: js.UndefOr[
    squarify | resquarify | slice | dice | slicedice | binary | circlePack | partition | `partition-pivot`
  ] = js.native
  
  // default: 'squarify'
  var onLeafClick: js.UndefOr[RVValueEventHandler[TreemapPoint]] = js.native
  
  var onLeafMouseOut: js.UndefOr[RVValueEventHandler[TreemapPoint]] = js.native
  
  var onLeafMouseOver: js.UndefOr[RVValueEventHandler[TreemapPoint]] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  // default: 1
  var sortFunction: js.UndefOr[
    js.Function3[/* a */ js.Any, /* b */ js.Any, /* getSize */ RVGet[TreemapPoint, size], Double]
  ] = js.native
  
  var useCirclePacking: js.UndefOr[Boolean] = js.native
  
  var width: Double = js.native
}
object TreemapProps {
  
  @scala.inline
  def apply(height: Double, width: Double): TreemapProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapProps]
  }
  
  @scala.inline
  implicit class TreemapPropsMutableBuilder[Self <: TreemapProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: String | AnimationParam | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setData(value: TreemapPoint): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setGetColor(
      value: TreemapPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetColorUndefined: Self = StObject.set(x, "getColor", js.undefined)
    
    @scala.inline
    def setGetSize(
      value: TreemapPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSizeUndefined: Self = StObject.set(x, "getSize", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideRootNode(value: Boolean): Self = StObject.set(x, "hideRootNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideRootNodeUndefined: Self = StObject.set(x, "hideRootNode", js.undefined)
    
    @scala.inline
    def setMargin(value: Margin | Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMode(
      value: squarify | resquarify | slice | dice | slicedice | binary | circlePack | partition | `partition-pivot`
    ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOnLeafClick(value: (TreemapPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onLeafClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnLeafClickUndefined: Self = StObject.set(x, "onLeafClick", js.undefined)
    
    @scala.inline
    def setOnLeafMouseOut(value: (TreemapPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onLeafMouseOut", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnLeafMouseOutUndefined: Self = StObject.set(x, "onLeafMouseOut", js.undefined)
    
    @scala.inline
    def setOnLeafMouseOver(value: (TreemapPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onLeafMouseOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnLeafMouseOverUndefined: Self = StObject.set(x, "onLeafMouseOver", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setSortFunction(value: (/* a */ js.Any, /* b */ js.Any, /* getSize */ RVGet[TreemapPoint, size]) => Double): Self = StObject.set(x, "sortFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSortFunctionUndefined: Self = StObject.set(x, "sortFunction", js.undefined)
    
    @scala.inline
    def setUseCirclePacking(value: Boolean): Self = StObject.set(x, "useCirclePacking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCirclePackingUndefined: Self = StObject.set(x, "useCirclePacking", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
