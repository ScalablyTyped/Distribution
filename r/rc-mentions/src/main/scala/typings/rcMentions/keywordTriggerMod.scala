package typings.rcMentions

import typings.rcMentions.mentionsMod.Direction
import typings.rcMentions.mentionsMod.Placement
import typings.rcMentions.optionMod.OptionProps
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keywordTriggerMod {
  
  @JSImport("rc-mentions/es/KeywordTrigger", JSImport.Default)
  @js.native
  class default () extends KeywordTrigger
  
  @js.native
  trait KeywordTrigger
    extends Component[KeywordTriggerProps, js.Object, js.Any] {
    
    def getDropDownPlacement(): String = js.native
    
    def getDropdownElement(): Element = js.native
    
    def getDropdownPrefix(): String = js.native
  }
  
  trait KeywordTriggerProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.undefined
    
    var direction: js.UndefOr[Direction] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var options: js.Array[OptionProps]
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object KeywordTriggerProps {
    
    @scala.inline
    def apply(options: js.Array[OptionProps]): KeywordTriggerProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeywordTriggerProps]
    }
    
    @scala.inline
    implicit class KeywordTriggerPropsMutableBuilder[Self <: KeywordTriggerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: () => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[OptionProps]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: OptionProps*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
