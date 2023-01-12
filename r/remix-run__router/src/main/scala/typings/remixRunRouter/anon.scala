package typings.remixRunRouter

import typings.remixRunRouter.distRouterMod.RouterFetchOptions
import typings.remixRunRouter.distUtilsMod.DataResult
import typings.remixRunRouter.distUtilsMod.Params
import typings.remixRunRouter.remixRunRouterStrings.get
import typings.remixRunRouter.remixRunRouterStrings.idle
import typings.remixRunRouter.remixRunRouterStrings.loading
import typings.remixRunRouter.remixRunRouterStrings.submitting
import typings.std.Exclude
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActionResult extends StObject {
    
    var actionResult: js.UndefOr[DataResult] = js.undefined
    
    var currentParams: Params[String]
    
    var currentUrl: URL
    
    var defaultShouldRevalidate: Boolean
    
    var formAction: js.UndefOr[String] = js.undefined
    
    var formData: js.UndefOr[typings.std.FormData] = js.undefined
    
    var formEncType: js.UndefOr[typings.remixRunRouter.distUtilsMod.FormEncType] = js.undefined
    
    var formMethod: js.UndefOr[Exclude[typings.remixRunRouter.distUtilsMod.FormMethod, get]] = js.undefined
    
    var nextParams: Params[String]
    
    var nextUrl: URL
  }
  object ActionResult {
    
    inline def apply(
      currentParams: Params[String],
      currentUrl: URL,
      defaultShouldRevalidate: Boolean,
      nextParams: Params[String],
      nextUrl: URL
    ): ActionResult = {
      val __obj = js.Dynamic.literal(currentParams = currentParams.asInstanceOf[js.Any], currentUrl = currentUrl.asInstanceOf[js.Any], defaultShouldRevalidate = defaultShouldRevalidate.asInstanceOf[js.Any], nextParams = nextParams.asInstanceOf[js.Any], nextUrl = nextUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionResult] (val x: Self) extends AnyVal {
      
      inline def setActionResult(value: DataResult): Self = StObject.set(x, "actionResult", value.asInstanceOf[js.Any])
      
      inline def setActionResultUndefined: Self = StObject.set(x, "actionResult", js.undefined)
      
      inline def setCurrentParams(value: Params[String]): Self = StObject.set(x, "currentParams", value.asInstanceOf[js.Any])
      
      inline def setCurrentUrl(value: URL): Self = StObject.set(x, "currentUrl", value.asInstanceOf[js.Any])
      
      inline def setDefaultShouldRevalidate(value: Boolean): Self = StObject.set(x, "defaultShouldRevalidate", value.asInstanceOf[js.Any])
      
      inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      inline def setFormData(value: typings.std.FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
      
      inline def setFormEncType(value: typings.remixRunRouter.distUtilsMod.FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      inline def setFormMethod(value: Exclude[typings.remixRunRouter.distUtilsMod.FormMethod, get]): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      inline def setNextParams(value: Params[String]): Self = StObject.set(x, "nextParams", value.asInstanceOf[js.Any])
      
      inline def setNextUrl(value: URL): Self = StObject.set(x, "nextUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data[TData] extends StObject {
    
    var data: js.UndefOr[TData] = js.undefined
    
    var formAction: Unit
    
    var formData: Unit
    
    var formEncType: Unit
    
    var formMethod: Unit
    
    var state: idle
  }
  object Data {
    
    inline def apply[TData](formAction: Unit, formData: Unit, formEncType: Unit, formMethod: Unit): Data[TData] = {
      val __obj = js.Dynamic.literal(formAction = formAction.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], formEncType = formEncType.asInstanceOf[js.Any], formMethod = formMethod.asInstanceOf[js.Any], state = "idle")
      __obj.asInstanceOf[Data[TData]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data[?], TData] (val x: Self & Data[TData]) extends AnyVal {
      
      inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFormAction(value: Unit): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormData(value: Unit): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormEncType(value: Unit): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormMethod(value: Unit): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setState(value: idle): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormAction[TData] extends StObject {
    
    var data: js.UndefOr[TData] = js.undefined
    
    var formAction: js.UndefOr[String] = js.undefined
    
    var formData: js.UndefOr[typings.std.FormData] = js.undefined
    
    var formEncType: js.UndefOr[typings.remixRunRouter.distUtilsMod.FormEncType] = js.undefined
    
    var formMethod: js.UndefOr[typings.remixRunRouter.distUtilsMod.FormMethod] = js.undefined
    
    var state: loading
  }
  object FormAction {
    
    inline def apply[TData](): FormAction[TData] = {
      val __obj = js.Dynamic.literal(state = "loading")
      __obj.asInstanceOf[FormAction[TData]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormAction[?], TData] (val x: Self & FormAction[TData]) extends AnyVal {
      
      inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      inline def setFormData(value: typings.std.FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
      
      inline def setFormEncType(value: typings.remixRunRouter.distUtilsMod.FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      inline def setFormMethod(value: typings.remixRunRouter.distUtilsMod.FormMethod): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      inline def setState(value: loading): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormData[TData] extends StObject {
    
    var data: js.UndefOr[TData] = js.undefined
    
    var formAction: String
    
    var formData: typings.std.FormData
    
    var formEncType: typings.remixRunRouter.distUtilsMod.FormEncType
    
    var formMethod: typings.remixRunRouter.distUtilsMod.FormMethod
    
    var state: submitting
  }
  object FormData {
    
    inline def apply[TData](
      formAction: String,
      formData: typings.std.FormData,
      formEncType: typings.remixRunRouter.distUtilsMod.FormEncType,
      formMethod: typings.remixRunRouter.distUtilsMod.FormMethod
    ): FormData[TData] = {
      val __obj = js.Dynamic.literal(formAction = formAction.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], formEncType = formEncType.asInstanceOf[js.Any], formMethod = formMethod.asInstanceOf[js.Any], state = "submitting")
      __obj.asInstanceOf[FormData[TData]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormData[?], TData] (val x: Self & FormData[TData]) extends AnyVal {
      
      inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormData(value: typings.std.FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormEncType(value: typings.remixRunRouter.distUtilsMod.FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormMethod(value: typings.remixRunRouter.distUtilsMod.FormMethod): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setState(value: submitting): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormEncType extends StObject {
    
    var formAction: Unit
    
    var formData: Unit
    
    var formEncType: Unit
    
    var formMethod: Unit
    
    var location: Unit
    
    var state: idle
  }
  object FormEncType {
    
    inline def apply(formAction: Unit, formData: Unit, formEncType: Unit, formMethod: Unit, location: Unit): FormEncType = {
      val __obj = js.Dynamic.literal(formAction = formAction.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], formEncType = formEncType.asInstanceOf[js.Any], formMethod = formMethod.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], state = "idle")
      __obj.asInstanceOf[FormEncType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormEncType] (val x: Self) extends AnyVal {
      
      inline def setFormAction(value: Unit): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormData(value: Unit): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormEncType(value: Unit): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormMethod(value: Unit): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Unit): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setState(value: idle): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormMethod extends StObject {
    
    var formAction: js.UndefOr[String] = js.undefined
    
    var formData: js.UndefOr[typings.std.FormData] = js.undefined
    
    var formEncType: js.UndefOr[typings.remixRunRouter.distUtilsMod.FormEncType] = js.undefined
    
    var formMethod: js.UndefOr[typings.remixRunRouter.distUtilsMod.FormMethod] = js.undefined
    
    var location: typings.remixRunRouter.distHistoryMod.Location
    
    var state: loading
  }
  object FormMethod {
    
    inline def apply(location: typings.remixRunRouter.distHistoryMod.Location): FormMethod = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], state = "loading")
      __obj.asInstanceOf[FormMethod]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormMethod] (val x: Self) extends AnyVal {
      
      inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      inline def setFormData(value: typings.std.FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
      
      inline def setFormEncType(value: typings.remixRunRouter.distUtilsMod.FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      inline def setFormMethod(value: typings.remixRunRouter.distUtilsMod.FormMethod): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      inline def setLocation(value: typings.remixRunRouter.distHistoryMod.Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setState(value: loading): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Location extends StObject {
    
    var formAction: String
    
    var formData: typings.std.FormData
    
    var formEncType: typings.remixRunRouter.distUtilsMod.FormEncType
    
    var formMethod: typings.remixRunRouter.distUtilsMod.FormMethod
    
    var location: typings.remixRunRouter.distHistoryMod.Location
    
    var state: submitting
  }
  object Location {
    
    inline def apply(
      formAction: String,
      formData: typings.std.FormData,
      formEncType: typings.remixRunRouter.distUtilsMod.FormEncType,
      formMethod: typings.remixRunRouter.distUtilsMod.FormMethod,
      location: typings.remixRunRouter.distHistoryMod.Location
    ): Location = {
      val __obj = js.Dynamic.literal(formAction = formAction.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], formEncType = formEncType.asInstanceOf[js.Any], formMethod = formMethod.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], state = "submitting")
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormData(value: typings.std.FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormEncType(value: typings.remixRunRouter.distUtilsMod.FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormMethod(value: typings.remixRunRouter.distUtilsMod.FormMethod): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: typings.remixRunRouter.distHistoryMod.Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setState(value: submitting): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@remix-run/router.@remix-run/router/dist/router.LinkNavigateOptions, 'replace'> */
  trait OmitLinkNavigateOptionsre
    extends StObject
       with RouterFetchOptions {
    
    var preventScrollReset: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
  }
  object OmitLinkNavigateOptionsre {
    
    inline def apply(): OmitLinkNavigateOptionsre = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitLinkNavigateOptionsre]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitLinkNavigateOptionsre] (val x: Self) extends AnyVal {
      
      inline def setPreventScrollReset(value: Boolean): Self = StObject.set(x, "preventScrollReset", value.asInstanceOf[js.Any])
      
      inline def setPreventScrollResetUndefined: Self = StObject.set(x, "preventScrollReset", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@remix-run/router.@remix-run/router/dist/router.SubmissionNavigateOptions, 'replace'> */
  trait OmitSubmissionNavigateOpt
    extends StObject
       with RouterFetchOptions {
    
    var formData: typings.std.FormData
    
    var formEncType: js.UndefOr[typings.remixRunRouter.distUtilsMod.FormEncType] = js.undefined
    
    var formMethod: js.UndefOr[typings.remixRunRouter.distUtilsMod.FormMethod] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
  }
  object OmitSubmissionNavigateOpt {
    
    inline def apply(formData: typings.std.FormData): OmitSubmissionNavigateOpt = {
      val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitSubmissionNavigateOpt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitSubmissionNavigateOpt] (val x: Self) extends AnyVal {
      
      inline def setFormData(value: typings.std.FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormEncType(value: typings.remixRunRouter.distUtilsMod.FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      inline def setFormMethod(value: typings.remixRunRouter.distUtilsMod.FormMethod): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@remix-run/router.@remix-run/router/dist/history.Location> */
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
  
  /* Inlined std.Partial<@remix-run/router.@remix-run/router/dist/history.Path> */
  trait PartialPath extends StObject {
    
    var hash: js.UndefOr[String] = js.undefined
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
  }
  object PartialPath {
    
    inline def apply(): PartialPath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPath] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<@remix-run/router.@remix-run/router/dist/history.Location> */
  trait ReadonlyLocation extends StObject {
    
    val hash: String
    
    val key: String
    
    val pathname: String
    
    val search: String
    
    val state: Any
  }
  object ReadonlyLocation {
    
    inline def apply(hash: String, key: String, pathname: String, search: String, state: Any): ReadonlyLocation = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyLocation] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
