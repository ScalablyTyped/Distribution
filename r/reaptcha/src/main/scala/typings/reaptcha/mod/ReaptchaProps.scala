package typings.reaptcha.mod

import typings.react.mod.ReactNode
import typings.reaptcha.reaptchaStrings.`inline`
import typings.reaptcha.reaptchaStrings.bottomleft
import typings.reaptcha.reaptchaStrings.bottomright
import typings.reaptcha.reaptchaStrings.compact
import typings.reaptcha.reaptchaStrings.dark
import typings.reaptcha.reaptchaStrings.invisible
import typings.reaptcha.reaptchaStrings.light
import typings.reaptcha.reaptchaStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReaptchaProps extends js.Object {
  
  var badge: js.UndefOr[bottomright | bottomleft | `inline`] = js.native
  
  var children: js.UndefOr[js.Function1[/* renderProps */ RenderProps, ReactNode]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var explicit: js.UndefOr[Boolean] = js.native
  
  var hl: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var inject: js.UndefOr[Boolean] = js.native
  
  var isolated: js.UndefOr[Boolean] = js.native
  
  var onError: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onExpire: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onRender: js.UndefOr[js.Function0[Unit]] = js.native
  
  def onVerify(response: String): Unit = js.native
  
  var sitekey: String = js.native
  
  var size: js.UndefOr[compact | normal | invisible] = js.native
  
  var tabindex: js.UndefOr[Double] = js.native
  
  var theme: js.UndefOr[light | dark] = js.native
}
object ReaptchaProps {
  
  @scala.inline
  def apply(onVerify: String => Unit, sitekey: String): ReaptchaProps = {
    val __obj = js.Dynamic.literal(onVerify = js.Any.fromFunction1(onVerify), sitekey = sitekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaptchaProps]
  }
  
  @scala.inline
  implicit class ReaptchaPropsOps[Self <: ReaptchaProps] (val x: Self) extends AnyVal {
    
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
    def setOnVerify(value: String => Unit): Self = this.set("onVerify", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSitekey(value: String): Self = this.set("sitekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadge(value: bottomright | bottomleft | `inline`): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setChildren(value: /* renderProps */ RenderProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setExplicit(value: Boolean): Self = this.set("explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicit: Self = this.set("explicit", js.undefined)
    
    @scala.inline
    def setHl(value: String): Self = this.set("hl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHl: Self = this.set("hl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInject(value: Boolean): Self = this.set("inject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInject: Self = this.set("inject", js.undefined)
    
    @scala.inline
    def setIsolated(value: Boolean): Self = this.set("isolated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsolated: Self = this.set("isolated", js.undefined)
    
    @scala.inline
    def setOnError(value: () => Unit): Self = this.set("onError", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnExpire(value: () => Unit): Self = this.set("onExpire", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnExpire: Self = this.set("onExpire", js.undefined)
    
    @scala.inline
    def setOnLoad(value: () => Unit): Self = this.set("onLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnRender(value: () => Unit): Self = this.set("onRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
    
    @scala.inline
    def setSize(value: compact | normal | invisible): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTabindex(value: Double): Self = this.set("tabindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabindex: Self = this.set("tabindex", js.undefined)
    
    @scala.inline
    def setTheme(value: light | dark): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
