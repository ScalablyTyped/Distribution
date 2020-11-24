package typings.reactMdUtils.anon

import typings.reactMdUtils.sizingConstantsMod.QuerySize
import typings.reactMdUtils.useWidthMediaQueryMod.WidthMediaQuerys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxMin extends WidthMediaQuerys {
  
  var max: QuerySize = js.native
  
  var min: QuerySize = js.native
}
object MaxMin {
  
  @scala.inline
  def apply(max: QuerySize, min: QuerySize): MaxMin = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxMin]
  }
  
  @scala.inline
  implicit class MaxMinOps[Self <: MaxMin] (val x: Self) extends AnyVal {
    
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
    def setMax(value: QuerySize): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: QuerySize): Self = this.set("min", value.asInstanceOf[js.Any])
  }
}
