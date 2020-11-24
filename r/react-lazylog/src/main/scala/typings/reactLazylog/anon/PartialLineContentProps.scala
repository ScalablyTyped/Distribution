package typings.reactLazylog.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-lazylog.react-lazylog/build/LineContent.LineContentProps> */
@js.native
trait PartialLineContentProps extends js.Object {
  
  var data: js.UndefOr[js.Array[Text]] = js.native
  
  var formatPart: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.native
  
  var number: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object PartialLineContentProps {
  
  @scala.inline
  def apply(): PartialLineContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLineContentProps]
  }
  
  @scala.inline
  implicit class PartialLineContentPropsOps[Self <: PartialLineContentProps] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: Text*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[Text]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFormatPart(value: /* text */ String => ReactNode): Self = this.set("formatPart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatPart: Self = this.set("formatPart", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
