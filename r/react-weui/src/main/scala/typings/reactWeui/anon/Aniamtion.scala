package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aniamtion extends js.Object {
  
  var aniamtion: Boolean = js.native
  
  var defaultIndex: Double = js.native
  
  var groupIndex: Double = js.native
  
  var height: Double = js.native
  
  var indicatorHeight: Double = js.native
  
  var indicatorTop: Double = js.native
  
  var itemHeight: Double = js.native
  
  var mapKeys: Label = js.native
}
object Aniamtion {
  
  @scala.inline
  def apply(
    aniamtion: Boolean,
    defaultIndex: Double,
    groupIndex: Double,
    height: Double,
    indicatorHeight: Double,
    indicatorTop: Double,
    itemHeight: Double,
    mapKeys: Label
  ): Aniamtion = {
    val __obj = js.Dynamic.literal(aniamtion = aniamtion.asInstanceOf[js.Any], defaultIndex = defaultIndex.asInstanceOf[js.Any], groupIndex = groupIndex.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], indicatorHeight = indicatorHeight.asInstanceOf[js.Any], indicatorTop = indicatorTop.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], mapKeys = mapKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aniamtion]
  }
  
  @scala.inline
  implicit class AniamtionOps[Self <: Aniamtion] (val x: Self) extends AnyVal {
    
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
    def setAniamtion(value: Boolean): Self = this.set("aniamtion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultIndex(value: Double): Self = this.set("defaultIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIndex(value: Double): Self = this.set("groupIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorHeight(value: Double): Self = this.set("indicatorHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorTop(value: Double): Self = this.set("indicatorTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemHeight(value: Double): Self = this.set("itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapKeys(value: Label): Self = this.set("mapKeys", value.asInstanceOf[js.Any])
  }
}
