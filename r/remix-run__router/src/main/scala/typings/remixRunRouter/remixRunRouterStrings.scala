package typings.remixRunRouter

import typings.remixRunRouter.distRouterMod.Fetcher
import typings.remixRunRouter.distRouterMod.Navigation
import typings.remixRunRouter.distRouterMod.RelativeRoutingType
import typings.remixRunRouter.distRouterMod.RevalidationState
import typings.remixRunRouter.distUtilsMod.FormEncType
import typings.remixRunRouter.distUtilsMod.ImmutableRouteKey
import typings.remixRunRouter.distUtilsMod.LowerCaseFormMethod
import typings.remixRunRouter.distUtilsMod.MutationFormMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remixRunRouterStrings {
  
  @js.native
  sealed trait Asterisk extends StObject
  inline def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait GET extends StObject
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait `Space_hasFetcherDoneAnything `
    extends StObject
       with Fetcher[Any]
  inline def `Space_hasFetcherDoneAnything `: `Space_hasFetcherDoneAnything ` = (" _hasFetcherDoneAnything ").asInstanceOf[`Space_hasFetcherDoneAnything `]
  
  @js.native
  sealed trait applicationSlashjson
    extends StObject
       with FormEncType
  inline def applicationSlashjson: applicationSlashjson = "application/json".asInstanceOf[applicationSlashjson]
  
  @js.native
  sealed trait `applicationSlashx-www-form-urlencoded`
    extends StObject
       with FormEncType
  inline def `applicationSlashx-www-form-urlencoded`: `applicationSlashx-www-form-urlencoded` = "application/x-www-form-urlencoded".asInstanceOf[`applicationSlashx-www-form-urlencoded`]
  
  @js.native
  sealed trait blocked extends StObject
  inline def blocked: blocked = "blocked".asInstanceOf[blocked]
  
  @js.native
  sealed trait caseSensitive
    extends StObject
       with ImmutableRouteKey
  inline def caseSensitive: caseSensitive = "caseSensitive".asInstanceOf[caseSensitive]
  
  @js.native
  sealed trait children
    extends StObject
       with ImmutableRouteKey
  inline def children: children = "children".asInstanceOf[children]
  
  @js.native
  sealed trait data
    extends StObject
       with Fetcher[Any]
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait delete
    extends StObject
       with LowerCaseFormMethod
       with MutationFormMethod
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait formAction
    extends StObject
       with Fetcher[Any]
       with Navigation
  inline def formAction: formAction = "formAction".asInstanceOf[formAction]
  
  @js.native
  sealed trait formData
    extends StObject
       with Fetcher[Any]
       with Navigation
  inline def formData: formData = "formData".asInstanceOf[formData]
  
  @js.native
  sealed trait formEncType
    extends StObject
       with Fetcher[Any]
       with Navigation
  inline def formEncType: formEncType = "formEncType".asInstanceOf[formEncType]
  
  @js.native
  sealed trait formMethod
    extends StObject
       with Fetcher[Any]
       with Navigation
  inline def formMethod: formMethod = "formMethod".asInstanceOf[formMethod]
  
  @js.native
  sealed trait get_
    extends StObject
       with LowerCaseFormMethod
  inline def get_ : get_ = "get".asInstanceOf[get_]
  
  @js.native
  sealed trait id
    extends StObject
       with ImmutableRouteKey
  inline def id: id = "id".asInstanceOf[id]
  
  @js.native
  sealed trait idle
    extends StObject
       with RevalidationState
  inline def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait index
    extends StObject
       with ImmutableRouteKey
  inline def index: index = "index".asInstanceOf[index]
  
  @js.native
  sealed trait json
    extends StObject
       with Fetcher[Any]
       with Navigation
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait `lazy`
    extends StObject
       with ImmutableRouteKey
  inline def `lazy`: `lazy` = "lazy".asInstanceOf[`lazy`]
  
  @js.native
  sealed trait loading
    extends StObject
       with RevalidationState
  inline def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait location
    extends StObject
       with Navigation
  inline def location: location = "location".asInstanceOf[location]
  
  @js.native
  sealed trait `multipartSlashform-data`
    extends StObject
       with FormEncType
  inline def `multipartSlashform-data`: `multipartSlashform-data` = "multipart/form-data".asInstanceOf[`multipartSlashform-data`]
  
  @js.native
  sealed trait patch
    extends StObject
       with LowerCaseFormMethod
       with MutationFormMethod
  inline def patch: patch = "patch".asInstanceOf[patch]
  
  @js.native
  sealed trait path
    extends StObject
       with ImmutableRouteKey
       with RelativeRoutingType
  inline def path: path = "path".asInstanceOf[path]
  
  @js.native
  sealed trait post
    extends StObject
       with LowerCaseFormMethod
       with MutationFormMethod
  inline def post: post = "post".asInstanceOf[post]
  
  @js.native
  sealed trait proceeding extends StObject
  inline def proceeding: proceeding = "proceeding".asInstanceOf[proceeding]
  
  @js.native
  sealed trait put
    extends StObject
       with LowerCaseFormMethod
       with MutationFormMethod
  inline def put: put = "put".asInstanceOf[put]
  
  @js.native
  sealed trait route
    extends StObject
       with RelativeRoutingType
  inline def route: route = "route".asInstanceOf[route]
  
  @js.native
  sealed trait state
    extends StObject
       with Fetcher[Any]
       with Navigation
  inline def state: state = "state".asInstanceOf[state]
  
  @js.native
  sealed trait submitting extends StObject
  inline def submitting: submitting = "submitting".asInstanceOf[submitting]
  
  @js.native
  sealed trait text
    extends StObject
       with Fetcher[Any]
       with Navigation
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait textSlashplain
    extends StObject
       with FormEncType
  inline def textSlashplain: textSlashplain = "text/plain".asInstanceOf[textSlashplain]
  
  @js.native
  sealed trait unblocked extends StObject
  inline def unblocked: unblocked = "unblocked".asInstanceOf[unblocked]
}
