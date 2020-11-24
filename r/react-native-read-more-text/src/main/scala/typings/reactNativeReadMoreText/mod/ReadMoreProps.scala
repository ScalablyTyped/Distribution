package typings.reactNativeReadMoreText.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadMoreProps extends js.Object {
  
  var children: ReactNode = js.native
  
  var numberOfLines: Double = js.native
  
  var onReady: js.UndefOr[js.Function0[Unit]] = js.native
  
  def renderRevealedFooter(onPress: js.Function0[Unit]): ReactNode = js.native
  
  def renderTruncatedFooter(onPress: js.Function0[Unit]): ReactNode = js.native
}
object ReadMoreProps {
  
  @scala.inline
  def apply(
    numberOfLines: Double,
    renderRevealedFooter: js.Function0[Unit] => ReactNode,
    renderTruncatedFooter: js.Function0[Unit] => ReactNode
  ): ReadMoreProps = {
    val __obj = js.Dynamic.literal(numberOfLines = numberOfLines.asInstanceOf[js.Any], renderRevealedFooter = js.Any.fromFunction1(renderRevealedFooter), renderTruncatedFooter = js.Any.fromFunction1(renderTruncatedFooter))
    __obj.asInstanceOf[ReadMoreProps]
  }
  
  @scala.inline
  implicit class ReadMorePropsOps[Self <: ReadMoreProps] (val x: Self) extends AnyVal {
    
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
    def setNumberOfLines(value: Double): Self = this.set("numberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderRevealedFooter(value: js.Function0[Unit] => ReactNode): Self = this.set("renderRevealedFooter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderTruncatedFooter(value: js.Function0[Unit] => ReactNode): Self = this.set("renderTruncatedFooter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setOnReady(value: () => Unit): Self = this.set("onReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
  }
}
