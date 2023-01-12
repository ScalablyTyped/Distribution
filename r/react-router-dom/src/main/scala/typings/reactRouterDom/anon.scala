package typings.reactRouterDom

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributeAnchorTarget
import typings.react.mod.RefAttributes
import typings.reactRouter.distLibContextMod.RelativeRoutingType
import typings.reactRouterDom.mod.FormProps
import typings.reactRouterDom.mod.SubmitTarget
import typings.remixRunRouter.distRouterMod.HydrationState
import typings.remixRunRouter.distUtilsMod.FormEncType
import typings.remixRunRouter.distUtilsMod.FormMethod
import typings.std.FormData
import typings.std.HTMLFormElement
import typings.std.ReturnType
import typings.std.URL
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Basename extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var hydrationData: js.UndefOr[HydrationState] = js.undefined
    
    var window: js.UndefOr[Window] = js.undefined
  }
  object Basename {
    
    inline def apply(): Basename = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Basename]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Basename] (val x: Self) extends AnyVal {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setHydrationData(value: HydrationState): Self = StObject.set(x, "hydrationData", value.asInstanceOf[js.Any])
      
      inline def setHydrationDataUndefined: Self = StObject.set(x, "hydrationData", js.undefined)
      
      inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  trait EncType extends StObject {
    
    var encType: String
    
    var formData: FormData
    
    var method: String
    
    var url: URL
  }
  object EncType {
    
    inline def apply(encType: String, formData: FormData, method: String, url: URL): EncType = {
      val __obj = js.Dynamic.literal(encType = encType.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncType] (val x: Self) extends AnyVal {
      
      inline def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
      
      inline def setFormData(value: FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
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
    def submit(target: SubmitTarget, options: OmitSubmitOptionsreplace): Unit = js.native
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
  
  /* Inlined std.Omit<react-router-dom.react-router-dom/dist/dom.SubmitOptions, 'replace'> */
  trait OmitSubmitOptionsreplace extends StObject {
    
    var action: js.UndefOr[String] = js.undefined
    
    var encType: js.UndefOr[FormEncType] = js.undefined
    
    var method: js.UndefOr[FormMethod] = js.undefined
    
    var relative: js.UndefOr[RelativeRoutingType] = js.undefined
  }
  object OmitSubmitOptionsreplace {
    
    inline def apply(): OmitSubmitOptionsreplace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitSubmitOptionsreplace]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitSubmitOptionsreplace] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setEncType(value: FormEncType): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
      
      inline def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
      
      inline def setMethod(value: FormMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
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
