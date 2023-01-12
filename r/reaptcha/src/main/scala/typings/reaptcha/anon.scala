package typings.reaptcha

import typings.react.mod.ReactNode
import typings.reaptcha.mod.RenderProps
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

object anon {
  
  trait Invisible extends StObject {
    
    var invisible: Boolean
  }
  object Invisible {
    
    inline def apply(invisible: Boolean): Invisible = {
      val __obj = js.Dynamic.literal(invisible = invisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Invisible]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Invisible] (val x: Self) extends AnyVal {
      
      inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<reaptcha.reaptcha.Props> */
  trait ReadonlyProps extends StObject {
    
    val badge: js.UndefOr[bottomright | bottomleft | `inline`] = js.undefined
    
    val children: js.UndefOr[js.Function1[/* renderProps */ RenderProps, ReactNode]] = js.undefined
    
    val className: js.UndefOr[String] = js.undefined
    
    val explicit: js.UndefOr[Boolean] = js.undefined
    
    val hl: js.UndefOr[String] = js.undefined
    
    val id: js.UndefOr[String] = js.undefined
    
    val inject: js.UndefOr[Boolean] = js.undefined
    
    val isolated: js.UndefOr[Boolean] = js.undefined
    
    val onError: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val onExpire: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val onRender: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val onVerify: js.Function1[/* response */ String, Unit]
    
    val sitekey: String
    
    val size: js.UndefOr[compact | normal | invisible] = js.undefined
    
    val tabindex: js.UndefOr[Double] = js.undefined
    
    val theme: js.UndefOr[light | dark] = js.undefined
  }
  object ReadonlyProps {
    
    inline def apply(onVerify: /* response */ String => Unit, sitekey: String): ReadonlyProps = {
      val __obj = js.Dynamic.literal(onVerify = js.Any.fromFunction1(onVerify), sitekey = sitekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyProps] (val x: Self) extends AnyVal {
      
      inline def setBadge(value: bottomright | bottomleft | `inline`): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setChildren(value: /* renderProps */ RenderProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      inline def setExplicitUndefined: Self = StObject.set(x, "explicit", js.undefined)
      
      inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
      
      inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInject(value: Boolean): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setIsolated(value: Boolean): Self = StObject.set(x, "isolated", value.asInstanceOf[js.Any])
      
      inline def setIsolatedUndefined: Self = StObject.set(x, "isolated", js.undefined)
      
      inline def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnExpire(value: () => Unit): Self = StObject.set(x, "onExpire", js.Any.fromFunction0(value))
      
      inline def setOnExpireUndefined: Self = StObject.set(x, "onExpire", js.undefined)
      
      inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
      
      inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      inline def setOnVerify(value: /* response */ String => Unit): Self = StObject.set(x, "onVerify", js.Any.fromFunction1(value))
      
      inline def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      inline def setSize(value: compact | normal | invisible): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      inline def setTheme(value: light | dark): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
