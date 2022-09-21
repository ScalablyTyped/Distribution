package typings.reaptcha

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reaptcha.anon.Invisible
import typings.reaptcha.anon.ReadonlyProps
import typings.reaptcha.reaptchaStrings.`inline`
import typings.reaptcha.reaptchaStrings.bottomleft
import typings.reaptcha.reaptchaStrings.bottomright
import typings.reaptcha.reaptchaStrings.compact
import typings.reaptcha.reaptchaStrings.dark
import typings.reaptcha.reaptchaStrings.invisible
import typings.reaptcha.reaptchaStrings.light
import typings.reaptcha.reaptchaStrings.normal
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reaptcha", JSImport.Default)
  @js.native
  open class default () extends Reaptcha
  object default {
    
    @JSImport("reaptcha", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    /* Inlined std.Partial<reaptcha.reaptcha.Props> */
    object defaultProps {
      
      @JSImport("reaptcha", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("reaptcha", "default.defaultProps.badge")
      @js.native
      def badge: js.UndefOr[bottomright | bottomleft | `inline`] = js.native
      inline def badge_=(x: js.UndefOr[bottomright | bottomleft | `inline`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("badge")(x.asInstanceOf[js.Any])
      
      @JSImport("reaptcha", "default.defaultProps.children")
      @js.native
      def children: js.UndefOr[js.Function1[/* renderProps */ RenderProps, ReactNode]] = js.native
      inline def children_=(x: js.UndefOr[js.Function1[/* renderProps */ RenderProps, ReactNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("reaptcha", "default.defaultProps.className")
      @js.native
      def className: js.UndefOr[String] = js.native
      inline def className_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("reaptcha", "default.defaultProps.explicit")
      @js.native
      def explicit: js.UndefOr[Boolean] = js.native
      inline def explicit_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("explicit")(x.asInstanceOf[js.Any])
      
      @JSImport("reaptcha", "default.defaultProps.hl")
      @js.native
      def hl: js.UndefOr[String] = js.native
      inline def hl_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hl")(x.asInstanceOf[js.Any])
      
      @JSImport("reaptcha", "default.defaultProps.id")
      @js.native
      def id: js.UndefOr[String] = js.native
      inline def id_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("reaptcha", "default.defaultProps.inject")
      @js.native
      def inject: js.UndefOr[Boolean] = js.native
      inline def inject_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inject")(x.asInstanceOf[js.Any])
      
      @JSImport("reaptcha", "default.defaultProps.isolated")
      @js.native
      def isolated: js.UndefOr[Boolean] = js.native
      inline def isolated_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isolated")(x.asInstanceOf[js.Any])
      
      @JSImport("reaptcha", "default.defaultProps.onError")
      @js.native
      def onError: js.UndefOr[js.Function0[Unit]] = js.native
      inline def onError_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
      
      @JSImport("reaptcha", "default.defaultProps.onExpire")
      @js.native
      def onExpire: js.UndefOr[js.Function0[Unit]] = js.native
      inline def onExpire_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExpire")(x.asInstanceOf[js.Any])
      
      @JSImport("reaptcha", "default.defaultProps.onLoad")
      @js.native
      def onLoad: js.UndefOr[js.Function0[Unit]] = js.native
      inline def onLoad_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(x.asInstanceOf[js.Any])
      
      @JSImport("reaptcha", "default.defaultProps.onRender")
      @js.native
      def onRender: js.UndefOr[js.Function0[Unit]] = js.native
      inline def onRender_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRender")(x.asInstanceOf[js.Any])
      
      @JSImport("reaptcha", "default.defaultProps.onVerify")
      @js.native
      def onVerify: js.UndefOr[js.Function1[/* response */ String, Unit]] = js.native
      inline def onVerify_=(x: js.UndefOr[js.Function1[/* response */ String, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onVerify")(x.asInstanceOf[js.Any])
      
      @JSImport("reaptcha", "default.defaultProps.sitekey")
      @js.native
      def sitekey: js.UndefOr[String] = js.native
      inline def sitekey_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sitekey")(x.asInstanceOf[js.Any])
      
      @JSImport("reaptcha", "default.defaultProps.size")
      @js.native
      def size: js.UndefOr[compact | normal | invisible] = js.native
      inline def size_=(x: js.UndefOr[compact | normal | invisible]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("reaptcha", "default.defaultProps.tabindex")
      @js.native
      def tabindex: js.UndefOr[Double] = js.native
      inline def tabindex_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(x.asInstanceOf[js.Any])
      
      @JSImport("reaptcha", "default.defaultProps.theme")
      @js.native
      def theme: js.UndefOr[light | dark] = js.native
      inline def theme_=(x: js.UndefOr[light | dark]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    inline def getDerivedStateFromProps(props: Props, state: State): Invisible | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Invisible | Null]
  }
  
  @js.native
  trait Grecaptcha extends StObject {
    
    def execute(): Unit = js.native
    def execute(id: Double): Unit = js.native
    
    def getResponse(): String = js.native
    def getResponse(id: Double): String = js.native
    
    def ready(callback: js.Function0[Unit]): Unit = js.native
    
    def render(): Double = js.native
    def render(container: Unit, config: RecaptchaConfig): Double = js.native
    def render(container: HTMLElement): Double = js.native
    def render(container: HTMLElement, config: RecaptchaConfig): Double = js.native
    
    def reset(): Unit = js.native
    def reset(id: Double): Unit = js.native
  }
  
  trait Props
    extends StObject
       with RecaptchaBaseConfig {
    
    var children: js.UndefOr[js.Function1[/* renderProps */ RenderProps, ReactNode]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var explicit: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inject: js.UndefOr[Boolean] = js.undefined
    
    var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExpire: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onRender: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def onVerify(response: String): Unit
  }
  object Props {
    
    inline def apply(onVerify: String => Unit, sitekey: String): Props = {
      val __obj = js.Dynamic.literal(onVerify = js.Any.fromFunction1(onVerify), sitekey = sitekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: /* renderProps */ RenderProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      inline def setExplicitUndefined: Self = StObject.set(x, "explicit", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInject(value: Boolean): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnExpire(value: () => Unit): Self = StObject.set(x, "onExpire", js.Any.fromFunction0(value))
      
      inline def setOnExpireUndefined: Self = StObject.set(x, "onExpire", js.undefined)
      
      inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
      
      inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      inline def setOnVerify(value: String => Unit): Self = StObject.set(x, "onVerify", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Reaptcha extends Component[Props, State, Any] {
    
    def _executeRecaptcha(): Unit = js.native
    
    def _getResponseRecaptcha(): String = js.native
    
    def _inject(): Unit = js.native
    
    def _isAvailable(): Boolean = js.native
    
    def _onError(): js.UndefOr[Unit] = js.native
    
    def _onExpire(): js.UndefOr[Unit] = js.native
    
    def _onVerify(response: String): Unit = js.native
    
    def _prepare(): Unit = js.native
    
    def _renderRecaptcha(container: HTMLDivElement, config: RecaptchaConfig): Double = js.native
    
    def _resetRecaptcha(): Unit = js.native
    
    def _stopTimer(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MReaptcha(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MReaptcha(prevProps: ReadonlyProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MReaptcha(): Unit = js.native
    
    var container: js.UndefOr[HTMLDivElement | Null] = js.native
    
    def execute(): js.Promise[Unit] = js.native
    
    def getResponse(): js.Promise[String] = js.native
    
    def renderExplicitly(): js.Promise[Unit] = js.native
    
    def reset(): js.Promise[Unit] = js.native
    
    var timer: js.UndefOr[Double] = js.native
  }
  
  trait RecaptchaBaseConfig extends StObject {
    
    var badge: js.UndefOr[bottomright | bottomleft | `inline`] = js.undefined
    
    var hl: js.UndefOr[String] = js.undefined
    
    var isolated: js.UndefOr[Boolean] = js.undefined
    
    var sitekey: String
    
    var size: js.UndefOr[compact | normal | invisible] = js.undefined
    
    var tabindex: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[light | dark] = js.undefined
  }
  object RecaptchaBaseConfig {
    
    inline def apply(sitekey: String): RecaptchaBaseConfig = {
      val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecaptchaBaseConfig]
    }
    
    extension [Self <: RecaptchaBaseConfig](x: Self) {
      
      inline def setBadge(value: bottomright | bottomleft | `inline`): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
      
      inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
      
      inline def setIsolated(value: Boolean): Self = StObject.set(x, "isolated", value.asInstanceOf[js.Any])
      
      inline def setIsolatedUndefined: Self = StObject.set(x, "isolated", js.undefined)
      
      inline def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      inline def setSize(value: compact | normal | invisible): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      inline def setTheme(value: light | dark): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait RecaptchaConfig
    extends StObject
       with RecaptchaBaseConfig {
    
    var callback: js.UndefOr[js.Function1[/* response */ String, Unit]] = js.undefined
    
    var `error-callback`: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var `expired-callback`: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object RecaptchaConfig {
    
    inline def apply(sitekey: String): RecaptchaConfig = {
      val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecaptchaConfig]
    }
    
    extension [Self <: RecaptchaConfig](x: Self) {
      
      inline def setCallback(value: /* response */ String => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def `setError-callback`(value: () => Unit): Self = StObject.set(x, "error-callback", js.Any.fromFunction0(value))
      
      inline def `setError-callbackUndefined`: Self = StObject.set(x, "error-callback", js.undefined)
      
      inline def `setExpired-callback`(value: () => Unit): Self = StObject.set(x, "expired-callback", js.Any.fromFunction0(value))
      
      inline def `setExpired-callbackUndefined`: Self = StObject.set(x, "expired-callback", js.undefined)
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
    
    inline def apply(
      execute: () => js.Promise[Unit],
      getResponse: () => js.Promise[String],
      renderExplicitly: () => js.Promise[Unit],
      reset: () => js.Promise[Unit]
    ): RenderProps = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getResponse = js.Any.fromFunction0(getResponse), renderExplicitly = js.Any.fromFunction0(renderExplicitly), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[RenderProps]
    }
    
    extension [Self <: RenderProps](x: Self) {
      
      inline def setExecute(value: () => js.Promise[Unit]): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      inline def setGetResponse(value: () => js.Promise[String]): Self = StObject.set(x, "getResponse", js.Any.fromFunction0(value))
      
      inline def setRecaptchaComponent(value: ReactNode): Self = StObject.set(x, "recaptchaComponent", value.asInstanceOf[js.Any])
      
      inline def setRecaptchaComponentUndefined: Self = StObject.set(x, "recaptchaComponent", js.undefined)
      
      inline def setRenderExplicitly(value: () => js.Promise[Unit]): Self = StObject.set(x, "renderExplicitly", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => js.Promise[Unit]): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  trait State extends StObject {
    
    var instanceId: js.UndefOr[Double] = js.undefined
    
    var instanceKey: Double
    
    var invisible: Boolean
    
    var ready: Boolean
    
    var rendered: Boolean
  }
  object State {
    
    inline def apply(instanceKey: Double, invisible: Boolean, ready: Boolean, rendered: Boolean): State = {
      val __obj = js.Dynamic.literal(instanceKey = instanceKey.asInstanceOf[js.Any], invisible = invisible.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setInstanceId(value: Double): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      inline def setInstanceKey(value: Double): Self = StObject.set(x, "instanceKey", value.asInstanceOf[js.Any])
      
      inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setRendered(value: Boolean): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var grecaptcha: js.UndefOr[Grecaptcha] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setGrecaptcha(value: Grecaptcha): Self = StObject.set(x, "grecaptcha", value.asInstanceOf[js.Any])
        
        inline def setGrecaptchaUndefined: Self = StObject.set(x, "grecaptcha", js.undefined)
      }
    }
  }
}
