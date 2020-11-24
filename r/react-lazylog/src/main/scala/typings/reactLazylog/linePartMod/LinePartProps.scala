package typings.reactLazylog.linePartMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactLazylog.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinePartProps extends js.Object {
  
  var format: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.native
  
  var part: Text = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object LinePartProps {
  
  @scala.inline
  def apply(part: Text): LinePartProps = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinePartProps]
  }
  
  @scala.inline
  implicit class LinePartPropsOps[Self <: LinePartProps] (val x: Self) extends AnyVal {
    
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
    def setPart(value: Text): Self = this.set("part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: /* text */ String => ReactNode): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
