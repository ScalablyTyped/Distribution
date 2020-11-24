package typings.rcDrawer.anon

import typings.rcDrawer.idrawerproptypesMod.IDrawerChildProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrevPropsIDrawerChildProps extends js.Object {
  
  var prevProps: IDrawerChildProps = js.native
}
object PrevPropsIDrawerChildProps {
  
  @scala.inline
  def apply(prevProps: IDrawerChildProps): PrevPropsIDrawerChildProps = {
    val __obj = js.Dynamic.literal(prevProps = prevProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevPropsIDrawerChildProps]
  }
  
  @scala.inline
  implicit class PrevPropsIDrawerChildPropsOps[Self <: PrevPropsIDrawerChildProps] (val x: Self) extends AnyVal {
    
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
    def setPrevProps(value: IDrawerChildProps): Self = this.set("prevProps", value.asInstanceOf[js.Any])
  }
}
