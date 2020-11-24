package typings.rcMentions.keywordTriggerMod

import typings.rcMentions.mentionsMod.Direction
import typings.rcMentions.mentionsMod.Placement
import typings.rcMentions.optionMod.OptionProps
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeywordTriggerProps extends js.Object {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var direction: js.UndefOr[Direction] = js.native
  
  var getPopupContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
  
  var loading: js.UndefOr[Boolean] = js.native
  
  var options: js.Array[OptionProps] = js.native
  
  var placement: js.UndefOr[Placement] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var transitionName: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object KeywordTriggerProps {
  
  @scala.inline
  def apply(options: js.Array[OptionProps]): KeywordTriggerProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeywordTriggerProps]
  }
  
  @scala.inline
  implicit class KeywordTriggerPropsOps[Self <: KeywordTriggerProps] (val x: Self) extends AnyVal {
    
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
    def setOptionsVarargs(value: OptionProps*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[OptionProps]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDirection(value: Direction): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setGetPopupContainer(value: () => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
