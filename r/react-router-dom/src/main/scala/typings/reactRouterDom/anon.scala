package typings.reactRouterDom

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributeAnchorTarget
import typings.react.mod.RefAttributes
import typings.reactRouterDom.mod.FormProps
import typings.reactRouterDom.mod.SubmitTarget
import typings.remixRunRouter.distHistoryMod.Location
import typings.remixRunRouter.distRouterMod.GetScrollRestorationKeyFunction
import typings.remixRunRouter.distRouterMod.RelativeRoutingType
import typings.remixRunRouter.distRouterMod.UseMatchesMatch
import typings.remixRunRouter.distUtilsMod.FormEncType
import typings.remixRunRouter.distUtilsMod.HTMLFormMethod
import typings.std.FormData
import typings.std.HTMLFormElement
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action extends StObject {
    
    var action: String | Null
    
    var encType: String
    
    var formData: FormData
    
    var method: String
  }
  object Action {
    
    inline def apply(encType: String, formData: FormData, method: String): Action = {
      val __obj = js.Dynamic.literal(encType = encType.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], action = null)
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionNull: Self = StObject.set(x, "action", null)
      
      inline def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
      
      inline def setFormData(value: FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  trait Capture extends StObject {
    
    var capture: js.UndefOr[Boolean] = js.undefined
  }
  object Capture {
    
    inline def apply(): Capture = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Capture]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Capture] (val x: Self) extends AnyVal {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    }
  }
  
  @js.native
  trait Form extends StObject {
    
    var Form: ReturnType[
        js.Function2[
          /* fetcherKey */ String, 
          /* routeId */ String, 
          ForwardRefExoticComponent[FormProps & RefAttributes[HTMLFormElement]]
        ]
      ] = js.native
    
    def load(href: String): Unit = js.native
    
    def submit(target: SubmitTarget): Unit = js.native
    def submit(target: SubmitTarget, options: OmitSubmitOptionsreplacep): Unit = js.native
  }
  
  trait GetKey extends StObject {
    
    var getKey: js.UndefOr[GetScrollRestorationKeyFunction] = js.undefined
    
    var storageKey: js.UndefOr[String] = js.undefined
  }
  object GetKey {
    
    inline def apply(): GetKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetKey] (val x: Self) extends AnyVal {
      
      inline def setGetKey(value: (/* location */ Location, /* matches */ js.Array[UseMatchesMatch]) => String | Null): Self = StObject.set(x, "getKey", js.Any.fromFunction2(value))
      
      inline def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
      
      inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
      
      inline def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
    }
  }
  
  trait IsActive extends StObject {
    
    var isActive: Boolean
    
    var isPending: Boolean
  }
  object IsActive {
    
    inline def apply(isActive: Boolean, isPending: Boolean): IsActive = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isPending = isPending.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsActive]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsActive] (val x: Self) extends AnyVal {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsPending(value: Boolean): Self = StObject.set(x, "isPending", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var message: String
    
    var when: Boolean
  }
  object Message {
    
    inline def apply(message: String, when: Boolean): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setWhen(value: Boolean): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<react-router-dom.react-router-dom/dist/dom.SubmitOptions, 'replace' | 'preventScrollReset'> */
  trait OmitSubmitOptionsreplacep extends StObject {
    
    var action: js.UndefOr[String] = js.undefined
    
    var encType: js.UndefOr[FormEncType] = js.undefined
    
    var method: js.UndefOr[HTMLFormMethod] = js.undefined
    
    var relative: js.UndefOr[RelativeRoutingType] = js.undefined
  }
  object OmitSubmitOptionsreplacep {
    
    inline def apply(): OmitSubmitOptionsreplacep = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitSubmitOptionsreplacep]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitSubmitOptionsreplacep] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setEncType(value: FormEncType): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
      
      inline def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
      
      inline def setMethod(value: HTMLFormMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setRelative(value: RelativeRoutingType): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-router-dom.react-router-dom.Location> */
  trait PartialLocation extends StObject {
    
    var hash: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
  }
  object PartialLocation {
    
    inline def apply(): PartialLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialLocation] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Omit<@remix-run/router.@remix-run/router.FutureConfig, 'v7_prependBasename'>> */
  trait PartialOmitFutureConfigv7 extends StObject {
    
    var v7_normalizeFormMethod: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOmitFutureConfigv7 {
    
    inline def apply(): PartialOmitFutureConfigv7 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOmitFutureConfigv7]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOmitFutureConfigv7] (val x: Self) extends AnyVal {
      
      inline def setV7_normalizeFormMethod(value: Boolean): Self = StObject.set(x, "v7_normalizeFormMethod", value.asInstanceOf[js.Any])
      
      inline def setV7_normalizeFormMethodUndefined: Self = StObject.set(x, "v7_normalizeFormMethod", js.undefined)
    }
  }
  
  trait PreventScrollReset extends StObject {
    
    var preventScrollReset: js.UndefOr[Boolean] = js.undefined
    
    var relative: js.UndefOr[RelativeRoutingType] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
    
    var target: js.UndefOr[HTMLAttributeAnchorTarget] = js.undefined
  }
  object PreventScrollReset {
    
    inline def apply(): PreventScrollReset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreventScrollReset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreventScrollReset] (val x: Self) extends AnyVal {
      
      inline def setPreventScrollReset(value: Boolean): Self = StObject.set(x, "preventScrollReset", value.asInstanceOf[js.Any])
      
      inline def setPreventScrollResetUndefined: Self = StObject.set(x, "preventScrollReset", js.undefined)
      
      inline def setRelative(value: RelativeRoutingType): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTarget(value: HTMLAttributeAnchorTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait Relative extends StObject {
    
    var relative: js.UndefOr[RelativeRoutingType] = js.undefined
  }
  object Relative {
    
    inline def apply(): Relative = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Relative]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Relative] (val x: Self) extends AnyVal {
      
      inline def setRelative(value: RelativeRoutingType): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    }
  }
}
