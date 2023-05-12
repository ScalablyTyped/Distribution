package typings.reactRouterDom

import org.scalablytyped.runtime.StringDictionary
import typings.reactRouterDom.anon.Action
import typings.remixRunRouter.distRouterMod.RelativeRoutingType
import typings.remixRunRouter.distUtilsMod.FormEncType
import typings.remixRunRouter.distUtilsMod.HTMLFormMethod
import typings.std.FormData
import typings.std.HTMLButtonElement
import typings.std.HTMLFormElement
import typings.std.HTMLInputElement
import typings.std.Record
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomMod {
  
  @JSImport("react-router-dom/dist/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSearchParams(): URLSearchParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createSearchParams")().asInstanceOf[URLSearchParams]
  inline def createSearchParams(init: URLSearchParamsInit): URLSearchParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createSearchParams")(init.asInstanceOf[js.Any]).asInstanceOf[URLSearchParams]
  
  @JSImport("react-router-dom/dist/dom", "defaultMethod")
  @js.native
  val defaultMethod: HTMLFormMethod = js.native
  
  inline def getFormSubmissionInfo(target: StringDictionary[String], options: SubmitOptions, basename: String): Action = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormSubmissionInfo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[Action]
  inline def getFormSubmissionInfo(target: Null, options: SubmitOptions, basename: String): Action = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormSubmissionInfo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[Action]
  inline def getFormSubmissionInfo(target: FormData, options: SubmitOptions, basename: String): Action = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormSubmissionInfo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[Action]
  inline def getFormSubmissionInfo(target: HTMLButtonElement, options: SubmitOptions, basename: String): Action = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormSubmissionInfo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[Action]
  inline def getFormSubmissionInfo(target: HTMLFormElement, options: SubmitOptions, basename: String): Action = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormSubmissionInfo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[Action]
  inline def getFormSubmissionInfo(target: HTMLInputElement, options: SubmitOptions, basename: String): Action = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormSubmissionInfo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[Action]
  inline def getFormSubmissionInfo(target: URLSearchParams, options: SubmitOptions, basename: String): Action = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormSubmissionInfo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[Action]
  
  inline def getSearchParamsForLocation(locationSearch: String): URLSearchParams = ^.asInstanceOf[js.Dynamic].applyDynamic("getSearchParamsForLocation")(locationSearch.asInstanceOf[js.Any]).asInstanceOf[URLSearchParams]
  inline def getSearchParamsForLocation(locationSearch: String, defaultSearchParams: URLSearchParams): URLSearchParams = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchParamsForLocation")(locationSearch.asInstanceOf[js.Any], defaultSearchParams.asInstanceOf[js.Any])).asInstanceOf[URLSearchParams]
  
  inline def isButtonElement(`object`: Any): /* is std.HTMLButtonElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isButtonElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLButtonElement */ Boolean]
  
  inline def isFormElement(`object`: Any): /* is std.HTMLFormElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLFormElement */ Boolean]
  
  inline def isHtmlElement(`object`: Any): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHtmlElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  
  inline def isInputElement(`object`: Any): /* is std.HTMLInputElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInputElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLInputElement */ Boolean]
  
  inline def shouldProcessLinkClick(event: LimitedMouseEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldProcessLinkClick")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def shouldProcessLinkClick(event: LimitedMouseEvent, target: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldProcessLinkClick")(event.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* Inlined std.Pick<std.MouseEvent, 'button' | 'metaKey' | 'altKey' | 'ctrlKey' | 'shiftKey'> */
  trait LimitedMouseEvent extends StObject {
    
    var altKey: Boolean
    
    var button: Double
    
    var ctrlKey: Boolean
    
    var metaKey: Boolean
    
    var shiftKey: Boolean
  }
  object LimitedMouseEvent {
    
    inline def apply(altKey: Boolean, button: Double, ctrlKey: Boolean, metaKey: Boolean, shiftKey: Boolean): LimitedMouseEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[LimitedMouseEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LimitedMouseEvent] (val x: Self) extends AnyVal {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    }
  }
  
  type ParamKeyValuePair = js.Tuple2[String, String]
  
  trait SubmitOptions extends StObject {
    
    /**
      * The action URL path used to submit the form. Overrides `<form action>`.
      * Defaults to the path of the current route.
      */
    var action: js.UndefOr[String] = js.undefined
    
    /**
      * The action URL used to submit the form. Overrides `<form encType>`.
      * Defaults to "application/x-www-form-urlencoded".
      */
    var encType: js.UndefOr[FormEncType] = js.undefined
    
    /**
      * The HTTP method used to submit the form. Overrides `<form method>`.
      * Defaults to "GET".
      */
    var method: js.UndefOr[HTMLFormMethod] = js.undefined
    
    /**
      * In browser-based environments, prevent resetting scroll after this
      * navigation when using the <ScrollRestoration> component
      */
    var preventScrollReset: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines whether the form action is relative to the route hierarchy or
      * the pathname.  Use this if you want to opt out of navigating the route
      * hierarchy and want to instead route based on /-delimited URL segments
      */
    var relative: js.UndefOr[RelativeRoutingType] = js.undefined
    
    /**
      * Set `true` to replace the current entry in the browser's history stack
      * instead of creating a new one (i.e. stay on "the same page"). Defaults
      * to `false`.
      */
    var replace: js.UndefOr[Boolean] = js.undefined
  }
  object SubmitOptions {
    
    inline def apply(): SubmitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubmitOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubmitOptions] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setEncType(value: FormEncType): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
      
      inline def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
      
      inline def setMethod(value: HTMLFormMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPreventScrollReset(value: Boolean): Self = StObject.set(x, "preventScrollReset", value.asInstanceOf[js.Any])
      
      inline def setPreventScrollResetUndefined: Self = StObject.set(x, "preventScrollReset", js.undefined)
      
      inline def setRelative(value: RelativeRoutingType): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    }
  }
  
  type URLSearchParamsInit = String | js.Array[ParamKeyValuePair] | (Record[String, String | js.Array[String]]) | URLSearchParams
}
