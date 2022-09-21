package typings.remixRunRouter

import typings.remixRunRouter.routerMod.Fetcher
import typings.remixRunRouter.routerMod.Navigation
import typings.remixRunRouter.routerMod.RevalidationState
import typings.remixRunRouter.utilsMod.FormEncType
import typings.remixRunRouter.utilsMod.FormMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remixRunRouterStrings {
  
  @js.native
  sealed trait Asterisk extends StObject
  inline def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait Params extends StObject
  inline def Params: Params = "Params".asInstanceOf[Params]
  
  @js.native
  sealed trait `applicationSlashx-www-form-urlencoded`
    extends StObject
       with FormEncType
  inline def `applicationSlashx-www-form-urlencoded`: `applicationSlashx-www-form-urlencoded` = "application/x-www-form-urlencoded".asInstanceOf[`applicationSlashx-www-form-urlencoded`]
  
  @js.native
  sealed trait data
    extends StObject
       with Fetcher[Any]
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait delete
    extends StObject
       with FormMethod
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
  sealed trait generatePath extends StObject
  inline def generatePath: generatePath = "generatePath".asInstanceOf[generatePath]
  
  @js.native
  sealed trait get
    extends StObject
       with FormMethod
  inline def get: get = "get".asInstanceOf[get]
  
  @js.native
  sealed trait idle
    extends StObject
       with RevalidationState
  inline def idle: idle = "idle".asInstanceOf[idle]
  
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
       with FormMethod
  inline def patch: patch = "patch".asInstanceOf[patch]
  
  @js.native
  sealed trait post
    extends StObject
       with FormMethod
  inline def post: post = "post".asInstanceOf[post]
  
  @js.native
  sealed trait put
    extends StObject
       with FormMethod
  inline def put: put = "put".asInstanceOf[put]
  
  @js.native
  sealed trait state
    extends StObject
       with Fetcher[Any]
       with Navigation
  inline def state: state = "state".asInstanceOf[state]
  
  @js.native
  sealed trait submitting extends StObject
  inline def submitting: submitting = "submitting".asInstanceOf[submitting]
}
