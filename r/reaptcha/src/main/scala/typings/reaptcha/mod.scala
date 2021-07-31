package typings.reaptcha

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reaptcha.reaptchaStrings.`inline`
import typings.reaptcha.reaptchaStrings.bottomleft
import typings.reaptcha.reaptchaStrings.bottomright
import typings.reaptcha.reaptchaStrings.compact
import typings.reaptcha.reaptchaStrings.dark
import typings.reaptcha.reaptchaStrings.invisible
import typings.reaptcha.reaptchaStrings.light
import typings.reaptcha.reaptchaStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reaptcha", JSImport.Default)
  @js.native
  class default () extends Reaptcha
  
  @js.native
  trait Reaptcha
    extends Component[ReaptchaProps, js.Object, js.Any] {
    
    def execute(): js.Promise[Unit] = js.native
    
    def getResponse(): js.Promise[String] = js.native
    
    def renderExplicitly(): js.Promise[Unit] = js.native
    
    def reset(): js.Promise[Unit] = js.native
  }
  
  trait ReaptchaProps extends StObject {
    
    var badge: js.UndefOr[bottomright | bottomleft | `inline`] = js.undefined
    
    var children: js.UndefOr[js.Function1[/* renderProps */ RenderProps, ReactNode]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var explicit: js.UndefOr[Boolean] = js.undefined
    
    var hl: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inject: js.UndefOr[Boolean] = js.undefined
    
    var isolated: js.UndefOr[Boolean] = js.undefined
    
    var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExpire: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onRender: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def onVerify(response: String): Unit
    
    var sitekey: String
    
    var size: js.UndefOr[compact | normal | invisible] = js.undefined
    
    var tabindex: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[light | dark] = js.undefined
  }
  object ReaptchaProps {
    
    @scala.inline
    def apply(onVerify: String => Unit, sitekey: String): ReaptchaProps = {
      val __obj = js.Dynamic.literal(onVerify = js.Any.fromFunction1(onVerify), sitekey = sitekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReaptchaProps]
    }
    
    @scala.inline
    implicit class ReaptchaPropsMutableBuilder[Self <: ReaptchaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: bottomright | bottomleft | `inline`): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setChildren(value: /* renderProps */ RenderProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitUndefined: Self = StObject.set(x, "explicit", js.undefined)
      
      @scala.inline
      def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInject(value: Boolean): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      @scala.inline
      def setIsolated(value: Boolean): Self = StObject.set(x, "isolated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsolatedUndefined: Self = StObject.set(x, "isolated", js.undefined)
      
      @scala.inline
      def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnExpire(value: () => Unit): Self = StObject.set(x, "onExpire", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExpireUndefined: Self = StObject.set(x, "onExpire", js.undefined)
      
      @scala.inline
      def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      @scala.inline
      def setOnVerify(value: String => Unit): Self = StObject.set(x, "onVerify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: compact | normal | invisible): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      @scala.inline
      def setTheme(value: light | dark): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait RenderProps extends StObject {
    
    def execute(): js.Promise[Unit]
    
    def getResponse(): js.Promise[String]
    
    var recaptchaComponent: ReactNode
    
    def renderExplicitly(): js.Promise[Unit]
    
    def reset(): js.Promise[Unit]
  }
  object RenderProps {
    
    @scala.inline
    def apply(
      execute: () => js.Promise[Unit],
      getResponse: () => js.Promise[String],
      renderExplicitly: () => js.Promise[Unit],
      reset: () => js.Promise[Unit]
    ): RenderProps = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getResponse = js.Any.fromFunction0(getResponse), renderExplicitly = js.Any.fromFunction0(renderExplicitly), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[RenderProps]
    }
    
    @scala.inline
    implicit class RenderPropsMutableBuilder[Self <: RenderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecute(value: () => js.Promise[Unit]): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetResponse(value: () => js.Promise[String]): Self = StObject.set(x, "getResponse", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRecaptchaComponent(value: ReactNode): Self = StObject.set(x, "recaptchaComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecaptchaComponentUndefined: Self = StObject.set(x, "recaptchaComponent", js.undefined)
      
      @scala.inline
      def setRenderExplicitly(value: () => js.Promise[Unit]): Self = StObject.set(x, "renderExplicitly", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => js.Promise[Unit]): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
}
